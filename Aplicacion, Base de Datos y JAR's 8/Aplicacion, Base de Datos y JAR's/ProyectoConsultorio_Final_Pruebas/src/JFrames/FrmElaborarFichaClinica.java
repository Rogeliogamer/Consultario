package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import javax.swing.JOptionPane;

public class FrmElaborarFichaClinica extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.

    String nControlA, nombreA, alergias, recomendaciones, observaciones, pesoKg, estaturaCm, fechaNacimiento, edad, genero;
    String nControlM, nombreM;
    String[] fechaCreacion;

    public FrmElaborarFichaClinica() {
        initComponents();

        this.setLocationRelativeTo(null);

        camposFicha(false);
        btnConfirmar(false);
        btnCancelar(false);

        configurarTextArea();
        cargarPlaceHolders();
        cargarImagenesBtns();
        cargarValidaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFNControl = new javax.swing.JTextField();
        btnCargarDatos = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTitular = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtFNombreA = new javax.swing.JTextField();
        txtFGenero = new javax.swing.JTextField();
        txtFEdad = new javax.swing.JTextField();
        txtFNacimiento = new javax.swing.JTextField();
        txtFPeso = new javax.swing.JTextField();
        txtFEstatura = new javax.swing.JTextField();
        txtFNombreM = new javax.swing.JTextField();
        txtFActivacionFecha = new javax.swing.JTextField();
        txtFActivacionHora = new javax.swing.JTextField();
        lblAlergias = new javax.swing.JLabel();
        jScrollPaneAAlergias = new javax.swing.JScrollPane();
        txtAAlergias = new javax.swing.JTextArea();
        lblRecomendaciones = new javax.swing.JLabel();
        jScrollPaneARecomendaciones = new javax.swing.JScrollPane();
        txtARecomendaciones = new javax.swing.JTextArea();
        jScrollPaneAObservaciones = new javax.swing.JScrollPane();
        txtAObservaciones = new javax.swing.JTextArea();
        lblObservaciones = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        lblMedico = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 520));

        jPanel1.setBackground(new java.awt.Color(3, 102, 102));

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(160, 30));

        btnCargarDatos.setBackground(new java.awt.Color(3, 102, 102));
        btnCargarDatos.setBorder(null);
        btnCargarDatos.setFocusPainted(false);
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(3, 102, 102));
        btnConfirmar.setBorder(null);
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(3, 102, 102));
        btnCancelar.setBorder(null);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTitular.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setText("Activar Ficha Clínica");
        lblTitular.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitular)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitular))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(36, 130, 119));
        jPanel2.setPreferredSize(new java.awt.Dimension(748, 409));

        txtFNombreA.setEditable(false);
        txtFNombreA.setBackground(new java.awt.Color(255, 255, 255));
        txtFNombreA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombreA.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNombreA.setToolTipText("");
        txtFNombreA.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombreA.setFocusable(false);
        txtFNombreA.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombreA.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFNombreA.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFNombreA.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFNombreA.setRequestFocusEnabled(false);

        txtFGenero.setEditable(false);
        txtFGenero.setBackground(new java.awt.Color(255, 255, 255));
        txtFGenero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFGenero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFGenero.setToolTipText("");
        txtFGenero.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFGenero.setFocusable(false);
        txtFGenero.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFGenero.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFGenero.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFGenero.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFGenero.setRequestFocusEnabled(false);

        txtFEdad.setEditable(false);
        txtFEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtFEdad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFEdad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFEdad.setToolTipText("");
        txtFEdad.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFEdad.setFocusable(false);
        txtFEdad.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFEdad.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFEdad.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFEdad.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFEdad.setRequestFocusEnabled(false);

        txtFNacimiento.setEditable(false);
        txtFNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFNacimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNacimiento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNacimiento.setToolTipText("");
        txtFNacimiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNacimiento.setFocusable(false);
        txtFNacimiento.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNacimiento.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFNacimiento.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFNacimiento.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFNacimiento.setRequestFocusEnabled(false);

        txtFPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFPeso.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFPeso.setToolTipText("");
        txtFPeso.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFPeso.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFPeso.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFPeso.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFPeso.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFEstatura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFEstatura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFEstatura.setToolTipText("");
        txtFEstatura.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFEstatura.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFEstatura.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFEstatura.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFEstatura.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFNombreM.setEditable(false);
        txtFNombreM.setBackground(new java.awt.Color(255, 255, 255));
        txtFNombreM.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombreM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNombreM.setToolTipText("");
        txtFNombreM.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombreM.setFocusable(false);
        txtFNombreM.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombreM.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFNombreM.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFNombreM.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFNombreM.setRequestFocusEnabled(false);

        txtFActivacionFecha.setEditable(false);
        txtFActivacionFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFActivacionFecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFActivacionFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFActivacionFecha.setToolTipText("");
        txtFActivacionFecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFActivacionFecha.setFocusable(false);
        txtFActivacionFecha.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFActivacionFecha.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFActivacionFecha.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFActivacionFecha.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFActivacionFecha.setRequestFocusEnabled(false);

        txtFActivacionHora.setEditable(false);
        txtFActivacionHora.setBackground(new java.awt.Color(255, 255, 255));
        txtFActivacionHora.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFActivacionHora.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFActivacionHora.setToolTipText("");
        txtFActivacionHora.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFActivacionHora.setFocusable(false);
        txtFActivacionHora.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFActivacionHora.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFActivacionHora.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFActivacionHora.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFActivacionHora.setRequestFocusEnabled(false);

        lblAlergias.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblAlergias.setForeground(new java.awt.Color(255, 255, 255));
        lblAlergias.setText("Alergias");
        lblAlergias.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtAAlergias.setColumns(20);
        txtAAlergias.setRows(5);
        txtAAlergias.setBorder(null);
        txtAAlergias.setName(""); // NOI18N
        jScrollPaneAAlergias.setViewportView(txtAAlergias);

        lblRecomendaciones.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblRecomendaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblRecomendaciones.setText("Seguimiento y Recomendaciones");
        lblRecomendaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtARecomendaciones.setColumns(20);
        txtARecomendaciones.setRows(5);
        txtARecomendaciones.setBorder(null);
        txtARecomendaciones.setName(""); // NOI18N
        jScrollPaneARecomendaciones.setViewportView(txtARecomendaciones);

        txtAObservaciones.setColumns(20);
        txtAObservaciones.setRows(5);
        txtAObservaciones.setBorder(null);
        txtAObservaciones.setName(""); // NOI18N
        jScrollPaneAObservaciones.setViewportView(txtAObservaciones);

        lblObservaciones.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblObservaciones.setText("Observaciones");
        lblObservaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

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

        btnActivar.setText("Activar Ficha");
        btnActivar.setFocusPainted(false);
        btnActivar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnActivar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnActivar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        lblMedico.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblMedico.setForeground(new java.awt.Color(255, 255, 255));
        lblMedico.setText("Médico que realiza la activación de la Ficha Clínica:");
        lblMedico.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblAlumno.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblAlumno.setForeground(new java.awt.Color(255, 255, 255));
        lblAlumno.setText("Información basica del alumno:");
        lblAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblFecha.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Activación:");
        lblFecha.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblAlumno)
                                .addGap(152, 152, 152))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneAAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlergias))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRecomendaciones)
                            .addComponent(jScrollPaneARecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObservaciones)
                            .addComponent(jScrollPaneAObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblMedico)
                                    .addGap(13, 13, 13))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFActivacionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFActivacionHora, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtFNombreM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFNombreM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFActivacionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFActivacionHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblRecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneARecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneAObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFNombreA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(lblAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneAAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        nControlA = txtFNControl.getText();
        if (!nControlA.isEmpty()) {
            String nControlExisteSQL = "SELECT Numero_Control FROM Alumno WHERE Numero_Control = " + nControlA;
            if (fn.verificarExistencia(nControlExisteSQL)) {
                String fichaExisteSQL = "SELECT Id_Ficha_Clinica FROM Ficha_Clinica WHERE Alumno_Numero_Control = " + nControlA;
                if (!fn.verificarExistencia(fichaExisteSQL)) {
                    obtenerDatos();
                    cargarDatos();
                    
                    txtFNControl.setEnabled(false);
                    btnCargarDatos.setEnabled(false);
                    
                    btnConfirmar(true);
                    btnCancelar(true);
                } else {
                    mostrarError("Ficha Existente", "Este alumno ya tiene una ficha activa");
                }
            } else {
                mostrarError("Alumno no encontrado", "El número de control no existe o no pertenece a un alumno");
            }
        } else {
            mostrarError("Campo vacio", "Escribe un número de control");
        }
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        camposFicha(true);
        btnConfirmar(false);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        camposFicha(false);
        btnConfirmar(false);
        btnCancelar(false);

        txtFNControl.setEnabled(true);
        btnCargarDatos.setEnabled(true);
        txtFNControl.requestFocus();

        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuMedico frm_menu_medico = new FrmMenuMedico();
        frm_menu_medico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        obtenerVariables();
        if (!camposVacios()) {
            insertarFichaClinica();
            
            txtFNControl.setEnabled(true);
            btnCargarDatos.setEnabled(true);
            
            camposFicha(false);
            btnConfirmar(false);
            btnCancelar(false);
            limpiarCampos();
        } else {
            mostrarError("Datos faltantes", "Completa todos los campos");
        }
    }//GEN-LAST:event_btnActivarActionPerformed

    // Método para obtener la última ID en la tabla de fichas clinicas.
    private String obtenerIdMaxFichaClinica() {
        String idMaxSQL = "SELECT MAX(Id_Ficha_Clinica) FROM Ficha_Clinica";
        String idMax = fn.obtenerResultado(idMaxSQL);

        if (idMax == null || idMax.equalsIgnoreCase("null")) {
            return "1";
        } else {
            int idActual = Integer.parseInt(idMax) + 1;
            return Integer.toString(idActual);
        }
    }

    // Método para insertar una nueva ficha clinica.
    private void insertarFichaClinica() {
        String idFichaClinica = obtenerIdMaxFichaClinica();
        String recetaMedicamentoSQL = "INSERT INTO Ficha_Clinica(Id_Ficha_Clinica, Alumno_Numero_Control, Nombre_Medico, Alergias, Recomendaciones, Observaciones, PesoKg, AlturaCm, Fecha_Actualizacion, Hora_Actualizacion) "
                + "VALUES (" + idFichaClinica + ", " + nControlA + ", '" + nombreM + "', '" + alergias + "', '" + recomendaciones + "', '" + observaciones + "', " + pesoKg + ", " + estaturaCm + ", '" + fechaCreacion[0] + "', '" + fechaCreacion[1] + "')";
        fn.ejecutarSentencia(recetaMedicamentoSQL, true);
    }

    // Método para obtener los datos a mostrar en los campos no accesibles.
    private void obtenerDatos() {
        String nombreCompletoASQL = "SELECT CONCAT(Nombre_Alumno, ' ', Apellido_Alumno) AS NombreCompletoA FROM Alumno WHERE Numero_Control = " + nControlA;
        nombreA = fn.obtenerResultado(nombreCompletoASQL);

        String fechaNSQL = "SELECT Fecha_Nacimiento FROM Alumno WHERE Numero_Control =" + nControlA;
        String generoSQL = "SELECT Genero FROM Alumno WHERE Numero_Control = " + nControlA;

        fechaNacimiento = fn.obtenerResultado(fechaNSQL);
        genero = fn.obtenerResultado(generoSQL);
        edad = Integer.toString(fe.calcularEdad(fe.convertirStringADate(fechaNacimiento), fe.obtenerFechaActual()));

        nControlM = VariablesGlobales.numeroDeControl;
        String nombreCompletoMSQL = "SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS NombreCompletoM FROM Medico WHERE Numero_Control = " + nControlM;
        nombreM = fn.obtenerResultado(nombreCompletoMSQL);

        fechaCreacion = fe.separarFechaYHora(fe.obtenerFechaActual().toString());
    }
    
    // Método para cargar los datos obtenidos en los campos no accesibles.
    private void cargarDatos() {
        txtFNombreA.setText(nombreA);
        txtFNombreM.setText(nombreM);
        txtFNacimiento.setText(fechaNacimiento);
        txtFGenero.setText(genero);
        txtFEdad.setText(edad);

        txtFActivacionFecha.setText(fechaCreacion[0]);
        txtFActivacionHora.setText(fechaCreacion[1]);
    }
    
    // Método para activar o desactivar los campos editables.
    private void camposFicha(boolean opcion) {
        lblAlergias.setVisible(opcion);
        jScrollPaneAAlergias.setEnabled(opcion);
        jScrollPaneAAlergias.setVisible(opcion);

        lblRecomendaciones.setVisible(opcion);
        jScrollPaneARecomendaciones.setEnabled(opcion);
        jScrollPaneARecomendaciones.setVisible(opcion);

        lblObservaciones.setVisible(opcion);
        jScrollPaneAObservaciones.setEnabled(opcion);
        jScrollPaneAObservaciones.setVisible(opcion);

        txtFPeso.setEnabled(opcion);
        txtFPeso.setVisible(opcion);
        txtFEstatura.setEnabled(opcion);
        txtFEstatura.setVisible(opcion);

        btnActivar.setEnabled(opcion);
        btnActivar.setVisible(opcion);
    }

     // Método para activar o desactivar el botón de confirmar (Icono Verde).
    private void btnConfirmar(boolean opcion) {
        btnConfirmar.setEnabled(opcion);
        btnConfirmar.setVisible(opcion);
    }

    // Método para activar o desactivar el botón de cancelar (Icono Rojo).
    private void btnCancelar(boolean opcion) {
        btnCancelar.setEnabled(opcion);
        btnCancelar.setVisible(opcion);
    }

    // Método para comprobar la existencia del contenido de los campos necesarios.
    private Boolean camposVacios() {
        return alergias.isEmpty() || recomendaciones.isEmpty() || observaciones.isEmpty() || pesoKg.isEmpty() || estaturaCm.isEmpty();
    }
    
    // Método para obtener los valores de los campos editables.
    private void obtenerVariables() {
        alergias = txtAAlergias.getText();
        recomendaciones = txtARecomendaciones.getText();
        observaciones = txtAObservaciones.getText();
        pesoKg = txtFPeso.getText();
        estaturaCm = txtFEstatura.getText();
    }

    // Método para mostrar mensajes de error.
    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    // Método para limpiar TODOS los campos Editables o NO Editables.
    private void limpiarCampos() {
        txtFNControl.setText("");
        txtFNombreA.setText("");
        txtFNacimiento.setText("");
        txtFEdad.setText("");
        txtFGenero.setText("");
        txtFNombreM.setText("");
        txtFActivacionFecha.setText("");
        txtFActivacionHora.setText("");
        txtFPeso.setText("");
        txtFEstatura.setText("");

        txtAAlergias.setText("");
        txtARecomendaciones.setText("");
        txtAObservaciones.setText("");

        txtFNControl.requestFocus();
    }

    // Método para cargar todos los Place Holder de los TextField.
    private void cargarPlaceHolders() {
        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl);
        TextPrompt pHNNombre = new TextPrompt("Nombre del Alumno", txtFNombreA);
        TextPrompt pHNGenero = new TextPrompt("H/M", txtFGenero);
        TextPrompt pHNFechaNacimiento = new TextPrompt("Fecha de Nacimiento", txtFNacimiento);
        TextPrompt pHNEdad = new TextPrompt("Edad del Alumno", txtFEdad);
        TextPrompt pHPeso = new TextPrompt("Kg", txtFPeso);
        TextPrompt pHAltura = new TextPrompt("Cm", txtFEstatura);
        TextPrompt pHMedico = new TextPrompt("Médico que realiza la activación", txtFNombreM);
        TextPrompt pHFechaEmision = new TextPrompt("Fecha de Activación", txtFActivacionFecha);
        TextPrompt pHHoraEmision = new TextPrompt("Hora de Activación", txtFActivacionHora);
    }

    // Método para cargar las imágenes en los Button.
    private void cargarImagenesBtns() {
        btnCargarDatos.setIcon(di.pintarImagenBtn(btnCargarDatos, "src/Imagenes/IMG_Icono_Lupa.png"));
        btnConfirmar.setIcon(di.pintarImagenBtn(btnConfirmar, "src/Imagenes/IMG_Icono_Confirmar.png"));
        btnCancelar.setIcon(di.pintarImagenBtn(btnCancelar, "src/Imagenes/IMG_Icono_Cancelar.png"));
    }

    // Método para activar las validaciones de los campos.
    private void cargarValidaciones() {
        validar.validarNControlRegex(txtFNControl);
        validar.validarIDn3(txtFPeso);
        validar.validarIDn3(txtFEstatura);
    }

    // Método para configurar el comportamiento de los TextArea.
    private void configurarTextArea() {
        txtAAlergias.setLineWrap(true);
        txtAAlergias.setWrapStyleWord(true);
        txtARecomendaciones.setLineWrap(true);
        txtARecomendaciones.setWrapStyleWord(true);
        txtAObservaciones.setLineWrap(true);
        txtAObservaciones.setWrapStyleWord(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmElaborarFichaClinica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneAAlergias;
    private javax.swing.JScrollPane jScrollPaneAObservaciones;
    private javax.swing.JScrollPane jScrollPaneARecomendaciones;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRecomendaciones;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JTextArea txtAAlergias;
    private javax.swing.JTextArea txtAObservaciones;
    private javax.swing.JTextArea txtARecomendaciones;
    private javax.swing.JTextField txtFActivacionFecha;
    private javax.swing.JTextField txtFActivacionHora;
    private javax.swing.JTextField txtFEdad;
    private javax.swing.JTextField txtFEstatura;
    private javax.swing.JTextField txtFGenero;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JTextField txtFNacimiento;
    private javax.swing.JTextField txtFNombreA;
    private javax.swing.JTextField txtFNombreM;
    private javax.swing.JTextField txtFPeso;
    // End of variables declaration//GEN-END:variables
}
