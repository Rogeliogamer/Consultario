package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmRegistrarCita extends javax.swing.JFrame {

    Funciones fn = new Funciones();
    FuncionesInterface di = new FuncionesInterface();
    FuncionesValidar validar = new FuncionesValidar();
    DefaultTableModel model;

    public FrmRegistrarCita() {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl); // PlaceHolder para el campo "N. Control"

        btnIconoLupa.setIcon(di.pintarImagenBtn(btnIconoLupa, "C:/Users/daAkn/Documents/NetBeansProjects/ProyectoConsultorio/src/Imagenes/IMG_Icono_Lupa.png"));

        validar.validarNControlRegex(txtFNControl);
        
        ActualizarTabla();
        ActualizarCombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpControlCitas = new javax.swing.JPanel();
        lblNControl = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtFNControl = new javax.swing.JTextField();
        dtpFechaHora = new com.lavantech.gui.comp.DateTimePicker();
        btnModificar = new javax.swing.JButton();
        lblTitular = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblFechaHora = new javax.swing.JLabel();
        lblMedico = new javax.swing.JLabel();
        lblMedico1 = new javax.swing.JLabel();
        CboxMedico = new javax.swing.JComboBox<>();
        CboxConsultorio = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnVerCitas = new javax.swing.JButton();
        btnIconoLupa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        lblServicio = new javax.swing.JLabel();
        CboxServicio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jpControlCitas.setBackground(new java.awt.Color(36, 130, 119));
        jpControlCitas.setMaximumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.setMinimumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.setPreferredSize(new java.awt.Dimension(610, 360));

        lblNControl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNControl.setForeground(new java.awt.Color(255, 255, 255));
        lblNControl.setText("N. Control:");

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(69, 23));
        btnGuardar.setMinimumSize(new java.awt.Dimension(69, 23));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));

        btnModificar.setText("Modificar");
        btnModificar.setFocusPainted(false);
        btnModificar.setMaximumSize(new java.awt.Dimension(69, 23));
        btnModificar.setMinimumSize(new java.awt.Dimension(69, 23));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblTitular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setText("Registro de Citas");

        btnSalir.setText("Salir");
        btnSalir.setFocusPainted(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(69, 23));
        btnSalir.setMinimumSize(new java.awt.Dimension(69, 23));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblFechaHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaHora.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaHora.setText("Fecha:");

        lblMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMedico.setForeground(new java.awt.Color(255, 255, 255));
        lblMedico.setText("Médico:");

        lblMedico1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMedico1.setForeground(new java.awt.Color(255, 255, 255));
        lblMedico1.setText("Consultorio:");

        CboxMedico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        CboxConsultorio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusPainted(false);
        btnEliminar.setMaximumSize(new java.awt.Dimension(69, 23));
        btnEliminar.setMinimumSize(new java.awt.Dimension(69, 23));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVerCitas.setText("Citas");
        btnVerCitas.setFocusPainted(false);
        btnVerCitas.setMaximumSize(new java.awt.Dimension(69, 23));
        btnVerCitas.setMinimumSize(new java.awt.Dimension(69, 23));
        btnVerCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCitasActionPerformed(evt);
            }
        });

        btnIconoLupa.setBackground(new java.awt.Color(36, 130, 119));
        btnIconoLupa.setBorder(null);
        btnIconoLupa.setFocusPainted(false);
        btnIconoLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconoLupaActionPerformed(evt);
            }
        });

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCitas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCitas);

        lblServicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblServicio.setText("Servicio:");

        CboxServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        javax.swing.GroupLayout jpControlCitasLayout = new javax.swing.GroupLayout(jpControlCitas);
        jpControlCitas.setLayout(jpControlCitasLayout);
        jpControlCitasLayout.setHorizontalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpControlCitasLayout.createSequentialGroup()
                                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                                        .addComponent(lblMedico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                                        .addComponent(lblNControl)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(btnIconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTitular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaHora)
                            .addComponent(lblMedico1)
                            .addComponent(lblServicio))
                        .addGap(27, 27, 27)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CboxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtpFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CboxConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );
        jpControlCitasLayout.setVerticalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addComponent(lblTitular)
                        .addGap(18, 18, 18)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNControl)
                            .addComponent(txtFNControl)
                            .addComponent(btnIconoLupa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtpFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CboxConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CboxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpControlCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpControlCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nControl = txtFNControl.getText();
        String idMedico = "SELECT Id_Medico FROM Medicos WHERE Nombre_Medico ='" + CboxMedico.getSelectedItem().toString() + "'";
        String idConsultorio = "SELECT Id_Consultorio FROM Consultorios WHERE Nombre_Consultorio ='" + CboxConsultorio.getSelectedItem().toString() + "'";
        String fechaHora = dtpFechaHora.getDate().toString();
        String[] resultado = parseFechaHora(fechaHora);
        
        // if(txtFNControl.getText().isEmpty() || CboxMedico.getSelectedItem() == null || CboxConsultorio.getSelectedItem() == null || CboxMedico.getSelectedItem().toString().equals("Seleccione una opcion") || CboxConsultorio.getSelectedItem().toString().equals("Seleccione una opcion"))
        

        fn.ejecutarSentencia("INSERT INTO Citas (Numero_Control, Id_Medico, Id_Consultorio, Fecha, Hora) VALUES (" + nControl + ", (" + idMedico
                + "), (" + idConsultorio + "), '" + resultado[0] + "', '" + resultado[1] + "')");
        ActualizarTabla();
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String nControl = txtFNControl.getText();
        String idMedico = "SELECT Id_Medico FROM Medicos WHERE Nombre_Medico ='" + CboxMedico.getSelectedItem().toString() + "'";
        String idConsultorio = "SELECT Id_Consultorio FROM Consultorios WHERE Nombre_Consultorio ='" + CboxConsultorio.getSelectedItem().toString() + "'";
        String fechaHora = dtpFechaHora.getDate().toString();
        String[] resultado = parseFechaHora(fechaHora);
        String id = String.valueOf(model.getValueAt(tablaCitas.getSelectedRow(), 0));
        fn.realizarSentencia("UPDATE Citas SET Numero_Control = " + nControl
                + ", Id_Medico = (" + idMedico + "), Id_Consultorio = (" + idConsultorio
                + "), Fecha = '" + resultado[0] + "', Hora = '"
                + resultado[1] + "' WHERE Id_Cita = " + id);
        ActualizarTabla();
        limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //VariablesGlobales.frm_menu.setVisible(true);
        //dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = String.valueOf(model.getValueAt(tablaCitas.getSelectedRow(), 0));
        fn.realizarSentencia("DELETE FROM Citas WHERE Id_Cita = " + id);
        ActualizarTabla();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCitasActionPerformed
        // VariablesGlobales.frm_consultarCita.setVisible(true);
        //dispose();
    }//GEN-LAST:event_btnVerCitasActionPerformed

    private void btnIconoLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconoLupaActionPerformed
        String nombre = "SELECT Nombre_Alumno AS Nombre\n"
                + "FROM Alumnos\n"
                + "WHERE Numero_Control = " + txtFNControl.getText() + "\n"
                + "UNION ALL\n"
                + "SELECT Nombre_Maestro AS Nombre\n"
                + "FROM Maestros\n"
                + "WHERE Numero_Control = " + txtFNControl.getText();

        if (fn.verificarExistencia(nombre) == true) {
            JOptionPane.showMessageDialog(null, "Este usuario es: " + fn.obtenerResultado(nombre));
        } else {
            JOptionPane.showMessageDialog(this, "Esta cuenta no está registrada en nuestro sistema", "Datos Incorrectos y/o Inexistentes", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIconoLupaActionPerformed

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMouseClicked
        int row = tablaCitas.getSelectedRow();
        txtFNControl.setText(String.valueOf(model.getValueAt(row, 1))); // Campo para Numero_Control
        CboxMedico.setSelectedItem(String.valueOf(model.getValueAt(row, 3))); // ComboBox para Nombre del Medico (usando el valor Id)
        CboxConsultorio.setSelectedItem(String.valueOf(model.getValueAt(row, 4))); // ComboBox para Nombre del Consultorio (usando el valor Id)
        String fechaTexto = String.valueOf(model.getValueAt(row, 5));
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        try {
            Date fecha = dateFormat.parse(fechaTexto);
            dtpFechaHora.setDate(fecha); // dateTimePicker es tu componente DateTimePicker
        } catch (ParseException e) {

        }
        tablaCitas.clearSelection();
    }//GEN-LAST:event_tablaCitasMouseClicked

    private static String[] parseFechaHora(String fechaHoraStr) {
        // Define el formato de entrada
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        String[] resultado = new String[2];

        try {
            // Parsea la cadena en un objeto Date
            Date fechaHora = formatoEntrada.parse(fechaHoraStr);

            // Define formatos de salida para fecha y hora
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

            // Extrae la fecha y la hora como cadenas separadas
            resultado[0] = formatoFecha.format(fechaHora);
            resultado[1] = formatoHora.format(fechaHora);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }


    /*
    private String obtenerFecha(String cadena, String dato){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US); // Crear un objeto SimpleDateFormat para analizar la fecha
            Date date = sdf.parse(cadena);// Analizar la cadena en un objeto Date

            SimpleDateFormat diaDeLaSemanaFormato = new SimpleDateFormat("EEEE", Locale.US);
            SimpleDateFormat diaDelMesFormato = new SimpleDateFormat("dd MMM", Locale.US);
            SimpleDateFormat mes = new SimpleDateFormat("MMM", Locale.US);
            SimpleDateFormat anioFormato = new SimpleDateFormat("yyyy", Locale.US);
            SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm:ss", Locale.US);

            String diaSemana = diaDeLaSemanaFormato.format(date);
            String diaMes = diaDelMesFormato.format(date);
            String anio = anioFormato.format(date);
            String hora = horaFormato.format(date);
            
            String completo = anio + " " + mes + " " + diaMes;
            
            switch (dato) {
                case "diaSemana" -> {
                    return diaSemana;
                }
                case "diaMes" -> {
                    return diaMes;
                }
                case "anio" -> {
                    return anio;
                }
                case "hora" -> {
                    return hora;
                }
                case "completo" ->{
                    return completo;
                }
                default -> {
                }
            }
        } catch (ParseException e) {
            
        }
        return null;
    }
     */
    private void ActualizarTabla() {
        model = fn.mostrarTablas("SELECT Citas.Id_Cita,\n"
                + "Usuarios.Numero_Control,\n"
                + "CASE\n"
                + "    WHEN Usuarios.Id_Rol = 1 THEN Alumnos.Nombre_Alumno\n"
                + "    WHEN Usuarios.Id_Rol = 2 THEN Maestros.Nombre_Maestro\n"
                + "END AS Paciente,\n"
                + "Medicos.Nombre_Medico AS Medico,\n"
                + "Consultorios.Nombre_Consultorio AS Consultorio,\n"
                + "Citas.Fecha,\n"
                + "Citas.Hora\n"
                + "FROM Citas\n"
                + "INNER JOIN Usuarios ON Citas.Numero_Control = Usuarios.Numero_Control\n"
                + "LEFT JOIN Alumnos ON Usuarios.Numero_Control = Alumnos.Numero_Control\n"
                + "LEFT JOIN Maestros ON Usuarios.Numero_Control = Maestros.Numero_Control\n"
                + "INNER JOIN Medicos ON Citas.Id_Medico = Medicos.Id_Medico\n"
                + "INNER JOIN Consultorios ON Citas.Id_Consultorio = Consultorios.Id_Consultorio");
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");
    }

    public void ActualizarCombobox() {
        CboxMedico.removeAllItems();
        CboxConsultorio.removeAllItems();
        CboxMedico = fn.llenarCombobox("SELECT Nombre_Medico FROM Medicos ORDER BY Id_Medico ASC",
                "Nombre_Medico", CboxMedico);
        CboxConsultorio = fn.llenarCombobox("SELECT Nombre_Consultorio FROM Consultorios ORDER BY Id_Consultorio ASC",
                "Nombre_Consultorio", CboxConsultorio);
    }

    private void limpiar() {
        txtFNControl.setText("");
        CboxMedico.setSelectedIndex(0);
        CboxConsultorio.setSelectedIndex(0);
        txtFNControl.requestFocus();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxConsultorio;
    private javax.swing.JComboBox<String> CboxMedico;
    private javax.swing.JComboBox<String> CboxServicio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIconoLupa;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerCitas;
    private com.lavantech.gui.comp.DateTimePicker dtpFechaHora;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpControlCitas;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblMedico1;
    private javax.swing.JLabel lblNControl;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtFNControl;
    // End of variables declaration//GEN-END:variables
}
