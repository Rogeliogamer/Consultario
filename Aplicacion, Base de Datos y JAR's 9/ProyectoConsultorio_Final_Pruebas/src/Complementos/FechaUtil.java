package Complementos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FechaUtil {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
    private static final SimpleDateFormat diaDeLaSemanaFormato = new SimpleDateFormat("EEEE", Locale.US);
    private static final SimpleDateFormat diaDelMesFormato = new SimpleDateFormat("dd MMM", Locale.US);
    private static final SimpleDateFormat mesFormato = new SimpleDateFormat("MMM", Locale.US);
    private static final SimpleDateFormat anioFormato = new SimpleDateFormat("yyyy", Locale.US);
    private static final SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm:ss", Locale.US);
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);

    public String obtenerFecha(String fechaStr, String formato) {
        try {
            Date date = sdf.parse(fechaStr);
            Map<String, SimpleDateFormat> formatos = new HashMap<>();
            formatos.put("diaSemana", diaDeLaSemanaFormato);
            formatos.put("diaMes", diaDelMesFormato);
            formatos.put("mes", mesFormato);
            formatos.put("anio", anioFormato);
            formatos.put("hora", horaFormato);
            formatos.put("completo", new SimpleDateFormat("yyyy MMM dd", Locale.US));

            SimpleDateFormat formatoSeleccionado = formatos.get(formato);

            if (formatoSeleccionado != null) {
                return formatoSeleccionado.format(date);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static String formatearFecha(String fechaStr, String formato) {
        try {
            Date date = sdf2.parse(fechaStr);
            SimpleDateFormat formatoSeleccionado = new SimpleDateFormat(formato, Locale.US);

            return formatoSeleccionado.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
