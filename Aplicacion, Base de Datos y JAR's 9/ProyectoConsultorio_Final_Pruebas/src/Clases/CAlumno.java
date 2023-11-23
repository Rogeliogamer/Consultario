package Clases;

import java.util.Date;

public class CAlumno {

    private String numeroDeControlAlumno;
    private String nombreAlumno;
    private String apellidoAlumno;
    private Date fechaDeNacimiento;
    private char genero;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fechaDeRegistro;

    public CAlumno() {
    }

    public CAlumno(String numeroDeControlAlumno, String nombreAlumno, String apellidoAlumno,
            Date fechaDeNacimiento, char genero, String telefono, String correo,
            String direccion, Date fechaDeRegistro) {
        this.numeroDeControlAlumno = numeroDeControlAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getNumeroDeControlAlumno() {
        return numeroDeControlAlumno;
    }

    public void setNumeroDeControlAlumno(String numeroDeControlAlumno) {
        this.numeroDeControlAlumno = numeroDeControlAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
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