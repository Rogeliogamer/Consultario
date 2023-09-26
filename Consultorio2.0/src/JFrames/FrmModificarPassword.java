package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import javax.swing.JOptionPane;

public class FrmModificarPassword extends javax.swing.JFrame {

    Funciones fn = new Funciones();
    FuncionesValidar validar = new FuncionesValidar();

    public FrmModificarPassword() {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl); // PlaceHolder para el campo "N. Control"
        TextPrompt pHPassword = new TextPrompt("Nueva Contraseña", txtFPassword); // PlaceHolder para el campo "Password"
        TextPrompt pHConfirmacionPassword = new TextPrompt("Confirmar Contraseña", txtFConfirmarPassword); // PlaceHolder para el campo "Confirmar Password"

        validar.validarNControlRegex(txtFNControl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNControl = new javax.swing.JLabel();
        txtFNControl = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblConfirmarPassword = new javax.swing.JLabel();
        txtFConfirmarPassword = new javax.swing.JPasswordField();
        txtFPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setPreferredSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 360));

        lblNControl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNControl.setForeground(new java.awt.Color(255, 255, 255));
        lblNControl.setText("No. de Control:");

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña:");

        lblConfirmarPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmarPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmarPassword.setText("Confirmar Contraseña:");

        txtFConfirmarPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFConfirmarPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFConfirmarPassword.setMargin(new java.awt.Insets(3, 8, 3, 8));

        txtFPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFPassword.setMargin(new java.awt.Insets(3, 8, 3, 8));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Contraseña");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConfirmarPassword)
                                    .addComponent(lblPassword)
                                    .addComponent(lblNControl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFConfirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNControl)
                    .addComponent(txtFNControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmarPassword)
                    .addComponent(txtFConfirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
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
        VariablesGlobales.frm_registrarUsuario.setVisible(true);
        limpiar();
        txtFNControl.setText("");
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
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
        } else {
            // La sentencia SQL evalua implicitamente la posibilidad de una cuenta erronea y/o inexistente.
            if (fn.verificarExistencia(nControlExiste) == true) {
                // Evaluamos la robustosidad de la contraseña.
                if (validar.validarPasswordRegex(password) == true) {
                    // Evaluamos si las contraseñas son iguales
                    if (password.equals(confirmacionPassword)) {
                        if (fn.verificarExistencia(passwordAnterior) == true) {
                            JOptionPane.showMessageDialog(this, "La contraseña ingresada es igual a tu anterior contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            fn.ejecutarSentencia("UPDATE Usuario SET Contrasenya = '" + password
                                    + "' WHERE Numero_Control = " + nControl);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Las contraseñas ingresadas no coinciden.", "Contraseña Incorrecta", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La contraseña proporcionada no cumple con los estándares mínimos de seguridad.", "Contraseña Insegura", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfirmarPassword;
    private javax.swing.JLabel lblNControl;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPasswordField txtFConfirmarPassword;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JPasswordField txtFPassword;
    // End of variables declaration//GEN-END:variables
}
