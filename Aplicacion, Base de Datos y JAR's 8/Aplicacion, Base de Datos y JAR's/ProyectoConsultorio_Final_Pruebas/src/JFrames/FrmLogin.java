package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.

    String nControl = "";
    String password = "";

    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);

        TextPrompt pHUsuario = new TextPrompt("Número de Control", txtFNControl);
        TextPrompt pHPassword = new TextPrompt("**********", txtFPassword);

        lblIconoUsuario.setIcon(di.pintarImagenLbl(lblIconoUsuario, "src/Imagenes/IMG_Icono_Usuario.png"));
        lblIconoConsultorio.setIcon(di.pintarImagenLbl(lblIconoConsultorio, "src/Imagenes/IMG_Icono_Consultorio.png"));

        txtFNControl.requestFocus();

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
        txtFNControl = new javax.swing.JTextField();
        txtFPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblNControl = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();

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
        lblIndicaciones.setText("<html><center>Ingresa los datos de tu<br>cuenta</center></html>");
        lblIndicaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

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

        lblNControl.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblNControl.setText("Número de Control:");
        lblNControl.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblPassword.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblPassword.setText("Contraseña:");
        lblPassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLoginLayout.createSequentialGroup()
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNControl)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLoginLayout.createSequentialGroup()
                        .addComponent(lblIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLoginLayout.createSequentialGroup()
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconoConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNControl))
                .addGap(18, 18, 18)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconoConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        obtenerVariables();

        if (!comprobarCamposVacios()) {
            String nControlExisteSQL = "SELECT * FROM USUARIO WHERE Numero_Control = " + nControl;
            String usuarioExisteSQL = "SELECT * FROM USUARIO WHERE Numero_Control = " + nControl + " AND Contrasenya= '" + password + "'";

            boolean nControlExiste = fn.verificarExistencia(nControlExisteSQL);
            boolean usuarioExiste = fn.verificarExistencia(usuarioExisteSQL);
            if (nControlExiste && usuarioExiste) { // USUARIO EXISTE
                mostrarMensaje(null, "Conectado Exitosamente");
                iniciarMenu();
                dispose();
            } else if (nControlExiste && !usuarioExiste) { // NÚMERO DE CONTROL EXISTE, PERO LA PASSWORD NO
                mostrarMensaje(null, "Contraseña Incorrecta");
                txtFPassword.setText("");
                txtFPassword.requestFocus();
            } else if (!nControlExiste && !usuarioExiste) { // USUARIO NO EXISTE
                mostrarError(null, "Usuario Inexistente");
                limpiar();
            }
        } else {
            mostrarError("Campos Vacíos", "Completa todos los campos");
            limpiar();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void iniciarMenu() {
        String idRolSQL = "SELECT Id_Rol FROM Usuario WHERE Numero_Control = " + nControl;
        int idRol = Integer.parseInt(fn.obtenerResultado(idRolSQL));
        VariablesGlobales.numeroDeControl = nControl;
        VariablesGlobales.rol = idRol;

        switch (idRol) {
            case 1 -> {
                FrmMenuAlumno frm_menu_alumno = new FrmMenuAlumno();
                frm_menu_alumno.setVisible(true);
            }
            case 2 -> {
                FrmMenuMedico frm_menu_medico = new FrmMenuMedico();
                frm_menu_medico.setVisible(true);
            }
            case 3 -> {
                FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
                frm_menu_secretario.setVisible(true);
            }
            default -> {
            }
        }
    }

    private void obtenerVariables() {
        nControl = txtFNControl.getText();
        password = txtFPassword.getText();
    }

    private Boolean comprobarCamposVacios() {
        return nControl.isEmpty() || password.isEmpty();
    }

    private void mostrarMensaje(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JLabel lblNControl;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JPasswordField txtFPassword;
    // End of variables declaration//GEN-END:variables
}
