package JFrames;

import Complementos.FuncionesInterface;
import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesPDF;
import Complementos.FuncionesValidar;
import java.awt.Color;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmReporteEstudiantesAtendidos extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.
    DefaultTableModel model;

    String fechaSeleccionada;

    public FrmReporteEstudiantesAtendidos() {
        initComponents();

        this.setLocationRelativeTo(null);

        actualizarTabla();
        formatoTabla();

        dpFechaCita.setDate(fe.obtenerFechaActual());
        dpFechaInicioReporte.setDate(fe.obtenerFechaActual());
        dpFechaFinalReporte.setDate(fe.obtenerFechaActual());

        dpFechaInicioReporte.setEnabled(false);
        dpFechaFinalReporte.setEnabled(false);
        btnGenerarPDFConRango.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCargarFecha = new javax.swing.JButton();
        jScrollPaneTablaCitasHistorial = new javax.swing.JScrollPane();
        tablaCitasHistorial = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        dpFechaCita = new org.jdesktop.swingx.JXDatePicker();
        lblFecha = new javax.swing.JLabel();
        btnCargarTodos = new javax.swing.JButton();
        dpFechaInicioReporte = new org.jdesktop.swingx.JXDatePicker();
        lblFechaInicio = new javax.swing.JLabel();
        dpFechaFinalReporte = new org.jdesktop.swingx.JXDatePicker();
        lblFechaFinal = new javax.swing.JLabel();
        jTBtnReporte = new javax.swing.JToggleButton();
        btnGenerarPDFConRango = new javax.swing.JButton();
        btnGenerarPDFUnaFecha = new javax.swing.JButton();
        lblInicio = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));

        btnCargarFecha.setText("Cargar Fecha");
        btnCargarFecha.setFocusPainted(false);
        btnCargarFecha.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCargarFecha.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCargarFecha.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCargarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFechaActionPerformed(evt);
            }
        });

        tablaCitasHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCitasHistorial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPaneTablaCitasHistorial.setViewportView(tablaCitasHistorial);

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

        dpFechaCita.setMaximumSize(new java.awt.Dimension(30, 24));
        dpFechaCita.setMinimumSize(new java.awt.Dimension(30, 24));
        dpFechaCita.setPreferredSize(new java.awt.Dimension(30, 24));
        dpFechaCita.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpFechaCitaPropertyChange(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));

        btnCargarTodos.setText("Cargar Todos");
        btnCargarTodos.setFocusPainted(false);
        btnCargarTodos.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCargarTodos.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCargarTodos.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCargarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTodosActionPerformed(evt);
            }
        });

        dpFechaInicioReporte.setMaximumSize(new java.awt.Dimension(30, 24));
        dpFechaInicioReporte.setMinimumSize(new java.awt.Dimension(30, 24));
        dpFechaInicioReporte.setPreferredSize(new java.awt.Dimension(30, 24));
        dpFechaInicioReporte.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpFechaInicioReportePropertyChange(evt);
            }
        });

        lblFechaInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFechaInicio.setForeground(new java.awt.Color(255, 255, 255));

        dpFechaFinalReporte.setMaximumSize(new java.awt.Dimension(30, 24));
        dpFechaFinalReporte.setMinimumSize(new java.awt.Dimension(30, 24));
        dpFechaFinalReporte.setPreferredSize(new java.awt.Dimension(30, 24));
        dpFechaFinalReporte.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpFechaFinalReportePropertyChange(evt);
            }
        });

        lblFechaFinal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFechaFinal.setForeground(new java.awt.Color(255, 255, 255));

        jTBtnReporte.setBackground(new java.awt.Color(3, 102, 102));
        jTBtnReporte.setMaximumSize(new java.awt.Dimension(22, 20));
        jTBtnReporte.setMinimumSize(new java.awt.Dimension(22, 20));
        jTBtnReporte.setName(""); // NOI18N
        jTBtnReporte.setPreferredSize(new java.awt.Dimension(22, 20));
        jTBtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtnReporteActionPerformed(evt);
            }
        });

        btnGenerarPDFConRango.setText("Generar PDF");
        btnGenerarPDFConRango.setFocusPainted(false);
        btnGenerarPDFConRango.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGenerarPDFConRango.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGenerarPDFConRango.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGenerarPDFConRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFConRangoActionPerformed(evt);
            }
        });

        btnGenerarPDFUnaFecha.setText("Generar PDF");
        btnGenerarPDFUnaFecha.setFocusPainted(false);
        btnGenerarPDFUnaFecha.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGenerarPDFUnaFecha.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGenerarPDFUnaFecha.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGenerarPDFUnaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFUnaFechaActionPerformed(evt);
            }
        });

        lblInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Fecha de Inicio:");

        lblFinal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFinal.setForeground(new java.awt.Color(255, 255, 255));
        lblFinal.setText("Fecha Final:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerarPDFUnaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCargarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneTablaCitasHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTBtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGenerarPDFConRango, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(dpFechaInicioReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(dpFechaFinalReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblInicio)
                                    .addComponent(lblFinal))))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCargarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenerarPDFUnaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerarPDFConRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTBtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpFechaInicioReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(lblFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpFechaFinalReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jScrollPaneTablaCitasHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
        frm_menu_secretario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void dpFechaCitaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpFechaCitaPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(selectedDate);
            lblFecha.setText(formattedDate);
        }
    }//GEN-LAST:event_dpFechaCitaPropertyChange

    private void btnCargarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFechaActionPerformed
        actualizarTablaConFecha(obtenerFecha());
        formatoTabla();
    }//GEN-LAST:event_btnCargarFechaActionPerformed

    private void btnCargarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTodosActionPerformed
        actualizarTabla();
        formatoTabla();
        dpFechaCita.setDate(fe.obtenerFechaActual());
    }//GEN-LAST:event_btnCargarTodosActionPerformed

    private void dpFechaInicioReportePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpFechaInicioReportePropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(selectedDate);
            lblFechaInicio.setText(formattedDate);
        }
    }//GEN-LAST:event_dpFechaInicioReportePropertyChange

    private void dpFechaFinalReportePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpFechaFinalReportePropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(selectedDate);
            lblFechaFinal.setText(formattedDate);
        }
    }//GEN-LAST:event_dpFechaFinalReportePropertyChange

    private void jTBtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtnReporteActionPerformed
        if (jTBtnReporte.isSelected()) {
            dpFechaInicioReporte.setEnabled(true);
            dpFechaFinalReporte.setEnabled(true);
            btnGenerarPDFConRango.setEnabled(true);
            dpFechaCita.setEnabled(false);
            btnCargarFecha.setEnabled(false);
            btnGenerarPDFUnaFecha.setEnabled(false);
        } else {
            dpFechaInicioReporte.setEnabled(false);
            dpFechaFinalReporte.setEnabled(false);
            btnGenerarPDFConRango.setEnabled(false);
            dpFechaCita.setEnabled(true);
            btnCargarFecha.setEnabled(true);
            btnGenerarPDFUnaFecha.setEnabled(true);
        }
    }//GEN-LAST:event_jTBtnReporteActionPerformed

    private void btnGenerarPDFConRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFConRangoActionPerformed
        if (fe.fechaEsPosterior(dpFechaFinalReporte.getDate(), dpFechaInicioReporte.getDate())) {
            String fechaInicio = obtenerFechaInicio();
            String fechaFinal = obtenerFechaFinal();

            String sentencia = "SELECT Alumno_Numero_Control, Nombre_Servicio, Nombre_Medico, Fecha_Cita FROM Historial_CITAS "
                    + "WHERE Fecha_Cita BETWEEN '" + fechaInicio + "' AND '" + fechaFinal + "' "
                    + "ORDER BY Fecha_Cita ASC";

            String[] fechas = {fechaInicio, fechaFinal};

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
                            FuncionesPDF fnPDF = new FuncionesPDF();
                            fnPDF.generarReporteServiciosRangoPDF(sentencia, filePath, fechas);
                            FrmReporteEstudiantesAtendidos frm_reporteEstudiantesAtendidos = new FrmReporteEstudiantesAtendidos();
                            frm_reporteEstudiantesAtendidos.setVisible(true);
                            dispose();
                        } else {
                            // No se ejecuta la lógica, el usuario no desea sobrescribir el archivo.
                        }
                    } else {
                        // Lógica para crear el PDF si no existe un archivo previo
                        FuncionesPDF fnPDF = new FuncionesPDF();
                        fnPDF.generarReporteServiciosRangoPDF(sentencia, filePath, fechas);
                        FrmReporteEstudiantesAtendidos frm_reporteEstudiantesAtendidos = new FrmReporteEstudiantesAtendidos();
                        frm_reporteEstudiantesAtendidos.setVisible(true);
                        dispose();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            mostrarError("Fechas conflictivas", "Selecciona un rango coherente de tiempo");
        }
    }//GEN-LAST:event_btnGenerarPDFConRangoActionPerformed

    private void btnGenerarPDFUnaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFUnaFechaActionPerformed
        String fecha = obtenerFecha();
        String sentencia = "SELECT Alumno_Numero_Control, Nombre_Servicio, Nombre_Medico, Fecha_Cita FROM Historial_CITAS "
                + "WHERE Fecha_Cita = '" + fecha + "'";
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
                        FuncionesPDF fnPDF = new FuncionesPDF();
                        fnPDF.generarReporteServiciosUnaFechaPDF(sentencia, filePath, fecha);
                        FrmReporteEstudiantesAtendidos frm_reporteEstudiantesAtendidos = new FrmReporteEstudiantesAtendidos();
                        frm_reporteEstudiantesAtendidos.setVisible(true);
                        dispose();
                    } else {
                        // No se ejecuta la lógica, el usuario no desea sobrescribir el archivo.
                    }
                } else {
                    // Lógica para crear el PDF si no existe un archivo previo
                    FuncionesPDF fnPDF = new FuncionesPDF();
                    fnPDF.generarReporteServiciosUnaFechaPDF(sentencia, filePath, fecha);
                    FrmReporteEstudiantesAtendidos frm_reporteEstudiantesAtendidos = new FrmReporteEstudiantesAtendidos();
                    frm_reporteEstudiantesAtendidos.setVisible(true);
                    dispose();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerarPDFUnaFechaActionPerformed

    private String obtenerFecha() {
        fechaSeleccionada = dpFechaCita.getDate().toString();
        String[] resultado = fe.separarFechaYHora(fechaSeleccionada);
        return resultado[0];
    }

    private String obtenerFechaInicio() {
        String fechaInicio = dpFechaInicioReporte.getDate().toString();
        String[] resultado = fe.separarFechaYHora(fechaInicio);
        return resultado[0];
    }

    private String obtenerFechaFinal() {
        String fechaFinal = dpFechaFinalReporte.getDate().toString();
        String[] resultado = fe.separarFechaYHora(fechaFinal);
        return resultado[0];
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void actualizarTablaConFecha(String fecha) {
        model = fn.mostrarTablas("SELECT\n"
                + "hc.Id_Cita as 'ID',\n"
                + "hc.Nombre_Alumno as 'Nombre Alumno',\n"
                + "hc.Nombre_Medico as 'Nombre Medico',\n"
                + "hc.Nombre_Servicio as 'Nombre Servicio',\n"
                + "hc.Fecha_Cita as 'Fecha',\n"
                + "hc.Asistencia as 'Asistencia'\n"
                + "FROM Historial_Citas hc\n"
                + "WHERE hc.Fecha_Cita = '" + fecha + "'");
        this.tablaCitasHistorial.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTabla() {
        model = fn.mostrarTablas("SELECT\n"
                + "hc.Id_Cita as 'ID',\n"
                + "hc.Nombre_Alumno as 'Nombre Alumno',\n"
                + "hc.Nombre_Medico as 'Nombre Medico',\n"
                + "hc.Nombre_Servicio as 'Nombre Servicio',\n"
                + "hc.Fecha_Cita as 'Fecha',\n"
                + "hc.Asistencia as 'Asistencia'\n"
                + "FROM Historial_Citas hc\n"
                + "ORDER BY hc.Fecha_Cita ASC");
        this.tablaCitasHistorial.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void formatoTabla() {
        TableColumn columna;
        columna = tablaCitasHistorial.getColumnModel().getColumn(0); // Columna Id_Cita
        columna.setPreferredWidth(40);
        columna = tablaCitasHistorial.getColumnModel().getColumn(1); // Columna Alumno
        columna.setPreferredWidth(200);
        columna = tablaCitasHistorial.getColumnModel().getColumn(2); // Nombre Medico
        columna.setPreferredWidth(200);
        columna = tablaCitasHistorial.getColumnModel().getColumn(3); // Nombre Servicio
        columna.setPreferredWidth(180);
        columna = tablaCitasHistorial.getColumnModel().getColumn(4); // Fecha
        columna.setPreferredWidth(80);
        columna = tablaCitasHistorial.getColumnModel().getColumn(5); // Asistencia
        columna.setPreferredWidth(80);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tablaCitasHistorial.getColumnCount(); i++) {
            tablaCitasHistorial.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReporteEstudiantesAtendidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarFecha;
    private javax.swing.JButton btnCargarTodos;
    private javax.swing.JButton btnGenerarPDFConRango;
    private javax.swing.JButton btnGenerarPDFUnaFecha;
    private javax.swing.JButton btnSalir;
    private org.jdesktop.swingx.JXDatePicker dpFechaCita;
    private org.jdesktop.swingx.JXDatePicker dpFechaFinalReporte;
    private org.jdesktop.swingx.JXDatePicker dpFechaInicioReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTablaCitasHistorial;
    private javax.swing.JToggleButton jTBtnReporte;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JTable tablaCitasHistorial;
    // End of variables declaration//GEN-END:variables
}
