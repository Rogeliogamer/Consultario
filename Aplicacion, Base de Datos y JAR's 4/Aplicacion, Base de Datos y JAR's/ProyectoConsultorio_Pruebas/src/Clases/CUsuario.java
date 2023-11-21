package Clases;

public class CUsuario {
    
    private String numeroDeControlUsuario;
    private String idRol;
    private String contrasenya;

    public CUsuario() {
    }

    public CUsuario(String numeroDeControlUsuario, String idRol, String contrasenya) {
        this.numeroDeControlUsuario = numeroDeControlUsuario;
        this.idRol = idRol;
        this.contrasenya = contrasenya;
    }

    public String getNumeroDeControlUsuario() {
        return numeroDeControlUsuario;
    }

    public void setNumeroDeControlUsuario(String numeroDeControlUsuario) {
        this.numeroDeControlUsuario = numeroDeControlUsuario;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
}