package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmVerCitas extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones para validar campos.
    DefaultTableModel model;

    boolean a, b, c, d; // Variables para rastrear el estado (activo o inactivo) de los ToggleButton.
    String nControlA, nControlM, idServicio, fechaCita; // Variables relacionadas a los filtros.
    String medSeleccionado, serSeleccionado; // Variables para guardar el String de los ComboBox

    // Variables relacionadas a la cita seleccionada.
    String citaSeleccionada, alumnoSeleccionado, medicoSeleccionado, servicioSeleccionado;
    Date fechaCitaSeleccionada;

    public FrmVerCitas() {
        initComponents();

        this.setLocationRelativeTo(null);
        
        TextPrompt pHIdServicio = new TextPrompt("Número de Control", txtFNControl);

        validar.validarNControlRegex(txtFNControl);

        txtFNControl.setEnabled(false);
        CboxMedico.setEnabled(false);
        CboxServicio.setEnabled(false);
        dpFechaCita.setEnabled(false);

        dpFechaCita.setDate(fe.obtenerFechaActual());

        actualizarCombobox();
        actualizarTabla();
        formatoTabla();

        btnFiltrar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpControlCitas = new javax.swing.JPanel();
        jScrollPaneTablaCita = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        dpFechaCita = new org.jdesktop.swingx.JXDatePicker();
        txtFNControl = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblTitular = new javax.swing.JLabel();
        jTBtnNControl = new javax.swing.JToggleButton();
        jTBtnMedico = new javax.swing.JToggleButton();
        jTBtnServicio = new javax.swing.JToggleButton();
        jTBtnFecha = new javax.swing.JToggleButton();
        CboxMedico = new javax.swing.JComboBox<>();
        CboxServicio = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        btnNoFiltrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jpControlCitas.setBackground(new java.awt.Color(36, 130, 119));
        jpControlCitas.setMaximumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.setMinimumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpControlCitasMouseClicked(evt);
            }
        });

        jScrollPaneTablaCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPaneTablaCitaMouseClicked(evt);
            }
        });

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCitas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCitasMouseClicked(evt);
            }
        });
        jScrollPaneTablaCita.setViewportView(tablaCitas);

        dpFechaCita.setMaximumSize(new java.awt.Dimension(30, 24));
        dpFechaCita.setMinimumSize(new java.awt.Dimension(30, 24));
        dpFechaCita.setPreferredSize(new java.awt.Dimension(30, 24));
        dpFechaCita.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpFechaCitaPropertyChange(evt);
            }
        });

        txtFNControl.setBackground(new java.awt.Color(204, 204, 204));
        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(135, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(135, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(135, 30));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));

        lblTitular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setText("Citas Registradas");

        jTBtnNControl.setBackground(new java.awt.Color(3, 102, 102));
        jTBtnNControl.setMaximumSize(new java.awt.Dimension(22, 20));
        jTBtnNControl.setMinimumSize(new java.awt.Dimension(22, 20));
        jTBtnNControl.setName(""); // NOI18N
        jTBtnNControl.setPreferredSize(new java.awt.Dimension(22, 20));
        jTBtnNControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtnNControlActionPerformed(evt);
            }
        });

        jTBtnMedico.setBackground(new java.awt.Color(3, 102, 102));
        jTBtnMedico.setMaximumSize(new java.awt.Dimension(22, 20));
        jTBtnMedico.setMinimumSize(new java.awt.Dimension(22, 20));
        jTBtnMedico.setPreferredSize(new java.awt.Dimension(22, 20));
        jTBtnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtnMedicoActionPerformed(evt);
            }
        });

        jTBtnServicio.setBackground(new java.awt.Color(3, 102, 102));
        jTBtnServicio.setMaximumSize(new java.awt.Dimension(22, 20));
        jTBtnServicio.setMinimumSize(new java.awt.Dimension(22, 20));
        jTBtnServicio.setPreferredSize(new java.awt.Dimension(22, 20));
        jTBtnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtnServicioActionPerformed(evt);
            }
        });

        jTBtnFecha.setBackground(new java.awt.Color(3, 102, 102));
        jTBtnFecha.setMaximumSize(new java.awt.Dimension(22, 20));
        jTBtnFecha.setMinimumSize(new java.awt.Dimension(22, 20));
        jTBtnFecha.setPreferredSize(new java.awt.Dimension(22, 20));
        jTBtnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtnFechaActionPerformed(evt);
            }
        });

        CboxMedico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxMedico.setBorder(null);
        CboxMedico.setMaximumSize(new java.awt.Dimension(135, 30));
        CboxMedico.setMinimumSize(new java.awt.Dimension(135, 30));
        CboxMedico.setPreferredSize(new java.awt.Dimension(135, 30));

        CboxServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxServicio.setBorder(null);
        CboxServicio.setMaximumSize(new java.awt.Dimension(135, 30));
        CboxServicio.setMinimumSize(new java.awt.Dimension(135, 30));
        CboxServicio.setPreferredSize(new java.awt.Dimension(135, 30));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.setFocusPainted(false);
        btnFiltrar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnFiltrar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnFiltrar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnNoFiltrar.setText("Sin Filtrar");
        btnNoFiltrar.setFocusPainted(false);
        btnNoFiltrar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnNoFiltrar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnNoFiltrar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnNoFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoFiltrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setFocusPainted(false);
        btnModificar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnModificar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnModificar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusPainted(false);
        btnEliminar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnEliminar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jpControlCitasLayout = new javax.swing.GroupLayout(jpControlCitas);
        jpControlCitas.setLayout(jpControlCitasLayout);
        jpControlCitasLayout.setHorizontalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpControlCitasLayout.createSequentialGroup()
                                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(CboxMedico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CboxServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFNControl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnNoFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTBtnNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTBtnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTBtnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpControlCitasLayout.createSequentialGroup()
                                .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTBtnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblTitular)))
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneTablaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpControlCitasLayout.setVerticalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTitular)
                        .addGap(25, 25, 25)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpControlCitasLayout.createSequentialGroup()
                                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTBtnNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTBtnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CboxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTBtnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTBtnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(jScrollPaneTablaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNoFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpControlCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpControlCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBtnNControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtnNControlActionPerformed
        if (jTBtnNControl.isSelected()) {
            txtFNControl.setEnabled(true);
            txtFNControl.setBackground(new Color(255, 255, 255));
        } else {
            txtFNControl.setEnabled(false);
            txtFNControl.setBackground(new Color(204,204,204));
        }
        verificarTBtns();
    }//GEN-LAST:event_jTBtnNControlActionPerformed

    private void jTBtnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtnMedicoActionPerformed
        if (jTBtnMedico.isSelected()) {
            CboxMedico.setEnabled(true);
        } else {
            CboxMedico.setEnabled(false);
        }
        verificarTBtns();
    }//GEN-LAST:event_jTBtnMedicoActionPerformed

    private void jTBtnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtnServicioActionPerformed
        if (jTBtnServicio.isSelected()) {
            CboxServicio.setEnabled(true);
        } else {
            CboxServicio.setEnabled(false);
        }
        verificarTBtns();
    }//GEN-LAST:event_jTBtnServicioActionPerformed

    private void jTBtnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtnFechaActionPerformed
        if (jTBtnFecha.isSelected()) {
            dpFechaCita.setEnabled(true);
        } else {
            dpFechaCita.setEnabled(false);
        }
        verificarTBtns();
    }//GEN-LAST:event_jTBtnFechaActionPerformed

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMouseClicked
        int row = tablaCitas.getSelectedRow();
        if (row != -1) {
            citaSeleccionada = (String.valueOf(model.getValueAt(row, 0)));
            alumnoSeleccionado = (String.valueOf(model.getValueAt(row, 1)));
            medicoSeleccionado = (String.valueOf(model.getValueAt(row, 2)));
            servicioSeleccionado = (String.valueOf(model.getValueAt(row, 3)));
            String fechaTexto = String.valueOf(model.getValueAt(row, 4));
            String horaTexto = String.valueOf(model.getValueAt(row, 5));

            fechaCitaSeleccionada = fe.combinarFechaYHora(fechaTexto, horaTexto);

            seccionEditar(true);
            seccionNormal(false);
        } else {
            tablaCitas.clearSelection();
            limpiarSeleccion();
            seccionEditar(false);
            seccionNormal(true);
        }
    }//GEN-LAST:event_tablaCitasMouseClicked

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        obtenerEleccion();
        obtenerVariables();
        actualizarTablaSegunFiltros();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnNoFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoFiltrarActionPerformed
        actualizarTabla();
        formatoTabla();
        limpiar();
    }//GEN-LAST:event_btnNoFiltrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        FrmRegistrarCita frm_registrarCita = new FrmRegistrarCita(citaSeleccionada, alumnoSeleccionado, medicoSeleccionado, servicioSeleccionado, fechaCitaSeleccionada);
        frm_registrarCita.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        fn.ejecutarSentencia("DELETE FROM Cita WHERE Id_Cita = " + citaSeleccionada, true);
        actualizarTablaSegunFiltros();
        seccionEditar(false);
        seccionNormal(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmRegistrarCita frm_registrarCita = new FrmRegistrarCita();
        frm_registrarCita.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jScrollPaneTablaCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneTablaCitaMouseClicked
        tablaCitas.clearSelection();
        limpiarSeleccion();
        seccionEditar(false);
        seccionNormal(true);
    }//GEN-LAST:event_jScrollPaneTablaCitaMouseClicked

    private void jpControlCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpControlCitasMouseClicked
        tablaCitas.clearSelection();
        limpiarSeleccion();
        seccionEditar(false);
        seccionNormal(true);
    }//GEN-LAST:event_jpControlCitasMouseClicked

    private void dpFechaCitaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpFechaCitaPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(selectedDate);
            lblFecha.setText(formattedDate);
        }
    }//GEN-LAST:event_dpFechaCitaPropertyChange

    private void actualizarTablaSegunFiltros() {
        boolean error = false;

        if (a && !alumnoVacio()) {
            actualizarTablaA();
        } else if (a) {
            error = true;
        }

        if (b && !medicoVacio()) {
            actualizarTablaB();
        } else if (b) {
            error = true;
        }

        if (c && !servicioVacio()) {
            actualizarTablaC();
        } else if (c) {
            error = true;
        }

        if (d && !fechaVacio()) {
            actualizarTablaD();
        } else if (d) {
            error = true;
        }

        if (a && b) {
            if (!alumnoVacio() || !medicoVacio()) {
                actualizarTablaAB();
            } else {
                error = true;
            }
        }

        if (a && c) {
            if (!alumnoVacio() || !servicioVacio()) {
                actualizarTablaAC();
            } else {
                error = true;
            }
        }

        if (a && d) {
            if (!alumnoVacio() || !fechaVacio()) {
                actualizarTablaAD();
            } else {
                error = true;
            }
        }

        if (b && c) {
            if (!medicoVacio() || !servicioVacio()) {
                actualizarTablaBC();
            } else {
                error = true;
            }
        }

        if (b && d) {
            if (!medicoVacio() || !fechaVacio()) {
                actualizarTablaBD();
            } else {
                error = true;
            }
        }

        if (c && d) {
            if (!servicioVacio() || !fechaVacio()) {
                actualizarTablaCD();
            } else {
                error = true;
            }
        }

        if (a && b && c) {
            if (!alumnoVacio() || !medicoVacio() || !servicioVacio()) {
                actualizarTablaABC();
            } else {
                error = true;
            }
        }

        if (a && b && d) {
            if (!alumnoVacio() || !medicoVacio() || !fechaVacio()) {
                actualizarTablaABD();
            } else {
                error = true;
            }
        }

        if (a && c && d) {
            if (!alumnoVacio() || !servicioVacio() || !fechaVacio()) {
                actualizarTablaACD();
            } else {
                error = true;
            }
        }

        if (b && c && d) {
            if (!medicoVacio() || !servicioVacio() || !fechaVacio()) {
                actualizarTablaBCD();
            } else {
                error = true;
            }
        }

        if (!a && !b && !c && !d) {
            actualizarTabla();
        }

        if (error) {
            mostrarError("Datos Faltantes", "Verifica que estén llenos los campos activos");
        } else {
            formatoTabla();
        }
    }

    private void verificarTBtns() {
        if (jTBtnNControl.isSelected() || jTBtnMedico.isSelected() || jTBtnServicio.isSelected() || jTBtnFecha.isSelected()) {
            btnFiltrar.setEnabled(true);
        } else {
            btnFiltrar.setEnabled(false);
        }
    }

    private Boolean alumnoVacio() {
        return nControlA.isEmpty();
    }

    private Boolean medicoVacio() {
        return nControlM.isEmpty() || nControlM.equals("Seleccione una opcion");
    }

    private Boolean servicioVacio() {
        return idServicio.isEmpty() || idServicio.equals("Seleccione una opcion");
    }

    private Boolean fechaVacio() {
        return fechaCita.isEmpty();
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void obtenerVariables() {
        // Si (letra) es verdadero, se asigna el valor del campo, de lo contrario, se asigna una cadena vacía.
        nControlA = (a) ? txtFNControl.getText() : "";
        nControlM = (b) ? obtenerNumeroControlMedico() : "";
        idServicio = (c) ? obtenerIdServicio() : "";
        fechaCita = (d) ? obtenerFechaCita() : "";
    }

    private String obtenerNumeroControlMedico() {
        medSeleccionado = CboxMedico.getSelectedItem().toString();
        String nControlMSQL = "SELECT Numero_Control FROM Medico WHERE CONCAT(Nombre_Medico, ' ', Apellido_Medico) = '" + medSeleccionado + "'";
        return fn.obtenerResultado(nControlMSQL);
    }

    private String obtenerIdServicio() {
        serSeleccionado = CboxServicio.getSelectedItem().toString();
        String idServicioSQL = "SELECT Id_Servicio FROM Servicio WHERE Nombre_Servicio = '" + serSeleccionado + "'";
        return fn.obtenerResultado(idServicioSQL);
    }

    private String obtenerFechaCita() {
        fechaCita = dpFechaCita.getDate().toString();
        String[] resultado = fe.separarFechaYHora(fechaCita);
        return resultado[0];
    }

    private void obtenerEleccion() {
        a = jTBtnNControl.isSelected();
        b = jTBtnMedico.isSelected();
        c = jTBtnServicio.isSelected();
        d = jTBtnFecha.isSelected();
    }

    private void actualizarTablaA() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE alumno.Numero_Control = " + nControlA + "\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaB() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE medico.Numero_Control = " + nControlM + "\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaC() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE servicio.Id_Servicio = " + idServicio + "\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaD() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE cita.Fecha = '" + fechaCita + "' \n"
                + "ORDER BY cita.Hora ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaAB() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE alumno.Numero_Control = " + nControlA + " AND medico.Numero_Control = " + nControlM + "\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaAC() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE alumno.Numero_Control = " + nControlA + " AND servicio.Id_Servicio = " + idServicio + "\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaAD() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE alumno.Numero_Control = " + nControlA + " AND cita.Fecha = '" + fechaCita + "' \n"
                + "ORDER BY cita.Hora ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaBC() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE medico.Numero_Control = " + nControlM + " AND servicio.Id_Servicio = " + idServicio + "\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");

    }

    private void actualizarTablaBD() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE medico.Numero_Control = " + nControlM + " AND cita.Fecha = '" + fechaCita + "' \n"
                + "ORDER BY cita.Hora ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaCD() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE servicio.Id_Servicio = " + idServicio + " AND cita.Fecha = '" + fechaCita + "' \n"
                + "ORDER BY cita.Hora ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaABC() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE alumno.Numero_Control = " + nControlA + " AND medico.Numero_Control = " + nControlM + " AND servicio.Id_Servicio = " + idServicio + "\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaABD() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE alumno.Numero_Control = " + nControlA + " AND medico.Numero_Control = " + nControlM + " AND cita.Fecha = '" + fechaCita + "'\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaACD() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE alumno.Numero_Control = " + nControlA + " AND servicio.Id_Servicio = " + idServicio + " AND cita.Fecha = '" + fechaCita + "'\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTablaBCD() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE medico.Numero_Control = " + nControlM + " AND servicio.Id_Servicio = " + idServicio + " AND cita.Fecha = '" + fechaCita + "' \n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTabla() {
        String[] fechaActual = fe.separarFechaYHora(fe.obtenerFechaActual().toString());
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE cita.Fecha >= '" + fechaActual[0] + "'\n" // Filtrar por citas en o después de la fecha
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente

        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");

    }

    private void formatoTabla() {
        TableColumn columna;
        columna = tablaCitas.getColumnModel().getColumn(0); // Columna Id_Cita
        columna.setPreferredWidth(40);
        columna = tablaCitas.getColumnModel().getColumn(1); // Columna Alumno
        columna.setPreferredWidth(90);
        columna = tablaCitas.getColumnModel().getColumn(2); // Nombre Medico
        columna.setPreferredWidth(180);
        columna = tablaCitas.getColumnModel().getColumn(3); // Nombre Servicio
        columna.setPreferredWidth(180);
        columna = tablaCitas.getColumnModel().getColumn(4); // Fecha
        columna.setPreferredWidth(80);
        columna = tablaCitas.getColumnModel().getColumn(5); // Hora
        columna.setPreferredWidth(65);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tablaCitas.getColumnCount(); i++) {
            tablaCitas.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    public void actualizarCombobox() {
        CboxMedico.removeAllItems();
        CboxServicio.removeAllItems();
        CboxMedico = fn.llenarCombobox("SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS NombreCompleto FROM Medico ORDER BY Numero_Control ASC",
                "NombreCompleto", CboxMedico);
        CboxServicio = fn.llenarCombobox("SELECT Nombre_Servicio FROM Servicio ORDER BY Id_Servicio ASC",
                "Nombre_Servicio", CboxServicio);
    }

    private void limpiar() {
        txtFNControl.setText("");
        CboxMedico.setSelectedIndex(0);
        CboxServicio.setSelectedIndex(0);
        dpFechaCita.setDate(fe.obtenerFechaActual());

        txtFNControl.setEnabled(false);
        CboxMedico.setEnabled(false);
        CboxServicio.setEnabled(false);
        dpFechaCita.setEnabled(false);

        jTBtnNControl.setSelected(false);
        jTBtnMedico.setSelected(false);
        jTBtnServicio.setSelected(false);
        jTBtnFecha.setSelected(false);
    }

    private void limpiarSeleccion() {
        citaSeleccionada = "";
        alumnoSeleccionado = "";
        medicoSeleccionado = "";
        servicioSeleccionado = "";
    }

    private void seccionEditar(boolean opcion) {
        btnEliminar.setEnabled(opcion);
        btnModificar.setEnabled(opcion);
    }

    private void seccionNormal(boolean opcion) {
        btnSalir.setEnabled(opcion);
        btnNoFiltrar.setEnabled(opcion);
        jTBtnNControl.setEnabled(opcion);
        jTBtnMedico.setEnabled(opcion);
        jTBtnServicio.setEnabled(opcion);
        jTBtnFecha.setEnabled(opcion);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVerCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxMedico;
    private javax.swing.JComboBox<String> CboxServicio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNoFiltrar;
    private javax.swing.JButton btnSalir;
    private org.jdesktop.swingx.JXDatePicker dpFechaCita;
    private javax.swing.JScrollPane jScrollPaneTablaCita;
    private javax.swing.JToggleButton jTBtnFecha;
    private javax.swing.JToggleButton jTBtnMedico;
    private javax.swing.JToggleButton jTBtnNControl;
    private javax.swing.JToggleButton jTBtnServicio;
    private javax.swing.JPanel jpControlCitas;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtFNControl;
    // End of variables declaration//GEN-END:variables
}
