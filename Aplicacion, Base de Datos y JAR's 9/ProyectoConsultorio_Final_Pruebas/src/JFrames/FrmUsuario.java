package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

public class FrmUsuario extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.

    String rol = "";
    String nombre = "";
    String telefono = "";
    String telefonoEmergencia = "";
    String correo = "";

    String municipio, estado, codigoP, calle, numeroI, numeroE;

    public FrmUsuario() {
        initComponents();

        this.setLocationRelativeTo(null);

        actualizarCombobox();

        obtenerDatos();
        cargarDatos();

        cargarImagenesBtns();
        cargarPlaceHolders();
        cargarValidaciones();

        cargarCmbMunicipios(estado);
        CboxMunicipio.setSelectedItem(municipio);

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

        jPanel1 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        lblPerfil = new javax.swing.JLabel();
        txtFNombre = new javax.swing.JTextField();
        txtFRol = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        lblNombrePerfil = new javax.swing.JLabel();
        lblRolPerfil = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        CboxEstado = new javax.swing.JComboBox<>();
        CboxMunicipio = new javax.swing.JComboBox<>();
        lblMunicipio = new javax.swing.JLabel();
        txtFCodigoPostal = new javax.swing.JTextField();
        txtFCalle = new javax.swing.JTextField();
        txtFNumeroInterior = new javax.swing.JTextField();
        txtFNumeroExterior = new javax.swing.JTextField();
        btnActualizarDireccion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtFTelefono = new javax.swing.JTextField();
        txtFTelefonoEmergencia = new javax.swing.JTextField();
        txtFCorreo = new javax.swing.JTextField();
        btnGuardarCorreo = new javax.swing.JButton();
        btnGuardarTelefonoEmergencia = new javax.swing.JButton();
        btnGuardarTelefono = new javax.swing.JButton();
        lblContacto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnEliminarCuenta.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminarCuenta.setText("Eliminar Cuenta");
        btnEliminarCuenta.setFocusPainted(false);
        btnEliminarCuenta.setMaximumSize(new java.awt.Dimension(100, 30));
        btnEliminarCuenta.setMinimumSize(new java.awt.Dimension(100, 30));
        btnEliminarCuenta.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        lblPerfil.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Información del Usuario:");
        lblPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtFNombre.setEditable(false);
        txtFNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtFNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNombre.setToolTipText("");
        txtFNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombre.setFocusable(false);
        txtFNombre.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombre.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFNombre.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFNombre.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFNombre.setRequestFocusEnabled(false);

        txtFRol.setEditable(false);
        txtFRol.setBackground(new java.awt.Color(255, 255, 255));
        txtFRol.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFRol.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFRol.setToolTipText("");
        txtFRol.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFRol.setFocusable(false);
        txtFRol.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFRol.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFRol.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFRol.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFRol.setRequestFocusEnabled(false);

        btnSalir.setText("Salir");
        btnSalir.setFocusPainted(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(100, 30));
        btnSalir.setMinimumSize(new java.awt.Dimension(100, 30));
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblNombrePerfil.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblNombrePerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePerfil.setText("Nombre del Usuario:");
        lblNombrePerfil.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblRolPerfil.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblRolPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblRolPerfil.setText("Rol del Usuario:");
        lblRolPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFRol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombrePerfil)
                            .addComponent(lblRolPerfil)))
                    .addComponent(lblPerfil)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRolPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(3, 102, 102));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado");

        CboxEstado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxEstado.setBorder(null);
        CboxEstado.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxEstado.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxEstado.setPreferredSize(new java.awt.Dimension(160, 30));

        CboxMunicipio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxMunicipio.setBorder(null);
        CboxMunicipio.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxMunicipio.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxMunicipio.setPreferredSize(new java.awt.Dimension(160, 30));

        lblMunicipio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lblMunicipio.setText("Municipio");

        txtFCodigoPostal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFCodigoPostal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFCodigoPostal.setToolTipText("");
        txtFCodigoPostal.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFCodigoPostal.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFCodigoPostal.setMaximumSize(new java.awt.Dimension(120, 28));
        txtFCodigoPostal.setMinimumSize(new java.awt.Dimension(120, 28));
        txtFCodigoPostal.setPreferredSize(new java.awt.Dimension(120, 28));

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

        btnActualizarDireccion.setText("Actualizar Dirección");
        btnActualizarDireccion.setFocusPainted(false);
        btnActualizarDireccion.setMaximumSize(new java.awt.Dimension(100, 30));
        btnActualizarDireccion.setMinimumSize(new java.awt.Dimension(100, 30));
        btnActualizarDireccion.setPreferredSize(new java.awt.Dimension(100, 30));
        btnActualizarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFNumeroInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFNumeroExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CboxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMunicipio)
                        .addGap(32, 32, 32)))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnActualizarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(lblMunicipio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CboxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFNumeroInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNumeroExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(3, 102, 102));

        txtFTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFTelefono.setToolTipText("");
        txtFTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFTelefono.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFTelefono.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFTelefono.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFTelefono.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFTelefonoEmergencia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFTelefonoEmergencia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFTelefonoEmergencia.setToolTipText("");
        txtFTelefonoEmergencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFTelefonoEmergencia.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFTelefonoEmergencia.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFTelefonoEmergencia.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFTelefonoEmergencia.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFCorreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFCorreo.setToolTipText("");
        txtFCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFCorreo.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFCorreo.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFCorreo.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFCorreo.setPreferredSize(new java.awt.Dimension(160, 30));

        btnGuardarCorreo.setBackground(new java.awt.Color(3, 102, 102));
        btnGuardarCorreo.setBorder(null);
        btnGuardarCorreo.setFocusPainted(false);
        btnGuardarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCorreoActionPerformed(evt);
            }
        });

        btnGuardarTelefonoEmergencia.setBackground(new java.awt.Color(3, 102, 102));
        btnGuardarTelefonoEmergencia.setBorder(null);
        btnGuardarTelefonoEmergencia.setFocusPainted(false);
        btnGuardarTelefonoEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTelefonoEmergenciaActionPerformed(evt);
            }
        });

        btnGuardarTelefono.setBackground(new java.awt.Color(3, 102, 102));
        btnGuardarTelefono.setBorder(null);
        btnGuardarTelefono.setFocusPainted(false);
        btnGuardarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTelefonoActionPerformed(evt);
            }
        });

        lblContacto.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblContacto.setForeground(new java.awt.Color(255, 255, 255));
        lblContacto.setText("Actualizar Contacto:");
        lblContacto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblContacto)
                        .addContainerGap(149, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFTelefonoEmergencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarTelefonoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnGuardarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addComponent(btnGuardarTelefonoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFTelefonoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTelefonoActionPerformed
        telefono = txtFTelefono.getText();
        if (!telefono.isEmpty()) {
            modificarDato("Telefono", telefono);
        } else {
            mostrarError("Sin Contenido", "Se requiere contenido en el campo");
        }
    }//GEN-LAST:event_btnGuardarTelefonoActionPerformed

    private void btnGuardarTelefonoEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTelefonoEmergenciaActionPerformed
        telefonoEmergencia = txtFTelefonoEmergencia.getText();
        if (!telefonoEmergencia.isEmpty()) {
            modificarDato("Telefono_Emergencia", telefonoEmergencia);
        } else {
            mostrarError("Sin Contenido", "Se requiere contenido en el campo");
        }
    }//GEN-LAST:event_btnGuardarTelefonoEmergenciaActionPerformed

    private void btnGuardarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCorreoActionPerformed
        correo = txtFCorreo.getText();
        if (!correo.isEmpty()) {
            modificarDato("Correo", correo);
        } else {
            mostrarError("Sin Contenido", "Se requiere contenido en el campo");
        }
    }//GEN-LAST:event_btnGuardarCorreoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        mostrarMensaje("Cerrando Sesión...", "La sesión ha sido cerrada exitosamente");
        VariablesGlobales.numeroDeControl = "";
        VariablesGlobales.rol = 0;
        FrmLogin frm_login = new FrmLogin();
        frm_login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        iniciarMenu();
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDireccionActionPerformed
        obtenerDireccion();
        if (!camposVaciosDireccion()) {
            actualizarDireccion();
        } else {
            mostrarError("Dirección Incompleta", "Completa todos los campos de dirección");
        }
    }//GEN-LAST:event_btnActualizarDireccionActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        if (confirmacion("Eliminar Cuenta", "La cuenta será eliminada, escribe \"Eliminar\" para confirmar")) {
            mostrarMensaje("Cuenta Eliminada", "Saliendo del sistema...");
            eliminarUsuario();
            eliminarCuenta();
            VariablesGlobales.numeroDeControl = "";
            VariablesGlobales.rol = 0;
            FrmLogin frm_login = new FrmLogin();
            frm_login.setVisible(true);
            dispose();
        } else {
            mostrarMensaje("Proceso Cancelado", "Cancelado Exitosamente");
        }
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void eliminarUsuario() {
        fn.ejecutarSentencia("DELETE FROM Usuario WHERE Numero_Control = " + VariablesGlobales.numeroDeControl, false);
    }

    private void eliminarCuenta() {
        fn.ejecutarSentencia("DELETE FROM " + rol + " WHERE Numero_Control = " + VariablesGlobales.numeroDeControl, false);
    }

    // Método para confirmar la eliminación del registro antes de proceder.
    private Boolean confirmacion(String titulo, String contenido) {
        String respuesta = JOptionPane.showInputDialog(this, contenido, titulo, JOptionPane.INFORMATION_MESSAGE);
        return respuesta != null && respuesta.equalsIgnoreCase("Eliminar");
    }

    private void iniciarMenu() {
        switch (VariablesGlobales.rol) {
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

    private void actualizarDireccion() {
        String modificarDirSQL = "UPDATE " + rol + " SET Municipio = '" + municipio + "', Estado = '" + estado + "', "
                + "Codigo_Postal = " + codigoP + ", Calle = '" + calle + "', numero_Interior = " + numeroI + ", "
                + "Numero_Exterior = " + numeroE + " WHERE Numero_Control = " + VariablesGlobales.numeroDeControl;
        fn.ejecutarSentencia(modificarDirSQL, true);
    }

    private void obtenerDireccion() {
        estado = CboxEstado.getSelectedItem().toString();
        municipio = CboxMunicipio.getSelectedItem().toString();
        codigoP = txtFCodigoPostal.getText();
        calle = txtFCalle.getText();
        numeroI = txtFNumeroInterior.getText();
        numeroE = txtFNumeroExterior.getText();
        if (numeroE.isEmpty()) {
            numeroE = "NULL";
        }
    }

    // Método para actualizar la Base de Datos en base a cualquier campo modificado de la Ficha Clínica.
    private void modificarDato(String argumento, String valor) {
        String modificarDatoSQL = String.format("UPDATE %s SET %s = '%s' WHERE Numero_Control = %s", rol, argumento, valor, VariablesGlobales.numeroDeControl);
        fn.ejecutarSentencia(modificarDatoSQL, true);
    }

    private void obtenerDatos() {
        rol = fn.obtenerResultado("SELECT Nombre_Rol FROM Rol WHERE Id_Rol = " + VariablesGlobales.rol);
        nombre = fn.obtenerResultado("SELECT CONCAT(Nombre_" + rol + ", ' ', Apellido_" + rol + ") AS Nombre_Completo FROM " + rol + " WHERE Numero_Control = " + VariablesGlobales.numeroDeControl);
        telefono = obtenerDato("Telefono");
        telefonoEmergencia = obtenerDato("Telefono_Emergencia");
        correo = obtenerDato("Correo");
        estado = obtenerDato("Estado");
        municipio = obtenerDato("Municipio");
        System.out.println("Estado = " + estado + " - Municipio = " + municipio);
        codigoP = obtenerDato("Codigo_Postal");
        calle = obtenerDato("Calle");
        numeroI = obtenerDato("Numero_Interior");
        numeroE = obtenerDato("Numero_Exterior");

        if (numeroE.equals("null")) {
            numeroE = "";
        }
    }

    private void cargarDatos() {
        txtFNombre.setText(nombre);
        txtFRol.setText(rol);
        txtFTelefono.setText(telefono);
        txtFTelefonoEmergencia.setText(telefonoEmergencia);
        txtFCorreo.setText(correo);
        CboxEstado.setSelectedItem(estado);
        CboxMunicipio.setSelectedItem(municipio);
        txtFCodigoPostal.setText(codigoP);
        txtFCalle.setText(calle);
        txtFNumeroInterior.setText(numeroI);
        if (numeroE.isEmpty()) {
            txtFNumeroExterior.setText("");
        } else {
            txtFNumeroExterior.setText(numeroE);
        }
    }
    // Método para obtener cualquier dato de Alumno en la Base de Datos.

    private String obtenerDato(String argumento) {
        String sql = "SELECT " + argumento + " FROM " + rol + " WHERE Numero_Control = " + VariablesGlobales.numeroDeControl;
        return fn.obtenerResultado(sql);
    }

    private Boolean camposVaciosDireccion() {
        return municipio.isEmpty() || municipio.equals("Municipio") || estado.isEmpty() || estado.equals("Estado")
                || codigoP.isEmpty() || calle.isEmpty() || numeroI.isEmpty();
    }

    // Método para mostrar mensajes de error.
    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarMensaje(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    private void cargarCmbMunicipios(String estado) {
        CboxMunicipio.removeAllItems();
        String idEstadoSQL = "SELECT id FROM Estados WHERE estado = '" + estado + "'";
        String idEstado = fn.obtenerResultado(idEstadoSQL);
        CboxMunicipio = fn.llenarComboboxEyM("SELECT Municipios.municipio FROM Estados_Municipios JOIN Municipios ON Estados_Municipios.municipios_id = Municipios.id WHERE Estados_Municipios.estados_id = " + idEstado, "municipio", CboxMunicipio);
        // CboxMunicipio = fn.llenarComboboxEyM("SELECT Municipios.municipio FROM Estados_Municipios JOIN Municipios ON Estados_Municipios.municipios_id = Municipios.id WHERE Estados_Municipios.estados_id " + idEstado, "municipio", CboxMunicipio);
    }

    private void actualizarCombobox() {
        CboxEstado.removeAllItems();
        CboxEstado = fn.llenarComboboxEyM("SELECT estado FROM Estados ORDER BY estado ASC",
                "estado", CboxEstado);
    }

    // Método para cargar las imágenes en los Button.
    private void cargarImagenesBtns() {
        btnGuardarTelefono.setIcon(di.pintarImagenBtn(btnGuardarTelefono, "src/Imagenes/IMG_Icono_Guardar.png"));
        btnGuardarTelefonoEmergencia.setIcon(di.pintarImagenBtn(btnGuardarTelefonoEmergencia, "src/Imagenes/IMG_Icono_Guardar.png"));
        btnGuardarCorreo.setIcon(di.pintarImagenBtn(btnGuardarCorreo, "src/Imagenes/IMG_Icono_Guardar.png"));
    }

    // Método para activar las validaciones de los campos.
    private void cargarValidaciones() {
        validar.validarTelefonoRegex(txtFTelefono);
        validar.validarTelefonoRegex(txtFTelefonoEmergencia);
        validar.validarCorreoElectronicoEnTiempoReal(txtFCorreo, btnGuardarCorreo);
        validar.validarCodigoPostalRegex(txtFCodigoPostal);
        validar.validarNumeroDe5Digitos(txtFNumeroInterior);
        validar.validarNumeroDe5Digitos(txtFNumeroExterior);
    }

    private void cargarPlaceHolders() {
        TextPrompt pHNombre = new TextPrompt("Nombre del Usuario", txtFNombre);
        TextPrompt pHRol = new TextPrompt("Rol del Usuario", txtFRol);
        TextPrompt pHTelefono = new TextPrompt("Teléfono", txtFTelefono);
        TextPrompt pHTelefonoEmergencia = new TextPrompt("Teléfono de Emergencia", txtFTelefonoEmergencia);
        TextPrompt pHCorreo = new TextPrompt("correo@example.com", txtFCorreo);
        TextPrompt pHCodigoPostal = new TextPrompt("Código Postal", txtFCodigoPostal);
        TextPrompt pHCalle = new TextPrompt("Calle", txtFCalle);
        TextPrompt pHNumeroInterior = new TextPrompt("Núm. Int", txtFNumeroInterior);
        TextPrompt pHNumeroExterior = new TextPrompt("Núm. Ext (Opcional)", txtFNumeroExterior);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxEstado;
    private javax.swing.JComboBox<String> CboxMunicipio;
    private javax.swing.JButton btnActualizarDireccion;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnGuardarCorreo;
    private javax.swing.JButton btnGuardarTelefono;
    private javax.swing.JButton btnGuardarTelefonoEmergencia;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombrePerfil;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblRolPerfil;
    private javax.swing.JTextField txtFCalle;
    private javax.swing.JTextField txtFCodigoPostal;
    private javax.swing.JTextField txtFCorreo;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JTextField txtFNumeroExterior;
    private javax.swing.JTextField txtFNumeroInterior;
    private javax.swing.JTextField txtFRol;
    private javax.swing.JTextField txtFTelefono;
    private javax.swing.JTextField txtFTelefonoEmergencia;
    // End of variables declaration//GEN-END:variables
}
