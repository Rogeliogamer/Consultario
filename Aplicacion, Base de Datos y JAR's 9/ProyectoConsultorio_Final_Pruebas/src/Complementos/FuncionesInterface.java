/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complementos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author dakni
 */
public class FuncionesInterface {
    
    public ImageIcon imagen; // variable imagen 
    public Icon icono; // variable icono
    
    public FuncionesInterface(){
        
    }
    
    // METODO PARA PONER UNA IMAGEN EN UN LABEL
    public ImageIcon pintarImagenLbl(JLabel lbl, String ruta){ // recibir parametros necesarios
        imagen = new ImageIcon(ruta); // asignar a la imagen la ruta de nuestra imagen
        icono = new ImageIcon(imagen.getImage().getScaledInstance( 
                lbl.getWidth(), 
                lbl.getHeight(), 
                Image.SCALE_DEFAULT)); // asignar al icono los parametros basados entorno a la imagen
        
        return (ImageIcon) icono; // retornamos el icono 
    }
    
    // METODO PARA PONER UNA IMAGEN EN UN BUTTON
    public ImageIcon pintarImagenBtn (JButton btn, String ruta){ // recibir parametros necesarios
        imagen = new ImageIcon(ruta); // asignar a la imagen la ruta de nuestra imagen
        icono = new ImageIcon(imagen.getImage().getScaledInstance(
                btn.getWidth(), 
                btn.getHeight(), 
                Image.SCALE_DEFAULT)); // asignar al icono los parametros basados entorno a la imagen
        
        return (ImageIcon) icono; // retornamos el icono 
    }
    
    
}
