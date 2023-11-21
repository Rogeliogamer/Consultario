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

    Funciones fn = new Funciones();
    FuncionesInterface di = new FuncionesInterface();
    FuncionesValidar validar = new FuncionesValidar();
    FuncionesFecha fe = new FuncionesFecha();
    DefaultTableModel model;

    String idServicio;
    String nombreServ;
    String descServ;
    String horaInicio;
    String horaTermino;

    public FrmRegistrarServicio() {
        initComponents();
        this.setLocationRelativeTo(null);

        TextPrompt pHIdServicio = new TextPrompt("Id", txtFIdServicio);
        TextPrompt pHNombreServicio = new TextPrompt("Nombre del Servicio", txtFNombreServicio);
        TextPrompt pHDescServicio = new TextPrompt("Descripción del Servico", txtADescServicio);

        ActualizarTabla();

        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPControlServicios = new javax.swing.JPanel();
        jScrollPaneAreaDesc = new javax.swing.JScrollPane();
        txtADescServicio = new javax.swing.JTextArea();
        jScrollPaneTablaServicio = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        txtFNombreServicio = new javax.swing.JTextField();
        tpHoraInicio = new com.github.lgooddatepicker.components.TimePicker();
        tpHoraTermino = new com.github.lgooddatepicker.components.TimePicker();
        lblTitular = new javax.swing.JLabel();
        txtFIdServicio = new javax.swing.JTextField();
        lblHoraInicio = new javax.swing.JLabel();
        lblHoraTermino = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPControlServicios.setBackground(new java.awt.Color(36, 130, 119));
        jPControlServicios.setMaximumSize(new java.awt.Dimension(610, 360));
        jPControlServicios.setMinimumSize(new java.awt.Dimension(610, 360));
        jPControlServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPControlServiciosMousePressed(evt);
            }
        });

        txtADescServicio.setColumns(20);
        txtADescServicio.setRows(5);
        jScrollPaneAreaDesc.setViewportView(txtADescServicio);

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
        tablaServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaServiciosMouseClicked(evt);
            }
        });
        jScrollPaneTablaServicio.setViewportView(tablaServicios);

        txtFNombreServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombreServicio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNombreServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombreServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombreServicio.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNombreServicio.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNombreServicio.setPreferredSize(new java.awt.Dimension(160, 30));
        txtFNombreServicio.setToolTipText("");

        lblTitular.setText("Registro de Servicios");
        lblTitular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));

        txtFIdServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFIdServicio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFIdServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFIdServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFIdServicio.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFIdServicio.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFIdServicio.setPreferredSize(new java.awt.Dimension(160, 30));
        txtFIdServicio.setToolTipText("");

        lblHoraInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoraInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraInicio.setText("Hora de Inicio:");

        lblHoraTermino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoraTermino.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraTermino.setText("Hora de Cierre:");

        btnGuardar.setText("Registrar");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        javax.swing.GroupLayout jPControlServiciosLayout = new javax.swing.GroupLayout(jPControlServicios);
        jPControlServicios.setLayout(jPControlServiciosLayout);
        jPControlServiciosLayout.setHorizontalGroup(
            jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPControlServiciosLayout.createSequentialGroup()
                .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPControlServiciosLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPaneTablaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPControlServiciosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblTitular))
                    .addGroup(jPControlServiciosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPControlServiciosLayout.createSequentialGroup()
                                .addComponent(txtFIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPaneAreaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPControlServiciosLayout.createSequentialGroup()
                                .addComponent(lblHoraTermino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tpHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPControlServiciosLayout.createSequentialGroup()
                                .addComponent(lblHoraInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPControlServiciosLayout.setVerticalGroup(
            jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPControlServiciosLayout.createSequentialGroup()
                .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPControlServiciosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneTablaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPControlServiciosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblTitular)
                        .addGap(17, 17, 17)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPControlServiciosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPControlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tpHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(jPControlServiciosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPaneAreaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPControlServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPControlServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        obtenerVariables();

        if (camposVacios() == true) {
            mostrarError("Datos Faltantes", "Completa todos los campos");
        } else {
            if (fn.verificarExistencia(idServicio) == true) {
                mostrarError("Id Existente", "Ingresa un nuevo identificador");
            } else {
                if (esRangoValido(horaInicio, horaTermino) == true) {
                    insertarServicio();
                    ActualizarTabla();
                    limpiar();
                } else {
                    mostrarError("Horas conflictivas", "Selecciona un rango coherente de horas");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        obtenerVariables();
        int filaSeleccionada = tablaServicios.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = String.valueOf(model.getValueAt(filaSeleccionada, 0));
            fn.ejecutarSentencia("DELETE FROM Servicio WHERE Id_Servicio = " + id, true);
            ActualizarTabla();
            limpiar();
        } else {

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaServicios.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = String.valueOf(model.getValueAt(filaSeleccionada, 0));
            fn.ejecutarSentencia("DELETE FROM Servicio WHERE Id_Servicio = " + id, true);
            ActualizarTabla();
            limpiar();
        } else {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaServiciosMouseClicked
        int row = tablaServicios.getSelectedRow();
        if (row != -1) {
            txtFIdServicio.setText(String.valueOf(model.getValueAt(row, 0)));
            txtFNombreServicio.setText(String.valueOf(model.getValueAt(row, 1)));
            String id = txtFIdServicio.getText();
            String descripcion = "SELECT Descripcion FROM Servicio WHERE Id_Servicio = " + id;
            String horaDeInicio = "SELECT TIME_FORMAT(Hora_Inicio, '%H:%i') "
                    + "FROM Servicio WHERE Id_Servicio = " + id;
            String horaDeTermino = "SELECT TIME_FORMAT(Hora_Termino, '%H:%i') "
                    + "FROM Servicio WHERE Id_Servicio = " + id;
            System.out.println(id);
            txtADescServicio.setText(fn.obtenerResultado(descripcion));
            tpHoraInicio.setText(fn.obtenerResultado(horaDeInicio));
            tpHoraTermino.setText(fn.obtenerResultado(horaDeTermino));

            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);
            txtFIdServicio.setEnabled(false);
        } else {
            tablaServicios.clearSelection();
            btnEliminar.setEnabled(false);
            txtFIdServicio.setEnabled(true);
        }
    }//GEN-LAST:event_tablaServiciosMouseClicked

    private void jScrollPaneTablaServicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneTablaServicioMousePressed
        tablaServicios.clearSelection();
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        txtFIdServicio.setEnabled(true);
    }//GEN-LAST:event_jScrollPaneTablaServicioMousePressed

    private void jPControlServiciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPControlServiciosMousePressed
        tablaServicios.clearSelection();
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        txtFIdServicio.setEnabled(true);
    }//GEN-LAST:event_jPControlServiciosMousePressed

    private void insertarServicio() {
        obtenerVariables();
        String citaSQL = "INSERT INTO Servicio (Id_Servicio, Nombre_Servicio, Descripcion, HoraInicio, HoraTermino) "
                + "VALUES (" + idServicio + ", '" + nombreServ + "', '" + descServ + "', '" + horaInicio + "', '" + horaTermino + "')";
        fn.ejecutarSentencia(citaSQL, true);
    }

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
        return idServicio.isEmpty() || nombreServ.isEmpty() || descServ.isEmpty() || horaInicio.isEmpty() || horaTermino.isEmpty();
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void obtenerVariables() {
        idServicio = txtFIdServicio.getText();
        nombreServ = txtFNombreServicio.getText();
        descServ = txtADescServicio.getText();
        horaInicio = tpHoraInicio.getText();
        horaTermino = tpHoraTermino.getText();
    }

    private void ActualizarTabla() {
        model = fn.mostrarTablas("SELECT\n"
                + "servicio.Id_Servicio as 'Id',\n"
                + "servicio.Nombre_Servicio as 'Nombre',\n"
                + "servicio.Hora_Inicio as 'Hora_Inicio',\n"
                + "servicio.Hora_Termino as 'Hora_Termino'\n"
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPControlServicios;
    private javax.swing.JScrollPane jScrollPaneAreaDesc;
    private javax.swing.JScrollPane jScrollPaneTablaServicio;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblHoraTermino;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JTable tablaServicios;
    private com.github.lgooddatepicker.components.TimePicker tpHoraInicio;
    private com.github.lgooddatepicker.components.TimePicker tpHoraTermino;
    private javax.swing.JTextArea txtADescServicio;
    private javax.swing.JTextField txtFIdServicio;
    private javax.swing.JTextField txtFNombreServicio;
    // End of variables declaration//GEN-END:variables
}
