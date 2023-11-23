package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.VariablesGlobales;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmConsultarCita extends javax.swing.JFrame {

    FuncionesFecha fe = new FuncionesFecha();
    Funciones fn = new Funciones(); // Conjunto de Funciones SQL
    DefaultTableModel model;
    String[] fechaHoy;

    public FrmConsultarCita() {
        initComponents();

        this.setLocationRelativeTo(null);

        fechaHoy = fe.separarFechaYHora(fe.obtenerFechaActual().toString());

        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPCitasDelUsuario = new javax.swing.JPanel();
        lblIdUsuario = new javax.swing.JLabel();
        jScrollPaneTablaCitas = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jPCitasDelUsuario.setBackground(new java.awt.Color(36, 130, 119));
        jPCitasDelUsuario.setMaximumSize(new java.awt.Dimension(610, 360));
        jPCitasDelUsuario.setMinimumSize(new java.awt.Dimension(610, 360));

        lblIdUsuario.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblIdUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblIdUsuario.setText("Proximas Citas:");
        lblIdUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCitas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPaneTablaCitas.setViewportView(tablaCitas);

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

        javax.swing.GroupLayout jPCitasDelUsuarioLayout = new javax.swing.GroupLayout(jPCitasDelUsuario);
        jPCitasDelUsuario.setLayout(jPCitasDelUsuarioLayout);
        jPCitasDelUsuarioLayout.setHorizontalGroup(
            jPCitasDelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCitasDelUsuarioLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPaneTablaCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPCitasDelUsuarioLayout.createSequentialGroup()
                .addGroup(jPCitasDelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCitasDelUsuarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCitasDelUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCitasDelUsuarioLayout.setVerticalGroup(
            jPCitasDelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCitasDelUsuarioLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneTablaCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCitasDelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCitasDelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuAlumno frm_menu_alumno = new FrmMenuAlumno();
        frm_menu_alumno.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void actualizarTabla() {
        model = fn.mostrarTablas("SELECT\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE alumno.Numero_Control = " + VariablesGlobales.numeroDeControl + "\n"
                + "AND cita.Fecha = '" + fechaHoy[0] + "'\n"
                + "ORDER BY cita.Fecha ASC");
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");

        TableColumn columna;
        columna = tablaCitas.getColumnModel().getColumn(0); // Nombre Alumno
        columna.setPreferredWidth(90);
        columna = tablaCitas.getColumnModel().getColumn(1); // Nombre Medico
        columna.setPreferredWidth(180);
        columna = tablaCitas.getColumnModel().getColumn(2); // Nombre Servicio
        columna.setPreferredWidth(180);
        columna = tablaCitas.getColumnModel().getColumn(3); // Fecha
        columna.setPreferredWidth(80);
        columna = tablaCitas.getColumnModel().getColumn(4); // Hora
        columna.setPreferredWidth(65);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tablaCitas.getColumnCount(); i++) {
            tablaCitas.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPCitasDelUsuario;
    private javax.swing.JScrollPane jScrollPaneTablaCitas;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JTable tablaCitas;
    // End of variables declaration//GEN-END:variables
}
