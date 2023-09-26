package Complementos;

import java.sql.Connection;
import JFrames.*;

public class VariablesGlobales {
    public static Connection conexion = null;
    public static FrmMenuAlumno frm_menu_alumno = new FrmMenuAlumno();
    public static FrmMenuMedico frm_menu_medico = new FrmMenuMedico();
    public static FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
    public static FrmRegistrarUsuario frm_registrarUsuario = new FrmRegistrarUsuario();
    public static FrmModificarPassword frm_modificarPassword = new FrmModificarPassword();
    public static FrmRegistrarCita frm_registrarCita = new FrmRegistrarCita();
    public static FrmConsultarCita frm_consultarCita = new FrmConsultarCita();
    public static FrmElaborarRecetaMedica frm_elaborarReceta = new FrmElaborarRecetaMedica();
    
    
    public static String numeroDeControl = "";
    public static int rol;
}
