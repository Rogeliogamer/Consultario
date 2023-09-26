package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Clase que incluye funciones relacionadas con la ejecución de comandos SQL.
    FuncionesInterface di = new FuncionesInterface(); // Clase que incluye funciones relacionadas con el diseño de interfaces.
    FuncionesValidar validar = new FuncionesValidar(); // Clase que incluye funciones relacionadas a la validación de campos.

    String nControl = ""; // String para guardar el Número de Control ingresado.
    String password = ""; // String para guardar la Contraseña ingresada.

    public FrmLogin() {
        initComponents();

        this.setLocationRelativeTo(null); // Declaración que permite centrar la ventana.

        TextPrompt pHUsuario = new TextPrompt("Número de Control", txtFNControl); // PlaceHolder para el campo de Número de Control.
        TextPrompt pHPassword = new TextPrompt("**********", txtFPassword); // PlaceHolder para el campo de Contraseña.

        // Declaraciones que nos permiten ajustar el tamaño de una imagen.
        lblIconoUsuario.setIcon(di.pintarImagenLbl(lblIconoUsuario, "src/Imagenes/IMG_Icono_Usuario.png"));
        lblIconoConsultorio.setIcon(di.pintarImagenLbl(lblIconoConsultorio, "src/Imagenes/IMG_Icono_Consultorio.png"));

        txtFNControl.requestFocus(); // Declaración que selecciona automáticamente el campo de Número de Control.

        validar.validarNControlRegex(txtFNControl); // Validación constante de la estructura del Número de Control.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPLoginPresentacion = new javax.swing.JPanel();
        lblIconoUsuario = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        jPLogin = new javax.swing.JPanel();
        lblIconoConsultorio = new javax.swing.JLabel();
        lblIndicaciones = new javax.swing.JLabel();
        lblTemporal = new javax.swing.JLabel();
        txtFNControl = new javax.swing.JTextField();
        txtFPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPLoginPresentacion.setBackground(new java.awt.Color(255, 255, 255));
        jPLoginPresentacion.setMaximumSize(new java.awt.Dimension(300, 360));
        jPLoginPresentacion.setMinimumSize(new java.awt.Dimension(300, 360));
        jPLoginPresentacion.setPreferredSize(new java.awt.Dimension(300, 360));

        lblBienvenida.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblBienvenida.setText("<html><center>Bienvenido a<br>Tu Consultorio Escolar</center></html>");
        lblBienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPLoginPresentacionLayout = new javax.swing.GroupLayout(jPLoginPresentacion);
        jPLoginPresentacion.setLayout(jPLoginPresentacionLayout);
        jPLoginPresentacionLayout.setHorizontalGroup(
            jPLoginPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginPresentacionLayout.createSequentialGroup()
                .addGroup(jPLoginPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLoginPresentacionLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPLoginPresentacionLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        jPLoginPresentacionLayout.setVerticalGroup(
            jPLoginPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginPresentacionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPLogin.setBackground(new java.awt.Color(3, 102, 102));
        jPLogin.setMaximumSize(new java.awt.Dimension(316, 360));
        jPLogin.setMinimumSize(new java.awt.Dimension(316, 360));
        jPLogin.setPreferredSize(new java.awt.Dimension(316, 360));

        lblIndicaciones.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblIndicaciones.setText("<html><center>Ingresa tu número de control<br>y tu contraseña</center></html>");
        lblIndicaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblTemporal.setText("<html><center>Usuario Valido<br>111111111<br>P@ssw0rd</center></html>");

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(130, 30));

        txtFPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFPassword.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFPassword.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFPassword.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFPassword.setPreferredSize(new java.awt.Dimension(130, 30));

        btnLogin.setText("Ingresar");
        btnLogin.setFocusPainted(false);
        btnLogin.setMaximumSize(new java.awt.Dimension(100, 30));
        btnLogin.setMinimumSize(new java.awt.Dimension(100, 30));
        btnLogin.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconoConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTemporal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemporal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLoginLayout.createSequentialGroup()
                        .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIconoConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPLoginPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPLoginPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        nControl = txtFNControl.getText(); // Asignación del Número de Control ingresado por el Usuario.
        password = txtFPassword.getText(); // Asignación de la Contraseña ingresada por el Usuario.

        // Declaración SQL para verificar la existencia del usuario (que implícitamente aborda los errores de datos incorrectos o inexistentes).
        String sql = "SELECT * FROM USUARIO WHERE Numero_Control= " + nControl
                + " AND Contrasenya= '" + password + "'";

        if (comprobarCamposVacios()) { // Se evalua la posibilidad de campos sin contenido.
            mostrarError("Campos Vacíos", "Por favor, complete todos los campos.");
            limpiar(); // Se devuelven los valores por defecto.
        } else {
            if (fn.verificarExistencia(sql)) { // Verificamos la existencia del Usuario en la Base de Datos.
                JOptionPane.showMessageDialog(null, "Conectado Exitosamente");
                iniciarMenu();
                // VariablesGlobales.frm_menu.setVisible(true); // Mostramos el Ménu.
                dispose(); // Cerramos la ventana actual.
            } else { // Si la sentencia SQL no obtiene ningún valor significa que los datos son incorrectos y/o inexistentes.
                mostrarError("Datos Incorrectos", "Esta cuenta no está registrada en nuestro sistema.");
                limpiar(); // Se devuelven los campos a su valor por defecto.
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void iniciarMenu(){
        String id_rol = "SELECT Id_Rol FROM Usuario WHERE Numero_Control =" + nControl;
        int rolN = Integer.parseInt(fn.obtenerResultado(id_rol));
        VariablesGlobales.numeroDeControl = nControl;
        VariablesGlobales.rol = rolN;
                
        switch (rolN) {
            case 1 -> {
                VariablesGlobales.frm_menu_alumno.setVisible(true);
            }
            case 2 -> {
                VariablesGlobales.frm_menu_medico.setVisible(true);
            }
            case 3 -> {
                VariablesGlobales.frm_menu_secretario.setVisible(true);
            }
            default -> {
            }
        }
    }
    
    private Boolean comprobarCamposVacios() {
        return nControl.isEmpty() || password.isEmpty();
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void limpiar() {
        txtFNControl.setText("");
        txtFPassword.setText("");
        txtFNControl.requestFocus();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPLoginPresentacion;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblIconoConsultorio;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblIndicaciones;
    private javax.swing.JLabel lblTemporal;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JPasswordField txtFPassword;
    // End of variables declaration//GEN-END:variables
}
