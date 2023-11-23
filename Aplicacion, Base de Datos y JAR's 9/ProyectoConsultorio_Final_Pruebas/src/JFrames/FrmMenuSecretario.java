package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesInterface;
import Complementos.VariablesGlobales;

public class FrmMenuSecretario extends javax.swing.JFrame {

    FuncionesInterface di = new FuncionesInterface();
    Funciones fn = new Funciones();

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

        lblBienvenida.setText("Bienvenid@ " + obtenerNombre());

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
        lblBienvenida = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();

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
        btnReporteDeEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteDeEstudiantesActionPerformed(evt);
            }
        });

        lblBienvenida.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnPerfil.setText("Perfil");
        btnPerfil.setFocusPainted(false);
        btnPerfil.setMaximumSize(new java.awt.Dimension(100, 30));
        btnPerfil.setMinimumSize(new java.awt.Dimension(100, 30));
        btnPerfil.setPreferredSize(new java.awt.Dimension(100, 30));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistroDeServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegistroDeCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistroDeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInformeDeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(btnRegistroDeEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReporteDeEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistroDeEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReporteDeEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistroDeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInformeDeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistroDeCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistroDeServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
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
        FrmInformeInventario frm_informeInventario = new FrmInformeInventario();
        frm_informeInventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInformeDeInventarioActionPerformed

    private void btnRegistroDeServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeServiciosActionPerformed
        FrmRegistrarServicio frm_registrarServicio = new FrmRegistrarServicio();
        frm_registrarServicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroDeServiciosActionPerformed

    private void btnRegistroDeCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeCitasActionPerformed
        FrmRegistrarCita1 frm_registrarCita = new FrmRegistrarCita1();
        frm_registrarCita.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroDeCitasActionPerformed

    private void btnRegistroDeEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeEstudiantesActionPerformed
        FrmRegistrarEstudiantesAtendidos frm_registrarEstudiantesAtendidos = new FrmRegistrarEstudiantesAtendidos();
        frm_registrarEstudiantesAtendidos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroDeEstudiantesActionPerformed

    private void btnReporteDeEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteDeEstudiantesActionPerformed
        FrmReporteEstudiantesAtendidos frm_reporteEstudiantesAtendidos = new FrmReporteEstudiantesAtendidos();
        frm_reporteEstudiantesAtendidos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReporteDeEstudiantesActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        FrmUsuario frm_usuario = new FrmUsuario();
        frm_usuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private String obtenerNombre() {
        return fn.obtenerResultado("SELECT Nombre_Secretario FROM Secretario WHERE Numero_Control = " + VariablesGlobales.numeroDeControl);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformeDeInventario;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnRegistroDeCitas;
    private javax.swing.JButton btnRegistroDeEstudiantes;
    private javax.swing.JButton btnRegistroDeInventario;
    private javax.swing.JButton btnRegistroDeServicios;
    private javax.swing.JButton btnReporteDeEstudiantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables
}
