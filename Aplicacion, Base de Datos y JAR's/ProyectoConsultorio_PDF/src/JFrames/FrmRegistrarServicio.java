package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmRegistrarServicio extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    DefaultTableModel model;

    String idServicio, nombreServ, descServ, horaInicio, horaTermino; // Variables para nuevas entradas

    public FrmRegistrarServicio() {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHIdServicio = new TextPrompt("Id del Servicio", txtFIdServicio);
        TextPrompt pHNombreServicio = new TextPrompt("Nombre del Servicio", txtFNombreServicio);

        btnIconoLupa.setIcon(di.pintarImagenBtn(btnIconoLupa, "src/Imagenes/IMG_Icono_Lupa.png"));

        
        validar.validarIDn3(txtFIdServicio);
        validar.validarTexto(txtFNombreServicio);

        actualizarTabla();

        btnEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPRegistrarServicio = new javax.swing.JPanel();
        jScrollPaneTablaServicio = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnIconoLupa = new javax.swing.JButton();
        txtFIdServicio = new javax.swing.JTextField();
        txtFNombreServicio = new javax.swing.JTextField();
        tpHoraInicio = new com.github.lgooddatepicker.components.TimePicker();
        tpHoraTermino = new com.github.lgooddatepicker.components.TimePicker();
        lblHoraTermino = new javax.swing.JLabel();
        lblHoraInicio = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPaneAreaDesc = new javax.swing.JScrollPane();
        txtADescServicio = new javax.swing.JTextArea();
        lblDescripcion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPRegistrarServicio.setBackground(new java.awt.Color(3, 102, 102));
        jPRegistrarServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPRegistrarServicioMouseClicked(evt);
            }
        });

        jScrollPaneTablaServicio.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPaneTablaServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPaneTablaServicioMousePressed(evt);
            }
        });

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaServicios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaServicios.setBackground(new java.awt.Color(0, 153, 153));
        tablaServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaServiciosMouseClicked(evt);
            }
        });
        jScrollPaneTablaServicio.setViewportView(tablaServicios);

        javax.swing.GroupLayout jPRegistrarServicioLayout = new javax.swing.GroupLayout(jPRegistrarServicio);
        jPRegistrarServicio.setLayout(jPRegistrarServicioLayout);
        jPRegistrarServicioLayout.setHorizontalGroup(
            jPRegistrarServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrarServicioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPaneTablaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPRegistrarServicioLayout.setVerticalGroup(
            jPRegistrarServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarServicioLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPaneTablaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));

        btnIconoLupa.setBackground(new java.awt.Color(3, 102, 102));
        btnIconoLupa.setBorder(null);
        btnIconoLupa.setFocusPainted(false);
        btnIconoLupa.setMaximumSize(new java.awt.Dimension(24, 25));
        btnIconoLupa.setMinimumSize(new java.awt.Dimension(24, 25));
        btnIconoLupa.setPreferredSize(new java.awt.Dimension(24, 25));
        btnIconoLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconoLupaActionPerformed(evt);
            }
        });

        txtFIdServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFIdServicio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFIdServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFIdServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFIdServicio.setMaximumSize(new java.awt.Dimension(130, 25));
        txtFIdServicio.setMinimumSize(new java.awt.Dimension(130, 25));
        txtFIdServicio.setPreferredSize(new java.awt.Dimension(130, 25));
        txtFIdServicio.setToolTipText("");

        txtFNombreServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombreServicio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNombreServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombreServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombreServicio.setMaximumSize(new java.awt.Dimension(130, 25));
        txtFNombreServicio.setMinimumSize(new java.awt.Dimension(130, 25));
        txtFNombreServicio.setPreferredSize(new java.awt.Dimension(130, 25));
        txtFNombreServicio.setToolTipText("");

        lblHoraTermino.setText("Cierre");
        lblHoraTermino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoraTermino.setForeground(new java.awt.Color(255, 255, 255));

        lblHoraInicio.setText("Inicio");
        lblHoraInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoraInicio.setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo.setText("Servicios");
        lblTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));

        txtADescServicio.setColumns(20);
        txtADescServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtADescServicio.setRows(5);
        txtADescServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        jScrollPaneAreaDesc.setViewportView(txtADescServicio);

        lblDescripcion.setText("Descripción del Servicio");
        lblDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(80, 30));
        btnGuardar.setMinimumSize(new java.awt.Dimension(80, 30));
        btnGuardar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tpHoraTermino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHoraInicio)
                            .addComponent(lblHoraTermino)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFNombreServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFIdServicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneAreaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFIdServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tpHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tpHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneAreaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(3, 102, 102));

        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusPainted(false);
        btnEliminar.setMaximumSize(new java.awt.Dimension(80, 30));
        btnEliminar.setMinimumSize(new java.awt.Dimension(80, 30));
        btnEliminar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.setFocusPainted(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(80, 30));
        btnSalir.setMinimumSize(new java.awt.Dimension(80, 30));
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPRegistrarServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPRegistrarServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        obtenerVariables();

        String idExisteSQL = "SELECT * FROM Servicio WHERE Id_Servicio = " + idServicio;

        if (!camposVacios()) {
            if (!fn.verificarExistencia(idExisteSQL)) {
                if (esRangoValido(horaInicio, horaTermino)) {
                    insertarServicio();
                    actualizarTabla();
                    limpiar();
                } else {
                    mostrarError("Horas conflictivas", "Selecciona un rango coherente de horas");
                }
            } else {
                if (esRangoValido(horaInicio, horaTermino)) {
                    if (confirmacion("Servicio Existente", "¿Deseas editar este servicio?") == true) {
                        modificarServicio();
                        actualizarTabla();
                        limpiar();
                    } else {
                        mostrarMensaje("Proceso Cancelado", "Cancelado Exitosamente");
                    }
                } else {
                    mostrarError("Horas conflictivas", "Selecciona un rango coherente de horas");
                }
            }
        } else {
            mostrarError("Datos faltantes", "Completa todos los campos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarServicio();
        actualizarTabla();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
        frm_menu_secretario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIconoLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconoLupaActionPerformed
        idServicio = txtFIdServicio.getText();
        String idExistenteSQL = "SELECT Id_Servicio FROM Servicio WHERE Id_Servicio = " + idServicio;

        if (!idServicio.isEmpty()) {
            if (fn.verificarExistencia(idExistenteSQL) == true) {
                String nombreServicioSQL = "SELECT Nombre_Servicio FROM Servicio WHERE Id_Servicio = " + idServicio;
                String descServicioSQL = "SELECT Descripcion FROM Servicio WHERE Id_Servicio = " + idServicio;
                String horaInicioSQL = "SELECT TIME_FORMAT(Hora_Inicio, '%H:%i') "
                        + "FROM Servicio WHERE Id_Servicio = " + idServicio;
                String horaTerminoSQL = "SELECT TIME_FORMAT(Hora_Termino, '%H:%i') "
                        + "FROM Servicio WHERE Id_Servicio = " + idServicio;
                txtFNombreServicio.setText(fn.obtenerResultado(nombreServicioSQL));
                txtADescServicio.setText(fn.obtenerResultado(descServicioSQL));
                tpHoraInicio.setText(fn.obtenerResultado(horaInicioSQL));
                tpHoraTermino.setText(fn.obtenerResultado(horaTerminoSQL));
            } else {
                mostrarError("Servicio NO Encontrado", "Esta ID no ha sido utilizada");
            }
        } else {
            mostrarError("Campo de ID vacio", "Ingresa una ID");
        }
    }//GEN-LAST:event_btnIconoLupaActionPerformed

    private void tablaServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaServiciosMouseClicked
        int row = tablaServicios.getSelectedRow();
        if (row != -1) {
            txtFNombreServicio.setText(String.valueOf(model.getValueAt(row, 1)));

            String id = (String.valueOf(model.getValueAt(row, 0)));
            String descripcion = "SELECT Descripcion FROM Servicio WHERE Id_Servicio = " + id;
            String horaDeInicio = "SELECT TIME_FORMAT(Hora_Inicio, '%H:%i') "
                    + "FROM Servicio WHERE Id_Servicio = " + id;
            String horaDeTermino = "SELECT TIME_FORMAT(Hora_Termino, '%H:%i') "
                    + "FROM Servicio WHERE Id_Servicio = " + id;
            txtFIdServicio.setText(id);
            txtADescServicio.setText(fn.obtenerResultado(descripcion));
            tpHoraInicio.setText(fn.obtenerResultado(horaDeInicio));
            tpHoraTermino.setText(fn.obtenerResultado(horaDeTermino));

            desactivar();
        } else {
            tablaServicios.clearSelection();
            activar();
            limpiar();
        }
    }//GEN-LAST:event_tablaServiciosMouseClicked

    private void jPRegistrarServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPRegistrarServicioMouseClicked
        tablaServicios.clearSelection();
        activar();
        limpiar();
    }//GEN-LAST:event_jPRegistrarServicioMouseClicked

    private void jScrollPaneTablaServicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneTablaServicioMousePressed
        tablaServicios.clearSelection();
        activar();
        limpiar();
    }//GEN-LAST:event_jScrollPaneTablaServicioMousePressed

    private void insertarServicio() {
        String citaSQL = "INSERT INTO Servicio (Id_Servicio, Nombre_Servicio, Descripcion, Hora_Inicio, Hora_Termino) "
                + "VALUES (" + idServicio + ", '" + nombreServ + "', '" + descServ + "', '" + horaInicio + " ', '" + horaTermino + "')";
        fn.ejecutarSentencia(citaSQL, true);
    }

    private void modificarServicio() {
        String modificarCitaSQL = "UPDATE Servicio SET "
                + "Nombre_Servicio = '" + nombreServ + "', Descripcion = '" + descServ + "', "
                + "Hora_Inicio = '" + horaInicio + "', hora_Termino = '" + horaTermino + "' "
                + "WHERE Id_Servicio = " + idServicio;
        fn.ejecutarSentencia(modificarCitaSQL, true);
    }

    private void eliminarServicio() {
        int filaSeleccionada = tablaServicios.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = String.valueOf(model.getValueAt(filaSeleccionada, 0));
            fn.ejecutarSentencia("DELETE FROM Servicio WHERE Id_Servicio = " + id, true);
        }
    }

    private String obtenerIdMax() {
        String idMaxSQL = "SELECT MAX(Id_Servicio) FROM Servicio";
        String idMax = fn.obtenerResultado(idMaxSQL);

        if (idMax == null || idMax.equalsIgnoreCase("null")) {
            return "1";
        } else {
            int idActual = Integer.parseInt(idMax) + 1;
            return Integer.toString(idActual);
        }
    }

    // Método para validar la coherencia de un rango de horas.
    // Ejemplo: 13:00 - 12:00 no es válido, 12:00 - 13:00 es válido.
    private Boolean esRangoValido(String horaInicio, String horaTermino) {
        try {
            String[] partesHoraInicio = horaInicio.split(":");
            String[] partesHoraTermino = horaTermino.split(":");

            int horaInicioH = Integer.parseInt(partesHoraInicio[0]);
            int minutoInicio = Integer.parseInt(partesHoraInicio[1]);
            int horaTerminoH = Integer.parseInt(partesHoraTermino[0]);
            int minutoTermino = Integer.parseInt(partesHoraTermino[1]);

            return horaInicioH < horaTerminoH || (horaInicioH == horaTerminoH && minutoInicio < minutoTermino);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

            return false;
        }
    }

    private Boolean camposVacios() {
        return nombreServ.isEmpty() || descServ.isEmpty() || horaInicio.isEmpty() || horaTermino.isEmpty();
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarMensaje(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para confirmar la eliminación del registro antes de proceder.
    private Boolean confirmacion(String titulo, String contenido) {
        int opcion = JOptionPane.showConfirmDialog(this, contenido, titulo, JOptionPane.YES_NO_CANCEL_OPTION);
        return switch (opcion) {
            case JOptionPane.YES_OPTION ->
                true;
            case JOptionPane.NO_OPTION ->
                false;
            default ->
                false;
        };
    }

    private void obtenerVariables() {
        idServicio = txtFIdServicio.getText();
        nombreServ = txtFNombreServicio.getText();
        descServ = txtADescServicio.getText();
        horaInicio = tpHoraInicio.getText();
        horaTermino = tpHoraTermino.getText();
    }

    private void actualizarTabla() {
        model = fn.mostrarTablas("SELECT\n"
                + "servicio.Id_Servicio as 'Id',\n"
                + "servicio.Nombre_Servicio as 'Nombre',\n"
                + "servicio.Hora_Inicio as 'Hora Inicio',\n"
                + "servicio.Hora_Termino as 'Hora Cierre'\n"
                + "FROM Servicio servicio\n"
                + "ORDER BY servicio.Id_Servicio ASC");
        this.tablaServicios.setModel(model);
        fn.realizarSentencia("commit");

        TableColumn columna;
        columna = tablaServicios.getColumnModel().getColumn(0); // Id_Servicio
        columna.setPreferredWidth(40);
        columna = tablaServicios.getColumnModel().getColumn(1); // Nombre de Servicio
        columna.setPreferredWidth(179);
        columna = tablaServicios.getColumnModel().getColumn(2); // Hora de Inicio
        columna.setPreferredWidth(75);
        columna = tablaServicios.getColumnModel().getColumn(3); // Hora de Termino
        columna.setPreferredWidth(90);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tablaServicios.getColumnCount(); i++) {
            tablaServicios.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void desactivar() {
        btnIconoLupa.setEnabled(false);
        btnGuardar.setEnabled(false);
        txtFIdServicio.setEnabled(false);
        txtFNombreServicio.setEnabled(false);
        txtADescServicio.setEnabled(false);
        tpHoraInicio.setEnabled(false);
        tpHoraTermino.setEnabled(false);
        btnSalir.setEnabled(false);

        btnEliminar.setEnabled(true);

    }

    private void activar() {
        btnIconoLupa.setEnabled(true);
        btnGuardar.setEnabled(true);
        txtFIdServicio.setEnabled(true);
        txtFNombreServicio.setEnabled(true);
        txtADescServicio.setEnabled(true);
        tpHoraInicio.setEnabled(true);
        tpHoraTermino.setEnabled(true);
        btnSalir.setEnabled(true);

        btnEliminar.setEnabled(false);
    }

    private void limpiar() {
        txtFIdServicio.setText("");
        txtFNombreServicio.setText("");
        txtADescServicio.setText("");
        tpHoraInicio.setText("");
        tpHoraTermino.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIconoLupa;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPRegistrarServicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneAreaDesc;
    private javax.swing.JScrollPane jScrollPaneTablaServicio;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblHoraTermino;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaServicios;
    private com.github.lgooddatepicker.components.TimePicker tpHoraInicio;
    private com.github.lgooddatepicker.components.TimePicker tpHoraTermino;
    private javax.swing.JTextArea txtADescServicio;
    private javax.swing.JTextField txtFIdServicio;
    private javax.swing.JTextField txtFNombreServicio;
    // End of variables declaration//GEN-END:variables
}
