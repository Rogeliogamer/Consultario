package JFrames;

import Complementos.FuncionesInterface;

public class FrmMenuAlumno extends javax.swing.JFrame {
    
    FuncionesInterface di = new FuncionesInterface();

    public FrmMenuAlumno() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        btnConsultarServicios.setIcon(di.pintarImagenBtn(btnConsultarServicios, "src/Imagenes/IMG_Menu_Alumno_Consulta_de_Servicios.png"));
        btnConsultarCitas.setIcon(di.pintarImagenBtn(btnConsultarCitas, "src/Imagenes/IMG_Menu_Alumno_Consulta_de_Citas.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsultarServicios = new javax.swing.JButton();
        btnConsultarCitas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));

        btnConsultarServicios.setMaximumSize(new java.awt.Dimension(200, 205));
        btnConsultarServicios.setMinimumSize(new java.awt.Dimension(200, 205));
        btnConsultarServicios.setPreferredSize(new java.awt.Dimension(200, 205));
        btnConsultarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarServiciosActionPerformed(evt);
            }
        });

        btnConsultarCitas.setMaximumSize(new java.awt.Dimension(200, 205));
        btnConsultarCitas.setMinimumSize(new java.awt.Dimension(200, 205));
        btnConsultarCitas.setPreferredSize(new java.awt.Dimension(200, 205));
        btnConsultarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnConsultarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnConsultarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
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

    private void btnConsultarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarServiciosActionPerformed
        FrmConsultarServicio frm_consultarServicio = new FrmConsultarServicio();
        frm_consultarServicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarServiciosActionPerformed

    private void btnConsultarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCitasActionPerformed
        FrmConsultarCita frm_consultarCita = new FrmConsultarCita();
        frm_consultarCita.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarCitasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarCitas;
    private javax.swing.JButton btnConsultarServicios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
