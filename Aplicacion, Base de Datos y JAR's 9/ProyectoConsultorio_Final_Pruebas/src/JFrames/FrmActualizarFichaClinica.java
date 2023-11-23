package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesPDF;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FrmActualizarFichaClinica extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.

    String nControlA, nombreA, fechaNacimiento, edad, genero, pesoKg, estaturaCm, alergias, recomendaciones, observaciones, medicamentos, fechaUltimaCita;
    String nombreM;
    String[] fechaActualizacion = new String[2];
    String idFichaClinica;

    public FrmActualizarFichaClinica() {
        initComponents();

        this.setLocationRelativeTo(null);

        camposFicha(false);
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
        lblAlergias = new javax.swing.JLabel();
        jScrollPaneAAlergias = new javax.swing.JScrollPane();
        txtAAlergias = new javax.swing.JTextArea();
        txtFNacimiento = new javax.swing.JTextField();
        txtFEdad = new javax.swing.JTextField();
        txtFGenero = new javax.swing.JTextField();
        lblRecomendaciones = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        btnGuardarAlergias = new javax.swing.JButton();
        btnGuardarRecomendaciones = new javax.swing.JButton();
        btnGuardarObservaciones = new javax.swing.JButton();
        lblActualizacion = new javax.swing.JLabel();
        txtFNombreA = new javax.swing.JTextField();
        txtFCitaReciente = new javax.swing.JTextField();
        jScrollPaneARecomendaciones = new javax.swing.JScrollPane();
        txtARecomendaciones = new javax.swing.JTextArea();
        jScrollPaneAObservaciones = new javax.swing.JScrollPane();
        txtAObservaciones = new javax.swing.JTextArea();
        txtFNombreM = new javax.swing.JTextField();
        lblMedico = new javax.swing.JLabel();
        lblCitaReciente = new javax.swing.JLabel();
        txtFActualizacionFecha = new javax.swing.JTextField();
        btnGuardarEstatura = new javax.swing.JButton();
        btnGuardarPeso = new javax.swing.JButton();
        txtFActualizacionHora = new javax.swing.JTextField();
        jScrollPaneAMedicamentos = new javax.swing.JScrollPane();
        txtAMedicamentos = new javax.swing.JTextArea();
        txtFEstatura = new javax.swing.JTextField();
        txtFPeso = new javax.swing.JTextField();
        lblMedicamentosReciente = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();
        btnRestablecer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtFNControl = new javax.swing.JTextField();
        btnCargarDatos = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTitular = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 510));

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(788, 402));
        jPanel1.setMinimumSize(new java.awt.Dimension(788, 402));

        lblAlergias.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblAlergias.setForeground(new java.awt.Color(255, 255, 255));
        lblAlergias.setText("Alergias");
        lblAlergias.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtAAlergias.setColumns(20);
        txtAAlergias.setRows(5);
        txtAAlergias.setBorder(null);
        txtAAlergias.setName(""); // NOI18N
        jScrollPaneAAlergias.setViewportView(txtAAlergias);

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

        lblRecomendaciones.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblRecomendaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblRecomendaciones.setText("Seguimiento y Recomendaciones");
        lblRecomendaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblObservaciones.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblObservaciones.setText("Observaciones");
        lblObservaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnGuardarAlergias.setBackground(new java.awt.Color(36, 130, 119));
        btnGuardarAlergias.setBorder(null);
        btnGuardarAlergias.setFocusPainted(false);
        btnGuardarAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAlergiasActionPerformed(evt);
            }
        });

        btnGuardarRecomendaciones.setBackground(new java.awt.Color(36, 130, 119));
        btnGuardarRecomendaciones.setBorder(null);
        btnGuardarRecomendaciones.setFocusPainted(false);
        btnGuardarRecomendaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRecomendacionesActionPerformed(evt);
            }
        });

        btnGuardarObservaciones.setBackground(new java.awt.Color(36, 130, 119));
        btnGuardarObservaciones.setBorder(null);
        btnGuardarObservaciones.setFocusPainted(false);
        btnGuardarObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarObservacionesActionPerformed(evt);
            }
        });

        lblActualizacion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblActualizacion.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizacion.setText("Ultima Actualización");
        lblActualizacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

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

        txtFCitaReciente.setEditable(false);
        txtFCitaReciente.setBackground(new java.awt.Color(255, 255, 255));
        txtFCitaReciente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFCitaReciente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFCitaReciente.setToolTipText("");
        txtFCitaReciente.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFCitaReciente.setFocusable(false);
        txtFCitaReciente.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFCitaReciente.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFCitaReciente.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFCitaReciente.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFCitaReciente.setRequestFocusEnabled(false);

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

        lblMedico.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblMedico.setForeground(new java.awt.Color(255, 255, 255));
        lblMedico.setText("Médico que realizó el último cambio");
        lblMedico.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lblCitaReciente.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblCitaReciente.setForeground(new java.awt.Color(255, 255, 255));
        lblCitaReciente.setText("Cita más reciente");
        lblCitaReciente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtFActualizacionFecha.setEditable(false);
        txtFActualizacionFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFActualizacionFecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFActualizacionFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFActualizacionFecha.setToolTipText("");
        txtFActualizacionFecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFActualizacionFecha.setFocusable(false);
        txtFActualizacionFecha.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFActualizacionFecha.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFActualizacionFecha.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFActualizacionFecha.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFActualizacionFecha.setRequestFocusEnabled(false);

        btnGuardarEstatura.setBackground(new java.awt.Color(36, 130, 119));
        btnGuardarEstatura.setBorder(null);
        btnGuardarEstatura.setFocusPainted(false);
        btnGuardarEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEstaturaActionPerformed(evt);
            }
        });

        btnGuardarPeso.setBackground(new java.awt.Color(36, 130, 119));
        btnGuardarPeso.setBorder(null);
        btnGuardarPeso.setFocusPainted(false);
        btnGuardarPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPesoActionPerformed(evt);
            }
        });

        txtFActualizacionHora.setEditable(false);
        txtFActualizacionHora.setBackground(new java.awt.Color(255, 255, 255));
        txtFActualizacionHora.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFActualizacionHora.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFActualizacionHora.setToolTipText("");
        txtFActualizacionHora.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFActualizacionHora.setFocusable(false);
        txtFActualizacionHora.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFActualizacionHora.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFActualizacionHora.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFActualizacionHora.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFActualizacionHora.setRequestFocusEnabled(false);

        txtAMedicamentos.setEditable(false);
        txtAMedicamentos.setColumns(20);
        txtAMedicamentos.setRows(5);
        txtAMedicamentos.setBorder(null);
        txtAMedicamentos.setName(""); // NOI18N
        jScrollPaneAMedicamentos.setViewportView(txtAMedicamentos);

        txtFEstatura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFEstatura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFEstatura.setToolTipText("");
        txtFEstatura.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFEstatura.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFEstatura.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFEstatura.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFEstatura.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFPeso.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFPeso.setToolTipText("");
        txtFPeso.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFPeso.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFPeso.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFPeso.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFPeso.setPreferredSize(new java.awt.Dimension(160, 30));

        lblMedicamentosReciente.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblMedicamentosReciente.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamentosReciente.setText("Medicamentos recetados más recientes:");
        lblMedicamentosReciente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.setFocusPainted(false);
        btnGenerarPDF.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGenerarPDF.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGenerarPDF.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        btnRestablecer.setText("Reestablecer Campos");
        btnRestablecer.setFocusPainted(false);
        btnRestablecer.setMaximumSize(new java.awt.Dimension(100, 30));
        btnRestablecer.setMinimumSize(new java.awt.Dimension(100, 30));
        btnRestablecer.setPreferredSize(new java.awt.Dimension(100, 30));
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneARecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRecomendaciones)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGuardarEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGuardarPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMedico)
                                    .addComponent(txtFNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFActualizacionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFActualizacionHora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(lblActualizacion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardarRecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMedicamentosReciente)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPaneAMedicamentos, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblCitaReciente)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtFCitaReciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneAAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlergias))
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardarAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPaneAObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblObservaciones)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFNombreA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGuardarEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGuardarPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFNombreM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFActualizacionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFActualizacionHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPaneAAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneAObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardarRecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneARecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFCitaReciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCitaReciente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedicamentosReciente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneAMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(3, 102, 102));

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
        lblTitular.setText("Actualizar Ficha Clinica");
        lblTitular.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(lblTitular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(lblTitular))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        nControlA = txtFNControl.getText();
        if (!nControlA.isEmpty()) {
            String nControlExisteSQL = "SELECT Numero_Control FROM Alumno WHERE Numero_Control = " + nControlA;
            if (fn.verificarExistencia(nControlExisteSQL)) {
                String fichaExisteSQL = "SELECT Id_Ficha_Clinica FROM Ficha_Clinica WHERE Alumno_Numero_Control = " + nControlA;
                if (fn.verificarExistencia(fichaExisteSQL)) {
                    obtenerDatos();
                    cargarDatos();
                    camposFicha(true);
                    
                    txtFNControl.setEnabled(false);
                    btnCargarDatos.setEnabled(false);
                    
                    btnCancelar(true);
                } else {
                    mostrarError("Ficha Inexistente", "Este alumno no tiene una ficha activa");
                }
            } else {
                mostrarError("Alumno no encontrado", "El número de control no existe o no pertenece a un alumno");
            }
        } else {
            mostrarError("Campo vacío", "Escribe un número de control");
        }
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnCancelar(false);
        camposFicha(false);
        
        txtFNControl.setEnabled(true);
        btnCargarDatos.setEnabled(true);
        txtFNControl.requestFocus();
        
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEstaturaActionPerformed
        estaturaCm = txtFEstatura.getText();
        if (!estaturaCm.isEmpty()) {
            modificarDato("AlturaCm", estaturaCm);
            actualizarFecha();
            actualizarMedico();
        } else {
            mostrarError("Sin Contenido", "Se requiere contenido en el campo");
        }
    }//GEN-LAST:event_btnGuardarEstaturaActionPerformed

    private void btnGuardarPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPesoActionPerformed
        pesoKg = txtFPeso.getText();
        if (!pesoKg.isEmpty()) {
            modificarDato("PesoKg", pesoKg);
            actualizarFecha();
            actualizarMedico();
        } else {
            mostrarError("Sin Contenido", "Se requiere contenido en el campo");
        }
    }//GEN-LAST:event_btnGuardarPesoActionPerformed

    private void btnGuardarAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAlergiasActionPerformed
        alergias = txtAAlergias.getText();
        if (!alergias.isEmpty()) {
            modificarDato("Alergias", alergias);
            actualizarFecha();
            actualizarMedico();
        } else {
            mostrarError("Sin Contenido", "Se requiere contenido en el campo");
        }
    }//GEN-LAST:event_btnGuardarAlergiasActionPerformed

    private void btnGuardarRecomendacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRecomendacionesActionPerformed
        recomendaciones = txtARecomendaciones.getText();
        if (!recomendaciones.isEmpty()) {
            modificarDato("Recomendaciones", recomendaciones);
            actualizarFecha();
            actualizarMedico();
        } else {
            mostrarError("Sin Contenido", "Se requiere contenido en el campo");
        }
    }//GEN-LAST:event_btnGuardarRecomendacionesActionPerformed

    private void btnGuardarObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarObservacionesActionPerformed
        observaciones = txtAObservaciones.getText();
        if (!observaciones.isEmpty()) {
            modificarDato("Observaciones", observaciones);
            actualizarFecha();
            actualizarMedico();
        } else {
            mostrarError("Sin Contenido", "Se requiere contenido en el campo");
        }
    }//GEN-LAST:event_btnGuardarObservacionesActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        obtenerDatos();
        limpiarCamposEditables();
        cargarDatos();
    }//GEN-LAST:event_btnRestablecerActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuMedico frm_menu_medico = new FrmMenuMedico();
        frm_menu_medico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        String[] datosFichaClinica = {nombreA, fechaNacimiento, edad, genero, pesoKg, estaturaCm, alergias, recomendaciones, observaciones, medicamentos, fechaUltimaCita, nombreM};
        
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar PDF");
            int userSelection = fileChooser.showSaveDialog(new JFrame());

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();

                if (!filePath.endsWith(".pdf")) {
                    filePath += ".pdf";
                }

                File file = new File(filePath);

                if (file.exists()) {
                    int result = JOptionPane.showConfirmDialog(null, "El archivo ya existe. ¿Desea sobrescribirlo?", "Confirmar sobrescritura", JOptionPane.YES_NO_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                        // Lógica para crear el PDF
                        FuncionesPDF fnPDF = new FuncionesPDF();
                        fnPDF.generarFichaClinica(datosFichaClinica, filePath);
                        FrmActualizarFichaClinica frm_actualizarFichaClinica = new FrmActualizarFichaClinica();
                        frm_actualizarFichaClinica.setVisible(true);
                        dispose();
                    } else {
                        // No se ejecuta la lógica, el usuario no desea sobrescribir el archivo.
                    }
                } else {
                    // Lógica para crear el PDF si no existe un archivo previo
                    FuncionesPDF fnPDF = new FuncionesPDF();
                    fnPDF.generarFichaClinica(datosFichaClinica, filePath);
                    FrmActualizarFichaClinica frm_actualizarFichaClinica = new FrmActualizarFichaClinica();
                    frm_actualizarFichaClinica.setVisible(true);
                    dispose();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    // Método para actualizar la fecha y hora de la última modificación de la Ficha Clínica.
    private void actualizarFecha() {
        fechaActualizacion = fe.separarFechaYHora(fe.obtenerFechaActual().toString());

        // Código para actualizar la fecha de la última modificación en la Base de Datos.
        String modificarFechaSQL = "UPDATE Ficha_Clinica SET Fecha_Actualizacion = '" + fechaActualizacion[0] + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarFechaSQL, false);

        // Código para actualizar la hora de la última modificación en la Base de Datos.
        String modificarHoraSQL = "UPDATE Ficha_Clinica SET Hora_Actualizacion = '" + fechaActualizacion[1] + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarHoraSQL, false);

        // Código para actualizar la fecha y hora de la ultima modificación en la ventana de Ficha Clínica.
        txtFActualizacionFecha.setText(fechaActualizacion[0]);
        txtFActualizacionHora.setText(fechaActualizacion[1]);
    }

    // Método para actualizar el médico asociado a la última modificación de la Ficha Clínica.
    private void actualizarMedico() {
        // Código para obtener el nombre del médico que ha realizado el cambio en la Ficha Clínica.
        String nombreCompletoMSQL = "SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS NombreCompleto FROM Medico "
                + "WHERE Numero_Control = " + VariablesGlobales.numeroDeControl;
        String nombreCompletoM = fn.obtenerResultado(nombreCompletoMSQL);

        // Código para actualizar el médico asociado a la última modificación en la Base de Datos.
        String modificarMedicoSQL = "UPDATE Ficha_Clinica SET Nombre_Medico = '" + nombreCompletoM + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarMedicoSQL, false);

        // Código para actualizar el médico asociado a la última modificación en la ventana de Ficha Clínica.
        txtFNombreM.setText(nombreCompletoM);
    }

    // Método para actualizar la Base de Datos en base a cualquier campo modificado de la Ficha Clínica.
    private void modificarDato(String argumento, String valor) {
        String modificarDatoSQL = "UPDATE Ficha_Clinica SET " + argumento + " = '" + valor + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarDatoSQL, true);
    }

    // Método para obtener cualquier dato de la Ficha Clínica en la Base de Datos.
    private String obtenerDatoFichaClinica(String argumento) {
        String sql = "SELECT " + argumento + " FROM Ficha_Clinica WHERE Id_Ficha_Clinica = " + idFichaClinica;
        return fn.obtenerResultado(sql);
    }

    // Método para obtener los datos de la Ficha Clínica.
    private void obtenerDatos() {
        String idFichaClinicaSQL = "SELECT Id_Ficha_Clinica FROM Ficha_Clinica WHERE Alumno_Numero_Control = " + nControlA;
        idFichaClinica = fn.obtenerResultado(idFichaClinicaSQL);

        String nombreCompletoASQL = "SELECT CONCAT(Nombre_Alumno, ' ', Apellido_Alumno) AS NombreCompleto FROM Alumno WHERE Numero_Control = " + nControlA;
        String fechaNSQL = "SELECT Fecha_Nacimiento FROM Alumno WHERE Numero_Control = " + nControlA;
        String generoSQL = "SELECT Genero FROM Alumno WHERE Numero_Control = " + nControlA;

        nombreA = fn.obtenerResultado(nombreCompletoASQL);
        fechaNacimiento = fn.obtenerResultado(fechaNSQL);
        edad = Integer.toString(fe.calcularEdad(fe.convertirStringADate(fechaNacimiento), fe.obtenerFechaActual()));
        genero = fn.obtenerResultado(generoSQL);
        estaturaCm = obtenerDatoFichaClinica("AlturaCm");
        pesoKg = obtenerDatoFichaClinica("PesoKg");
        nombreM = obtenerDatoFichaClinica("Nombre_Medico");
        fechaActualizacion[0] = obtenerDatoFichaClinica("Fecha_Actualizacion");
        fechaActualizacion[1] = obtenerDatoFichaClinica("Hora_Actualizacion");
        alergias = obtenerDatoFichaClinica("Alergias");
        recomendaciones = obtenerDatoFichaClinica("Recomendaciones");
        observaciones = obtenerDatoFichaClinica("Observaciones");
        medicamentos = obtenerDatoFichaClinica("Medicamentos");
        fechaUltimaCita = obtenerDatoFichaClinica("Cita_Reciente");
    }
    
    // Método para cargar los datos obtenidos de la Ficha Clínica en la Base de Datos.
    private void cargarDatos() {
        txtFNombreA.setText(nombreA);
        txtFNacimiento.setText(fechaNacimiento);
        txtFEdad.setText(edad);
        txtFGenero.setText(genero);
        txtFEstatura.setText(estaturaCm);
        txtFPeso.setText(pesoKg);
        txtFNombreM.setText(nombreM);
        txtFActualizacionFecha.setText(fechaActualizacion[0]);
        txtFActualizacionHora.setText(fechaActualizacion[1]);
        txtAAlergias.setText(alergias);
        txtARecomendaciones.setText(recomendaciones);
        txtAObservaciones.setText(observaciones);

        if (!fechaUltimaCita.equals("null")) {
            txtFCitaReciente.setText(fechaUltimaCita);
        }
        if (!medicamentos.equals("null")) {
            txtAMedicamentos.setText(medicamentos);
        }
    }

    // Método para activar o desactivar toda la sección de Ficha Clínica.
    private void camposFicha(boolean opcion) {
        JLabel[] labels = {lblMedico, lblActualizacion, lblAlergias, lblRecomendaciones, lblObservaciones,
            lblCitaReciente, lblMedicamentosReciente
        };

        JTextField[] textFields = {txtFNombreA, txtFNacimiento, txtFEdad, txtFGenero, txtFNombreM,
            txtFActualizacionFecha, txtFActualizacionHora, txtFPeso, txtFEstatura, txtFCitaReciente
        };

        JScrollPane[] scrollPanes = {jScrollPaneAAlergias, jScrollPaneARecomendaciones,
            jScrollPaneAObservaciones, jScrollPaneAMedicamentos
        };

        JButton[] buttons = {btnGuardarEstatura, btnGuardarPeso, btnGuardarAlergias,
            btnGuardarRecomendaciones, btnGuardarObservaciones, btnRestablecer, btnGenerarPDF
        };

        for (JLabel label : labels) {
            label.setVisible(opcion);
        }

        for (JTextField textField : textFields) {
            textField.setVisible(opcion);
            textField.setEnabled(opcion);
        }

        for (JScrollPane scrollPane : scrollPanes) {
            scrollPane.setVisible(opcion);
            scrollPane.setEnabled(opcion);
        }

        for (JButton button : buttons) {
            button.setVisible(opcion);
            button.setEnabled(opcion);
        }
    }

    // Método para activar o desactivar el botón de cancelar (Icono Rojo).
    private void btnCancelar(boolean opcion) {
        btnCancelar.setEnabled(opcion);
        btnCancelar.setVisible(opcion);
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
        txtFActualizacionFecha.setText("");
        txtFActualizacionHora.setText("");
        txtFPeso.setText("");
        txtFEstatura.setText("");

        txtAAlergias.setText("");
        txtARecomendaciones.setText("");
        txtAObservaciones.setText("");

        txtFNControl.requestFocus();
    }
    
    // Método para limpiar TODOS los campos Editables y ayudar a reestablecer los cambios no guardados.
    private void limpiarCamposEditables() {
        txtFPeso.setText("");
        txtFEstatura.setText("");
        txtAAlergias.setText("");
        txtARecomendaciones.setText("");
        txtAObservaciones.setText("");
    }

    // Método para cargar todos los Place Holder de los TextField.
    private void cargarPlaceHolders() {
        TextPrompt pHPeso = new TextPrompt("Kg", txtFPeso);
        TextPrompt pHAltura = new TextPrompt("Cm", txtFEstatura);
    }

    // Método para cargar las imágenes en los Button.
    private void cargarImagenesBtns() {
        btnCargarDatos.setIcon(di.pintarImagenBtn(btnCargarDatos, "src/Imagenes/IMG_Icono_Lupa.png"));
        btnCancelar.setIcon(di.pintarImagenBtn(btnCancelar, "src/Imagenes/IMG_Icono_Cancelar.png"));
        btnGuardarEstatura.setIcon(di.pintarImagenBtn(btnGuardarEstatura, "src/Imagenes/IMG_Icono_Guardar.png"));
        btnGuardarPeso.setIcon(di.pintarImagenBtn(btnGuardarPeso, "src/Imagenes/IMG_Icono_Guardar.png"));
        btnGuardarAlergias.setIcon(di.pintarImagenBtn(btnGuardarAlergias, "src/Imagenes/IMG_Icono_Guardar.png"));
        btnGuardarRecomendaciones.setIcon(di.pintarImagenBtn(btnGuardarRecomendaciones, "src/Imagenes/IMG_Icono_Guardar.png"));
        btnGuardarObservaciones.setIcon(di.pintarImagenBtn(btnGuardarObservaciones, "src/Imagenes/IMG_Icono_Guardar.png"));
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
        txtAMedicamentos.setLineWrap(true);
        txtAMedicamentos.setWrapStyleWord(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActualizarFichaClinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnGuardarAlergias;
    private javax.swing.JButton btnGuardarEstatura;
    private javax.swing.JButton btnGuardarObservaciones;
    private javax.swing.JButton btnGuardarPeso;
    private javax.swing.JButton btnGuardarRecomendaciones;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneAAlergias;
    private javax.swing.JScrollPane jScrollPaneAMedicamentos;
    private javax.swing.JScrollPane jScrollPaneAObservaciones;
    private javax.swing.JScrollPane jScrollPaneARecomendaciones;
    private javax.swing.JLabel lblActualizacion;
    private javax.swing.JLabel lblAlergias;
    private javax.swing.JLabel lblCitaReciente;
    private javax.swing.JLabel lblMedicamentosReciente;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRecomendaciones;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JTextArea txtAAlergias;
    private javax.swing.JTextArea txtAMedicamentos;
    private javax.swing.JTextArea txtAObservaciones;
    private javax.swing.JTextArea txtARecomendaciones;
    private javax.swing.JTextField txtFActualizacionFecha;
    private javax.swing.JTextField txtFActualizacionHora;
    private javax.swing.JTextField txtFCitaReciente;
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
