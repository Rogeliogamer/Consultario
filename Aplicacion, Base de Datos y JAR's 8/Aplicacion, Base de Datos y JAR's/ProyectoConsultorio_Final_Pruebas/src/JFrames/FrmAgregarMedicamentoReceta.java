package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesPDF;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmAgregarMedicamentoReceta extends javax.swing.JFrame {

    Funciones fn = new Funciones();
    DefaultTableModel model;

    /* 
     Se deben realizar dos registros: uno para la receta y otro para los medicamentos 
     que están asociados a dicha receta.
        
     Variables:
     - idMedicamento: Id del medicamento.
     - idReceta: Id de la receta médica.
     - idMedicamentoEnReceta: Id de la entrada que relaciona los medicamentos con la receta.
     */
    String idMedicamento, cantidadMedicamento, frecuenciaMedicamento, mediSeleccionado;
    String idReceta, idMedicamentoEnReceta;
    String[] datosReceta;

    String idFichaClinica;

    public FrmAgregarMedicamentoReceta() {
        initComponents();
    }

    public FrmAgregarMedicamentoReceta(String[] datosReceta) {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHFrecuencia = new TextPrompt("Frecuencia", txtFFrecuencia);

        this.idReceta = datosReceta[0];
        this.datosReceta = datosReceta;

        actualizarTabla();
        actualizarCombobox();

        lblIdRecetaActual.setText("Médicamentos para: " + datosReceta[1]);

        CboxMedicamento.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object selected = CboxMedicamento.getSelectedItem();
                    cargarDescripcion(selected.toString());
                    lblStock.setText("- Inventario: " + obtenerStockPorNombre(selected.toString()));
                }
            }

        });

        txtADescripcion.setLineWrap(true); // Permite el retorno de línea
        txtADescripcion.setWrapStyleWord(true); // Rompe líneas entre palabras
        txtADescripcion.setText("Aqui aparecera la descripcion del medicamento seleccionado");

        SpinnerNumberModel modelCantidad = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        jSCantidad.setModel(modelCantidad);

        btnEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPAgregarMedicamento = new javax.swing.JPanel();
        CboxMedicamento = new javax.swing.JComboBox<>();
        jSCantidad = new javax.swing.JSpinner();
        txtFFrecuencia = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblIdRecetaActual = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        btnGenerarPDF = new javax.swing.JButton();
        lblMedicamento = new javax.swing.JLabel();
        lblFrecuencia = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblStock = new javax.swing.JLabel();
        jScrollPaneTablaMedReceta = new javax.swing.JScrollPane();
        tablaMedicamentosReceta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPAgregarMedicamento.setBackground(new java.awt.Color(36, 130, 119));
        jPAgregarMedicamento.setMaximumSize(new java.awt.Dimension(610, 100));
        jPAgregarMedicamento.setMinimumSize(new java.awt.Dimension(610, 100));
        jPAgregarMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPAgregarMedicamentoMouseClicked(evt);
            }
        });

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

        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.setFocusPainted(false);
        btnGenerarPDF.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGenerarPDF.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGenerarPDF.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
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

        lblStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPaneTablaMedReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPaneTablaMedRecetaMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPAgregarMedicamentoLayout = new javax.swing.GroupLayout(jPAgregarMedicamento);
        jPAgregarMedicamento.setLayout(jPAgregarMedicamentoLayout);
        jPAgregarMedicamentoLayout.setHorizontalGroup(
            jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarMedicamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarMedicamentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarMedicamentoLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPAgregarMedicamentoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarMedicamentoLayout.createSequentialGroup()
                        .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedicamento)
                            .addComponent(lblCantidad)
                            .addComponent(lblFrecuencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CboxMedicamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPAgregarMedicamentoLayout.createSequentialGroup()
                                .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPAgregarMedicamentoLayout.createSequentialGroup()
                        .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdRecetaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPAgregarMedicamentoLayout.createSequentialGroup()
                                .addComponent(jScrollPaneTablaMedReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        jPAgregarMedicamentoLayout.setVerticalGroup(
            jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarMedicamentoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblIdRecetaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarMedicamentoLayout.createSequentialGroup()
                        .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CboxMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarMedicamentoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarMedicamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneTablaMedReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAgregarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAgregarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        obtenerVariables();
        if (!camposVacios()) {
            if (cantidadValida(idMedicamento)) {
                insertarMedicamentoEnReceta();
                reducirCantidad();
                actualizarTabla();
                limpiar();
            } else {
                mostrarError("No hay medicamento", "Selecciona una cantidad menor o reabastece el inventario");
            }
        } else {
            mostrarError("Datos Faltantes", "Completa todos los campos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarMedicamentoDeReceta();
        actualizarTabla();
        limpiar();

        btnEliminar.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnGenerarPDF.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Cancelamos el proceso, por lo que es necesario eliminar todos los registros y volver a la primer ventana.
        eliminarMedicamentos();
        eliminarReceta();
        FrmElaborarRecetaMedica frm_elaborarRecetaMedica = new FrmElaborarRecetaMedica();
        frm_elaborarRecetaMedica.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
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
                        // Lógica para crear el PDF
                        FuncionesPDF fnPDF = new FuncionesPDF();
                        fnPDF.generarRecetaPDF(datosReceta, filePath);

                        // Comprobar Existencia de la Ficha
                        if (comprobarFichaClinica()) {
                            boolean estado = false;
                            // Comprobar Existencia de Medicamentos
                            if (fn.verificarExistencia("SELECT Id_Elemento FROM Receta_Medica__Elemento WHERE Id_Receta_Medica = " + idReceta)) {
                                actualizarMedicamentos();
                                estado = true;
                            }

                            if (fn.verificarExistencia("SELECT AlturaCm FROM Receta_Medica WHERE Id_Receta_Medica = " + idReceta)) {
                                actualizarAltura();
                                estado = true;
                            }

                            if (fn.verificarExistencia("SELECT PesoKg FROM Receta_Medica WHERE Id_Receta_Medica = " + idReceta)) {
                                actualizarPeso();
                                estado = true;
                            }

                            if (estado == true) {
                                actualizarFecha();
                            }
                        }
                        eliminarMedicamentos();
                        eliminarReceta();
                        FrmElaborarRecetaMedica frm_elaborarRecetaMedica = new FrmElaborarRecetaMedica();
                        frm_elaborarRecetaMedica.setVisible(true);
                        dispose();
                    } else {
                        // No se ejecuta la lógica, el usuario no desea sobrescribir el archivo.
                    }
                } else {
                    // Lógica para crear el PDF si no existe un archivo previo
                    FuncionesPDF fnPDF = new FuncionesPDF();
                    fnPDF.generarRecetaPDF(datosReceta, filePath);
                    // Comprobar Existencia de la Ficha
                    if (comprobarFichaClinica()) {
                        boolean estado = false;
                        // Comprobar Existencia de Medicamentos
                        if (fn.verificarExistencia("SELECT Id_Elemento FROM Receta_Medica__Elemento WHERE Id_Receta_Medica = " + idReceta)) {
                            actualizarMedicamentos();
                            estado = true;
                        }

                        if (fn.verificarExistencia("SELECT AlturaCm FROM Receta_Medica WHERE Id_Receta_Medica = " + idReceta)) {
                            actualizarAltura();
                            estado = true;
                        }

                        if (fn.verificarExistencia("SELECT PesoKg FROM Receta_Medica WHERE Id_Receta_Medica = " + idReceta)) {
                            actualizarPeso();
                            estado = true;
                        }

                        if (estado == true) {
                            actualizarFecha();
                            actualizarMedico();
                        }
                    }
                    eliminarMedicamentos();
                    eliminarReceta();
                    FrmElaborarRecetaMedica frm_elaborarRecetaMedica = new FrmElaborarRecetaMedica();
                    frm_elaborarRecetaMedica.setVisible(true);
                    dispose();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void tablaMedicamentosRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicamentosRecetaMouseClicked
        int row = tablaMedicamentosReceta.getSelectedRow();
        if (row != -1) {
            idMedicamentoEnReceta = (String.valueOf(model.getValueAt(row, 0)));
            btnEliminar.setEnabled(true);
            btnAgregar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnGenerarPDF.setEnabled(false);
        } else {
            tablaMedicamentosReceta.clearSelection();
            btnEliminar.setEnabled(false);
            btnAgregar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnGenerarPDF.setEnabled(true);
            limpiar();
        }
    }//GEN-LAST:event_tablaMedicamentosRecetaMouseClicked

    private void jScrollPaneTablaMedRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneTablaMedRecetaMouseClicked
        btnAgregar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnGenerarPDF.setEnabled(true);
        btnEliminar.setEnabled(false);
        tablaMedicamentosReceta.clearSelection();
    }//GEN-LAST:event_jScrollPaneTablaMedRecetaMouseClicked

    private void jPAgregarMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAgregarMedicamentoMouseClicked
        btnAgregar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnGenerarPDF.setEnabled(true);
        btnEliminar.setEnabled(false);
        tablaMedicamentosReceta.clearSelection();
    }//GEN-LAST:event_jPAgregarMedicamentoMouseClicked

    private boolean comprobarFichaClinica() {
        String nControlASQL = "SELECT Alumno_Numero_Control FROM Receta_Medica WHERE Id_Receta_Medica = " + datosReceta[0];
        String fichaExisteSQL = "SELECT Id_Ficha_Clinica FROM Ficha_Clinica WHERE Alumno_Numero_Control = (" + nControlASQL + ")";
        if (fn.verificarExistencia(fichaExisteSQL)) {
            idFichaClinica = fn.obtenerResultado(fichaExisteSQL);
            return true;
        } else {
            return false;
        }
    }

    private void actualizarMedicamentos() {
        ArrayList<String[]> datosMedicamentosEnReceta = fn.obtenerResultados("SELECT Id_Elemento, Cantidad FROM Receta_Medica__Elemento WHERE Id_Receta_Medica = " + datosReceta[0]);
        String str = "";
        for (String[] entrada : datosMedicamentosEnReceta) {
            String nombreMedicamento = fn.obtenerResultado("SELECT Nombre_Producto FROM Elemento WHERE Id_Elemento = " + entrada[0]);
            str += nombreMedicamento + " | ";
        }
        String modificarDatoSQL = "UPDATE Ficha_Clinica SET Medicamentos = '" + str + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarDatoSQL, false);
    }

    private void actualizarMedico() {
        String nombreCompletoMSQL = "SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS NombreCompleto FROM Medico "
                + "WHERE Numero_Control = " + VariablesGlobales.numeroDeControl;
        String nombreCompletoM = fn.obtenerResultado(nombreCompletoMSQL);

        // Código para actualizar el médico asociado a la última modificación en la Base de Datos.
        String modificarMedicoSQL = "UPDATE Ficha_Clinica SET Nombre_Medico = '" + nombreCompletoM + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarMedicoSQL, false);
    }

    private void actualizarPeso() {
        if (!datosReceta[5].equals("NULL")) {
            String modificarPesoSQL = "UPDATE Ficha_Clinica SET PesoKg = " + datosReceta[5] + " "
                    + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
            fn.ejecutarSentencia(modificarPesoSQL, false);
        }
    }

    private void actualizarAltura() {
        if (!datosReceta[4].equals("NULL")) {
            String modificarEstaturaSQL = "UPDATE Ficha_Clinica SET AlturaCm = " + datosReceta[4] + " "
                    + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
            fn.ejecutarSentencia(modificarEstaturaSQL, false);
        }
    }

    private void actualizarFecha() {
        // Código para actualizar la fecha de la última modificación en la Base de Datos.
        String modificarFechaSQL = "UPDATE Ficha_Clinica SET Fecha_Actualizacion = '" + datosReceta[7] + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarFechaSQL, false);

        // Código para actualizar la hora de la última modificación en la Base de Datos.
        String modificarHoraSQL = "UPDATE Ficha_Clinica SET Hora_Actualizacion = '" + datosReceta[8] + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarHoraSQL, false);
    }

    // Método para obtener la última ID en la tabla de medicamentos en receta.
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

    // Método para eliminar la receta médica en caso de cancelar la operación.
    private void eliminarReceta() {
        String eliminarRecetaSQL = "DELETE FROM Receta_Medica WHERE Id_Receta_Medica = " + idReceta;
        fn.ejecutarSentencia(eliminarRecetaSQL, false);
        actualizarTabla();
    }

    // Método para eliminar todos los medicamentos de la receta médica que se va a eliminar (evitar conflictos).
    private void eliminarMedicamentos() {
        String eliminarMedicamentosSQL = "DELETE FROM Receta_Medica__Elemento WHERE Id_Receta_Medica = " + idReceta;
        fn.ejecutarSentencia(eliminarMedicamentosSQL, false);
    }

    // Método para insertar un nuevo medicamento en la receta médica.
    private void insertarMedicamentoEnReceta() {
        idMedicamentoEnReceta = obtenerIdMaxMedicamentoEnReceta();
        String recetaMedicamentoSQL = "INSERT INTO Receta_Medica__Elemento(Id_RecetaMedica_Medicamento, Id_Receta_Medica, Id_Elemento, Frecuencia, Cantidad) "
                + "VALUES (" + idMedicamentoEnReceta + ", " + idReceta + ", " + idMedicamento + ", '" + frecuenciaMedicamento + "', " + cantidadMedicamento + ")";
        fn.ejecutarSentencia(recetaMedicamentoSQL, true);
    }

    // Método para quitar la cantidad del inventario (Se ha agregado un medicamento en la receta).
    private void reducirCantidad() {
        int cantidadOriginal = Integer.parseInt(obtenerStockPorID(idMedicamento));
        int cantidadElegida = Integer.parseInt(cantidadMedicamento);
        int resultado = cantidadOriginal - cantidadElegida;
        String modificarCantidadSQL = "UPDATE Elemento SET Cantidad = " + resultado + " WHERE Id_Elemento = " + idMedicamento;
        fn.ejecutarSentencia(modificarCantidadSQL, false);
    }

    // Método para eliminar un medicamento de la receta médica.
    private void eliminarMedicamentoDeReceta() {
        int filaSeleccionada = tablaMedicamentosReceta.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = String.valueOf(model.getValueAt(filaSeleccionada, 0));
            aumentarCantidad(id);
            fn.ejecutarSentencia("DELETE FROM Receta_Medica__Elemento WHERE Id_RecetaMedica_Medicamento = " + id, true);
        }
    }

    // Método para devolver la cantidad al inventario (Se ha borrado un medicamento de la receta).
    private void aumentarCantidad(String id) {
        String cantidadEnRecetaSQL = "SELECT Cantidad FROM Receta_Medica__Elemento WHERE Id_RecetaMedica_Medicamento = " + id;
        int cantidadOriginal = Integer.parseInt(obtenerStockPorID(idMedicamento));
        int cantidadEnReceta = Integer.parseInt(fn.obtenerResultado(cantidadEnRecetaSQL));
        int resultado = cantidadOriginal + cantidadEnReceta;
        String modificarCantidadSQL = "UPDATE Elemento SET Cantidad = " + resultado + " WHERE Id_Elemento = " + idMedicamento;
        fn.ejecutarSentencia(modificarCantidadSQL, false);
    }

    // Método para cargar el inventario del medicamento seleccionado (Por Id).
    // Este método es para operaciones.
    private String obtenerStockPorID(String elemento) {
        String cantidadElementoSQL = "SELECT Cantidad FROM Elemento WHERE Id_Elemento = " + elemento;
        String cantidadElemento = fn.obtenerResultado(cantidadElementoSQL);
        return cantidadElemento;
    }

    // Método para cargar el inventario del medicamento seleccionado (Por Nombre).
    // Este método es para solamente mostrar la cantidad.
    private String obtenerStockPorNombre(String elemento) {
        String cantidadElementoSQL = "SELECT Cantidad FROM Elemento WHERE Nombre_Producto = '" + elemento + "'";
        String cantidadElemento = fn.obtenerResultado(cantidadElementoSQL);
        return cantidadElemento;
    }

    // Método para cargar la descripción según el medicamento seleccionado.
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

    // Método para obtener todos los datos necesarios.
    private void obtenerVariables() {
        mediSeleccionado = CboxMedicamento.getSelectedItem().toString();
        String idMedicamentoSQL = "SELECT Id_Elemento FROM Elemento WHERE Nombre_Producto = '" + mediSeleccionado + "'";

        idMedicamento = fn.obtenerResultado(idMedicamentoSQL);
        cantidadMedicamento = jSCantidad.getValue().toString();
        frecuenciaMedicamento = txtFFrecuencia.getText();

    }

    // Método para revisar que la cantidad proporcionada no sea mayor a la existente.
    private Boolean cantidadValida(String elemento) {
        return Integer.parseInt(cantidadMedicamento) <= Integer.parseInt(obtenerStockPorID(elemento));
    }

    // Método para revisar que exista contenido en todos los campos.
    private Boolean camposVacios() {
        return mediSeleccionado.isEmpty() || "Seleccione una opcion".equals(mediSeleccionado) || "0".equals(cantidadMedicamento) || cantidadMedicamento.isEmpty() || frecuenciaMedicamento.isEmpty();
    }

    // Método para mostrar mensajes de error.
    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    // Método para rellenar de datos el Combobox de Medicamentos.
    public void actualizarCombobox() {
        CboxMedicamento.removeAllItems();
        CboxMedicamento = fn.llenarCombobox("SELECT Nombre_Producto AS Nombre FROM Elemento WHERE Nombre_Categoria = 'Medicamento'",
                "Nombre", CboxMedicamento);
    }

    // Método para limpiar TODOS los campos.
    private void limpiar() {
        CboxMedicamento.setSelectedIndex(0);
        jSCantidad.setValue(0);
        txtFFrecuencia.setText("");
    }

    // Método para cargar la tabla con los medicamentos relacionados a una receta.
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
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JPanel jPAgregarMedicamento;
    private javax.swing.JSpinner jSCantidad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneTablaMedReceta;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFrecuencia;
    private javax.swing.JLabel lblIdRecetaActual;
    private javax.swing.JLabel lblMedicamento;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTable tablaMedicamentosReceta;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtFFrecuencia;
    // End of variables declaration//GEN-END:variables
}
