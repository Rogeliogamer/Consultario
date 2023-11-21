package JFrames;

import Complementos.FuncionesInterface;
import Complementos.VariablesGlobales;

public class FrmMenuSecretario extends javax.swing.JFrame {

    FuncionesInterface di = new FuncionesInterface();

    public FrmMenuSecretario() {
        initComponents();

        this.setLocationRelativeTo(null);

        btnRegistrarUsuario.setIcon(di.pintarImagenBtn(btnRegistrarUsuario, "src/Imagenes/IMG_Menu_Usuarios.png"));
        btnRegistroDeInventario.setIcon(di.pintarImagenBtn(btnRegistroDeInventario, "src/Imagenes/IMG_Menu_Secretario_Registro_de_Inventario.png"));
        btnInformeDeInventario.setIcon(di.pintarImagenBtn(btnInformeDeInventario, "src/Imagenes/IMG_Menu_Secretario_Informe_de_Inventario.png"));
        btnRegistroDeServicios.setIcon(di.pintarImagenBtn(btnRegistroDeServicios, "src/Imagenes/IMG_Menu_Secretario_Registro_de_Servicios.png"));
        btnRegistroDeCitas.setIcon(di.pintarImagenBtn(btnRegistroDeCitas, "src/Imagenes/IMG_Menu_Secretario_Registro_de_Citas.png"));
        btnRegistroDeEstudiantes.setIcon(di.pintarImagenBtn(btnRegistroDeEstudiantes, "src/Imagenes/IMG_Menu_Secretario_Registro_de_Estudiantes_Atendidos.png"));
        btnReporteDeEstudiantes.setIcon(di.pintarImagenBtn(btnReporteDeEstudiantes, "src/Imagenes/IMG_Menu_Secretario_Reporte_de_Estudiantes_Atendidos.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnRegistroDeInventario = new javax.swing.JButton();
        btnInformeDeInventario = new javax.swing.JButton();
        btnRegistroDeServicios = new javax.swing.JButton();
        btnRegistroDeCitas = new javax.swing.JButton();
        btnRegistroDeEstudiantes = new javax.swing.JButton();
        btnReporteDeEstudiantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));

        btnRegistrarUsuario.setMaximumSize(new java.awt.Dimension(130, 135));
        btnRegistrarUsuario.setMinimumSize(new java.awt.Dimension(130, 135));
        btnRegistrarUsuario.setPreferredSize(new java.awt.Dimension(130, 135));
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        btnRegistroDeInventario.setMaximumSize(new java.awt.Dimension(130, 135));
        btnRegistroDeInventario.setMinimumSize(new java.awt.Dimension(130, 135));
        btnRegistroDeInventario.setPreferredSize(new java.awt.Dimension(130, 135));
        btnRegistroDeInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeInventarioActionPerformed(evt);
            }
        });

        btnInformeDeInventario.setMaximumSize(new java.awt.Dimension(130, 135));
        btnInformeDeInventario.setMinimumSize(new java.awt.Dimension(130, 135));
        btnInformeDeInventario.setPreferredSize(new java.awt.Dimension(130, 135));
        btnInformeDeInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeDeInventarioActionPerformed(evt);
            }
        });

        btnRegistroDeServicios.setMaximumSize(new java.awt.Dimension(130, 135));
        btnRegistroDeServicios.setMinimumSize(new java.awt.Dimension(130, 135));
        btnRegistroDeServicios.setPreferredSize(new java.awt.Dimension(130, 135));
        btnRegistroDeServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeServiciosActionPerformed(evt);
            }
        });

        btnRegistroDeCitas.setMaximumSize(new java.awt.Dimension(130, 135));
        btnRegistroDeCitas.setMinimumSize(new java.awt.Dimension(130, 135));
        btnRegistroDeCitas.setPreferredSize(new java.awt.Dimension(130, 135));
        btnRegistroDeCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeCitasActionPerformed(evt);
            }
        });

        btnRegistroDeEstudiantes.setMaximumSize(new java.awt.Dimension(130, 135));
        btnRegistroDeEstudiantes.setMinimumSize(new java.awt.Dimension(130, 135));
        btnRegistroDeEstudiantes.setPreferredSize(new java.awt.Dimension(130, 135));
        btnRegistroDeEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeEstudiantesActionPerformed(evt);
            }
        });

        btnReporteDeEstudiantes.setMaximumSize(new java.awt.Dimension(130, 135));
        btnReporteDeEstudiantes.setMinimumSize(new java.awt.Dimension(130, 135));
        btnReporteDeEstudiantes.setPreferredSize(new java.awt.Dimension(130, 135));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistroDeServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistroDeCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistroDeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInformeDeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReporteDeEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistroDeEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInformeDeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroDeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistroDeEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroDeCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroDeServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteDeEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
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

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        FrmRegistrarUsuario frm_registrarUsuario = new FrmRegistrarUsuario();
        frm_registrarUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnRegistroDeInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeInventarioActionPerformed
        FrmRegistrarInventario frm_registrarInventario = new FrmRegistrarInventario();
        frm_registrarInventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroDeInventarioActionPerformed

    private void btnInformeDeInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeDeInventarioActionPerformed
        FrmVerCitas frm_verCitas = new FrmVerCitas();
        frm_verCitas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInformeDeInventarioActionPerformed

    private void btnRegistroDeServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeServiciosActionPerformed
        FrmRegistrarServicio frm_registrarServicio = new FrmRegistrarServicio();
        frm_registrarServicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroDeServiciosActionPerformed

    private void btnRegistroDeCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeCitasActionPerformed
        FrmRegistrarCita frm_registrarCita = new FrmRegistrarCita();
        frm_registrarCita.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroDeCitasActionPerformed

    private void btnRegistroDeEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeEstudiantesActionPerformed

    }//GEN-LAST:event_btnRegistroDeEstudiantesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformeDeInventario;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnRegistroDeCitas;
    private javax.swing.JButton btnRegistroDeEstudiantes;
    private javax.swing.JButton btnRegistroDeInventario;
    private javax.swing.JButton btnRegistroDeServicios;
    private javax.swing.JButton btnReporteDeEstudiantes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
