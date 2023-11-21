package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import javax.swing.JOptionPane;

public class FrmElaborarRecetaMedica extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.

    // Conjunto de variables no utilizadas en el registro.
    String nombreA, fechaNacimiento, genero; // Variables a extraer de la base de datos.
    String edad, nControlM, nombreCompletoM; // Variables obtenidas implícitamente.

    // Conjunto de variables que se insertan en el registro.
    String idReceta; // Variable para controlar el registro.
    String nControlA, diagnostico, peso, altura; // Variables para solicitar al usuario.
    String[] fechaEmision; // Variables obtenidas implícitamente.

    public FrmElaborarRecetaMedica() {
        initComponents();

        this.setLocationRelativeTo(null);

        cargarPlaceHolders();

        btnCargarDatos.setIcon(di.pintarImagenBtn(btnCargarDatos, "src/Imagenes/IMG_Icono_Lupa.png"));
        btnConfirmar.setIcon(di.pintarImagenBtn(btnConfirmar, "src/Imagenes/IMG_Icono_Confirmar.png"));
        btnCancelar.setIcon(di.pintarImagenBtn(btnCancelar, "src/Imagenes/IMG_Icono_Cancelar.png"));

        validar.validarNControlRegex(txtFNControl);
        validar.validarIDn3(txtFPeso);
        validar.validarIDn3(txtFAltura);

        camposReceta(false);
        btnConfirmar(false);
        btnCancelar(false);
        camposPesoYAltura(false);

        txtADiagnostico.setLineWrap(true); // Permite el retorno de línea
        txtADiagnostico.setWrapStyleWord(true); // Rompe líneas entre palabras
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        lblDiagnostico = new javax.swing.JLabel();
        jScrollPaneADiagnostico = new javax.swing.JScrollPane();
        txtADiagnostico = new javax.swing.JTextArea();
        btnMedicamento = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFNacimiento = new javax.swing.JTextField();
        txtFPeso = new javax.swing.JTextField();
        txtFAltura = new javax.swing.JTextField();
        txtFNControl = new javax.swing.JTextField();
        txtFEdad = new javax.swing.JTextField();
        txtFNombreA = new javax.swing.JTextField();
        txtFGenero = new javax.swing.JTextField();
        txtFEmisionFecha = new javax.swing.JTextField();
        txtFEmisionHora = new javax.swing.JTextField();
        txtFMedico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 360));

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));

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

        btnCargarDatos.setBackground(new java.awt.Color(36, 130, 119));
        btnCargarDatos.setBorder(null);
        btnCargarDatos.setFocusPainted(false);
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        lblDiagnostico.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblDiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        lblDiagnostico.setText("Diagnóstico");
        lblDiagnostico.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtADiagnostico.setColumns(20);
        txtADiagnostico.setRows(5);
        jScrollPaneADiagnostico.setViewportView(txtADiagnostico);

        btnMedicamento.setText("Agregar");
        btnMedicamento.setFocusPainted(false);
        btnMedicamento.setMaximumSize(new java.awt.Dimension(100, 30));
        btnMedicamento.setMinimumSize(new java.awt.Dimension(100, 30));
        btnMedicamento.setPreferredSize(new java.awt.Dimension(100, 30));
        btnMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentoActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(36, 130, 119));
        btnConfirmar.setBorder(null);
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(36, 130, 119));
        btnCancelar.setBorder(null);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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

        txtFPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtFPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFPeso.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFPeso.setToolTipText("");
        txtFPeso.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFPeso.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFPeso.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFPeso.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFPeso.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtFAltura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFAltura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFAltura.setToolTipText("");
        txtFAltura.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFAltura.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFAltura.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFAltura.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFAltura.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(160, 30));

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

        txtFEmisionFecha.setEditable(false);
        txtFEmisionFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFEmisionFecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFEmisionFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFEmisionFecha.setToolTipText("");
        txtFEmisionFecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFEmisionFecha.setFocusable(false);
        txtFEmisionFecha.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFEmisionFecha.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFEmisionFecha.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFEmisionFecha.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFEmisionFecha.setRequestFocusEnabled(false);

        txtFEmisionHora.setEditable(false);
        txtFEmisionHora.setBackground(new java.awt.Color(255, 255, 255));
        txtFEmisionHora.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFEmisionHora.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFEmisionHora.setToolTipText("");
        txtFEmisionHora.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFEmisionHora.setFocusable(false);
        txtFEmisionHora.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFEmisionHora.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFEmisionHora.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFEmisionHora.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFEmisionHora.setRequestFocusEnabled(false);

        txtFMedico.setEditable(false);
        txtFMedico.setBackground(new java.awt.Color(255, 255, 255));
        txtFMedico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFMedico.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFMedico.setToolTipText("");
        txtFMedico.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFMedico.setFocusable(false);
        txtFMedico.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFMedico.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFMedico.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFMedico.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFMedico.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPaneADiagnostico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblDiagnostico))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtFNombreA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFEmisionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFEmisionHora, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNombreA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFEmisionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFEmisionHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(lblDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneADiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        nControlA = txtFNControl.getText();
        if (!nControlA.isEmpty()) {
            String nControlExisteSQL = "SELECT Numero_Control FROM Alumno WHERE Numero_Control =" + nControlA;
            if (fn.verificarExistencia(nControlExisteSQL) == true) {
                obtenerDatos();
                cargarDatos();

                // Desactivamos los siguientes campos para evitar cambiar la informacion insertada.
                txtFNControl.setEnabled(false);
                btnCargarDatos.setEnabled(false);

                // En su lugar activamos botones para controlan si desean continuar o cancelar el proceso.
                btnConfirmar(true);
                btnCancelar(true);
            } else {
                mostrarError("Alumno NO Encontrado", "El número de control no existe o no pertenece a un alumno");
            }
        } else {
            mostrarError("Campo vacío", "Escribe un número de control");
        }
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        camposReceta(true); // Activamos los campos de peso y altura por separado.
        btnConfirmar(false);
        camposPesoYAltura(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Se cancela el proceso, por lo tanto regresamos todos los valores a su valor default.
        camposReceta(false);
        camposPesoYAltura(false);
        btnConfirmar(false);
        btnCancelar(false);

        // Activamos estos campos para permitir la insercion de contenido nuevamente.
        txtFNControl.setEnabled(true);
        btnCargarDatos.setEnabled(true);

        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentoActionPerformed
        obtenerVariables();
        insertarReceta();
        String[] datosReceta = {idReceta, nombreA, edad, genero, altura, peso, nombreCompletoM, fechaEmision[0], fechaEmision[1], diagnostico};
        FrmAgregarMedicamentoReceta frm_agregarMedicamentoReceta = new FrmAgregarMedicamentoReceta(datosReceta);
        frm_agregarMedicamentoReceta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMedicamentoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuMedico frm_menu_medico = new FrmMenuMedico();
        frm_menu_medico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Método para insertar la nueva receta.
    private void insertarReceta() {
        idReceta = obtenerIdMaxReceta();
        String recetaSQL = "INSERT INTO Receta_Medica (Id_Receta_Medica, Alumno_Numero_Control, Medico_Numero_Control, Diagnostico, PesoKg, AlturaCm, Fecha_Emision)"
                + "VALUES (" + idReceta + ", " + nControlA + ", " + nControlM + ", '" + diagnostico + "', " + peso + ", " + altura + ", '" + fechaEmision[0] + "')";
        fn.ejecutarSentencia(recetaSQL, false);
    }

    // Método para obtener la última ID en la tabla de recetas.
    private String obtenerIdMaxReceta() {
        String idMaxSQL = "SELECT MAX(Id_Receta_Medica) FROM Receta_Medica";
        String idMax = fn.obtenerResultado(idMaxSQL);

        if (idMax == null || idMax.equalsIgnoreCase("null")) {
            return "1";
        } else {
            int idActual = Integer.parseInt(idMax) + 1;
            return Integer.toString(idActual);
        }
    }

    // Método para obtener los datos a mostrar en los campos no accesibles.
    private void obtenerDatos() {
        // Sentencias SQL para recuperar los datos del alumno.
        String nombreCompletoASQL = "SELECT CONCAT(Nombre_Alumno, ' ', Apellido_Alumno) AS NombreCompleto FROM Alumno WHERE Numero_Control = " + nControlA;
        String fechaNSQL = "SELECT Fecha_Nacimiento FROM Alumno WHERE Numero_Control =" + nControlA;
        String generoSQL = "SELECT Genero FROM Alumno WHERE Numero_Control = " + nControlA;

        // Resultados de las sentencias SQL del alumno.
        nombreA = fn.obtenerResultado(nombreCompletoASQL);
        fechaNacimiento = fn.obtenerResultado(fechaNSQL);
        genero = fn.obtenerResultado(generoSQL);
        edad = Integer.toString(fe.calcularEdad(fe.convertirStringADate(fechaNacimiento), fe.obtenerFechaActual()));

        // Asignamos el valor del número de control del médico que accedió al software a la variable 'nControlM'.
        nControlM = VariablesGlobales.numeroDeControl;

        // Sentencias SQL para recuperar el nombre del Médico.
        String nombreCompletoMSQL = "SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS NombreCompleto FROM Medico WHERE Numero_Control = " + nControlM;

        // Resultados de las sentencia SQL del Médico.
        nombreCompletoM = fn.obtenerResultado(nombreCompletoMSQL);

        // Fecha obtenida implícitamente.
        fechaEmision = fe.separarFechaYHora(fe.obtenerFechaActual().toString());
    }

    // Método para cargar los datos obtenidos en los campos no accesibles.
    private void cargarDatos() {
        // Cargar los datos del alumno en los campos relacionados al alumno.
        txtFNombreA.setText(nombreA);
        txtFNacimiento.setText(fechaNacimiento);
        txtFGenero.setText(genero);
        txtFEdad.setText(edad);

        // Cargar el nombre del médico en su campo.
        txtFMedico.setText(nombreCompletoM);

        // Cargar la fecha de emisión en sus campos.
        txtFEmisionFecha.setText(fechaEmision[0]);
        txtFEmisionHora.setText(fechaEmision[1]);
    }

    // Método para activar o desactivar los campos editables.
    private void camposPesoYAltura(boolean opcion) {
        txtFPeso.setEnabled(opcion);
        txtFPeso.setVisible(opcion);
        txtFAltura.setEnabled(opcion);
        txtFAltura.setVisible(opcion);
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

    // Método para activar o desactivar el label, el área de texto grande y el botón de medicamento.
    private void camposReceta(boolean opcion) {
        lblDiagnostico.setVisible(opcion);

        jScrollPaneADiagnostico.setEnabled(opcion);
        jScrollPaneADiagnostico.setVisible(opcion);

        btnMedicamento.setEnabled(opcion);
        btnMedicamento.setVisible(opcion);
    }

    // Método exclusivamente utilizado´para obtener los datos de campos editables.
    private void obtenerVariables() {
        diagnostico = txtADiagnostico.getText();
        peso = txtFPeso.getText();
        altura = txtFAltura.getText();

        if (diagnostico.isEmpty()) {
            diagnostico = "NULL";
        }

        if (peso.isEmpty()) {
            peso = "NULL";
        }

        if (altura.isEmpty()) {
            altura = "NULL";
        }
    }
    
    // Método para mostrar mensajes de error.
    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    // Método para limpiar TODOS los campos Editables o NO Editables.
    private void limpiarDatos() {
        txtFNControl.setText("");
        txtFNombreA.setText("");
        txtFNacimiento.setText("");
        txtFEdad.setText("");
        txtFGenero.setText("");
        txtFMedico.setText("");
        txtFEmisionFecha.setText("");
        txtFEmisionHora.setText("");
        txtADiagnostico.setText("");
        txtFPeso.setText("");
        txtFAltura.setText("");

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
        TextPrompt pHAltura = new TextPrompt("Cm", txtFAltura);
        TextPrompt pHMedico = new TextPrompt("Médico Responsable", txtFMedico);
        TextPrompt pHFechaEmision = new TextPrompt("Fecha Receta", txtFEmisionFecha);
        TextPrompt pHHoraEmision = new TextPrompt("Hora Receta", txtFEmisionHora);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmElaborarRecetaMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnMedicamento;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneADiagnostico;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JTextArea txtADiagnostico;
    private javax.swing.JTextField txtFAltura;
    private javax.swing.JTextField txtFEdad;
    private javax.swing.JTextField txtFEmisionFecha;
    private javax.swing.JTextField txtFEmisionHora;
    private javax.swing.JTextField txtFGenero;
    private javax.swing.JTextField txtFMedico;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JTextField txtFNacimiento;
    private javax.swing.JTextField txtFNombreA;
    private javax.swing.JTextField txtFPeso;
    // End of variables declaration//GEN-END:variables
}
