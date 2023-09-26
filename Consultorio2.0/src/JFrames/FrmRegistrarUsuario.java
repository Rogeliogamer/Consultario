package JFrames;

import Complementos.VariablesGlobales;
import Complementos.Funciones;
import Complementos.FuncionesInterface;
import Complementos.TextPrompt;
import Complementos.FuncionesValidar;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.swing.JOptionPane;

public class FrmRegistrarUsuario extends javax.swing.JFrame {

    Funciones fn = new Funciones();
    FuncionesInterface di = new FuncionesInterface();
    FuncionesValidar validar = new FuncionesValidar();
    String nControl = "";
    String password = "";
    String nombre = "";
    String apellido = "";
    String telefono = "";
    String correo = "";
    String direccion = "";
    String[] resultado;
    char genero;
    LocalDate fechaPredeterminada = LocalDate.of(1995, 1, 1);
    Date fechaPredeterminadaDate = java.sql.Date.valueOf(fechaPredeterminada);

    public FrmRegistrarUsuario() {
        initComponents();

        this.setLocationRelativeTo(null);

        ActualizarCombobox();

        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl); // PlaceHolder para el campo "N. Control"
        TextPrompt pHPassword = new TextPrompt("Contraseña", txtFPassword); // PlaceHolder para el campo "Password"
        TextPrompt pHNombre = new TextPrompt("Nombre", txtFNombre);
        TextPrompt pHApellido = new TextPrompt("Apellido", txtFApellido);
        TextPrompt pHTelefono = new TextPrompt("8443727802", txtFTelefono);
        TextPrompt pHCorreo = new TextPrompt("ejemplo@gmail.com", txtFCorreo);
        TextPrompt pHDireccion = new TextPrompt("Dirección", txtFDireccion);

        validar.validarNControlRegex(txtFNControl);
        validar.validarNombreApellidoRegex(txtFNombre);
        validar.validarNombreApellidoRegex(txtFApellido);
        validar.validarTelefonoRegex(txtFTelefono);

        desactivarSegundoPaso(true);

        opcionesGenero.add(rbGHombre);
        opcionesGenero.add(rbGMujer);

        dpFechaNacimiento.setDate(fechaPredeterminadaDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesGenero = new javax.swing.ButtonGroup();
        jPRegistrarUsuario = new javax.swing.JPanel();
        CboxRol = new javax.swing.JComboBox<>();
        btnRegistrarUsuario = new javax.swing.JButton();
        txtFNControl = new javax.swing.JTextField();
        lblBienvenida = new javax.swing.JLabel();
        lblNControl = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtFPassword = new javax.swing.JPasswordField();
        txtFNombre = new javax.swing.JTextField();
        txtFApellido = new javax.swing.JTextField();
        txtFCorreo = new javax.swing.JTextField();
        txtFTelefono = new javax.swing.JTextField();
        txtFDireccion = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblGenero = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        rbGHombre = new javax.swing.JRadioButton();
        rbGMujer = new javax.swing.JRadioButton();
        dpFechaNacimiento = new org.jdesktop.swingx.JXDatePicker();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificarPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));

        jPRegistrarUsuario.setBackground(new java.awt.Color(36, 130, 119));
        jPRegistrarUsuario.setMaximumSize(new java.awt.Dimension(610, 360));
        jPRegistrarUsuario.setMinimumSize(new java.awt.Dimension(610, 360));
        jPRegistrarUsuario.setPreferredSize(new java.awt.Dimension(610, 360));

        CboxRol.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxRol.setBorder(null);
        CboxRol.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxRol.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxRol.setPreferredSize(new java.awt.Dimension(160, 30));

        btnRegistrarUsuario.setText("Registrar");
        btnRegistrarUsuario.setFocusPainted(false);
        btnRegistrarUsuario.setMaximumSize(new java.awt.Dimension(100, 30));
        btnRegistrarUsuario.setMinimumSize(new java.awt.Dimension(100, 30));
        btnRegistrarUsuario.setPreferredSize(new java.awt.Dimension(100, 30));
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(160, 30));

        lblBienvenida.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setText("<html><center>Registrar<br>Nuevo Usuario</center></html>");
        lblBienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblNControl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNControl.setForeground(new java.awt.Color(255, 255, 255));
        lblNControl.setText("N. Control:");

        lblRol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRol.setForeground(new java.awt.Color(255, 255, 255));
        lblRol.setText("Rol:");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña:");

        txtFPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFPassword.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFPassword.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFPassword.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFPassword.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNombre.setToolTipText("");
        txtFNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombre.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombre.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFNombre.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFNombre.setPreferredSize(new java.awt.Dimension(120, 28));

        txtFApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFApellido.setToolTipText("");
        txtFApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFApellido.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFApellido.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFApellido.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFApellido.setPreferredSize(new java.awt.Dimension(120, 28));

        txtFCorreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFCorreo.setToolTipText("");
        txtFCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFCorreo.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFCorreo.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFCorreo.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFCorreo.setPreferredSize(new java.awt.Dimension(120, 28));

        txtFTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFTelefono.setToolTipText("");
        txtFTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFTelefono.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFTelefono.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFTelefono.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFTelefono.setPreferredSize(new java.awt.Dimension(120, 28));

        txtFDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFDireccion.setToolTipText("");
        txtFDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFDireccion.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFDireccion.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFDireccion.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFDireccion.setPreferredSize(new java.awt.Dimension(120, 28));

        btnAceptar.setText("Aceptar");
        btnAceptar.setFocusPainted(false);
        btnAceptar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAceptar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAceptar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setText("Género:");

        lblFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha Nacimiento:");

        rbGHombre.setBackground(new java.awt.Color(36, 130, 119));
        rbGHombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbGHombre.setForeground(new java.awt.Color(255, 255, 255));
        rbGHombre.setText("Hombre");

        rbGMujer.setBackground(new java.awt.Color(36, 130, 119));
        rbGMujer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbGMujer.setForeground(new java.awt.Color(255, 255, 255));
        rbGMujer.setText("Mujer");

        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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

        btnModificarPassword.setText("<html><center>Modificar<br>Contraseña</center></html>");
        btnModificarPassword.setFocusPainted(false);
        btnModificarPassword.setMaximumSize(new java.awt.Dimension(100, 32));
        btnModificarPassword.setMinimumSize(new java.awt.Dimension(100, 32));
        btnModificarPassword.setPreferredSize(new java.awt.Dimension(100, 32));
        btnModificarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPRegistrarUsuarioLayout = new javax.swing.GroupLayout(jPRegistrarUsuario);
        jPRegistrarUsuario.setLayout(jPRegistrarUsuarioLayout);
        jPRegistrarUsuarioLayout.setHorizontalGroup(
            jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(lblRol)
                            .addComponent(lblNControl))
                        .addGap(18, 18, 18)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CboxRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFNControl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblFechaNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarUsuarioLayout.createSequentialGroup()
                                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblGenero)
                                        .addGap(28, 28, 28)
                                        .addComponent(rbGHombre)
                                        .addGap(27, 27, 27)
                                        .addComponent(rbGMujer))
                                    .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                            .addComponent(txtFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                            .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarUsuarioLayout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarUsuarioLayout.createSequentialGroup()
                                .addComponent(btnModificarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))))
        );
        jPRegistrarUsuarioLayout.setVerticalGroup(
            jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNControl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CboxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRol))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword)))
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(rbGHombre)
                            .addComponent(rbGMujer))
                        .addGap(18, 18, 18)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        nombre = txtFNombre.getText();
        apellido = txtFApellido.getText();
        correo = txtFCorreo.getText();
        telefono = txtFTelefono.getText();
        direccion = txtFDireccion.getText();

        if (CboxRol.getSelectedItem().toString().equals("Alumno")) {
            if (comprobarCamposVaciosSegundoPaso(true)) {
                mostrarError("Verifica los datos", "Asegurate de tener Nombre, Apellido, Genero y Fecha de Nacimiento");
            } else {
                if (rbGHombre.isSelected()) {
                    genero = 'H';
                } else if (rbGMujer.isSelected()) {
                    genero = 'M';
                }
                String fechaHora = dpFechaNacimiento.getDate().toString();
                resultado = parseFechaHora(fechaHora);
                insertarDatos();
                insertarUsuario();
                desactivarSegundoPaso(true);
                limpiarPrimerPaso();
                activarPrimerPaso();
            }
        } else {
            if (comprobarCamposVaciosSegundoPaso(false)) {
                mostrarError("Verifica los datos", "Asegurate de tener Nombre y Apellido");
            } else {
                insertarDatos();
                insertarUsuario();
                desactivarSegundoPaso(false);
                activarPrimerPaso();
                limpiarPrimerPaso();
            }
        }
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        nControl = txtFNControl.getText();
        password = txtFPassword.getText();
        String registradoAnteriormente = "SELECT Numero_Control FROM Usuario WHERE Numero_Control = " + nControl;

        if (comprobarCamposVaciosPrimerPaso()) { // Se evalua la posibilidad de campos sin contenido.
            mostrarError("Campos Vacíos", "Por favor, complete todos los campos.");
        } else {
            if (fn.verificarExistencia(registradoAnteriormente)) { // Comprobar existencia de registro previo.
                mostrarError("Error", "Este usuario ya esta registrado.");
                txtFNControl.setText("");
                txtFNControl.requestFocus();
            } else {
                if (validar.validarPasswordRegex(password) == true) {
                    if (CboxRol.getSelectedItem().toString().equals("Alumno")) {
                        activarSegundoPaso(true);
                        desactivarPrimerPaso();
                    } else {
                        activarSegundoPaso(false);
                        desactivarPrimerPaso();
                    }
                } else {
                    mostrarError("Contraseña Insegura", "La contraseña proporcionada no cumple con los estándares mínimos de seguridad.");
                    txtFPassword.setText("");
                    txtFPassword.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (CboxRol.getSelectedItem().toString().equals("Alumno")) {
            desactivarSegundoPaso(true);
            activarPrimerPaso();
        } else {
            desactivarSegundoPaso(false);
            activarPrimerPaso();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VariablesGlobales.frm_menu_secretario.setVisible(true);
        limpiarPrimerPaso();
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPasswordActionPerformed
        VariablesGlobales.frm_modificarPassword.setVisible(true);
        limpiarPrimerPaso();
        dispose();
    }//GEN-LAST:event_btnModificarPasswordActionPerformed

    private void insertarUsuario() {
        String id_rol = "SELECT Id_Rol FROM Rol WHERE Nombre_Rol ='" + CboxRol.getSelectedItem().toString() + "'";
        fn.ejecutarSentencia("INSERT INTO Usuario VALUES (" + nControl + ",(" + id_rol + "), '" + password + "')");

        JOptionPane.showMessageDialog(null, "La acción se realizó con éxito.");
    }

    private void insertarDatos() {
        switch (CboxRol.getSelectedItem().toString()) {
            case "Alumno" ->
                fn.ejecutarSentencia("INSERT INTO Alumno (Numero_Control, Nombre_Alumno, Apellido_Alumno, Fecha_Nacimiento, "
                        + "Genero, Telefono, Correo, Direccion) VALUES "
                        + "(" + nControl + ", '" + nombre + "', '" + apellido + "', '" + resultado[0] + "', '" + genero + "', '" + telefono
                        + "', '" + correo + "', '" + direccion + "')");
            case "Medico" ->
                fn.ejecutarSentencia("INSERT INTO Medico (Numero_Control, Nombre_Medico, Apellido_Medico, Telefono, Correo, Direccion) "
                        + "VALUES (" + nControl + ", '" + nombre + "', '" + apellido + "', '" + telefono + "', '" + correo + "', '" + direccion + "')");
            case "Secretario" ->
                fn.ejecutarSentencia("INSERT INTO Secretario (Numero_Control, Nombre_Secretario, Apellido_Secretario, Telefono, Correo, Direccion) "
                        + "VALUES (" + nControl + ", '" + nombre + "', '" + apellido + "', '" + telefono + "', '" + correo + "', '" + direccion + "')");
            default -> {
            }
        }
    }

    private Boolean comprobarCamposVaciosPrimerPaso() {
        return nControl.isEmpty() || password.isEmpty() || CboxRol.getSelectedItem() == null || CboxRol.getSelectedItem().toString().equals("Seleccione una opcion");
    }

    private Boolean comprobarCamposVaciosSegundoPaso(boolean completo) {
        if (completo == true) {
            if (!rbGHombre.isSelected() && !rbGMujer.isSelected()) {
                return true;
            }
            if (dpFechaNacimiento.getDate() == null) {
                return true;
            }
        }
        return nombre.isEmpty() || apellido.isEmpty();
    }

    private void activarPrimerPaso() {
        txtFNControl.setEnabled(true);
        txtFPassword.setEnabled(true);
        CboxRol.setEnabled(true);
        btnAceptar.setEnabled(true);
        btnSalir.setEnabled(true);
        btnModificarPassword.setEnabled(true);

        txtFNControl.setBackground(new Color(255, 255, 255));
        txtFPassword.setBackground(new Color(255, 255, 255));
    }

    private void desactivarPrimerPaso() {
        txtFNControl.setEnabled(false);
        txtFPassword.setEnabled(false);
        CboxRol.setEnabled(false);
        btnAceptar.setEnabled(false);
        btnSalir.setEnabled(false);
        btnModificarPassword.setEnabled(false);

        txtFNControl.setBackground(new Color(51, 173, 160));
        txtFPassword.setBackground(new Color(51, 173, 160));
    }

    private void desactivarSegundoPaso(boolean completo) {
        if (completo == true) {
            lblGenero.setVisible(false);
            lblFechaNacimiento.setVisible(false);
            rbGHombre.setVisible(false);
            rbGMujer.setVisible(false);
            dpFechaNacimiento.setVisible(false);

            rbGHombre.setEnabled(false);
            rbGMujer.setEnabled(false);
            dpFechaNacimiento.setEnabled(false);
        }

        btnCancelar.setVisible(false);
        btnRegistrarUsuario.setVisible(false);
        txtFNombre.setVisible(false);
        txtFApellido.setVisible(false);
        txtFTelefono.setVisible(false);
        txtFCorreo.setVisible(false);
        txtFDireccion.setVisible(false);

        btnCancelar.setEnabled(false);
        btnRegistrarUsuario.setEnabled(false);
        txtFNombre.setEnabled(false);
        txtFApellido.setEnabled(false);
        txtFTelefono.setEnabled(false);
        txtFCorreo.setEnabled(false);
        txtFDireccion.setEnabled(false);

        limpiarSegundoPaso();
    }

    private void activarSegundoPaso(boolean completo) {
        if (completo == true) {
            lblGenero.setVisible(true);
            lblFechaNacimiento.setVisible(true);
            rbGHombre.setVisible(true);
            rbGMujer.setVisible(true);
            dpFechaNacimiento.setVisible(true);

            rbGHombre.setEnabled(true);
            rbGMujer.setEnabled(true);
            dpFechaNacimiento.setEnabled(true);
        }

        btnCancelar.setVisible(true);
        btnRegistrarUsuario.setVisible(true);
        txtFNombre.setVisible(true);
        txtFApellido.setVisible(true);
        txtFTelefono.setVisible(true);
        txtFCorreo.setVisible(true);
        txtFDireccion.setVisible(true);

        btnCancelar.setEnabled(true);
        btnRegistrarUsuario.setEnabled(true);
        txtFNombre.setEnabled(true);
        txtFApellido.setEnabled(true);
        txtFTelefono.setEnabled(true);
        txtFCorreo.setEnabled(true);
        txtFDireccion.setEnabled(true);
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private static String[] parseFechaHora(String fechaHoraStr) {
        // Define el formato de entrada
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        String[] resultado = new String[2];

        try {
            // Parsea la cadena en un objeto Date
            Date fechaHora = formatoEntrada.parse(fechaHoraStr);

            // Define formatos de salida para fecha y hora
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

            // Extrae la fecha y la hora como cadenas separadas
            resultado[0] = formatoFecha.format(fechaHora);
            resultado[1] = formatoHora.format(fechaHora);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarUsuario().setVisible(true);
            }
        });
    }

    private void ActualizarCombobox() {
        CboxRol.removeAllItems();
        CboxRol = fn.llenarCombobox("SELECT Nombre_Rol FROM Rol ORDER BY Nombre_Rol ASC",
                "Nombre_Rol", CboxRol); // opciones de combobox de especialidad
    }

    private void limpiarPrimerPaso() {
        txtFNControl.setText("");
        txtFPassword.setText("");
        CboxRol.setSelectedIndex(0);
    }

    private void limpiarSegundoPaso() {
        txtFNombre.setText("");
        txtFApellido.setText("");
        txtFCorreo.setText("");
        txtFTelefono.setText("");
        txtFDireccion.setText("");
        opcionesGenero.clearSelection();
        dpFechaNacimiento.setDate(fechaPredeterminadaDate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxRol;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificarPassword;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnSalir;
    private org.jdesktop.swingx.JXDatePicker dpFechaNacimiento;
    private javax.swing.JPanel jPRegistrarUsuario;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNControl;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRol;
    private javax.swing.ButtonGroup opcionesGenero;
    private javax.swing.JRadioButton rbGHombre;
    private javax.swing.JRadioButton rbGMujer;
    private javax.swing.JTextField txtFApellido;
    private javax.swing.JTextField txtFCorreo;
    private javax.swing.JTextField txtFDireccion;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JPasswordField txtFPassword;
    private javax.swing.JTextField txtFTelefono;
    // End of variables declaration//GEN-END:variables
}
