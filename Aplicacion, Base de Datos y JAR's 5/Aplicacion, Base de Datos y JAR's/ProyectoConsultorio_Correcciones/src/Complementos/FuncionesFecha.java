package Complementos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FuncionesFecha {

    public FuncionesFecha() {

    }

    // Metodo para separar el formato de una fecha en YYYY-MM-DD y una hora HH:MM:SS
    public String[] separarFechaYHora(String fechaHoraStr) {

        SimpleDateFormat formatoEntrada = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        String[] resultado = new String[2];

        try {
            Date fechaHora = formatoEntrada.parse(fechaHoraStr);

            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

            resultado[0] = formatoFecha.format(fechaHora);
            resultado[1] = formatoHora.format(fechaHora);
        } catch (ParseException e) {
        }

        return resultado;
    }

    // Metodo para obtener fechas con minutos de rango hacia arriba y hacia abajo. 
    public String[] obtenerRango(String fecha, String hora, int rango) {

        String[] rangoDeFechas = new String[3];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(hora, formatter);

        LocalTime horaSumada = localTime.plusMinutes(rango);
        LocalTime horaRestada = localTime.minusMinutes(rango);

        String horaSumadaFormateada = horaSumada.format(formatter);
        String horaRestadaFormateada = horaRestada.format(formatter);

        rangoDeFechas[0] = fecha + " " + horaRestadaFormateada;
        rangoDeFechas[1] = fecha + " " + hora;
        rangoDeFechas[2] = fecha + " " + horaSumadaFormateada;

        return rangoDeFechas;
    }

    // Metodo para obtener la una fehca en String a una fecha Date
    public Date combinarFechaYHora(String fechaTexto, String horaTexto) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");

        try {
            Date fecha = dateFormat.parse(fechaTexto);
            Date hora = horaFormat.parse(horaTexto);

            Calendar calendarFechaHora = Calendar.getInstance();
            calendarFechaHora.setTime(fecha);
            calendarFechaHora.set(Calendar.HOUR_OF_DAY, hora.getHours());
            calendarFechaHora.set(Calendar.MINUTE, hora.getMinutes());
            calendarFechaHora.set(Calendar.SECOND, hora.getSeconds());

            return calendarFechaHora.getTime();
        } catch (ParseException e) {
            // Manejo de errores en caso de que la conversión falle
            e.printStackTrace();
            return null; // Devolver null en caso de error
        }
    }

    // Metodo para obtener la fecha predeterminada en un DateTimePicker
    public Date obtenerFechaPredeterminada(int yyyy, int m, int d) {
        LocalDate fechaPredeterminada = LocalDate.of(yyyy, m, d);
        Date fechaPredeterminadaDate = java.sql.Date.valueOf(fechaPredeterminada);
        return fechaPredeterminadaDate;
    }

    // Metodo para obtener la fecha y hora actual
    public Date obtenerFechaActual() {
        return new Date();
    }

    public Date convertirStringADate(String fechaString) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;

        try {
            fecha = formatoFecha.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return fecha;
    }
    
    public int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        Calendar calFechaNacimiento = Calendar.getInstance();
        calFechaNacimiento.setTime(fechaNacimiento);
        Calendar calFechaActual = Calendar.getInstance();
        calFechaActual.setTime(fechaActual);

        int edad = calFechaActual.get(Calendar.YEAR) - calFechaNacimiento.get(Calendar.YEAR);

        // Comprobar si aún no ha llegado el cumpleaños de este año
        if (calFechaActual.get(Calendar.MONTH) < calFechaNacimiento.get(Calendar.MONTH)
                || (calFechaActual.get(Calendar.MONTH) == calFechaNacimiento.get(Calendar.MONTH)
                        && calFechaActual.get(Calendar.DAY_OF_MONTH) < calFechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        return edad;
    }

    public boolean estaDentroDelRango(String horaCita, String horaInicio, String horaFin) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        try {
            Date horaActualDate = sdf.parse(horaCita);
            Date horaInicioDate = sdf.parse(horaInicio);
            Date horaFinDate = sdf.parse(horaFin);

            return horaActualDate.compareTo(horaInicioDate) >= 0 && horaActualDate.compareTo(horaFinDate) <= 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
