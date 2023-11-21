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
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtFIdElemento = new javax.swing.JTextField();

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
        jScrollPane2.setViewportView(txtADescripcion);

        CboxCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxCategoria.setBorder(null);
        CboxCategoria.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxCategoria.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxCategoria.setPreferredSize(new java.awt.Dimension(160, 30));

        btnModificar.setText("Actualizar");
        btnModificar.setFocusPainted(false);
        btnModificar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnModificar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnModificar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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

        lblTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Inventario");

        txtFIdElemento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFIdElemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFIdElemento.setToolTipText("");
        txtFIdElemento.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFIdElemento.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFIdElemento.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFIdElemento.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFIdElemento.setPreferredSize(new java.awt.Dimension(160, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(txtFIdElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFNombreElemento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CboxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(29, 29, 29)
                .addComponent(txtFIdElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFNombreElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
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

        String idElementoExisteSQL = "SELECT * FROM Elemento WHERE Id_Elemento = " + idElemento;

        if (!camposVacios()) {
            if (!fn.verificarExistencia(idElementoExisteSQL)) {
                if (Integer.parseInt(cantidadElemento) > 0) {
                    insertarElemento();
                    limpiar();
                } else {
                    mostrarError("Cantidada Incoherente", "No pueden existir cantidades negativas de un elemento");
                }
            } else {
                mostrarError("Id Duplicada", "Esta ID ya esta registrada en el sistema, elimina el elemento existente o usa otra id");
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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        obtenerVariables();
        if (!camposVacios()) {
            if (Integer.parseInt(cantidadElemento) > 0) {
                modificarElemento();
                limpiar();
                txtFIdElemento.requestFocus();
            } else {
                mostrarError("Cantidada Incoherente", "No pueden existir cantidades negativas de un elemento");
            }
        } else {
            mostrarError("Datos Faltantes", "Completa todos los campos");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        seccionEditar(false);
        btnGuardar(true);
        limpiar();
        txtFIdElemento.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void insertarElemento() {
        String elementoSQL = "INSERT INTO Elemento (Id_Elemento, Nombre_Categoria, Nombre_Producto, Cantidad, Descripcion) "
                + "VALUES (" + idElemento + ", '" + categoriaSeleccionada + "', '" + nombreElemento + "', " + cantidadElemento + ", '" + descElemento + "')";
        fn.ejecutarSentencia(elementoSQL, true);
    }

    private void modificarElemento() {
        String modificarElementoSQL = "UPDATE Elemento SET "
                + "Nombre_Categoria = '" + categoriaSeleccionada + "' , Nombre_Producto = '" + nombreElemento + "', "
                + "Cantidad = " + cantidadElemento + ", Descripcion = '" + descElemento + "' "
                + "WHERE Id_Elemento = " + idElemento;
        fn.ejecutarSentencia(modificarElementoSQL, true);
    }

    private void seccionEditar(boolean opcion) {
        btnModificar.setEnabled(opcion);
        btnModificar.setVisible(opcion);

        btnCancelar.setEnabled(opcion);
        btnCancelar.setVisible(opcion);
        
        btnGuardar(opcion);
    }
    
    private void btnGuardar(boolean opcion){
        btnGuardar.setEnabled(opcion);
        btnGuardar.setVisible(opcion);
    }

    private void obtenerVariables() {
        idElemento = txtFIdElemento.getText();
        nombreElemento = txtFNombreElemento.getText();
        categoriaSeleccionada = CboxCategoria.getSelectedItem().toString();
        cantidadElemento = jSCantidad.getValue().toString();
        descElemento = txtADescripcion.getText();
    }

    private Boolean camposVacios() {
        return categoriaSeleccionada.equals("Seleccione una opcions") || idElemento.isEmpty()
                || nombreElemento.isEmpty() || cantidadElemento.isEmpty() || descElemento.isEmpty()
                || categoriaSeleccionada.isEmpty();
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void llenarCmbCategoria() {
        String[] opcionesCategoria = {"Seleccione una opcion", "Medicamento", "Material", "Instrumento", "Otro"};
        for (String opcion : opcionesCategoria) {
            CboxCategoria.addItem(opcion);
        }
    }

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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVerTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSCantidad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtFIdElemento;
    private javax.swing.JTextField txtFNombreElemento;
    // End of variables declaration//GEN-END:variables
}
