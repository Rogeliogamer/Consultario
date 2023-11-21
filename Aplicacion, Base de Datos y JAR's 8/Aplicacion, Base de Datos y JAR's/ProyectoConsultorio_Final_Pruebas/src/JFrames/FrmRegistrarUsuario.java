package JFrames;

import Complementos.VariablesGlobales;
import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.TextPrompt;
import Complementos.FuncionesValidar;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmRegistrarUsuario extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesFecha fe = new FuncionesFecha();

    String nControl = "";
    String password = "";
    String rolSeleccionado = "";
    String nombre = "";
    String apellido = "";
    String telefono = "";
    String telefonoEmergencia = "";
    String correo = "";
    String[] resultado;
    char genero;
    LocalDate fechaPredeterminada = LocalDate.of(1995, 1, 1);
    Date fechaPredeterminadaDate = java.sql.Date.valueOf(fechaPredeterminada);

    String municipio, estado, codigoP, calle, numeroI, numeroE;

    public FrmRegistrarUsuario() {
        initComponents();

        this.setLocationRelativeTo(null);

        actualizarCombobox();

        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl);
        TextPrompt pHPassword = new TextPrompt("Contraseña", txtFPassword);
        TextPrompt pHNombre = new TextPrompt("Nombre", txtFNombre);
        TextPrompt pHApellido = new TextPrompt("Apellido", txtFApellido);
        TextPrompt pHTelefono = new TextPrompt("Tel.", txtFTelefono);
        TextPrompt pHTelefonoEmergencia = new TextPrompt("Tel. Emergencia", txtFTelefonoEmergencia);
        TextPrompt pHCorreo = new TextPrompt("correo@example.com", txtFCorreo);
        TextPrompt pHCodigoPostal = new TextPrompt("Código Postal", txtFCodigoPostal);
        TextPrompt pHCalle = new TextPrompt("Calle", txtFCalle);
        TextPrompt pHNumeroInterior = new TextPrompt("Núm. Int", txtFNumeroInterior);
        TextPrompt pHNumeroExterior = new TextPrompt("Núm. Ext (Opcional)", txtFNumeroExterior);

        validar.validarNControlRegex(txtFNControl);
        validar.validarNombreApellidoRegex(txtFNombre);
        validar.validarNombreApellidoRegex(txtFApellido);
        validar.validarTelefonoRegex(txtFTelefono);
        validar.validarTelefonoRegex(txtFTelefonoEmergencia);
        validar.validarCorreoElectronicoEnTiempoReal(txtFCorreo, btnRegistrarUsuario);
        validar.validarCodigoPostalRegex(txtFCodigoPostal);
        validar.validarNumeroDe5Digitos(txtFNumeroInterior);
        validar.validarNumeroDe5Digitos(txtFNumeroExterior);

        segundoPaso(false, true);

        opcionesGenero.add(rbGHombre);
        opcionesGenero.add(rbGMujer);

        dpFechaNacimiento.setDate(fechaPredeterminadaDate);

        CboxMunicipio.addItem("Municipio");

        CboxEstado.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object selected = CboxEstado.getSelectedItem();
                    if (selected.toString().equals("Estado")) {
                        CboxMunicipio.removeAllItems();
                        CboxMunicipio.addItem("Municipio");
                    } else {
                        cargarCmbMunicipios(selected.toString());
                    }
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesGenero = new javax.swing.ButtonGroup();
        jPRegistrarUsuario = new javax.swing.JPanel();
        CboxRol = new javax.swing.JComboBox<>();
        btnRegistrarUsuario = new javax.swing.JButton();
        txtFNControl = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblNControl = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtFPassword = new javax.swing.JPasswordField();
        txtFNombre = new javax.swing.JTextField();
        txtFApellido = new javax.swing.JTextField();
        txtFCorreo = new javax.swing.JTextField();
        txtFTelefono = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblGenero = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        rbGHombre = new javax.swing.JRadioButton();
        rbGMujer = new javax.swing.JRadioButton();
        dpFechaNacimiento = new org.jdesktop.swingx.JXDatePicker();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificarPassword = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        txtFTelefonoEmergencia = new javax.swing.JTextField();
        txtFCodigoPostal = new javax.swing.JTextField();
        CboxMunicipio = new javax.swing.JComboBox<>();
        CboxEstado = new javax.swing.JComboBox<>();
        txtFCalle = new javax.swing.JTextField();
        txtFNumeroInterior = new javax.swing.JTextField();
        txtFNumeroExterior = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

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

        lblTitulo.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registrar Nuevo Usuario");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

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
        lblFechaNacimiento.setText("F. Nac:");

        rbGHombre.setBackground(new java.awt.Color(36, 130, 119));
        rbGHombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbGHombre.setForeground(new java.awt.Color(255, 255, 255));
        rbGHombre.setText("Hombre");

        rbGMujer.setBackground(new java.awt.Color(36, 130, 119));
        rbGMujer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbGMujer.setForeground(new java.awt.Color(255, 255, 255));
        rbGMujer.setText("Mujer");

        dpFechaNacimiento.setMaximumSize(new java.awt.Dimension(30, 24));
        dpFechaNacimiento.setMinimumSize(new java.awt.Dimension(30, 24));
        dpFechaNacimiento.setPreferredSize(new java.awt.Dimension(30, 24));
        dpFechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpFechaNacimientoPropertyChange(evt);
            }
        });

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

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));

        txtFTelefonoEmergencia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFTelefonoEmergencia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFTelefonoEmergencia.setToolTipText("");
        txtFTelefonoEmergencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFTelefonoEmergencia.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFTelefonoEmergencia.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFTelefonoEmergencia.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFTelefonoEmergencia.setPreferredSize(new java.awt.Dimension(120, 28));

        txtFCodigoPostal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFCodigoPostal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFCodigoPostal.setToolTipText("");
        txtFCodigoPostal.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFCodigoPostal.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFCodigoPostal.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFCodigoPostal.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFCodigoPostal.setPreferredSize(new java.awt.Dimension(120, 28));

        CboxMunicipio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxMunicipio.setBorder(null);
        CboxMunicipio.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxMunicipio.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxMunicipio.setPreferredSize(new java.awt.Dimension(160, 30));

        CboxEstado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxEstado.setBorder(null);
        CboxEstado.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxEstado.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxEstado.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFCalle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFCalle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFCalle.setToolTipText("");
        txtFCalle.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFCalle.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFCalle.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFCalle.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFCalle.setPreferredSize(new java.awt.Dimension(120, 28));

        txtFNumeroInterior.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNumeroInterior.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNumeroInterior.setToolTipText("");
        txtFNumeroInterior.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNumeroInterior.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNumeroInterior.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFNumeroInterior.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFNumeroInterior.setPreferredSize(new java.awt.Dimension(120, 28));

        txtFNumeroExterior.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNumeroExterior.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNumeroExterior.setToolTipText("");
        txtFNumeroExterior.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNumeroExterior.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNumeroExterior.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFNumeroExterior.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFNumeroExterior.setPreferredSize(new java.awt.Dimension(120, 28));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado");

        lblMunicipio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lblMunicipio.setText("Municipio");

        javax.swing.GroupLayout jPRegistrarUsuarioLayout = new javax.swing.GroupLayout(jPRegistrarUsuario);
        jPRegistrarUsuario.setLayout(jPRegistrarUsuarioLayout);
        jPRegistrarUsuarioLayout.setHorizontalGroup(
            jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarUsuarioLayout.createSequentialGroup()
                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblRol)
                                    .addComponent(lblNControl))
                                .addGap(18, 18, 18)
                                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CboxRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFNControl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarUsuarioLayout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarUsuarioLayout.createSequentialGroup()
                                .addComponent(lblFechaNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                                .addComponent(txtFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFTelefonoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                                .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFNumeroInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFNumeroExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CboxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                        .addComponent(lblGenero)
                                        .addGap(24, 24, 24)
                                        .addComponent(rbGHombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbGMujer)))
                                .addGap(26, 26, 26))))
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMunicipio)
                        .addGap(58, 58, 58))))
            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPRegistrarUsuarioLayout.setVerticalGroup(
            jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNControl))
                        .addGap(12, 12, 12)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CboxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRol))
                        .addGap(12, 12, 12)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(jPRegistrarUsuarioLayout.createSequentialGroup()
                                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFTelefonoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstado)
                            .addComponent(lblMunicipio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CboxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFNumeroInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFNumeroExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(rbGHombre)
                            .addComponent(rbGMujer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFechaNacimiento)
                                .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        obtenerVariablesSegundoPaso();

        if (rolSeleccionado.equals("Alumno")) {
            if (camposVaciosSegundoPaso(true)) {
                mostrarError("Verifica los datos", "Completa todos los campos");
            } else {
                if (rbGHombre.isSelected()) {
                    genero = 'H';
                } else if (rbGMujer.isSelected()) {
                    genero = 'M';
                }
                String fechaHora = dpFechaNacimiento.getDate().toString();
                resultado = fe.separarFechaYHora(fechaHora); //parseFechaHora(fechaHora);
                insertarDatos();
                insertarUsuario();
                segundoPaso(false, true);
                limpiarSegundoPaso();
                limpiarPrimerPaso();
                primerPaso(true);
            }
        } else {
            if (camposVaciosSegundoPaso(false)) {
                mostrarError("Verifica los datos", "Completa todos los campos");
            } else {
                insertarDatos();
                insertarUsuario();
                segundoPaso(false, false);
                limpiarSegundoPaso();
                primerPaso(true);
                limpiarPrimerPaso();
            }
        }
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        obtenerVariablesPrimerPaso();
        String registradoAnteriormente = "SELECT Numero_Control FROM Usuario WHERE Numero_Control = " + nControl;

        if (camposVaciosPrimerPaso()) { // Se evalua la posibilidad de campos sin contenido.
            mostrarError("Campos Vacíos", "Completa todos los campos");
        } else {
            if (fn.verificarExistencia(registradoAnteriormente)) { // Comprobar existencia de registro previo.
                mostrarError("Error", "Este usuario ya está registrado");
                txtFNControl.setText("");
                txtFNControl.requestFocus();
            } else {
                if (validar.validarPasswordRegex(password) == true) {
                    if (rolSeleccionado.equals("Alumno")) {
                        segundoPaso(true, true);
                        primerPaso(false);
                    } else {
                        segundoPaso(true, false);
                        primerPaso(false);
                    }
                } else {
                    mostrarError("Contraseña Insegura", "La contraseña proporcionada no cumple con los estándares mínimos de seguridad");
                    String mensaje = "Requisitos de contraseña:\n"
                            + "1. Debe contener al menos una letra minúscula (a-z).\n"
                            + "2. Debe contener al menos una letra mayúscula (A-Z).\n"
                            + "3. Debe contener al menos un dígito (0-9).\n"
                            + "4. Debe contener al menos un carácter especial (@, #, $, %, ^, &, +, =, !).\n"
                            + "5. Debe tener una longitud mínima de 8 caracteres.\n"
                            + "6. No debe contener espacios en blanco.";
                    mostrarMensaje("Requisitos de Contraseña", mensaje);
                    txtFPassword.setText("");
                    txtFPassword.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (rolSeleccionado.equals("Alumno")) {
            segundoPaso(false, true);
            limpiarSegundoPaso();
            primerPaso(true);
        } else {
            segundoPaso(false, false);
            limpiarSegundoPaso();
            primerPaso(true);
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

    private void dpFechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpFechaNacimientoPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(selectedDate);
            lblFecha.setText(formattedDate);
        }
    }//GEN-LAST:event_dpFechaNacimientoPropertyChange

    private void insertarUsuario() {
        String id_rol = "SELECT Id_Rol FROM Rol WHERE Nombre_Rol ='" + CboxRol.getSelectedItem().toString() + "'";
        fn.ejecutarSentencia("INSERT INTO Usuario VALUES (" + nControl + ",(" + id_rol + "), '" + password + "')", true);
    }

    private void insertarDatos() {
        switch (rolSeleccionado) {
            case "Alumno" ->
                fn.ejecutarSentencia("INSERT INTO Alumno (Numero_Control, Nombre_Alumno, Apellido_Alumno, "
                        + "Fecha_Nacimiento, Genero, Telefono, Telefono_Emergencia, Correo, Municipio, "
                        + "Estado, Codigo_Postal, Calle, Numero_Interior, Numero_Exterior) VALUES "
                        + "(" + nControl + ", '" + nombre + "', '" + apellido
                        + "', '" + resultado[0] + "', '" + genero + "', '" + telefono + "', '" + telefonoEmergencia + "', '" + correo + "', '" + municipio
                        + "', '" + estado + "', " + codigoP + ", '" + calle + "', " + numeroI + ", " + numeroE + ")", false);
            case "Medico" ->
                fn.ejecutarSentencia("INSERT INTO Medico (Numero_Control, Nombre_Medico, Apellido_Medico, "
                        + "Telefono, Telefono_Emergencia, Correo, Municipio, Estado, Codigo_Postal, Calle, "
                        + "Numero_Interior, Numero_Exterior) VALUES "
                        + "(" + nControl + ", '" + nombre + "', '" + apellido
                        + "', '" + telefono + "', '" + telefonoEmergencia + "', '" + correo + "', '" + municipio + "', '" + estado + "', " + codigoP + ", '" + calle
                        + "', " + numeroI + ", " + numeroE + ")", false);
            case "Secretario" ->
                fn.ejecutarSentencia("INSERT INTO Secretario (Numero_Control, Nombre_Secretario, Apellido_Secretario, "
                        + "Telefono, Telefono_Emergencia, Correo, Municipio, Estado, Codigo_Postal, Calle, "
                        + "Numero_Interior, Numero_Exterior) VALUES "
                        + "(" + nControl + ", '" + nombre + "', '" + apellido
                        + "', '" + telefono + "', '" + telefonoEmergencia + "', '" + correo + "', '" + municipio + "', '" + estado + "', " + codigoP + ", '" + calle
                        + "', " + numeroI + ", " + numeroE + ")", false);
            default -> {
            }
        }
    }

    private Boolean camposVaciosPrimerPaso() {
        return nControl.isEmpty() || password.isEmpty() || rolSeleccionado.isEmpty() || rolSeleccionado.equals("Seleccione una opcion");
    }

    private Boolean camposVaciosSegundoPaso(boolean completo) {
        if (completo == true) {
            if (!rbGHombre.isSelected() && !rbGMujer.isSelected()) {
                return true;
            }
            if (dpFechaNacimiento.getDate() == null) {
                return true;
            }
        }
        return nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || telefonoEmergencia.isEmpty() || correo.isEmpty()
                || municipio.isEmpty() || municipio.equals("Municipio") || estado.isEmpty() || estado.equals("Estado")
                || codigoP.isEmpty() || calle.isEmpty() || numeroI.isEmpty();
    }

    private void primerPaso(boolean opcion) {
        if (opcion) {
            txtFNControl.setBackground(new Color(255, 255, 255));
            txtFPassword.setBackground(new Color(255, 255, 255));
        } else {
            txtFNControl.setBackground(new Color(51, 173, 160));
            txtFPassword.setBackground(new Color(51, 173, 160));
        }

        txtFNControl.setEnabled(opcion);
        txtFPassword.setEnabled(opcion);
        CboxRol.setEnabled(opcion);
        btnAceptar.setEnabled(opcion);
        btnSalir.setEnabled(opcion);
        btnSalir.setVisible(opcion);
        btnModificarPassword.setEnabled(opcion);
        btnModificarPassword.setVisible(opcion);
    }

    private void segundoPaso(boolean opcion, boolean completo) {
        if (completo) {
            lblGenero.setVisible(opcion);
            lblEstado.setVisible(opcion);
            lblMunicipio.setVisible(opcion);
            lblFechaNacimiento.setVisible(opcion);
            lblFecha.setVisible(opcion);
            rbGHombre.setVisible(opcion);
            rbGMujer.setVisible(opcion);
            dpFechaNacimiento.setVisible(opcion);

            rbGHombre.setEnabled(opcion);
            rbGMujer.setEnabled(opcion);
            dpFechaNacimiento.setEnabled(opcion);
        }

        btnCancelar.setVisible(opcion);
        btnRegistrarUsuario.setVisible(opcion);
        txtFNombre.setVisible(opcion);
        txtFApellido.setVisible(opcion);
        txtFTelefono.setVisible(opcion);
        txtFTelefonoEmergencia.setVisible(opcion);
        txtFCorreo.setVisible(opcion);
        CboxMunicipio.setVisible(opcion);
        CboxEstado.setVisible(opcion);
        txtFCodigoPostal.setVisible(opcion);
        txtFCalle.setVisible(opcion);
        txtFNumeroInterior.setVisible(opcion);
        txtFNumeroExterior.setVisible(opcion);

        btnCancelar.setEnabled(opcion);
        btnRegistrarUsuario.setEnabled(opcion);
        txtFNombre.setEnabled(opcion);
        txtFApellido.setEnabled(opcion);
        txtFTelefono.setEnabled(opcion);
        txtFTelefonoEmergencia.setEnabled(opcion);
        txtFCorreo.setEnabled(opcion);
        CboxMunicipio.setEnabled(opcion);
        CboxEstado.setEnabled(opcion);
        txtFCodigoPostal.setEnabled(opcion);
        txtFCalle.setEnabled(opcion);
        txtFNumeroInterior.setEnabled(opcion);
        txtFNumeroExterior.setEnabled(opcion);
    }

    private void mostrarMensaje(String titulo, String contenido) {
        JOptionPane.showMessageDialog(null, contenido, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void obtenerVariablesPrimerPaso() {
        nControl = txtFNControl.getText();
        password = txtFPassword.getText();
        rolSeleccionado = CboxRol.getSelectedItem().toString();
    }

    private void obtenerVariablesSegundoPaso() {
        nombre = txtFNombre.getText();
        apellido = txtFApellido.getText();
        correo = txtFCorreo.getText();
        telefono = txtFTelefono.getText();
        telefonoEmergencia = txtFTelefonoEmergencia.getText();
        municipio = CboxMunicipio.getSelectedItem().toString();
        estado = CboxEstado.getSelectedItem().toString();
        codigoP = txtFCodigoPostal.getText();
        calle = txtFCalle.getText();
        numeroI = txtFNumeroInterior.getText();
        numeroE = txtFNumeroExterior.getText();

        if (numeroE.isEmpty()) {
            numeroE = "NULL";
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarUsuario().setVisible(true);
            }
        });
    }

    private void cargarCmbMunicipios(String estado) {
        CboxMunicipio.removeAllItems();
        String idEstadoSQL = "SELECT id FROM Estados WHERE estado = '" + estado + "'";
        String idEstado = fn.obtenerResultado(idEstadoSQL);
        CboxMunicipio = fn.llenarComboboxEyM("SELECT Municipios.municipio FROM Estados_Municipios JOIN Municipios ON Estados_Municipios.municipios_id = Municipios.id WHERE Estados_Municipios.estados_id = " + idEstado, "municipio", CboxMunicipio);
        // CboxMunicipio = fn.llenarComboboxEyM("SELECT Municipios.municipio FROM Estados_Municipios JOIN Municipios ON Estados_Municipios.municipios_id = Municipios.id WHERE Estados_Municipios.estados_id " + idEstado, "municipio", CboxMunicipio);
    }

    private void actualizarCombobox() {
        CboxRol.removeAllItems();
        CboxRol = fn.llenarCombobox("SELECT Nombre_Rol FROM Rol ORDER BY Nombre_Rol ASC",
                "Nombre_Rol", CboxRol);
        CboxEstado.removeAllItems();
        CboxEstado = fn.llenarComboboxEyM("SELECT estado FROM Estados ORDER BY estado ASC",
                "estado", CboxEstado);
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
        txtFTelefonoEmergencia.setText("");
        txtFCodigoPostal.setText("");
        txtFCalle.setText("");
        txtFNumeroInterior.setText("");
        txtFNumeroExterior.setText("");
        CboxEstado.setSelectedItem("Aguascalientes");
        cargarCmbMunicipios("Aguascalientes");

        opcionesGenero.clearSelection();
        dpFechaNacimiento.setDate(fechaPredeterminadaDate);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxEstado;
    private javax.swing.JComboBox<String> CboxMunicipio;
    private javax.swing.JComboBox<String> CboxRol;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificarPassword;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnSalir;
    private org.jdesktop.swingx.JXDatePicker dpFechaNacimiento;
    private javax.swing.JPanel jPRegistrarUsuario;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNControl;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.ButtonGroup opcionesGenero;
    private javax.swing.JRadioButton rbGHombre;
    private javax.swing.JRadioButton rbGMujer;
    private javax.swing.JTextField txtFApellido;
    private javax.swing.JTextField txtFCalle;
    private javax.swing.JTextField txtFCodigoPostal;
    private javax.swing.JTextField txtFCorreo;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JTextField txtFNumeroExterior;
    private javax.swing.JTextField txtFNumeroInterior;
    private javax.swing.JPasswordField txtFPassword;
    private javax.swing.JTextField txtFTelefono;
    private javax.swing.JTextField txtFTelefonoEmergencia;
    // End of variables declaration//GEN-END:variables
}
