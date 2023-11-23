package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesInterface;
import Complementos.VariablesGlobales;

public class FrmMenuAlumno extends javax.swing.JFrame {

    FuncionesInterface di = new FuncionesInterface();
    Funciones fn = new Funciones();

    public FrmMenuAlumno() {
        initComponents();

        this.setLocationRelativeTo(null);

        btnConsultarServicios.setIcon(di.pintarImagenBtn(btnConsultarServicios, "src/Imagenes/IMG_Menu_Alumno_Consulta_de_Servicios.png"));
        btnConsultarCitas.setIcon(di.pintarImagenBtn(btnConsultarCitas, "src/Imagenes/IMG_Menu_Alumno_Consulta_de_Citas.png"));
       
        lblBienvenida.setText("Bienvenid@ " + obtenerNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsultarServicios = new javax.swing.JButton();
        btnConsultarCitas = new javax.swing.JButton();
        lblBienvenida = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();

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

        lblBienvenida.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnConsultarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
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

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        FrmUsuario frm_usuario = new FrmUsuario();
        frm_usuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private String obtenerNombre() {
        return fn.obtenerResultado("SELECT Nombre_Alumno FROM Alumno WHERE Numero_Control = " + VariablesGlobales.numeroDeControl);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarCitas;
    private javax.swing.JButton btnConsultarServicios;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables
}
