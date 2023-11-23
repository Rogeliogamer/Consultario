package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesValidar;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
        seccionEditar(false);

        CboxCategoria.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object selected = CboxCategoria.getSelectedItem();
                    actualizarTablaConFiltro(selected.toString());
                }
            }

        });
        txtADescripcion.setLineWrap(true); // Permite el retorno de línea
        txtADescripcion.setWrapStyleWord(true); // Rompe líneas entre palabras
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpControlCitas = new javax.swing.JPanel();
        jScrollPaneTablaInventario = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        CboxCategoria = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        lblMostrarElemento = new javax.swing.JLabel();
        lblTitular1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpControlCitas.setBackground(new java.awt.Color(36, 130, 119));
        jpControlCitas.setMaximumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.setMinimumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpControlCitasMouseClicked(evt);
            }
        });

        jScrollPaneTablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPaneTablaInventarioMouseClicked(evt);
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

        CboxCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxCategoria.setBorder(null);
        CboxCategoria.setMaximumSize(new java.awt.Dimension(135, 30));
        CboxCategoria.setMinimumSize(new java.awt.Dimension(135, 30));
        CboxCategoria.setPreferredSize(new java.awt.Dimension(135, 30));

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

        txtADescripcion.setEditable(false);
        txtADescripcion.setColumns(20);
        txtADescripcion.setRows(5);
        jScrollPane1.setViewportView(txtADescripcion);

        lblMostrarElemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMostrarElemento.setForeground(new java.awt.Color(255, 255, 255));
        lblMostrarElemento.setText("Mostrar:");

        lblTitular1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblTitular1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular1.setText("Elementos en Inventario");
        lblTitular1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jpControlCitasLayout = new javax.swing.GroupLayout(jpControlCitas);
        jpControlCitas.setLayout(jpControlCitasLayout);
        jpControlCitasLayout.setHorizontalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTablaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36))
                                .addGroup(jpControlCitasLayout.createSequentialGroup()
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblMostrarElemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitular1)
                        .addGap(15, 15, 15))))
        );
        jpControlCitasLayout.setVerticalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMostrarElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitular1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneTablaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            btnSalir.setEnabled(false);
            CboxCategoria.setEnabled(false);

        } else {
            tablaInventario.clearSelection();
            seccionEditar(false);
            btnSalir.setEnabled(true);
            CboxCategoria.setEnabled(true);
            reiniciarValores();
            txtADescripcion.setText("");
        }
    }//GEN-LAST:event_tablaInventarioMouseClicked

    private void jpControlCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpControlCitasMouseClicked
        tablaInventario.clearSelection();
        seccionEditar(false);
        btnSalir.setEnabled(true);
        CboxCategoria.setEnabled(true);
        reiniciarValores();
        txtADescripcion.setText("");
    }//GEN-LAST:event_jpControlCitasMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        FrmRegistrarInventario frm_registrarInventario = new FrmRegistrarInventario(idElementoSeleccionado, categoriaElemento, nombreElemento, cantidadElemento, descElemento);
        frm_registrarInventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarElemento();
        actualizarTablaConFiltro(CboxCategoria.getSelectedItem().toString());
        reiniciarValores();
        seccionEditar(false);
        btnSalir.setEnabled(true);
        CboxCategoria.setEnabled(true);
        txtADescripcion.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmRegistrarInventario frm_registrarInventario = new FrmRegistrarInventario();
        frm_registrarInventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jScrollPaneTablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneTablaInventarioMouseClicked
        tablaInventario.clearSelection();
        seccionEditar(false);
        btnSalir.setEnabled(true);
        CboxCategoria.setEnabled(true);
        reiniciarValores();
        txtADescripcion.setText("");
    }//GEN-LAST:event_jScrollPaneTablaInventarioMouseClicked

    private void eliminarElemento() {
        int filaSeleccionada = tablaInventario.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = String.valueOf(model.getValueAt(filaSeleccionada, 0));
            fn.ejecutarSentencia("DELETE FROM Elemento WHERE Id_Elemento = " + id, true);
        }
    }

    // Método para activar o desactivar el botón modificar y eliminar.
    private void seccionEditar(boolean opcion) {
        btnModificar.setEnabled(opcion);
        btnEliminar.setEnabled(opcion);
    }

    // Método para mostrar mensajes de error.
    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    // Método para restablecer valores cuando se desselecciona un elemento de la tabla.
    private void reiniciarValores() {
        idElementoSeleccionado = "";
        categoriaElemento = "";
        nombreElemento = "";
        cantidadElemento = "";
        descElemento = "";
    }

    // Método para actualizar la tabla con los datos de una categoría específica.
    private void actualizarTablaConFiltro(String filtro) {
        if ("Todos".equals(filtro)) {
            model = fn.mostrarTablas("SELECT "
                    + "Id_Elemento AS 'ID',\n"
                    + "Nombre_Categoria AS 'Categoría',\n"
                    + "Nombre_Producto AS 'Producto',\n"
                    + "Cantidad AS 'Cantidad'\n"
                    + "FROM Elemento "
                    + "ORDER BY Nombre_Producto ASC");
        } else {
            model = fn.mostrarTablas("SELECT "
                    + "Id_Elemento AS 'ID',\n"
                    + "Nombre_Categoria AS 'Categoría',\n"
                    + "Nombre_Producto AS 'Producto',\n"
                    + "Cantidad AS 'Cantidad'\n"
                    + "FROM Elemento\n"
                    + "WHERE Nombre_Categoria = '" + filtro + "'\n"
                    + "ORDER BY Nombre_Producto ASC");
        }
        this.tablaInventario.setModel(model);
        fn.realizarSentencia("commit");

        formatoTabla();
    }

    // Método para actualizar la tabla con todos los datos.
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

    // Método para ajustar el tamaño de las columnas de la tabla.
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

    // Método para rellenar de datos el Combobox de Categoria.
    private void llenarCmbCategoria() {
        String[] opcionesCategoria = {"Todos", "Medicamento", "Material", "Instrumento", "Otro"};
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
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTablaInventario;
    private javax.swing.JPanel jpControlCitas;
    private javax.swing.JLabel lblMostrarElemento;
    private javax.swing.JLabel lblTitular1;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextArea txtADescripcion;
    // End of variables declaration//GEN-END:variables
}
