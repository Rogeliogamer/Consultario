package JFrames;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

public class FrmRegistrarServicio extends javax.swing.JFrame {

    public FrmRegistrarServicio() {
        initComponents();

        ((AbstractDocument) txtFHoraInicio.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Asegurar que solo se ingresen números y ":" y que el formato sea "00:00"
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                StringBuilder sb = new StringBuilder(currentText);
                sb.replace(offset, offset + length, text);

                if (isValidHoraMinutos(sb.toString())) {
                    super.replace(fb, 0, fb.getDocument().getLength(), text, attrs);
                }
            }

            @Override
            public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
                // Asegurar que no se puedan eliminar ":" inadvertidamente
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                StringBuilder sb = new StringBuilder(currentText);
                sb.delete(offset, offset + length);

                if (isValidHoraMinutos(sb.toString())) {
                    super.remove(fb, offset, length);
                }
            }
        });
    }

    private boolean isValidHoraMinutos(String input) {
        // Usar una expresión regular para validar HH:mm (24 horas)
        return Pattern.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]", input);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescServicio = new javax.swing.JTextArea();
        txtFNombreServicio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtFHoraInicio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));

        txtADescServicio.setColumns(20);
        txtADescServicio.setRows(5);
        jScrollPane1.setViewportView(txtADescServicio);

        txtFNombreServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombreServicio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNombreServicio.setToolTipText("");
        txtFNombreServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombreServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombreServicio.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNombreServicio.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNombreServicio.setPreferredSize(new java.awt.Dimension(160, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(69, 23));
        btnGuardar.setMinimumSize(new java.awt.Dimension(69, 23));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtFHoraInicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFHoraInicio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFHoraInicio.setToolTipText("");
        txtFHoraInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFHoraInicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFHoraInicio.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFHoraInicio.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFHoraInicio.setPreferredSize(new java.awt.Dimension(160, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreServicio = txtFNombreServicio.getText();
        String descServicio = txtADescServicio.getText();
        String horaInicio = "";

        System.out.println(horaInicio);

    }//GEN-LAST:event_btnGuardarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtADescServicio;
    private javax.swing.JTextField txtFHoraInicio;
    private javax.swing.JTextField txtFNombreServicio;
    // End of variables declaration//GEN-END:variables
}
