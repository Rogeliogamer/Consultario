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

        TextPrompt pHnControlA = new TextPrompt("Número de Control", txtFNControl);
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
        lblFecha = new javax.swing.JLabel();
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
        txtFNControl = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblTitular1 = new javax.swing.JLabel();

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

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));

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

        btnFiltrar.setText("Aplicar Filtros");
        btnFiltrar.setFocusPainted(false);
        btnFiltrar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnFiltrar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnFiltrar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnNoFiltrar.setText("Quitar Filtros");
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

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(135, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(135, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(135, 30));

        javax.swing.GroupLayout jpControlCitasLayout = new javax.swing.GroupLayout(jpControlCitas);
        jpControlCitas.setLayout(jpControlCitasLayout);
        jpControlCitasLayout.setHorizontalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addComponent(txtFNControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTBtnNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addComponent(CboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTBtnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addComponent(CboxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTBtnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpControlCitasLayout.createSequentialGroup()
                                .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addComponent(btnNoFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTBtnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTablaCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addContainerGap())
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpControlCitasLayout.setVerticalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTablaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTBtnNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBtnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CboxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBtnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBtnFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(3, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(193, 39));
        jPanel1.setMinimumSize(new java.awt.Dimension(193, 39));

        lblTitular1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblTitular1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular1.setText("Citas Registradas");
        lblTitular1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitular1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitular1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpControlCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpControlCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBtnNControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtnNControlActionPerformed
        if (jTBtnNControl.isSelected()) {
            txtFNControl.setEnabled(true);
            txtFNControl.setBackground(new Color(255, 255, 255));
        } else {
            txtFNControl.setEnabled(false);
            txtFNControl.setBackground(new Color(204, 204, 204));
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
            btnFiltrar.setEnabled(false);
            limpiar();
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
        btnFiltrar.setEnabled(false);
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
        boolean error = true;

        if (a && !alumnoVacio() && !b && !c && !d) {
            actualizarTablaA();
            System.out.println("actualizarTablaA();");
            error = false;
        }

        if (b && !medicoVacio() && !a && !c && !d) {
            actualizarTablaB();
            System.out.println("actualizarTablaB();");
            error = false;
        }

        if (c && !servicioVacio() && !a && !b && !d) {
            actualizarTablaC();
            System.out.println("actualizarTablaC();");
            error = false;
        }

        if (d && !a && !b && !c) {
            actualizarTablaD();
            System.out.println("actualizarTablaD();");

        }

        if (a && b && !c && !d) {
            if (!alumnoVacio() && !medicoVacio()) {
                actualizarTablaAB();
                System.out.println("actualizarTablaAB();");
                error = false;
            }
        }

        if (a && c && !b && !d) {
            if (!alumnoVacio() && !servicioVacio()) {
                actualizarTablaAC();
                System.out.println("actualizarTablaAC();");
                error = false;
            }
        }

        if (a && d && !b && !c) {
            if (!alumnoVacio()) {
                actualizarTablaAD();
                System.out.println("actualizarTablaAD();");
                error = false;
            }
        }

        if (b && c && !a && !d) {
            if (!medicoVacio() && !servicioVacio()) {
                actualizarTablaBC();
                System.out.println("actualizarTablaBC();");
                error = false;
            }
        }

        if (b && d && !a && !c) {
            if (!medicoVacio()) {
                actualizarTablaBD();
                System.out.println("actualizarTablaBD();");
                error = false;
            }
        }

        if (c && d && !a && !b) {
            if (!servicioVacio()) {
                actualizarTablaCD();
                System.out.println("actualizarTablaCD();");
                error = false;
            }
        }

        if (a && b && c && !d) {
            if (!alumnoVacio() && !medicoVacio() && !servicioVacio()) {
                actualizarTablaABC();
                System.out.println("actualizarTablaABC();");
                error = false;
            }
        }

        if (a && b && d && !c) {
            if (!alumnoVacio() && !medicoVacio()) {
                actualizarTablaABD();
                System.out.println("actualizarTablaABD();");
                error = false;
            }
        }

        if (a && c && d && !b) {
            if (!alumnoVacio() && !servicioVacio()) {
                actualizarTablaACD();
                System.out.println("actualizarTablaACD();");
                error = false;
            }
        }

        if (b && c && d && !a) {
            if (!medicoVacio() && !servicioVacio()) {
                actualizarTablaBCD();
                System.out.println("actualizarTablaBCD();");
                error = false;
            }
        }

        if (a && b && c && d) {
            if (!alumnoVacio() && !medicoVacio() && !servicioVacio()) {
                actualizarTablaABCD();
                System.out.println("actualizarTablaABCD();");
                error = false;
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

    private void actualizarTablaABCD() {
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
                + "WHERE alumno.Numero_Control = " + nControlA + " AND medico.Numero_Control = " + nControlM + " AND servicio.Id_Servicio = " + idServicio + " AND cita.Fecha = '" + fechaCita + "' \n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTabla() {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTablaCita;
    private javax.swing.JToggleButton jTBtnFecha;
    private javax.swing.JToggleButton jTBtnMedico;
    private javax.swing.JToggleButton jTBtnNControl;
    private javax.swing.JToggleButton jTBtnServicio;
    private javax.swing.JPanel jpControlCitas;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTitular1;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtFNControl;
    // End of variables declaration//GEN-END:variables
}
