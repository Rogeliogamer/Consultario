package Clases;

import java.util.Date;

public class CMedico {
    
    private String numeroDeControlMedico;
    private String nombreMedico;
    private String apellidoMedico;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fechaDeRegistro;

    // Constructor vacío
    public CMedico() {
    }

    // Constructor con parámetros
    public CMedico(String numeroDeControlMedico, String nombreMedico, String apellidoMedico,
                   String telefono, String correo, String direccion, Date fechaDeRegistro) {
        this.numeroDeControlMedico = numeroDeControlMedico;
        this.nombreMedico = nombreMedico;
        this.apellidoMedico = apellidoMedico;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    // Métodos getter y setter para cada atributo
    public String getNumeroDeControlMedico() {
        return numeroDeControlMedico;
    }

    public void setNumeroDeControlMedico(String numeroDeControlMedico) {
        this.numeroDeControlMedico = numeroDeControlMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
}
