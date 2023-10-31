package JFrames;

import Complementos.FuncionesPDF;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmInformeInventario extends javax.swing.JFrame {

    boolean a, b, c, d;

    public FrmInformeInventario() {
        initComponents();

        this.setLocationRelativeTo(null);

        opcionCantidad.add(rbGNoImportaCeros);
        opcionCantidad.add(rbGSoloCeros);
        opcionCantidad.add(rbGSinCeros);

        jCBoxMedicamentos.setEnabled(false);
        jCBoxMaterial.setEnabled(false);
        jCBoxInstrumento.setEnabled(false);
        jCBoxOtro.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionCantidad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnGenerarPDF = new javax.swing.JButton();
        rbGSinCeros = new javax.swing.JRadioButton();
        rbGSoloCeros = new javax.swing.JRadioButton();
        rbGNoImportaCeros = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        jTBtnFiltros = new javax.swing.JToggleButton();
        jCBoxMedicamentos = new javax.swing.JCheckBox();
        jCBoxMaterial = new javax.swing.JCheckBox();
        jCBoxInstrumento = new javax.swing.JCheckBox();
        jCBoxOtro = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(411, 230));
        setMinimumSize(new java.awt.Dimension(411, 230));

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(411, 230));
        jPanel1.setMinimumSize(new java.awt.Dimension(411, 230));
        jPanel1.setPreferredSize(new java.awt.Dimension(411, 230));

        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.setFocusPainted(false);
        btnGenerarPDF.setMaximumSize(new java.awt.Dimension(122, 30));
        btnGenerarPDF.setMinimumSize(new java.awt.Dimension(122, 30));
        btnGenerarPDF.setPreferredSize(new java.awt.Dimension(122, 30));
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        rbGSinCeros.setBackground(new java.awt.Color(36, 130, 119));
        rbGSinCeros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbGSinCeros.setForeground(new java.awt.Color(255, 255, 255));
        rbGSinCeros.setText("Excluir cantidades en 0");

        rbGSoloCeros.setBackground(new java.awt.Color(36, 130, 119));
        rbGSoloCeros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbGSoloCeros.setForeground(new java.awt.Color(255, 255, 255));
        rbGSoloCeros.setText("Mostrar solo cantidades en 0");

        rbGNoImportaCeros.setBackground(new java.awt.Color(36, 130, 119));
        rbGNoImportaCeros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbGNoImportaCeros.setForeground(new java.awt.Color(255, 255, 255));
        rbGNoImportaCeros.setText("Mostrar todas las cantidades");

        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(122, 30));
        btnCancelar.setMinimumSize(new java.awt.Dimension(122, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(122, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jTBtnFiltros.setText("Activar Filtros");
        jTBtnFiltros.setFocusPainted(false);
        jTBtnFiltros.setMaximumSize(new java.awt.Dimension(122, 30));
        jTBtnFiltros.setMinimumSize(new java.awt.Dimension(122, 30));
        jTBtnFiltros.setPreferredSize(new java.awt.Dimension(122, 30));
        jTBtnFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBtnFiltrosActionPerformed(evt);
            }
        });

        jCBoxMedicamentos.setBackground(new java.awt.Color(36, 130, 119));
        jCBoxMedicamentos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jCBoxMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        jCBoxMedicamentos.setText("Medicamento");
        jCBoxMedicamentos.setFocusPainted(false);
        jCBoxMedicamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCBoxMedicamentos.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jCBoxMedicamentos.setMaximumSize(new java.awt.Dimension(101, 30));
        jCBoxMedicamentos.setMinimumSize(new java.awt.Dimension(101, 30));
        jCBoxMedicamentos.setPreferredSize(new java.awt.Dimension(101, 30));

        jCBoxMaterial.setBackground(new java.awt.Color(36, 130, 119));
        jCBoxMaterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jCBoxMaterial.setForeground(new java.awt.Color(255, 255, 255));
        jCBoxMaterial.setText("Material");
        jCBoxMaterial.setFocusPainted(false);
        jCBoxMaterial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCBoxMaterial.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jCBoxMaterial.setMaximumSize(new java.awt.Dimension(101, 30));
        jCBoxMaterial.setMinimumSize(new java.awt.Dimension(101, 30));
        jCBoxMaterial.setPreferredSize(new java.awt.Dimension(101, 30));

        jCBoxInstrumento.setBackground(new java.awt.Color(36, 130, 119));
        jCBoxInstrumento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jCBoxInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        jCBoxInstrumento.setText("Instrumento");
        jCBoxInstrumento.setFocusPainted(false);
        jCBoxInstrumento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCBoxInstrumento.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jCBoxInstrumento.setMaximumSize(new java.awt.Dimension(101, 30));
        jCBoxInstrumento.setMinimumSize(new java.awt.Dimension(101, 30));
        jCBoxInstrumento.setPreferredSize(new java.awt.Dimension(101, 30));

        jCBoxOtro.setBackground(new java.awt.Color(36, 130, 119));
        jCBoxOtro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jCBoxOtro.setForeground(new java.awt.Color(255, 255, 255));
        jCBoxOtro.setText("Otro");
        jCBoxOtro.setFocusPainted(false);
        jCBoxOtro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCBoxOtro.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jCBoxOtro.setMaximumSize(new java.awt.Dimension(101, 30));
        jCBoxOtro.setMinimumSize(new java.awt.Dimension(101, 30));
        jCBoxOtro.setPreferredSize(new java.awt.Dimension(101, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTBtnFiltros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBoxMedicamentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBoxOtro, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jCBoxMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBoxInstrumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbGSoloCeros)
                                    .addComponent(rbGSinCeros)
                                    .addComponent(rbGNoImportaCeros))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTBtnFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBoxMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbGNoImportaCeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBoxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbGSinCeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBoxInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbGSoloCeros))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBoxOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        if (!camposVacios()) {

            FuncionesPDF fnPDF = new FuncionesPDF();
            obtenerSeleccion();

            String sentencia = "SELECT Id_Elemento, Nombre_Categoria, Nombre_Producto, Cantidad FROM Elemento";

            int opcion = 0;

            if (jTBtnFiltros.isSelected()) {
                sentencia += " WHERE (";

                boolean algunaCategoriaSeleccionada = false;

                if (a) {
                    sentencia += "Nombre_Categoria = 'Medicamento' OR ";
                    algunaCategoriaSeleccionada = true;
                }
                if (b) {
                    sentencia += "Nombre_Categoria = 'Material' OR ";
                    algunaCategoriaSeleccionada = true;
                }
                if (c) {
                    sentencia += "Nombre_Categoria = 'Instrumento' OR ";
                    algunaCategoriaSeleccionada = true;
                }
                if (d) {
                    sentencia += "Nombre_Categoria = 'Otro' OR ";
                    algunaCategoriaSeleccionada = true;
                }

                // Elimina la parte final 'OR' si existe
                if (algunaCategoriaSeleccionada && sentencia.endsWith("OR ")) {
                    sentencia = sentencia.substring(0, sentencia.length() - 4);
                }

                sentencia += ")";

                if (rbGNoImportaCeros.isSelected()) {
                    opcion = 3;
                }

                if (rbGSoloCeros.isSelected()) {
                    opcion = 1;
                }

                if (rbGSinCeros.isSelected()) {
                    opcion = 2;
                }

                // Agrega la condición para la cantidad según la opción
                if (opcion == 1) {
                    if (sentencia.contains("WHERE")) {
                        sentencia += " AND Cantidad = 0";
                    } else {
                        sentencia += " WHERE Cantidad = 0";
                    }
                } else if (opcion == 2) {
                    if (sentencia.contains("WHERE")) {
                        sentencia += " AND Cantidad <> 0";
                    } else {
                        sentencia += " WHERE Cantidad <> 0";
                    }
                }

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
                                fnPDF.generarInventarioPDF(sentencia, filePath);
                                FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
                                frm_menu_secretario.setVisible(true);
                                dispose();
                            } else {
                                // No se ejecuta la lógica, el usuario no desea sobrescribir el archivo.
                            }
                        } else {
                            // Lógica para crear el PDF si no existe un archivo previo
                            fnPDF.generarInventarioPDF(sentencia, filePath);
                            FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
                            frm_menu_secretario.setVisible(true);
                            dispose();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                mostrarError("Sin filtros", "Para obtener un informe sin filtros, desactiva el botón de filtros");
            }
        } else {
            mostrarError("Sin cantidad", "Selecciona una opción para el filtro de cantidad");
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
        frm_menu_secretario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTBtnFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBtnFiltrosActionPerformed

        if (jTBtnFiltros.isSelected()) {
            jCBoxMedicamentos.setEnabled(true);
            jCBoxMaterial.setEnabled(true);
            jCBoxInstrumento.setEnabled(true);
            jCBoxOtro.setEnabled(true);
        } else {
            jCBoxMedicamentos.setEnabled(false);
            jCBoxMaterial.setEnabled(false);
            jCBoxInstrumento.setEnabled(false);
            jCBoxOtro.setEnabled(false);
        }

    }//GEN-LAST:event_jTBtnFiltrosActionPerformed

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private boolean camposVacios() {
        return !rbGNoImportaCeros.isSelected() && !rbGSoloCeros.isSelected() && !rbGSinCeros.isSelected();
    }

    private void obtenerSeleccion() {
        a = jCBoxMedicamentos.isSelected();
        b = jCBoxMaterial.isSelected();
        c = jCBoxInstrumento.isSelected();
        d = jCBoxOtro.isSelected();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JCheckBox jCBoxInstrumento;
    private javax.swing.JCheckBox jCBoxMaterial;
    private javax.swing.JCheckBox jCBoxMedicamentos;
    private javax.swing.JCheckBox jCBoxOtro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jTBtnFiltros;
    private javax.swing.ButtonGroup opcionCantidad;
    private javax.swing.JRadioButton rbGNoImportaCeros;
    private javax.swing.JRadioButton rbGSinCeros;
    private javax.swing.JRadioButton rbGSoloCeros;
    // End of variables declaration//GEN-END:variables
}
