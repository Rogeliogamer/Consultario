package JFrames;

import Complementos.Funciones;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

public class FrmConsultarServicio extends javax.swing.JFrame {

    Funciones fn = new Funciones();

    public FrmConsultarServicio() {
        initComponents();

        this.setLocationRelativeTo(null);

        actualizarCombobox();

        txtADescServicio.setLineWrap(true);
        txtADescServicio.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPServDisponibles = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        CboxServicio = new javax.swing.JComboBox<>();
        lblNombreServicio = new javax.swing.JLabel();
        txtFNombreServicio = new javax.swing.JTextField();
        lblDescServicio = new javax.swing.JLabel();
        jScrollPaneAreaDesc = new javax.swing.JScrollPane();
        txtADescServicio = new javax.swing.JTextArea();
        lblHorario = new javax.swing.JLabel();
        txtFHorarioServicio = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));

        jPServDisponibles.setBackground(new java.awt.Color(36, 130, 119));
        jPServDisponibles.setMaximumSize(new java.awt.Dimension(610, 360));
        jPServDisponibles.setMinimumSize(new java.awt.Dimension(610, 360));

        lblTitulo.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Servicios Disponibles:");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        CboxServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxServicio.setBorder(null);
        CboxServicio.setMaximumSize(new java.awt.Dimension(160, 30));
        CboxServicio.setMinimumSize(new java.awt.Dimension(160, 30));
        CboxServicio.setPreferredSize(new java.awt.Dimension(160, 30));

        lblNombreServicio.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblNombreServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreServicio.setText("Nombre del Servicio:");
        lblNombreServicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtFNombreServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNombreServicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFNombreServicio.setToolTipText("");
        txtFNombreServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNombreServicio.setFocusable(false);
        txtFNombreServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNombreServicio.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFNombreServicio.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFNombreServicio.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFNombreServicio.setRequestFocusEnabled(false);

        lblDescServicio.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblDescServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblDescServicio.setText("Descripción:");
        lblDescServicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtADescServicio.setColumns(20);
        txtADescServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtADescServicio.setRows(5);
        txtADescServicio.setFocusable(false);
        txtADescServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtADescServicio.setRequestFocusEnabled(false);
        jScrollPaneAreaDesc.setViewportView(txtADescServicio);

        lblHorario.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(255, 255, 255));
        lblHorario.setText("Horario:");
        lblHorario.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtFHorarioServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFHorarioServicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFHorarioServicio.setToolTipText("");
        txtFHorarioServicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFHorarioServicio.setFocusable(false);
        txtFHorarioServicio.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFHorarioServicio.setMaximumSize(new java.awt.Dimension(130, 30));
        txtFHorarioServicio.setMinimumSize(new java.awt.Dimension(130, 30));
        txtFHorarioServicio.setPreferredSize(new java.awt.Dimension(130, 30));
        txtFHorarioServicio.setRequestFocusEnabled(false);

        btnMostrar.setText("Mostrar");
        btnMostrar.setFocusPainted(false);
        btnMostrar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnMostrar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnMostrar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPServDisponiblesLayout = new javax.swing.GroupLayout(jPServDisponibles);
        jPServDisponibles.setLayout(jPServDisponiblesLayout);
        jPServDisponiblesLayout.setHorizontalGroup(
            jPServDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPServDisponiblesLayout.createSequentialGroup()
                .addGroup(jPServDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPServDisponiblesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPServDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescServicio)
                            .addGroup(jPServDisponiblesLayout.createSequentialGroup()
                                .addComponent(CboxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblHorario)
                            .addComponent(lblNombreServicio)
                            .addComponent(lblTitulo)
                            .addGroup(jPServDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFHorarioServicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPaneAreaDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addComponent(txtFNombreServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPServDisponiblesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPServDisponiblesLayout.setVerticalGroup(
            jPServDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPServDisponiblesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(19, 19, 19)
                .addGroup(jPServDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNombreServicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFNombreServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFHorarioServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescServicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneAreaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPServDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPServDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (camposVacios() == false) {
            String idServSQL = "SELECT Id_Servicio FROM Servicio WHERE Nombre_Servicio = '" + CboxServicio.getSelectedItem().toString() + "'";
            String idServicio = fn.obtenerResultado(idServSQL);

            String descServSQL = "SELECT Descripcion FROM Servicio WHERE Id_Servicio = " + idServicio;
            String horarioServSQL = "SELECT CONCAT("
                    + "DATE_FORMAT(Hora_Inicio, '%H:%i'), ' - ', DATE_FORMAT(Hora_Termino, '%H:%i')"
                    + ") AS resultado FROM Servicio WHERE Id_Servicio = " + idServicio;

            String nombreServ = CboxServicio.getSelectedItem().toString();
            String descripcionServ = fn.obtenerResultado(descServSQL);
            String horarioServ = fn.obtenerResultado(horarioServSQL);

            txtFNombreServicio.setText(nombreServ);
            txtADescServicio.setText(descripcionServ);
            txtFHorarioServicio.setText(horarioServ);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un servicio", "Servicio necesario", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }


    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuAlumno frm_menu_alumno = new FrmMenuAlumno();
        frm_menu_alumno.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private Boolean camposVacios() {
        String servicio = CboxServicio.getSelectedItem().toString();
        return "Seleccione una opcion".equals(servicio) || servicio.isEmpty();
    }

    private void actualizarCombobox() {
        CboxServicio.removeAllItems();
        CboxServicio = fn.llenarCombobox("SELECT Nombre_Servicio FROM Servicio ORDER BY Nombre_Servicio ASC",
                "Nombre_Servicio", CboxServicio); // opciones de combobox de especialidad
    }

    private void limpiar() {
        CboxServicio.setSelectedItem(0);
        txtFNombreServicio.setText("");
        txtADescServicio.setText("");
        txtFHorarioServicio.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxServicio;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPServDisponibles;
    private javax.swing.JScrollPane jScrollPaneAreaDesc;
    private javax.swing.JLabel lblDescServicio;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNombreServicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtADescServicio;
    private javax.swing.JTextField txtFHorarioServicio;
    private javax.swing.JTextField txtFNombreServicio;
    // End of variables declaration//GEN-END:variables
}
