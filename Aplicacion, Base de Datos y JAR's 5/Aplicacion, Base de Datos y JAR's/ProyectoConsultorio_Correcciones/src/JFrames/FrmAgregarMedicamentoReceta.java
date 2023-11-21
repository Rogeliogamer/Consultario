package JFrames;

import Complementos.Funciones;
import Complementos.TextPrompt;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmAgregarMedicamentoReceta extends javax.swing.JFrame {

    Funciones fn = new Funciones();
    DefaultTableModel model;

    // Se tienen que hacer 2 registros, uno el de la receta y el otro el de los medicamentos que pertenecen a la receta.
    // Variables para registrar la receta medica
    String idMedicamento, cantidadMedicamento, frecuenciaMedicamento;
    String mediSeleccionado;

    String idReceta, idMedicamentoEnReceta;

    public FrmAgregarMedicamentoReceta() {
        initComponents();
    }

    public FrmAgregarMedicamentoReceta(String idReceta, String nombreA) {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHFrecuencia = new TextPrompt("Frecuencia", txtFFrecuencia);

        this.idReceta = idReceta;

        actualizarTabla();
        actualizarCombobox();

        lblIdRecetaActual.setText("Médicamentos para: " + nombreA);

        CboxMedicamento.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object selected = CboxMedicamento.getSelectedItem();
                    cargarDescripcion(selected.toString());
                }
            }
        });

        txtADescripcion.setLineWrap(true); // Permite el retorno de línea
        txtADescripcion.setWrapStyleWord(true); // Rompe líneas entre palabras
        txtADescripcion.setText("Aqui aparecera la descripcion del medicamento seleccionado");

        SpinnerNumberModel modelCantidad = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        jSCantidad.setModel(modelCantidad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CboxMedicamento = new javax.swing.JComboBox<>();
        jSCantidad = new javax.swing.JSpinner();
        txtFFrecuencia = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPaneTablaMedReceta = new javax.swing.JScrollPane();
        tablaMedicamentosReceta = new javax.swing.JTable();
        lblIdRecetaActual = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        lblMedicamento = new javax.swing.JLabel();
        lblFrecuencia = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 100));

        CboxMedicamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxMedicamento.setBorder(null);
        CboxMedicamento.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxMedicamento.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxMedicamento.setPreferredSize(new java.awt.Dimension(160, 30));

        jSCantidad.setMaximumSize(new java.awt.Dimension(64, 30));
        jSCantidad.setMinimumSize(new java.awt.Dimension(64, 30));
        jSCantidad.setPreferredSize(new java.awt.Dimension(64, 30));

        txtFFrecuencia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFFrecuencia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFFrecuencia.setToolTipText("");
        txtFFrecuencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFFrecuencia.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFFrecuencia.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFFrecuencia.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFFrecuencia.setPreferredSize(new java.awt.Dimension(160, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.setFocusPainted(false);
        btnAgregar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAgregar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        jScrollPaneTablaMedReceta.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPaneTablaMedReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPaneTablaMedRecetaMousePressed(evt);
            }
        });

        tablaMedicamentosReceta.setBackground(new java.awt.Color(0, 153, 153));
        tablaMedicamentosReceta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaMedicamentosReceta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaMedicamentosReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedicamentosRecetaMouseClicked(evt);
            }
        });
        jScrollPaneTablaMedReceta.setViewportView(tablaMedicamentosReceta);

        lblIdRecetaActual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIdRecetaActual.setForeground(new java.awt.Color(255, 255, 255));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("Cantidad:");

        txtADescripcion.setEditable(false);
        txtADescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtADescripcion.setColumns(20);
        txtADescripcion.setRows(5);
        jScrollPane2.setViewportView(txtADescripcion);

        btnGuardar.setText("Imprimir");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblMedicamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamento.setText("Medicamento:");

        lblFrecuencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFrecuencia.setForeground(new java.awt.Color(255, 255, 255));
        lblFrecuencia.setText("Frecuencia:");

        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedicamento)
                            .addComponent(lblCantidad)
                            .addComponent(lblFrecuencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CboxMedicamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdRecetaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPaneTablaMedReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblIdRecetaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CboxMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneTablaMedReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        obtenerVariables();
        if (!camposVacios()) {
            insertarMedicamentoEnReceta();
            actualizarTabla();
            limpiar();
        } else {
            mostrarError("Datos Faltantes", "Completa todos los campos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarMedicamentoDeReceta();
        actualizarTabla();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaMedicamentosRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicamentosRecetaMouseClicked
        int row = tablaMedicamentosReceta.getSelectedRow();
        if (row != -1) {
            idMedicamentoEnReceta = (String.valueOf(model.getValueAt(row, 0)));
        } else {
            tablaMedicamentosReceta.clearSelection();
            limpiar();
        }
    }//GEN-LAST:event_tablaMedicamentosRecetaMouseClicked

    private void jScrollPaneTablaMedRecetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneTablaMedRecetaMousePressed

    }//GEN-LAST:event_jScrollPaneTablaMedRecetaMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        eliminarMedicamentos();
        eliminarReceta();
        FrmElaborarRecetaMedica frm_elaborarRecetaMedica = new FrmElaborarRecetaMedica();
        frm_elaborarRecetaMedica.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void eliminarReceta() {
        String eliminarRecetaSQL = "DELETE FROM Receta_Medica WHERE Id_Receta_Medica = " + idReceta;
        fn.ejecutarSentencia(eliminarRecetaSQL, false);
        actualizarTabla();
    }

    private void eliminarMedicamentos() {
        String eliminarMedicamentosSQL = "DELETE FROM Receta_Medica__Elemento WHERE Id_Receta_Medica = " + idReceta;
        fn.ejecutarSentencia(eliminarMedicamentosSQL, false);
    }

    private void cargarDescripcion(String nombreMedicamento) {
        if ("Seleccione una opcion".equals(nombreMedicamento)) {
            txtADescripcion.setText("Aqui aparecera la descripcion del medicamento seleccionado");
        } else {
            String descMedicamentoSQL = "SELECT Descripcion FROM Elemento WHERE Nombre_Producto = '" + nombreMedicamento + "'";
            String descMedicamento = fn.obtenerResultado(descMedicamentoSQL);
            System.out.println(nombreMedicamento);
            txtADescripcion.setText(descMedicamento);
        }
    }

    private void insertarMedicamentoEnReceta() {
        idMedicamentoEnReceta = obtenerIdMaxMedicamentoEnReceta();
        String recetaMedicamentoSQL = "INSERT INTO Receta_Medica__Elemento(Id_RecetaMedica_Medicamento, Id_Receta_Medica, Id_Elemento, Frecuencia, Cantidad) "
                + "VALUES (" + idMedicamentoEnReceta + ", " + idReceta + ", " + idMedicamento + ", '" + frecuenciaMedicamento + "', " + cantidadMedicamento + ")";
        fn.ejecutarSentencia(recetaMedicamentoSQL, true);
    }

    private void eliminarMedicamentoDeReceta() {
        int filaSeleccionada = tablaMedicamentosReceta.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = String.valueOf(model.getValueAt(filaSeleccionada, 0));
            fn.ejecutarSentencia("DELETE FROM Receta_Medica__Elemento WHERE Id_RecetaMedica_Medicamento = " + id, true);
        }
    }

    private String obtenerIdMaxMedicamentoEnReceta() {
        String idMaxSQL = "SELECT MAX(Id_RecetaMedica_Medicamento) FROM Receta_Medica__Elemento";
        String idMax = fn.obtenerResultado(idMaxSQL);

        if (idMax == null || idMax.equalsIgnoreCase("null")) {
            return "1";
        } else {
            int idActual = Integer.parseInt(idMax) + 1;
            return Integer.toString(idActual);
        }
    }

    private void obtenerVariables() {
        mediSeleccionado = CboxMedicamento.getSelectedItem().toString();
        String idMedicamentoSQL = "SELECT Id_Elemento FROM Elemento WHERE Nombre_Producto = '" + mediSeleccionado + "'";

        idMedicamento = fn.obtenerResultado(idMedicamentoSQL);
        cantidadMedicamento = jSCantidad.getValue().toString();
        frecuenciaMedicamento = txtFFrecuencia.getText();

    }

    private Boolean camposVacios() {
        return mediSeleccionado.isEmpty() || "Seleccione una opcion".equals(mediSeleccionado) || "0".equals(cantidadMedicamento) || cantidadMedicamento.isEmpty() || frecuenciaMedicamento.isEmpty();
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public void actualizarCombobox() {
        CboxMedicamento.removeAllItems();
        CboxMedicamento = fn.llenarCombobox("SELECT Nombre_Producto AS Nombre FROM Elemento WHERE Nombre_Categoria = 'Medicamento'",
                "Nombre", CboxMedicamento);
    }

    private void limpiar() {
        CboxMedicamento.setSelectedIndex(0);
        jSCantidad.setValue(0);
        txtFFrecuencia.setText("");
    }

    private void actualizarTabla() {
        model = fn.mostrarTablas("SELECT\n"
                + "RME.Id_RecetaMedica_Medicamento as 'ID',\n"
                + "E.Nombre_Producto as 'Medicamento',\n"
                + "RME.Cantidad as 'Cantidad',\n"
                + "RME.Frecuencia as 'Frecuencia'\n"
                + "FROM Receta_Medica__Elemento AS RME\n"
                + "JOIN Elemento AS E ON RME.Id_Elemento = E.Id_Elemento\n"
                + "WHERE RME.Id_Receta_Medica = " + idReceta);
        this.tablaMedicamentosReceta.setModel(model);
        fn.realizarSentencia("commit");

        TableColumn columna;
        columna = tablaMedicamentosReceta.getColumnModel().getColumn(0); // Id Medicamento en Receta
        columna.setPreferredWidth(100);
        columna = tablaMedicamentosReceta.getColumnModel().getColumn(1); // Nombre Medicamento
        columna.setPreferredWidth(180);
        columna = tablaMedicamentosReceta.getColumnModel().getColumn(2); // Cantidad
        columna.setPreferredWidth(80);
        columna = tablaMedicamentosReceta.getColumnModel().getColumn(3); // Frecuencia
        columna.setPreferredWidth(280);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tablaMedicamentosReceta.getColumnCount(); i++) {
            tablaMedicamentosReceta.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarMedicamentoReceta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxMedicamento;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSCantidad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneTablaMedReceta;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFrecuencia;
    private javax.swing.JLabel lblIdRecetaActual;
    private javax.swing.JLabel lblMedicamento;
    private javax.swing.JTable tablaMedicamentosReceta;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtFFrecuencia;
    // End of variables declaration//GEN-END:variables
}
