package Complementos;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionesPDF {

    Funciones fn = new Funciones();

    public FuncionesPDF() {

    }

    public void generarRecetaPDF(String[] datosReceta, String rutaArchivo) {
        // String[] datosReceta = {idReceta, nombreA, edad, genero, altura, peso, nombreCompletoM, fechaEmision[0], fechaEmision[1], diagnostico};

        // Obtener todos los medicamentos relacionados al Id de una Receta Medica.
        ArrayList<String[]> datosMedicamentosEnReceta = fn.obtenerResultados("SELECT Id_Elemento, Cantidad, Frecuencia FROM Receta_Medica__Elemento WHERE Id_Receta_Medica = " + datosReceta[0]);

        // - - - - - - - - - - - - - - CREACION DEL DOCUMENTO
        Document documento = new Document(PageSize.A4.rotate());

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            // Ajustes para el Titulo
            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLUE);
            Paragraph titulo = new Paragraph("Tu Consultorio Escolar", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);

            // Espacio antes de datos del paciente
            documento.add(Chunk.NEWLINE);

            // Datos del paciente
            PdfPTable datosPaciente = new PdfPTable(2);
            datosPaciente.setWidthPercentage(100);
            datosPaciente.setSpacingAfter(20);

            String[] labels = {"Nombre del Alumno:", "Edad:", "Género:", "Altura:", "Peso:", "Médico:", "Fecha de Emisión:"};
            String[] values = {datosReceta[1], datosReceta[2], datosReceta[3], datosReceta[4] + " cm", datosReceta[5] + " kg", datosReceta[6], datosReceta[7] + " " + datosReceta[8]};
            float[] medidaCeldasDatos = {1f, 3f};

            datosPaciente.setWidths(medidaCeldasDatos);

            if (values[3].equals("NULL cm")) {
                values[3] = "Sin estatura registrada";
            }

            if (values[4].equals("NULL kg")) {
                values[4] = "Sin peso registrado";
            }

            for (int i = 0; i < labels.length; i++) {

                PdfPCell celda = new PdfPCell(new Phrase(labels[i]));
                celda.setBorder(0);
                datosPaciente.addCell(celda);
                // celda.setFixedHeight(20f);

                PdfPCell valorAlumno = new PdfPCell(new Phrase(values[i]));
                valorAlumno.setPaddingLeft(5);
                datosPaciente.addCell(valorAlumno);
            }
            documento.add(datosPaciente);

            if (datosReceta[9].equals("NULL")) {
                datosReceta[9] = "Sin Diagnóstico";
            }

            // Diagnóstico
            Font fontDiagnostico = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph diagnostico = new Paragraph("Diagnóstico:", fontDiagnostico);
            diagnostico.setSpacingBefore(10);
            documento.add(diagnostico);
            documento.add(new Paragraph(datosReceta[9], FontFactory.getFont(FontFactory.HELVETICA, 12)));

            // Medicamentos
            Font fontMedicamentos = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.DARK_GRAY);
            Paragraph medicamentos = new Paragraph("Medicamentos:", fontMedicamentos);
            medicamentos.setSpacingBefore(20);
            medicamentos.setSpacingAfter(10);
            documento.add(medicamentos);

            PdfPTable tablaMedicamentos = new PdfPTable(3);
            tablaMedicamentos.setWidthPercentage(100);
            tablaMedicamentos.setSpacingAfter(20);
            PdfPCell celdaNombre = new PdfPCell(new Phrase("Nombre", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaCantidad = new PdfPCell(new Phrase("Cantidad", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaFrecuencia = new PdfPCell(new Phrase("Frecuencia", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            celdaNombre.setPaddingLeft(5);
            celdaCantidad.setPaddingLeft(5);
            celdaFrecuencia.setPaddingLeft(5);
            tablaMedicamentos.addCell(celdaNombre);
            tablaMedicamentos.addCell(celdaCantidad);
            tablaMedicamentos.addCell(celdaFrecuencia);
            float[] medidaCeldasMedicamentos = {1.2f, 0.5f, 2f};

            tablaMedicamentos.setWidths(medidaCeldasMedicamentos);

            for (String[] entrada : datosMedicamentosEnReceta) {
                String nombreMedicamento = fn.obtenerResultado("SELECT Nombre_Producto FROM Elemento WHERE Id_Elemento = " + entrada[0]);
                PdfPCell cell = new PdfPCell(new Phrase(nombreMedicamento));
                cell.setPaddingLeft(5); // Establecer el espacio izquierdo
                tablaMedicamentos.addCell(cell); // Nombre del medicamento

                PdfPCell cell2 = new PdfPCell(new Phrase(entrada[1]));
                cell2.setPaddingLeft(5); // Establecer el espacio izquierdo
                tablaMedicamentos.addCell(cell2); // Frecuencia

                PdfPCell cell3 = new PdfPCell(new Phrase(entrada[2]));
                cell3.setPaddingLeft(5); // Establecer el espacio izquierdo
                tablaMedicamentos.addCell(cell3); // Cantidad
            }

            documento.add(tablaMedicamentos);

            // Firma
            Font fontFirma = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Firma del Médico: ____________________", fontFirma));

            // Logo
            try {
                Image imagen = Image.getInstance("src/Imagenes/IMG_Logo_Receta.png");
                imagen.scaleToFit(150, 150);
                imagen.setAlignment(Element.ALIGN_RIGHT);
                documento.add(imagen);
            } catch (IOException e) {
                e.printStackTrace();
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "La receta médica se ha generado exitosamente");
        } catch (DocumentException | HeadlessException | IOException e) {
            e.printStackTrace();
        }
    }

    public void generarInventarioPDF(String sentencia, String rutaArchivo) {
        ArrayList<String[]> datosElemento;

        String sql = sentencia;

        datosElemento = fn.obtenerResultados(sql);

        // - - - - - - - - - - - - - - CREACION DEL DOCUMENTO
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            // Ajustes para el Titulo
            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLUE);
            Paragraph titulo = new Paragraph("Inventario", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);

            // Espacio antes de datos del paciente
            documento.add(Chunk.NEWLINE);

            PdfPTable tablaInventario = new PdfPTable(4);
            tablaInventario.setWidthPercentage(100);
            tablaInventario.setSpacingAfter(20);
            PdfPCell celdaId = new PdfPCell(new Phrase("ID", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaCategoria = new PdfPCell(new Phrase("Categoria", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaNombre = new PdfPCell(new Phrase("Nombre", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaCantidad = new PdfPCell(new Phrase("Cantidad", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            celdaId.setPaddingLeft(5);
            celdaNombre.setPaddingLeft(5);
            celdaCategoria.setPaddingLeft(5);
            celdaCantidad.setPaddingLeft(5);
            tablaInventario.addCell(celdaId);
            tablaInventario.addCell(celdaCategoria);
            tablaInventario.addCell(celdaNombre);
            tablaInventario.addCell(celdaCantidad);
            float[] medidaCeldasDatos = {0.3f, 0.8f, 2.5f, 0.5f};
            tablaInventario.setWidths(medidaCeldasDatos);

            for (String[] entrada : datosElemento) {
                PdfPCell idElemento = new PdfPCell(new Phrase(entrada[0]));
                idElemento.setPaddingLeft(5);
                tablaInventario.addCell(idElemento);

                PdfPCell nombreCategoria = new PdfPCell(new Phrase(entrada[1]));
                nombreCategoria.setPaddingLeft(5);
                tablaInventario.addCell(nombreCategoria);

                PdfPCell nombreElemento = new PdfPCell(new Phrase(entrada[2]));
                nombreElemento.setPaddingLeft(5);
                tablaInventario.addCell(nombreElemento);

                PdfPCell cantidadElemento = new PdfPCell(new Phrase(entrada[3]));
                cantidadElemento.setPaddingLeft(5);
                tablaInventario.addCell(cantidadElemento);
            }

            documento.add(tablaInventario);

            documento.close();
            JOptionPane.showMessageDialog(null, "El reporte ha sido generado con éxito");
        } catch (DocumentException | HeadlessException | IOException e) {
            e.printStackTrace();
        }
    }

}
