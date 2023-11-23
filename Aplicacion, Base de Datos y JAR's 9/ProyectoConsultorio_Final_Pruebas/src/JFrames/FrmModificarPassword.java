package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import javax.swing.JOptionPane;

public class FrmModificarPassword extends javax.swing.JFrame {

    Funciones fn = new Funciones();
    FuncionesInterface di = new FuncionesInterface();
    FuncionesValidar validar = new FuncionesValidar();

    public FrmModificarPassword() {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl); // PlaceHolder para el campo "N. Control"
        TextPrompt pHPassword = new TextPrompt("Nueva Contraseña", txtFPassword); // PlaceHolder para el campo "Password"
        TextPrompt pHConfirmacionPassword = new TextPrompt("Confirmar Contraseña", txtFConfirmarPassword); // PlaceHolder para el campo "Confirmar Password"

        lblIconoModificarPassword.setIcon(di.pintarImagenLbl(lblIconoModificarPassword, "src/Imagenes/IMG_Icono_ModPassword.png"));
        
        validar.validarNControlRegex(txtFNControl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmarPassword = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        lblNControl = new javax.swing.JLabel();
        txtFNControl = new javax.swing.JTextField();
        txtFPassword = new javax.swing.JPasswordField();
        txtFConfirmarPassword = new javax.swing.JPasswordField();
        lblTitulo = new javax.swing.JLabel();
        lblIconoModificarPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 360));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña:");

        lblConfirmarPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmarPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmarPassword.setText("Confirmar Contraseña:");

        btnSalir.setText("Salir");
        btnSalir.setFocusPainted(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(100, 32));
        btnSalir.setMinimumSize(new java.awt.Dimension(100, 32));
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 32));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardarCambios.setText("<html><center>Guardar<br>Cambios</center></html>");
        btnGuardarCambios.setFocusPainted(false);
        btnGuardarCambios.setMaximumSize(new java.awt.Dimension(100, 32));
        btnGuardarCambios.setMinimumSize(new java.awt.Dimension(100, 32));
        btnGuardarCambios.setPreferredSize(new java.awt.Dimension(100, 32));
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        lblNControl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNControl.setForeground(new java.awt.Color(255, 255, 255));
        lblNControl.setText("N. Control:");

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFPassword.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFPassword.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFPassword.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFPassword.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFConfirmarPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFConfirmarPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFConfirmarPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFConfirmarPassword.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFConfirmarPassword.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFConfirmarPassword.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFConfirmarPassword.setPreferredSize(new java.awt.Dimension(160, 30));

        lblTitulo.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Modificar Contraseña");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(496, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblConfirmarPassword)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNControl, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFConfirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIconoModificarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNControl)
                            .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConfirmarPassword)
                            .addComponent(txtFConfirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIconoModificarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmRegistrarUsuario frm_registrarUsuario = new FrmRegistrarUsuario();
        frm_registrarUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        String nControl = txtFNControl.getText(); // Contiene el usuario a modificar.
        String password = txtFPassword.getText(); // Contiene la nueva contraseña.
        String confirmacionPassword = txtFConfirmarPassword.getText(); // Contiene la confirmación contraseña.

        String nControlExiste = "SELECT Numero_Control FROM Usuario WHERE Numero_Control = " + nControl;
        String passwordAnterior = "SELECT Contrasenya FROM Usuario WHERE Numero_Control = " + nControl + " AND contrasenya = '" + password + "';";

        // Evaluamos la posibilidad de campos sin contenido.
        if (nControl.isEmpty() || password.isEmpty() || confirmacionPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
        } else {
            // La sentencia SQL evalua implicitamente la posibilidad de una cuenta erronea y/o inexistente.
            if (fn.verificarExistencia(nControlExiste) == true) {
                // Evaluamos la robustosidad de la contraseña.
                if (validar.validarPasswordRegex(password) == true) {
                    // Evaluamos si las contraseñas son iguales
                    if (password.equals(confirmacionPassword)) {
                        if (fn.verificarExistencia(passwordAnterior) == true) {
                            JOptionPane.showMessageDialog(this, "La contraseña ingresada es igual a tu anterior contraseña", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            fn.ejecutarSentencia("UPDATE Usuario SET Contrasenya = '" + password
                                    + "' WHERE Numero_Control = " + nControl, true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Las contraseñas ingresadas no coinciden", "Contraseña Incorrecta", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La contraseña proporcionada no cumple con los estándares mínimos de seguridad", "Contraseña Insegura", JOptionPane.ERROR_MESSAGE);
                    String mensaje = "Requisitos de contraseña:\n"
                            + "1. Debe contener al menos una letra minúscula (a-z).\n"
                            + "2. Debe contener al menos una letra mayúscula (A-Z).\n"
                            + "3. Debe contener al menos un dígito (0-9).\n"
                            + "4. Debe contener al menos un carácter especial (@, #, $, %, ^, &, +, =, !).\n"
                            + "5. Debe tener una longitud mínima de 8 caracteres.\n"
                            + "6. No debe contener espacios en blanco.";
                    JOptionPane.showMessageDialog(null, mensaje, "Requisitos de Contraseña", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Esta cuenta no está registrada en nuestro sistema", "Datos Incorrectos y/o Inexistentes", JOptionPane.ERROR_MESSAGE);
            }
        }
        limpiar();
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void limpiar() {
        txtFPassword.setText("");
        txtFConfirmarPassword.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModificarPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfirmarPassword;
    private javax.swing.JLabel lblIconoModificarPassword;
    private javax.swing.JLabel lblNControl;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField txtFConfirmarPassword;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JPasswordField txtFPassword;
    // End of variables declaration//GEN-END:variables
}
