package Complementos;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewClass {

    Funciones fn = new Funciones();
    FuncionesFecha fe = new FuncionesFecha();

    public static void main(String[] args) {
        NewClass generador = new NewClass();
        generador.hola();
    }

    private void hola() {
        ArrayList<String[]> hola = fn.obtenerResultados("SELECT Id_Elemento, Frecuencia, Cantidad FROM Receta_Medica__Elemento WHERE Id_Receta_Medica = " + 1);

        for (String[] entrada : hola) {
            String nombreMedicamento = fn.obtenerResultado("SELECT Nombre_Producto FROM Elemento WHERE Id_Elemento = " + entrada[0]);
                System.out.println(nombreMedicamento); // Nombre del medicamento
                System.out.println("Frecuencia: " + entrada[1]); // Cantidad
                System.out.println("Cantidad: " + entrada[2]); // Frecuencia
            }
        System.out.println(" - - - - - - - ");

    }

}
