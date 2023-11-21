package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class FrmRegistrarInventario extends javax.swing.JFrame {

    Funciones fn = new Funciones();
    FuncionesValidar validar = new FuncionesValidar();

    String idElemento, nombreElemento, cantidadElemento, descElemento;
    String categoriaSeleccionada;

    String idElementoSeleccionado = "";

    public FrmRegistrarInventario() {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHIdElemento = new TextPrompt("Id del Elemento", txtFIdElemento);
        TextPrompt pHNombreElemento = new TextPrompt("Nombre del Elemento", txtFNombreElemento);

        validar.validarIDn3(txtFIdElemento);

        SpinnerNumberModel modelCantidad = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        jSCantidad.setModel(modelCantidad);

        llenarCmbCategoria();
        seccionEditar(false);
        btnGuardar(true);
        btnVerTodos(true);
        btnSalir.setEnabled(true);
    }

    public FrmRegistrarInventario(String idElemento, String categoriaElemento, String nombreElemento, String cantidadElemento, String descElemento) {
        initComponents();
        llenarCmbCategoria();

        this.setLocationRelativeTo(null);

        SpinnerNumberModel modelCantidad = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        jSCantidad.setModel(modelCantidad);

        idElementoSeleccionado = idElemento;
        txtFIdElemento.setText(idElemento);
        CboxCategoria.setSelectedItem(categoriaElemento);
        txtFNombreElemento.setText(nombreElemento);
        jSCantidad.setValue(Integer.valueOf(cantidadElemento));
        txtADescripcion.setText(descElemento);

        TextPrompt pHIdElemento = new TextPrompt("Id del Elemento", txtFIdElemento);
        TextPrompt pHNombreElemento = new TextPrompt("Nombre del Elemento", txtFNombreElemento);

        seccionEditar(true);
        btnGuardar(false);
        btnVerTodos(false);
        btnSalir.setEnabled(false);
        txtFIdElemento.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnVerTodos = new javax.swing.JButton();
        txtFNombreElemento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        jSCantidad = new javax.swing.JSpinner();
        CboxCategoria = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFIdElemento = new javax.swing.JTextField();
        lblIdElemento = new javax.swing.JLabel();
        lblCategoriaElemento = new javax.swing.JLabel();
        lblNombreElemento = new javax.swing.JLabel();
        lblCantidadElemento = new javax.swing.JLabel();
        lblDescElemento = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 100));

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVerTodos.setText("Ver Todos");
        btnVerTodos.setFocusPainted(false);
        btnVerTodos.setMaximumSize(new java.awt.Dimension(100, 30));
        btnVerTodos.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVerTodos.setPreferredSize(new java.awt.Dimension(100, 30));
        btnVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosActionPerformed(evt);
            }
        });

        txtFNombreElemento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombreElemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNombreElemento.setToolTipText("");
        txtFNombreElemento.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombreElemento.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombreElemento.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNombreElemento.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNombreElemento.setPreferredSize(new java.awt.Dimension(160, 30));

        txtADescripcion.setColumns(20);
        txtADescripcion.setRows(5);
        txtADescripcion.setMaximumSize(new java.awt.Dimension(232, 84));
        txtADescripcion.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane2.setViewportView(txtADescripcion);

        jSCantidad.setMaximumSize(new java.awt.Dimension(64, 30));
        jSCantidad.setMinimumSize(new java.awt.Dimension(64, 30));
        jSCantidad.setPreferredSize(new java.awt.Dimension(64, 30));

        CboxCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxCategoria.setBorder(null);
        CboxCategoria.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxCategoria.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxCategoria.setPreferredSize(new java.awt.Dimension(160, 30));

        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusPainted(false);
        btnActualizar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnActualizar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnActualizar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

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

        txtFIdElemento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFIdElemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFIdElemento.setToolTipText("");
        txtFIdElemento.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFIdElemento.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFIdElemento.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFIdElemento.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFIdElemento.setPreferredSize(new java.awt.Dimension(160, 30));

        lblIdElemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIdElemento.setForeground(new java.awt.Color(255, 255, 255));
        lblIdElemento.setText("ID:");

        lblCategoriaElemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoriaElemento.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoriaElemento.setText("Categoria:");

        lblNombreElemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreElemento.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreElemento.setText("Nombre:");

        lblCantidadElemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidadElemento.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadElemento.setText("Cantidad:");

        lblDescElemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescElemento.setForeground(new java.awt.Color(255, 255, 255));
        lblDescElemento.setText("Descripción:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidadElemento)
                            .addComponent(lblNombreElemento)
                            .addComponent(lblCategoriaElemento)
                            .addComponent(lblIdElemento))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFNombreElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFIdElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(331, 331, 331))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescElemento)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdElemento)
                    .addComponent(txtFIdElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoriaElemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNombreElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreElemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadElemento))
                .addGap(18, 18, 18)
                .addComponent(lblDescElemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        obtenerVariables();
        if (!camposVacios()) {
            String idElementoExisteSQL = "SELECT * FROM Elemento WHERE Id_Elemento = " + idElemento;
            if (!fn.verificarExistencia(idElementoExisteSQL)) {
                insertarElemento();
                limpiar();
            } else {
                mostrarError("Id Duplicada", "Esta ID ya está registrada en el sistema. Por favor, elimina el elemento existente o utiliza otra ID");
            }
        } else {
            mostrarError("Datos Faltantes", "Completa todos los campos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosActionPerformed
        FrmVerInventario frm_verInventario = new FrmVerInventario();
        frm_verInventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVerTodosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        obtenerVariables();
        if (!camposVacios()) {
            modificarElemento();
            limpiar();
            txtFIdElemento.requestFocus();
            btnGuardar(true);
            btnVerTodos(true);
            seccionEditar(false);
            btnSalir.setEnabled(true);
        } else {
            mostrarError("Datos Faltantes", "Completa todos los campos");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        seccionEditar(false);
        btnGuardar(true);
        btnVerTodos(true);
        btnSalir.setEnabled(true);
        limpiar();
        txtFIdElemento.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
        frm_menu_secretario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Método para insertar un nuevo elemento en el inventario.
    private void insertarElemento() {
        String elementoSQL = "INSERT INTO Elemento (Id_Elemento, Nombre_Categoria, Nombre_Producto, Cantidad, Descripcion) "
                + "VALUES (" + idElemento + ", '" + categoriaSeleccionada + "', '" + nombreElemento + "', " + cantidadElemento + ", '" + descElemento + "')";
        fn.ejecutarSentencia(elementoSQL, true);
    }

    // Método para modificar un elemento existente en el inventario.
    private void modificarElemento() {
        String modificarElementoSQL = "UPDATE Elemento SET "
                + "Nombre_Categoria = '" + categoriaSeleccionada + "' , Nombre_Producto = '" + nombreElemento + "', "
                + "Cantidad = " + cantidadElemento + ", Descripcion = '" + descElemento + "' "
                + "WHERE Id_Elemento = " + idElementoSeleccionado;
        fn.ejecutarSentencia(modificarElementoSQL, true);
    }

    // Método para activar o desactivar el botón actualizar y cancelar.
    private void seccionEditar(boolean opcion) {
        btnActualizar.setEnabled(opcion);
        btnActualizar.setVisible(opcion);

        btnCancelar.setEnabled(opcion);
        btnCancelar.setVisible(opcion);
    }

    // Método para activar o desactivar el botón de guardar.
    private void btnGuardar(boolean opcion) {
        btnGuardar.setEnabled(opcion);
        btnGuardar.setVisible(opcion);
    }

    // Método para activar o desactivar el botón de ver todos.
    private void btnVerTodos(boolean opcion) {
        btnVerTodos.setEnabled(opcion);
        btnVerTodos.setVisible(opcion);
    }

    // Método para obtener todos los datos necesarios.
    private void obtenerVariables() {
        idElemento = txtFIdElemento.getText();
        nombreElemento = txtFNombreElemento.getText();
        categoriaSeleccionada = CboxCategoria.getSelectedItem().toString();
        cantidadElemento = jSCantidad.getValue().toString();
        descElemento = txtADescripcion.getText();
    }

    // Método para revisar que exista contenido en todos los campos.
    private Boolean camposVacios() {
        return categoriaSeleccionada.equals("Seleccione una opcion") || idElemento.isEmpty()
                || nombreElemento.isEmpty() || cantidadElemento.isEmpty() || descElemento.isEmpty()
                || categoriaSeleccionada.isEmpty();
    }

    // Método para mostrar mensajes de error.
    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    // Método para rellenar de datos el Combobox de Categoria.
    private void llenarCmbCategoria() {
        String[] opcionesCategoria = {"Seleccione una opcion", "Medicamento", "Material", "Instrumento", "Otro"};
        for (String opcion : opcionesCategoria) {
            CboxCategoria.addItem(opcion);
        }
    }

    // Método para limpiar TODOS los campos.
    private void limpiar() {
        CboxCategoria.setSelectedItem(0);
        txtFIdElemento.setText("");
        txtFNombreElemento.setText("");
        txtADescripcion.setText("");
        jSCantidad.setValue(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxCategoria;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSCantidad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidadElemento;
    private javax.swing.JLabel lblCategoriaElemento;
    private javax.swing.JLabel lblDescElemento;
    private javax.swing.JLabel lblIdElemento;
    private javax.swing.JLabel lblNombreElemento;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtFIdElemento;
    private javax.swing.JTextField txtFNombreElemento;
    // End of variables declaration//GEN-END:variables
}
