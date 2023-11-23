package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesPDF;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmElaborarPaseUrgencias extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.

    String nControlA, nombreA;
    String nControlM, nombreM;
    String idPaseUrgencias, razonesPase;
    String[] fechaEmision;

    public FrmElaborarPaseUrgencias() {
        initComponents();

        this.setLocationRelativeTo(null);

        btnConfirmar(false);
        btnCancelar(false);
        seccionRazones(false);

        configurarTextArea();
        cargarPlaceHolders();
        cargarImagenesBtns();
        cargarValidaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        lblRazonesPase = new javax.swing.JLabel();
        jScrollPaneARazones = new javax.swing.JScrollPane();
        txtARazones = new javax.swing.JTextArea();
        txtFNControl = new javax.swing.JTextField();
        txtFNombreA = new javax.swing.JTextField();
        txtFEmisionFecha = new javax.swing.JTextField();
        txtFEmisionHora = new javax.swing.JTextField();
        txtFNombreM = new javax.swing.JTextField();
        lblMedico = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblMedico1 = new javax.swing.JLabel();

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

        lblRazonesPase.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblRazonesPase.setForeground(new java.awt.Color(255, 255, 255));
        lblRazonesPase.setText("Razones para el pase de urgencias: ");
        lblRazonesPase.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtARazones.setColumns(20);
        txtARazones.setRows(5);
        jScrollPaneARazones.setViewportView(txtARazones);

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(160, 30));

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
        lblMedico.setText("Médico que realiza el pase");
        lblMedico.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

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

        lblMedico1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblMedico1.setForeground(new java.awt.Color(255, 255, 255));
        lblMedico1.setText("Alumno al que se le realiza el pase");
        lblMedico1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedico1)
                            .addComponent(txtFNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMedico)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFNombreM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFEmisionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFEmisionHora, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneARazones, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRazonesPase))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNombreM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNombreA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFEmisionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFEmisionHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblRazonesPase, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneARazones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

                txtFNControl.setEnabled(false);
                btnCargarDatos.setEnabled(false);

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
        seccionRazones(true);
        btnConfirmar(false);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        seccionRazones(false);
        btnConfirmar(false);
        btnCancelar(false);

        txtFNControl.setEnabled(true);
        btnCargarDatos.setEnabled(true);

        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuMedico frm_menu_medico = new FrmMenuMedico();
        frm_menu_medico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        obtenerVariables();
        if (!camposVacios()) {
            String[] datosPase = {idPaseUrgencias, nControlA, nombreA, nControlM, nombreM, razonesPase, fechaEmision[0], fechaEmision[1]};
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
                            fnPDF.generarPaseUrgencias(obtenerDatosAlumno(), obtenerDatosMedico(), razonesPase, filePath);
                            FrmElaborarPaseUrgencias frm_elaborarPaseUrgencias = new FrmElaborarPaseUrgencias();
                            frm_elaborarPaseUrgencias.setVisible(true);
                            dispose();
                        } else {
                            // No se ejecuta la lógica, el usuario no desea sobrescribir el archivo.
                        }
                    } else {
                        // Lógica para crear el PDF si no existe un archivo previo
                        FuncionesPDF fnPDF = new FuncionesPDF();
                        fnPDF.generarPaseUrgencias(obtenerDatosAlumno(), obtenerDatosMedico(), razonesPase, filePath);
                        FrmElaborarPaseUrgencias frm_elaborarPaseUrgencias = new FrmElaborarPaseUrgencias();
                        frm_elaborarPaseUrgencias.setVisible(true);
                        dispose();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            mostrarError("Razones faltantes", "Razones sin definir");
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    // Método para almacenar todos los datos del Alumno.
    private String[] obtenerDatosAlumno() {
        /* nControl, nombreCompleto, fechaNacimiento, edad, genero, telefono, telefonoEmergencia
           municipio, estado, codigo postal, calle, numero interior
         */
        String[] datosAlumno = new String[12];
        datosAlumno[0] = nControlA;
        datosAlumno[1] = fn.obtenerResultado("SELECT CONCAT(Nombre_Alumno, ' ', Apellido_Alumno) AS Nombre_Completo FROM Alumno WHERE Numero_Control = " + nControlA);
        datosAlumno[2] = obtenerDatoAlumno("Fecha_Nacimiento");
        datosAlumno[3] = Integer.toString(fe.calcularEdad(fe.convertirStringADate(datosAlumno[2]), fe.obtenerFechaActual()));
        datosAlumno[4] = obtenerDatoAlumno("Genero");
        datosAlumno[5] = obtenerDatoAlumno("Telefono");
        datosAlumno[6] = obtenerDatoAlumno("Telefono_Emergencia");
        datosAlumno[7] = obtenerDatoAlumno("Municipio");
        datosAlumno[8] = obtenerDatoAlumno("Estado");
        datosAlumno[9] = obtenerDatoAlumno("Codigo_Postal");
        datosAlumno[10] = obtenerDatoAlumno("Calle");
        datosAlumno[11] = obtenerDatoAlumno("Numero_Interior");
        return datosAlumno;
    }

    // Método para almacenar todos los datos del Médico.
    private String[] obtenerDatosMedico() {
        /* nControl, nombreCompleto, telefono, telefonoEmergencia, correo
           municipio, estado, codigo postal, calle, numero interior
         */
        String[] datosMedico = new String[10];
        datosMedico[0] = nControlM;
        datosMedico[1] = fn.obtenerResultado("SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS Nombre_Completo FROM Medico WHERE Numero_Control = " + nControlM);
        datosMedico[2] = obtenerDatoMedico("Telefono");
        datosMedico[3] = obtenerDatoMedico("Telefono_Emergencia");
        datosMedico[4] = obtenerDatoMedico("Correo");
        datosMedico[5] = obtenerDatoMedico("Municipio");
        datosMedico[6] = obtenerDatoMedico("Estado");
        datosMedico[7] = obtenerDatoMedico("Codigo_Postal");
        datosMedico[8] = obtenerDatoMedico("Calle");
        datosMedico[9] = obtenerDatoMedico("Numero_Interior");
        return datosMedico;
    }

    // Método para obtener cualquier dato de Alumno en la Base de Datos.
    private String obtenerDatoAlumno(String argumento) {
        String sql = "SELECT " + argumento + " FROM Alumno WHERE Numero_Control = " + nControlA;
        return fn.obtenerResultado(sql);
    }

    // Método para obtener cualquier dato de Médico en la Base de Datos.
    private String obtenerDatoMedico(String argumento) {
        String sql = "SELECT " + argumento + " FROM Medico WHERE Numero_Control = " + nControlM;
        return fn.obtenerResultado(sql);
    }
    
    // Método para obtener la última ID en la tabla de recetas.
    private String obtenerIdMaxPase() {
        String idMaxSQL = "SELECT MAX(Id_Pase_Urgencias) FROM Pase_Urgencias";
        String idMax = fn.obtenerResultado(idMaxSQL);
        if (idMax == null || idMax.equalsIgnoreCase("null")) {
            return "1";
        } else {
            int idActual = Integer.parseInt(idMax) + 1;
            return Integer.toString(idActual);
        }
    }
    
    // Método para insertar un nuevo pase a urgencias.
    private void insertarPase() {
        idPaseUrgencias = obtenerIdMaxPase();
        String recetaSQL = "INSERT INTO Pase_Urgencias (Id_Pase_Urgencias, Alumno_Numero_Control, Nombre_Alumno, Medico_Numero_Control, Nombre_Medico, Razones)"
                + "VALUES (" + idPaseUrgencias + ", " + nControlA + ", '" + nombreA + "', " + nControlM + ", '" + nombreM + "', '" + razonesPase + "')";
        fn.ejecutarSentencia(recetaSQL, true);
    }

    // Método para obtener los datos a mostrar en los campos no accesibles.
    private void obtenerDatos() {
        String nombreCompletoASQL = "SELECT CONCAT(Nombre_Alumno, ' ', Apellido_Alumno) AS NombreCompletoA FROM Alumno WHERE Numero_Control = " + nControlA;
        nombreA = fn.obtenerResultado(nombreCompletoASQL);

        nControlM = VariablesGlobales.numeroDeControl;

        String nombreCompletoMSQL = "SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS NombreCompleto FROM Medico WHERE Numero_Control = " + nControlM;
        nombreM = fn.obtenerResultado(nombreCompletoMSQL);

        fechaEmision = fe.separarFechaYHora(fe.obtenerFechaActual().toString());
    }

    // Método para cargar los datos obtenidos en los campos no accesibles.
    private void cargarDatos() {
        txtFNombreA.setText(nombreA);
        txtFNombreM.setText(nombreM);
        txtFEmisionFecha.setText(fechaEmision[0]);
        txtFEmisionHora.setText(fechaEmision[1]);
    }

    // Método para activar o desactivar el campo de razones.
    private void seccionRazones(boolean opcion) {
        lblRazonesPase.setVisible(opcion);
        jScrollPaneARazones.setEnabled(opcion);
        jScrollPaneARazones.setVisible(opcion);
        btnGenerarPDF.setEnabled(opcion);
        btnGenerarPDF.setVisible(opcion);
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
        return nControlA.isEmpty() || razonesPase.isEmpty();
    }

    // Método para obtener los valores de los campos editables.
    private void obtenerVariables() {
        nControlA = txtFNControl.getText();
        razonesPase = txtARazones.getText();
    }

    // Método para mostrar mensajes de error.
    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    // Método para limpiar TODOS los campos Editables o NO Editables.
    private void limpiarCampos() {
        txtFNControl.setText("");
        txtFNombreA.setText("");
        txtFNombreM.setText("");
        txtFEmisionFecha.setText("");
        txtFEmisionHora.setText("");
        txtARazones.setText("");

        txtFNControl.requestFocus();
    }

    // Método para cargar todos los Place Holder de los TextField.
    private void cargarPlaceHolders() {
        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl);
        TextPrompt pHNNombre = new TextPrompt("Nombre del Alumno", txtFNombreA);
        TextPrompt pHMedico = new TextPrompt("Médico que realiza el pase", txtFNombreM);
        TextPrompt pHFechaEmision = new TextPrompt("Fecha de Emisión", txtFEmisionFecha);
        TextPrompt pHHoraEmision = new TextPrompt("Hora de Emisión", txtFEmisionHora);
    }

    // Método para cargar las imágenes en los Button.
    private void cargarImagenesBtns() {
        btnCargarDatos.setIcon(di.pintarImagenBtn(btnCargarDatos, "src/Imagenes/IMG_Icono_Lupa.png"));
        btnCancelar.setIcon(di.pintarImagenBtn(btnCancelar, "src/Imagenes/IMG_Icono_Cancelar.png"));
        btnConfirmar.setIcon(di.pintarImagenBtn(btnConfirmar, "src/Imagenes/IMG_Icono_Confirmar.png"));
    }

    // Método para activar las validaciones de los campos.
    private void cargarValidaciones() {
        validar.validarNControlRegex(txtFNControl);
    }

    // Método para configurar el comportamiento de los TextArea.
    private void configurarTextArea() {
        txtARazones.setLineWrap(true);
        txtARazones.setWrapStyleWord(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmElaborarPaseUrgencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneARazones;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblMedico1;
    private javax.swing.JLabel lblRazonesPase;
    private javax.swing.JTextArea txtARazones;
    private javax.swing.JTextField txtFEmisionFecha;
    private javax.swing.JTextField txtFEmisionHora;
    private javax.swing.JTextField txtFNControl;
    private javax.swing.JTextField txtFNombreA;
    private javax.swing.JTextField txtFNombreM;
    // End of variables declaration//GEN-END:variables
}
