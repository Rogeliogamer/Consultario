package JFrames;

import Complementos.FuncionesInterface;
import Complementos.VariablesGlobales;

public class FrmMenuMedico extends javax.swing.JFrame {

    FuncionesInterface di = new FuncionesInterface();

    public FrmMenuMedico() {
        initComponents();

        this.setLocationRelativeTo(null);

        btnRegistrarFichaClinica.setIcon(di.pintarImagenBtn(btnRegistrarFichaClinica, "src/Imagenes/IMG_Menu_Medico_Registrar_Ficha_Clinica.png"));
        btnActualizarFichaClinica.setIcon(di.pintarImagenBtn(btnActualizarFichaClinica, "src/Imagenes/IMG_Menu_Medico_Actualizar_Ficha_Clinica.png"));
        btnElaborarRecetaMedica.setIcon(di.pintarImagenBtn(btnElaborarRecetaMedica, "src/Imagenes/IMG_Menu_Medico_Elaborar_Receta_Medica.png"));
        btnElaborarPaseUrgencias.setIcon(di.pintarImagenBtn(btnElaborarPaseUrgencias, "src/Imagenes/IMG_Menu_Medico_Elaborar_Pase_Urgencias.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarFichaClinica = new javax.swing.JButton();
        btnActualizarFichaClinica = new javax.swing.JButton();
        btnElaborarRecetaMedica = new javax.swing.JButton();
        btnElaborarPaseUrgencias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));

        btnRegistrarFichaClinica.setMaximumSize(new java.awt.Dimension(125, 130));
        btnRegistrarFichaClinica.setMinimumSize(new java.awt.Dimension(125, 130));
        btnRegistrarFichaClinica.setPreferredSize(new java.awt.Dimension(125, 130));
        btnRegistrarFichaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFichaClinicaActionPerformed(evt);
            }
        });

        btnActualizarFichaClinica.setMaximumSize(new java.awt.Dimension(125, 130));
        btnActualizarFichaClinica.setMinimumSize(new java.awt.Dimension(125, 130));
        btnActualizarFichaClinica.setPreferredSize(new java.awt.Dimension(125, 130));
        btnActualizarFichaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarFichaClinicaActionPerformed(evt);
            }
        });

        btnElaborarRecetaMedica.setMaximumSize(new java.awt.Dimension(125, 130));
        btnElaborarRecetaMedica.setMinimumSize(new java.awt.Dimension(125, 130));
        btnElaborarRecetaMedica.setPreferredSize(new java.awt.Dimension(125, 130));
        btnElaborarRecetaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaborarRecetaMedicaActionPerformed(evt);
            }
        });

        btnElaborarPaseUrgencias.setMaximumSize(new java.awt.Dimension(125, 130));
        btnElaborarPaseUrgencias.setMinimumSize(new java.awt.Dimension(125, 130));
        btnElaborarPaseUrgencias.setPreferredSize(new java.awt.Dimension(125, 130));
        btnElaborarPaseUrgencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaborarPaseUrgenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnElaborarPaseUrgencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnElaborarRecetaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarFichaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarFichaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarFichaClinica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarFichaClinica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElaborarPaseUrgencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElaborarRecetaMedica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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

    private void btnRegistrarFichaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFichaClinicaActionPerformed

    }//GEN-LAST:event_btnRegistrarFichaClinicaActionPerformed

    private void btnActualizarFichaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarFichaClinicaActionPerformed

    }//GEN-LAST:event_btnActualizarFichaClinicaActionPerformed

    private void btnElaborarRecetaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElaborarRecetaMedicaActionPerformed
        FrmElaborarRecetaMedica frm_elaborarRecetaMedica = new FrmElaborarRecetaMedica();
        frm_elaborarRecetaMedica.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnElaborarRecetaMedicaActionPerformed

    private void btnElaborarPaseUrgenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElaborarPaseUrgenciasActionPerformed

    }//GEN-LAST:event_btnElaborarPaseUrgenciasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarFichaClinica;
    private javax.swing.JButton btnElaborarPaseUrgencias;
    private javax.swing.JButton btnElaborarRecetaMedica;
    private javax.swing.JButton btnRegistrarFichaClinica;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
