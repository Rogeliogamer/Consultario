package Clases;

import java.util.Date;

public class CSecretario {
    
    private String numeroDeControlSecretario;
    private String nombreSecretario;
    private String apellidoSecretario;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fechaDeRegistro;

    public CSecretario() {
    }

    public CSecretario(String numeroDeControlSecretario, String nombreSecretario, String apellidoSecretario,
                       String telefono, String correo, String direccion, Date fechaDeRegistro) {
        this.numeroDeControlSecretario = numeroDeControlSecretario;
        this.nombreSecretario = nombreSecretario;
        this.apellidoSecretario = apellidoSecretario;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getNumeroDeControlSecretario() {
        return numeroDeControlSecretario;
    }

    public void setNumeroDeControlSecretario(String numeroDeControlSecretario) {
        this.numeroDeControlSecretario = numeroDeControlSecretario;
    }

    public String getNombreSecretario() {
        return nombreSecretario;
    }

    public void setNombreSecretario(String nombreSecretario) {
        this.nombreSecretario = nombreSecretario;
    }

    public String getApellidoSecretario() {
        return apellidoSecretario;
    }

    public void setApellidoSecretario(String apellidoSecretario) {
        this.apellidoSecretario = apellidoSecretario;
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

