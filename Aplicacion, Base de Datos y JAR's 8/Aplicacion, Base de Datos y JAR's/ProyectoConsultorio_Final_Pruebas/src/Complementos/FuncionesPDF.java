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
            //titulo.setSpacingAfter(20);
            documento.add(titulo);

            // Espacio antes de datos del paciente
            documento.add(Chunk.NEWLINE);

            // Datos del paciente
            PdfPTable datosPaciente = new PdfPTable(2);
            datosPaciente.setWidthPercentage(100);
            datosPaciente.setSpacingAfter(8);

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
                imagen.scaleToFit(55, 55);
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

    public void generarReporteServiciosRangoPDF(String sentencia, String rutaArchivo, String[] fechas) {
        ArrayList<String[]> datosServicio;

        String sql = sentencia;

        datosServicio = fn.obtenerResultados(sql);

        // - - - - - - - - - - - - - - CREACION DEL DOCUMENTO
        Document documento = new Document(PageSize.A4.rotate());

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            // Ajustes para el Titulo
            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLUE);
            Paragraph titulo = new Paragraph("Reporte de Servicios: " + fechas[0] + " - " + fechas[1], fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);

            // Espacio antes de datos del paciente
            documento.add(Chunk.NEWLINE);

            PdfPTable tablaServicios = new PdfPTable(4);
            tablaServicios.setWidthPercentage(100);
            tablaServicios.setSpacingAfter(20);
            PdfPCell celdaNControl = new PdfPCell(new Phrase("N.Control", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaServicio = new PdfPCell(new Phrase("Servicio", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaMedico = new PdfPCell(new Phrase("Médico", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaFecha = new PdfPCell(new Phrase("Fecha", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            celdaNControl.setPaddingLeft(5);
            celdaServicio.setPaddingLeft(5);
            celdaMedico.setPaddingLeft(5);
            celdaFecha.setPaddingLeft(5);
            tablaServicios.addCell(celdaNControl);
            tablaServicios.addCell(celdaServicio);
            tablaServicios.addCell(celdaMedico);
            tablaServicios.addCell(celdaFecha);
            float[] medidaCeldasDatos = {0.8f, 1.2f, 1.8f, 0.5f};
            tablaServicios.setWidths(medidaCeldasDatos);

            for (String[] entrada : datosServicio) {
                PdfPCell nControl = new PdfPCell(new Phrase(entrada[0]));
                nControl.setPaddingLeft(5);
                tablaServicios.addCell(nControl);

                PdfPCell servicio = new PdfPCell(new Phrase(entrada[1]));
                servicio.setPaddingLeft(5);
                tablaServicios.addCell(servicio);

                PdfPCell nombreM = new PdfPCell(new Phrase(entrada[2]));
                nombreM.setPaddingLeft(5);
                tablaServicios.addCell(nombreM);

                PdfPCell fecha = new PdfPCell(new Phrase(entrada[3]));
                fecha.setPaddingLeft(5);
                tablaServicios.addCell(fecha);
            }

            documento.add(tablaServicios);

            documento.close();
            JOptionPane.showMessageDialog(null, "El reporte ha sido generado con éxito");
        } catch (DocumentException | HeadlessException | IOException e) {
            e.printStackTrace();
        }
    }

    public void generarReporteServiciosUnaFechaPDF(String sentencia, String rutaArchivo, String dia) {
        ArrayList<String[]> datosServicio;

        String sql = sentencia;

        datosServicio = fn.obtenerResultados(sql);

        // - - - - - - - - - - - - - - CREACION DEL DOCUMENTO
        Document documento = new Document(PageSize.A4.rotate());

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            // Ajustes para el Titulo
            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLUE);
            Paragraph titulo = new Paragraph("Reporte de Servicios: " + dia, fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);

            // Espacio antes de datos del paciente
            documento.add(Chunk.NEWLINE);

            PdfPTable tablaServicios = new PdfPTable(4);
            tablaServicios.setWidthPercentage(100);
            tablaServicios.setSpacingAfter(20);
            PdfPCell celdaNControl = new PdfPCell(new Phrase("N.Control", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaServicio = new PdfPCell(new Phrase("Servicio", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaMedico = new PdfPCell(new Phrase("Médico", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            PdfPCell celdaFecha = new PdfPCell(new Phrase("Fecha", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            celdaNControl.setPaddingLeft(5);
            celdaServicio.setPaddingLeft(5);
            celdaMedico.setPaddingLeft(5);
            celdaFecha.setPaddingLeft(5);
            tablaServicios.addCell(celdaNControl);
            tablaServicios.addCell(celdaServicio);
            tablaServicios.addCell(celdaMedico);
            tablaServicios.addCell(celdaFecha);
            float[] medidaCeldasDatos = {0.8f, 1.2f, 1.8f, 0.5f};
            tablaServicios.setWidths(medidaCeldasDatos);

            for (String[] entrada : datosServicio) {
                PdfPCell nControl = new PdfPCell(new Phrase(entrada[0]));
                nControl.setPaddingLeft(5);
                tablaServicios.addCell(nControl);

                PdfPCell servicio = new PdfPCell(new Phrase(entrada[1]));
                servicio.setPaddingLeft(5);
                tablaServicios.addCell(servicio);

                PdfPCell nombreM = new PdfPCell(new Phrase(entrada[2]));
                nombreM.setPaddingLeft(5);
                tablaServicios.addCell(nombreM);

                PdfPCell fecha = new PdfPCell(new Phrase(entrada[3]));
                fecha.setPaddingLeft(5);
                tablaServicios.addCell(fecha);
            }

            documento.add(tablaServicios);

            documento.close();
            JOptionPane.showMessageDialog(null, "El reporte ha sido generado con éxito");
        } catch (DocumentException | HeadlessException | IOException e) {
            e.printStackTrace();
        }
    }

    public void generarPaseUrgencias(String[] datosPaciente, String[] datosMedico, String razonesPase, String rutaArchivo) {
        /* Datos Paciente: 
           nControl, nombreCompleto, fechaNacimiento, edad, genero, telefono, telefonoEmergencia
           municipio, estado, codigo postal, calle, numero interior
         */

 /* Datos Medico: 
           nControl, nombreCompleto, telefono, telefonoEmergencia, correo
           municipio, estado, codigo postal, calle, numero interior
         */
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
            //titulo.setSpacingAfter(20);
            documento.add(titulo);

            // documento.add(Chunk.NEWLINE);
            Font fontDatosA = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph datosA = new Paragraph("Información del Paciente:", fontDatosA);
            datosA.setSpacingBefore(10);
            datosA.setSpacingAfter(8);
            documento.add(datosA);

            // Datos del paciente
            PdfPTable datosAlumno = new PdfPTable(2);
            datosAlumno.setWidthPercentage(100);
            datosAlumno.setSpacingAfter(8);

            String[] labelsA = {"Nombre del Alumno:", "Fecha Nacimiento:", "Edad:", "Género:", "Telefono:", "Telefono de Emergencia:"};
            String[] valuesA = {datosPaciente[1], datosPaciente[2], datosPaciente[3], datosPaciente[4], datosPaciente[5], datosPaciente[6]};
            float[] medidaCeldasDatos = {1f, 3f};
            datosAlumno.setWidths(medidaCeldasDatos);

            for (int i = 0; i < labelsA.length; i++) {
                PdfPCell celda = new PdfPCell(new Phrase(labelsA[i]));
                celda.setBorder(0);
                datosAlumno.addCell(celda);

                PdfPCell valorAlumno = new PdfPCell(new Phrase(valuesA[i]));
                valorAlumno.setPaddingLeft(5);
                datosAlumno.addCell(valorAlumno);
            }

            documento.add(datosAlumno);

            String direccion = "Calle " + datosPaciente[10] + ", " + datosPaciente[11] + ", " + datosPaciente[7] + ", " + datosPaciente[8] + ", C.P. " + datosPaciente[9];

            // Direccion
            Font fontDireccionA = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph direccionA = new Paragraph("Dirección del Paciente:", fontDireccionA);
            direccionA.setSpacingBefore(10);
            documento.add(direccionA);
            documento.add(new Paragraph(direccion, FontFactory.getFont(FontFactory.HELVETICA, 12)));

            
            Font fontDatosM = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph datosM = new Paragraph("Información del Médico que emite el Pase:", fontDatosM);
            datosM.setSpacingBefore(10);
            datosM.setSpacingAfter(8);
            documento.add(datosM);
            
            // Datos del medico
            PdfPTable datosMed = new PdfPTable(2);
            datosMed.setWidthPercentage(100);
            datosMed.setSpacingAfter(8);

            String[] labelsM = {"Nombre del Médico:", "Telefono:", "Telefono de Emergencia:", "Correo:"};
            String[] valuesM = {datosMedico[1], datosMedico[2], datosMedico[3], datosMedico[4]};
            datosMed.setWidths(medidaCeldasDatos);

            for (int i = 0; i < labelsM.length; i++) {
                PdfPCell celda = new PdfPCell(new Phrase(labelsM[i]));
                celda.setBorder(0);
                datosMed.addCell(celda);

                PdfPCell valorMedico = new PdfPCell(new Phrase(valuesM[i]));
                valorMedico.setPaddingLeft(5);
                datosMed.addCell(valorMedico);
            }

            documento.add(datosMed);

            direccion = "Calle " + datosMedico[8] + ", " + datosMedico[9] + ", " + datosMedico[5] + ", " + datosMedico[6] + ", C.P. " + datosMedico[7];

            // Direccion
            Font fontDireccionM = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph direccionM = new Paragraph("Dirección del Médico:", fontDireccionM);
            direccionM.setSpacingBefore(10);
            documento.add(direccionM);
            documento.add(new Paragraph(direccion, FontFactory.getFont(FontFactory.HELVETICA, 12)));

            // Razones
            Font fontRazones = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.DARK_GRAY);
            Paragraph razones = new Paragraph("Razones:", fontRazones);
            razones.setSpacingBefore(20);
            razones.setSpacingAfter(10);
            documento.add(razones);
            documento.add(new Paragraph(razonesPase, FontFactory.getFont(FontFactory.HELVETICA, 12)));

            // Firma
            Font fontFirma = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Firma del Médico: ____________________", fontFirma));

            // Logo
            try {
                Image imagen = Image.getInstance("src/Imagenes/IMG_Logo_Receta.png");
                imagen.scaleToFit(55, 55);
                imagen.setAlignment(Element.ALIGN_RIGHT);
                documento.add(imagen);
            } catch (IOException e) {
                e.printStackTrace();
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "El pase a urgencias se ha generado exitosamente");
        } catch (DocumentException | HeadlessException | IOException e) {
            e.printStackTrace();
        }
    }

    public void generarFichaClinica(String[] datosFichaClinica, String rutaArchivo) {
        // - - - - - - - - - - - - - - CREACION DEL DOCUMENTO
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            // Ajustes para el Titulo
            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLUE);
            Paragraph titulo = new Paragraph("Ficha Clínica", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);

            // Espacio antes de datos del paciente
            documento.add(Chunk.NEWLINE);
            
            PdfPTable datosAlummno = new PdfPTable(2);
            datosAlummno.setWidthPercentage(100);
            datosAlummno.setSpacingAfter(8);

            String[] labels = {"Nombre del Alumno:", "Fecha de Nacimiento", "Edad:", "Género:", "Altura:", "Peso:"};
            String[] values = {datosFichaClinica[0], datosFichaClinica[1], datosFichaClinica[2], datosFichaClinica[3], datosFichaClinica[5] + " cm", datosFichaClinica[4] + " kg"};
            float[] medidaCeldasDatos = {1f, 3f};

            datosAlummno.setWidths(medidaCeldasDatos);

            for (int i = 0; i < labels.length; i++) {
                PdfPCell celda = new PdfPCell(new Phrase(labels[i]));
                celda.setBorder(0);
                datosAlummno.addCell(celda);
                // celda.setFixedHeight(20f);

                PdfPCell valorAlumno = new PdfPCell(new Phrase(values[i]));
                valorAlumno.setPaddingLeft(5);
                datosAlummno.addCell(valorAlumno);
            }
            documento.add(datosAlummno);
            
            Font fontAlergias = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph alergias = new Paragraph("Observaciones:", fontAlergias);
            alergias.setSpacingBefore(10);
            documento.add(alergias);
            documento.add(new Paragraph(datosFichaClinica[6], FontFactory.getFont(FontFactory.HELVETICA, 12)));

            Font fontRecomendaciones = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph recomendaciones = new Paragraph("Seguimiento y Recomendaciones:", fontRecomendaciones);
            recomendaciones.setSpacingBefore(10);
            documento.add(recomendaciones);
            documento.add(new Paragraph(datosFichaClinica[7], FontFactory.getFont(FontFactory.HELVETICA, 12)));

            Font fontObservaciones = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph observaciones = new Paragraph("Observaciones:", fontObservaciones);
            observaciones.setSpacingBefore(10);
            documento.add(observaciones);
            documento.add(new Paragraph(datosFichaClinica[8], FontFactory.getFont(FontFactory.HELVETICA, 12)));

            if (datosFichaClinica[9].equals("null")) {
                datosFichaClinica[9] = "No hay ningún medicamento reciente asociado a este Alumno";
            }
            
            Font fontUltimosMedicamentos = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph ultimosMedicamentos = new Paragraph("Ultimos Medicamentos", fontUltimosMedicamentos);
            ultimosMedicamentos.setSpacingBefore(10);
            documento.add(ultimosMedicamentos);
            documento.add(new Paragraph(datosFichaClinica[9], FontFactory.getFont(FontFactory.HELVETICA, 12)));

            if (datosFichaClinica[10].equals("null")) {
                datosFichaClinica[9] = "No hay una última cita asociada a este Alumno";
            }
            
            Font fontUltimaCita = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.RED);
            Paragraph ultimaCita = new Paragraph("Ultima Cita", fontUltimaCita);
            ultimaCita.setSpacingBefore(10);
            documento.add(ultimaCita);
            documento.add(new Paragraph(datosFichaClinica[10], FontFactory.getFont(FontFactory.HELVETICA, 12)));

            // Firma
            Font fontFirma = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Firma del Médico: ____________________", fontFirma));
            documento.add(new Paragraph(datosFichaClinica[11], FontFactory.getFont(FontFactory.HELVETICA, 12)));
            
            // Logo
            try {
                Image imagen = Image.getInstance("src/Imagenes/IMG_Logo_Receta.png");
                imagen.scaleToFit(55, 55);
                imagen.setAlignment(Element.ALIGN_RIGHT);
                documento.add(imagen);
            } catch (IOException e) {
                e.printStackTrace();
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "La Ficha Clínica ha sido generada con éxito");
        } catch (DocumentException | HeadlessException | IOException e) {
            e.printStackTrace();
        }
    }
}
