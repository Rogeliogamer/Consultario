package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmRegistrarEstudiantesAtendidos extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.
    DefaultTableModel model;

    String citaSeleccionada, alumnoSeleccionado, medicoSeleccionado, servicioSeleccionado, fechaCita, horaCita;

    String nombreA, nControlM;
    String fecha;
    char asistencia;
    String[] fechaHoy;

    String idFichaClinica;

    public FrmRegistrarEstudiantesAtendidos() {
        initComponents();

        this.setLocationRelativeTo(null);

        fechaHoy = fe.separarFechaYHora(fe.obtenerFechaActual().toString());

        lblCitasDelDia.setText("Citas registradas para el dia de hoy: " + fechaHoy[0]);

        actualizarTabla();
        formatoTabla();

        btnConfirmarA.setEnabled(false);
        btnConfirmarI.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFDatosCita = new javax.swing.JTextField();
        jScrollPaneTablaCita = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        btnConfirmarA = new javax.swing.JButton();
        btnConfirmarI = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblCitaSeleccionada = new javax.swing.JLabel();
        lblCitasDelDia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 360));

        jPanel1.setBackground(new java.awt.Color(36, 130, 119));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 360));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        txtFDatosCita.setEditable(false);
        txtFDatosCita.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFDatosCita.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFDatosCita.setToolTipText("");
        txtFDatosCita.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFDatosCita.setFocusable(false);
        txtFDatosCita.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFDatosCita.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFDatosCita.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFDatosCita.setPreferredSize(new java.awt.Dimension(160, 30));

        jScrollPaneTablaCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPaneTablaCitaMouseClicked(evt);
            }
        });

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
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCitasMouseClicked(evt);
            }
        });
        jScrollPaneTablaCita.setViewportView(tablaCitas);

        btnConfirmarA.setText("Confirmar Asistencia");
        btnConfirmarA.setFocusPainted(false);
        btnConfirmarA.setMaximumSize(new java.awt.Dimension(100, 30));
        btnConfirmarA.setMinimumSize(new java.awt.Dimension(100, 30));
        btnConfirmarA.setPreferredSize(new java.awt.Dimension(100, 30));
        btnConfirmarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarAActionPerformed(evt);
            }
        });

        btnConfirmarI.setText("Confirmar Inasistencia");
        btnConfirmarI.setFocusPainted(false);
        btnConfirmarI.setMaximumSize(new java.awt.Dimension(100, 30));
        btnConfirmarI.setMinimumSize(new java.awt.Dimension(100, 30));
        btnConfirmarI.setPreferredSize(new java.awt.Dimension(100, 30));
        btnConfirmarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarIActionPerformed(evt);
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

        lblCitaSeleccionada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCitaSeleccionada.setForeground(new java.awt.Color(255, 255, 255));
        lblCitaSeleccionada.setText("Información de la cita seleccionada:");

        lblCitasDelDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCitasDelDia.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblCitaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFDatosCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblCitasDelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPaneTablaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnConfirmarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnConfirmarI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 25, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCitaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFDatosCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCitasDelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnConfirmarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmarI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPaneTablaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMouseClicked
        int row = tablaCitas.getSelectedRow();
        if (row != -1) {
            citaSeleccionada = (String.valueOf(model.getValueAt(row, 0)));
            alumnoSeleccionado = (String.valueOf(model.getValueAt(row, 1)));
            medicoSeleccionado = (String.valueOf(model.getValueAt(row, 2)));
            servicioSeleccionado = (String.valueOf(model.getValueAt(row, 3)));
            fechaCita = String.valueOf(model.getValueAt(row, 4));
            horaCita = String.valueOf(model.getValueAt(row, 5));

            String sentencia = alumnoSeleccionado + " con " + medicoSeleccionado + " para " + servicioSeleccionado + " el dia " + fechaCita + " a las " + horaCita;
            txtFDatosCita.setText(sentencia);
            btnConfirmarA.setEnabled(true);
            btnConfirmarI.setEnabled(true);
        } else {
            txtFDatosCita.setText("");
            tablaCitas.clearSelection();
            btnConfirmarA.setEnabled(false);
            btnConfirmarI.setEnabled(false);
            limpiarVariables();
        }
    }//GEN-LAST:event_tablaCitasMouseClicked

    private void jScrollPaneTablaCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneTablaCitaMouseClicked
        txtFDatosCita.setText("");
        tablaCitas.clearSelection();
        btnConfirmarA.setEnabled(false);
        btnConfirmarI.setEnabled(false);
        limpiarVariables();
    }//GEN-LAST:event_jScrollPaneTablaCitaMouseClicked

    private void btnConfirmarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarAActionPerformed
        confirmarAsistencia();
        if (comprobarFichaClinica()) {
            actualizarCitaReciente();
        }
        eliminarCita();
        txtFDatosCita.setText("");
        btnConfirmarA.setEnabled(false);
        btnConfirmarI.setEnabled(false);
        limpiarVariables();
    }//GEN-LAST:event_btnConfirmarAActionPerformed

    private void btnConfirmarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarIActionPerformed
        eliminarCita();
        txtFDatosCita.setText("");
        btnConfirmarA.setEnabled(false);
        btnConfirmarI.setEnabled(false);
        limpiarVariables();
    }//GEN-LAST:event_btnConfirmarIActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
        frm_menu_secretario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        txtFDatosCita.setText("");
        tablaCitas.clearSelection();
        btnConfirmarA.setEnabled(false);
        btnConfirmarI.setEnabled(false);
        limpiarVariables();
    }//GEN-LAST:event_jPanel1MouseClicked

    private boolean comprobarFichaClinica() {
        String fichaExisteSQL = "SELECT Id_Ficha_Clinica FROM Ficha_Clinica WHERE Alumno_Numero_Control = " + alumnoSeleccionado;
        if (fn.verificarExistencia(fichaExisteSQL)) {
            idFichaClinica = fn.obtenerResultado(fichaExisteSQL);
            return true;
        } else {
            return false;
        }
    }

    private void actualizarCitaReciente() {
        String modificarCitaRecienteSQL = "UPDATE Ficha_Clinica SET Cita_Reciente = '" + fechaCita + "' "
                + "WHERE Id_Ficha_Clinica = " + idFichaClinica;
        fn.ejecutarSentencia(modificarCitaRecienteSQL, false);
    }

    private void obtenerDatos() {
        String nombreCompletoASQL = "SELECT CONCAT(Nombre_Alumno, ' ', Apellido_Alumno) AS NombreCompleto FROM Alumno WHERE Numero_Control = " + alumnoSeleccionado;
        String nControlMSQL = "SELECT Medico_Numero_Control FROM Cita WHERE Id_Cita = " + citaSeleccionada;

        nombreA = fn.obtenerResultado(nombreCompletoASQL);
        nControlM = fn.obtenerResultado(nControlMSQL);
    }

    // Método para confirmar la asistencias y agregar los datos de la cita a Historial Citas.
    private void confirmarAsistencia() {
        obtenerDatos();
        asistencia = 'S';
        String citaHistorialSQL = "INSERT INTO Historial_Citas (Id_Cita, Alumno_Numero_Control, Nombre_Alumno, Medico_Numero_Control, "
                + "Nombre_Medico, Nombre_Servicio, Fecha_Cita, Asistencia) "
                + "VALUES (" + citaSeleccionada + ", " + alumnoSeleccionado + ", '" + nombreA + "', " + nControlM + ", "
                + "'" + medicoSeleccionado + "', '" + servicioSeleccionado + "', '" + fechaCita + "', '" + asistencia + "')";
        fn.ejecutarSentencia(citaHistorialSQL, true);
    }

    // Método para eliminar la cita de la tabla de Citas.
    private void eliminarCita() {
        fn.ejecutarSentencia("DELETE FROM Cita WHERE Id_Cita = " + citaSeleccionada, false);
        actualizarTabla();
        formatoTabla();
    }

    // Método para mostrar mensajes de error.
    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    // Método para reiniciar el valor de las variables.
    private void limpiarVariables() {
        citaSeleccionada = "";
        alumnoSeleccionado = "";
        servicioSeleccionado = "";
        fechaCita = "";
        horaCita = "";
    }

    // Método para actualizar la tabla con todos los datos.
    private void actualizarTabla() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "WHERE cita.Fecha = '" + fechaHoy[0] + "' \n"
                + "ORDER BY cita.Hora ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    // Método para ajustar el tamaño de las columnas de la tabla.
    private void formatoTabla() {
        TableColumn columna;
        columna = tablaCitas.getColumnModel().getColumn(0); // Columna Id_Cita
        columna.setPreferredWidth(40);
        columna = tablaCitas.getColumnModel().getColumn(1); // Columna Alumno
        columna.setPreferredWidth(90);
        columna = tablaCitas.getColumnModel().getColumn(2); // Nombre Medico
        columna.setPreferredWidth(180);
        columna = tablaCitas.getColumnModel().getColumn(3); // Nombre Servicio
        columna.setPreferredWidth(180);
        columna = tablaCitas.getColumnModel().getColumn(4); // Fecha
        columna.setPreferredWidth(80);
        columna = tablaCitas.getColumnModel().getColumn(5); // Hora
        columna.setPreferredWidth(65);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tablaCitas.getColumnCount(); i++) {
            tablaCitas.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarEstudiantesAtendidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarA;
    private javax.swing.JButton btnConfirmarI;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTablaCita;
    private javax.swing.JLabel lblCitaSeleccionada;
    private javax.swing.JLabel lblCitasDelDia;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtFDatosCita;
    // End of variables declaration//GEN-END:variables
}
