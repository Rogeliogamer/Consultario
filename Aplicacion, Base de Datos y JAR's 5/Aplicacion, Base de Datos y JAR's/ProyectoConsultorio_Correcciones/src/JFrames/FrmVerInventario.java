package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesValidar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmVerInventario extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones para validar campos.
    DefaultTableModel model;

    String idElementoSeleccionado, categoriaElemento, nombreElemento, cantidadElemento, descElemento;

    public FrmVerInventario() {
        initComponents();

        this.setLocationRelativeTo(null);

        llenarCmbCategoria();
        actualizarTabla();
        formatoTabla();
        seccionEditar(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpControlCitas = new javax.swing.JPanel();
        jScrollPaneTablaInventario = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        lblTitular = new javax.swing.JLabel();
        CboxCategoria = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpControlCitas.setBackground(new java.awt.Color(36, 130, 119));
        jpControlCitas.setMaximumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.setMinimumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpControlCitasMouseClicked(evt);
            }
        });

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaInventario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInventarioMouseClicked(evt);
            }
        });
        jScrollPaneTablaInventario.setViewportView(tablaInventario);

        lblTitular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setText("Inventario");

        CboxCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxCategoria.setBorder(null);
        CboxCategoria.setMaximumSize(new java.awt.Dimension(135, 30));
        CboxCategoria.setMinimumSize(new java.awt.Dimension(135, 30));
        CboxCategoria.setPreferredSize(new java.awt.Dimension(135, 30));

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

        txtADescripcion.setColumns(20);
        txtADescripcion.setRows(5);
        jScrollPane1.setViewportView(txtADescripcion);

        javax.swing.GroupLayout jpControlCitasLayout = new javax.swing.GroupLayout(jpControlCitas);
        jpControlCitas.setLayout(jpControlCitasLayout);
        jpControlCitasLayout.setHorizontalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addComponent(lblTitular)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPaneTablaInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(jpControlCitasLayout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(CboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpControlCitasLayout.setVerticalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneTablaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void tablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInventarioMouseClicked
        int row = tablaInventario.getSelectedRow();
        if (row != -1) {
            idElementoSeleccionado = (String.valueOf(model.getValueAt(row, 0)));
            categoriaElemento = (String.valueOf(model.getValueAt(row, 1)));
            nombreElemento = (String.valueOf(model.getValueAt(row, 2)));
            cantidadElemento = (String.valueOf(model.getValueAt(row, 3)));

            String descElementoSQL = "SELECT Descripcion FROM Elemento WHERE Id_Elemento = " + idElementoSeleccionado;
            descElemento = fn.obtenerResultado(descElementoSQL);
            txtADescripcion.setText(descElemento);

            seccionEditar(true);

        } else {
            tablaInventario.clearSelection();
            seccionEditar(false);
            reiniciarValores();
        }
    }//GEN-LAST:event_tablaInventarioMouseClicked

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        String seleccion = CboxCategoria.getSelectedItem().toString();

        if (!seleccion.isEmpty() || !seleccion.equals("Seleccione una opcion")) {
            switch (seleccion) {
                case "Medicamento" -> {
                    actualizarTablaConFiltro("Medicamento");
                }
                case "Material" -> {
                    actualizarTablaConFiltro("Material");
                }
                case "Instrumento" -> {
                    actualizarTablaConFiltro("Instrumento");
                }
                case "Otro" -> {
                    actualizarTablaConFiltro("Otro");
                }
                default -> {
                }
            }
            formatoTabla();
        } else {
            mostrarError("Sin categoria", "Debes elegir una categoria");
            actualizarTabla();
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        FrmRegistrarInventario frm_registrarInventario = new FrmRegistrarInventario(idElementoSeleccionado, categoriaElemento, nombreElemento, cantidadElemento, descElemento);
        frm_registrarInventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmRegistrarInventario frm_registrarInventario = new FrmRegistrarInventario();
        frm_registrarInventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jpControlCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpControlCitasMouseClicked
        tablaInventario.clearSelection();
        seccionEditar(false);
        reiniciarValores();
    }//GEN-LAST:event_jpControlCitasMouseClicked

    private void seccionEditar(boolean opcion) {
        btnModificar.setEnabled(opcion);
        btnEliminar.setEnabled(opcion);
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void reiniciarValores() {
        idElementoSeleccionado = "";
        categoriaElemento = "";
        nombreElemento = "";
        cantidadElemento = "";
        descElemento = "";
    }

    private void actualizarTablaConFiltro(String filtro) {
        model = fn.mostrarTablas("SELECT "
                + "Id_Elemento AS 'ID',\n"
                + "Nombre_Categoria AS 'Categoría',\n"
                + "Nombre_Producto AS 'Producto',\n"
                + "Cantidad AS 'Cantidad'\n"
                + "FROM Elemento\n"
                + "WHERE Nombre_Categoria = '" + filtro + "'\n"
                + "ORDER BY Nombre_Producto ASC");
        this.tablaInventario.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void actualizarTabla() {
        model = fn.mostrarTablas("SELECT "
                + "Id_Elemento AS 'ID',\n"
                + "Nombre_Categoria AS 'Categoría',\n"
                + "Nombre_Producto AS 'Producto',\n"
                + "Cantidad AS 'Cantidad'\n"
                + "FROM Elemento "
                + "ORDER BY Nombre_Producto ASC");
        this.tablaInventario.setModel(model);
        fn.realizarSentencia("commit");
    }

    private void formatoTabla() {
        TableColumn columna;
        columna = tablaInventario.getColumnModel().getColumn(0); // ID
        columna.setPreferredWidth(40);
        columna = tablaInventario.getColumnModel().getColumn(1); // Categoria
        columna.setPreferredWidth(100);
        columna = tablaInventario.getColumnModel().getColumn(2); // Nombre
        columna.setPreferredWidth(230);
        columna = tablaInventario.getColumnModel().getColumn(3); // Cantidad
        columna.setPreferredWidth(80);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tablaInventario.getColumnCount(); i++) {
            tablaInventario.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void llenarCmbCategoria() {
        String[] opcionesCategoria = {"Seleccione una opcion", "Medicamento", "Material", "Instrumento", "Otro"};
        for (String opcion : opcionesCategoria) {
            CboxCategoria.addItem(opcion);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVerInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxCategoria;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTablaInventario;
    private javax.swing.JPanel jpControlCitas;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextArea txtADescripcion;
    // End of variables declaration//GEN-END:variables
}
