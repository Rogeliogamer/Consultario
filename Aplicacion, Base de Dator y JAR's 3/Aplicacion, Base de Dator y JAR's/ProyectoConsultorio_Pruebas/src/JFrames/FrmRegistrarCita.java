package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import Complementos.VariablesGlobales;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmRegistrarCita extends javax.swing.JFrame {

    Funciones fn = new Funciones();
    FuncionesInterface di = new FuncionesInterface();
    FuncionesValidar validar = new FuncionesValidar();
    FuncionesFecha fe = new FuncionesFecha();
    DefaultTableModel model;

    String medSeleccionado;
    String conSeleccionado;
    String serSeleccionado;

    String aNControl;
    String mNControlSQL;
    String idConsultorioSQL;
    String idServicio;
    String fechaHora;

    public FrmRegistrarCita() {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl); // PlaceHolder para el campo "N. Control"

        btnIconoLupa.setIcon(di.pintarImagenBtn(btnIconoLupa, "src/Imagenes/IMG_Icono_Lupa.png"));

        validar.validarNControlRegex(txtFNControl);

        ActualizarTabla();
        ActualizarCombobox();

        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
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
        jScrollPaneTablaCita = new javax.swing.JScrollPane();
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
        jpControlCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpControlCitasMousePressed(evt);
            }
        });

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

        jScrollPaneTablaCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPaneTablaCitaMousePressed(evt);
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
                        .addComponent(jScrollPaneTablaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jScrollPaneTablaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        obtenerVariables();
        String nControlExiste = "SELECT * FROM Alumno WHERE Numero_Control = " + aNControl;
        if (camposVacios() == true) {
            mostrarError("Datos Faltantes", "Completa todos los campos");
        } else {
            System.out.println("Ocurre el error en verificar existencia");
            if (fn.verificarExistencia(nControlExiste) == true) {
                System.out.println("Ocurre el error en conflicto de cita?");
                if (conflictoCita() == true) {

                } else {
                    System.out.println("Ocurre el error en evitar cita?");
                    insertarCita();
                    ActualizarTabla();
                    limpiar();
                }
            } else {
                mostrarError("Usuario no Encontrado", "Este usuario no es un Alumno");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VariablesGlobales.frm_menu_secretario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaCitas.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = String.valueOf(model.getValueAt(filaSeleccionada, 0));
            fn.ejecutarSentencia("DELETE FROM Cita WHERE Id_Cita = " + id, true);
            ActualizarTabla();
            limpiar();
        } else {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCitasActionPerformed

    }//GEN-LAST:event_btnVerCitasActionPerformed

    private void btnIconoLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconoLupaActionPerformed
        aNControl = txtFNControl.getText();
        String nombreCompleto = "SELECT CONCAT(Nombre_Alumno, ' ', Apellido_Alumno) AS NombreCompleto "
                + "FROM Alumno "
                + "WHERE Numero_Control = " + aNControl;

        if (fn.verificarExistencia(nombreCompleto) == true) {
            JOptionPane.showMessageDialog(null, "Este usuario es: " + fn.obtenerResultado(nombreCompleto));
        } else {
            mostrarError("Alumno NO Encontrado", "El número de control no existe o no pertenece a un alumno");
        }
    }//GEN-LAST:event_btnIconoLupaActionPerformed

    private void jScrollPaneTablaCitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneTablaCitaMousePressed
        tablaCitas.clearSelection();
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        txtFNControl.setEnabled(true);
    }//GEN-LAST:event_jScrollPaneTablaCitaMousePressed

    private void jpControlCitasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpControlCitasMousePressed
        tablaCitas.clearSelection();
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        txtFNControl.setEnabled(true);
    }//GEN-LAST:event_jpControlCitasMousePressed

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMouseClicked
        int row = tablaCitas.getSelectedRow();
        if (row != -1) {
            txtFNControl.setText(String.valueOf(model.getValueAt(row, 1)));
            CboxMedico.setSelectedItem(String.valueOf(model.getValueAt(row, 2)));
            CboxConsultorio.setSelectedItem(String.valueOf(model.getValueAt(row, 3)));
            CboxServicio.setSelectedItem(String.valueOf(model.getValueAt(row, 4)));
            String fechaTexto = String.valueOf(model.getValueAt(row, 5));
            String horaTexto = String.valueOf(model.getValueAt(row, 6));

            Date fechaHoraCombinada = fe.combinarFechaYHora(fechaTexto, horaTexto);
            dtpFechaHora.setDate(fechaHoraCombinada);

            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);
            txtFNControl.setEnabled(false);
        } else {
            tablaCitas.clearSelection();
            btnEliminar.setEnabled(false);
            txtFNControl.setEnabled(true);
        }
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

    private void insertarCita() {
        obtenerVariables();
        String[] resultado = parseFechaHora(fechaHora);
        String citaSQL = "INSERT INTO Cita (Medico_Numero_Control, Alumno_Numero_Control, Id_Consultorio, Id_Servicio, Fecha, Hora) "
                + "VALUES ((" + mNControlSQL + "), " + aNControl + ", (" + idConsultorioSQL + "), (" + idServicio + "), '" + resultado[0] + "', '" + resultado[1] + "')";
        fn.ejecutarSentencia(citaSQL, true);
    }

    private void modificarCita() {
        obtenerVariables();
        aNControl = txtFNControl.getText();
        String[] resultado = parseFechaHora(fechaHora);

        int filaSeleccionada = tablaCitas.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = String.valueOf(model.getValueAt(filaSeleccionada, 0));
            String modificarCitaSQL = "UPDATE Cita SET Alumno_Numero_Control = " + aNControl
                    + ", Medico_Numero_Control = (" + mNControlSQL + "), Id_Consultorio = (" + idConsultorioSQL
                    + "), (" + idServicio + "),  Fecha = '" + resultado[0] + "', Hora = '"
                    + resultado[1] + "' WHERE Id_Cita = " + id;

            fn.realizarSentencia(modificarCitaSQL);
            ActualizarTabla();
            limpiar();
        } else {

        }

    }

    private Boolean camposVacios() {
        obtenerVariables();
        String[] comboBoxes = {medSeleccionado, conSeleccionado, serSeleccionado};
        String defSeleccionado = "Seleccione una opción";

        for (String comboBox : comboBoxes) {
            if (comboBox.equals(defSeleccionado) || comboBox.isEmpty()) {
                return true;
            }
        }

        return aNControl.isEmpty() || fechaHora.isEmpty();
    }

    private Boolean conflictoCita() {
        String[] fechaYHora = fe.separarFechaYHora(fechaHora);
        String idCitaConflictiva;
        boolean adelante;
        boolean atras;

        /* Sentencia SQL que busca coincidencias entre citas que comparten Consultorios o Médicos en función de la fecha
        y hora, considerando un intervalo de 20 minutos hacia adelante. 
         */
        String rangoAdelanteSQL = "SELECT Id_Cita FROM Cita WHERE "
                + "((Medico_Numero_Control = (" + mNControlSQL + ") OR "
                + "Id_Consultorio = (" + idConsultorioSQL + ")) "
                + "AND Fecha = '" + fechaYHora[0] + "' "
                + "AND Hora BETWEEN '" + fechaYHora[1] + "' AND ADDTIME('" + fechaYHora[1] + "', '00:20:00')) "
                + "LIMIT 1; ";

        /* Sentencia SQL que busca coincidencias entre citas que comparten Consultorios o Médicos en función de la fecha
        y hora, considerando un intervalo de 20 minutos hacia atrás. 
         */
        String rangoAtrasSQL = "SELECT Id_Cita FROM Cita WHERE "
                + "((Medico_Numero_Control = (" + mNControlSQL + ") OR "
                + "Id_Consultorio = (" + idConsultorioSQL + ")) "
                + "AND Fecha = '" + fechaYHora[0] + "' "
                + "AND Hora BETWEEN SUBTIME('" + fechaYHora[1] + "', '00:20:00') AND '" + fechaYHora[1] + "') "
                + "LIMIT 1; ";

        adelante = fn.verificarExistencia(rangoAdelanteSQL);
        atras = fn.verificarExistencia(rangoAtrasSQL);

        if (adelante && !atras) { // Entramos en conflicto con una cita posterior (nuestra cita no cumpliria su rango de tiempo)
            idCitaConflictiva = fn.obtenerResultado(rangoAdelanteSQL);
            conflictoCitaDatos(idCitaConflictiva);

            return true; // Es verdad, hay conflicto.
        } else if (!adelante && atras) { // Entramos en conflicto con una cita previa (interrumpiriamos una cita en desarrollo)
            idCitaConflictiva = fn.obtenerResultado(rangoAtrasSQL);
            conflictoCitaDatos(idCitaConflictiva);

            return true; // Es verdad, hay conflicto.
        } else if (adelante && atras) { // Entramos entre 2 citas, no hay posibilidad de obtener una Id especifica, mostramos un mensaje general
            mostrarError("Conflicto de Citas", "Cambia de Fecha, de Hora, de Medico, o de Consultorio");

            return true; // Es verdad, hay conflicto.
        } else { // Si no hay ninguna coincidencia, la insercion se permite

            return false; // No es verdad, no hay conflicto
        }
    }

    private void conflictoCitaDatos(String idCita) {
        String nombreMedico;
        String nombreConsultorio;
        String horaCita;
        nombreMedico = fn.obtenerResultado("SELECT CONCAT(M.Nombre_Medico, ' ', M.Apellido_Medico) AS NombreCompleto "
                + "FROM Cita AS C "
                + "INNER JOIN Medico AS M ON C.Medico_Numero_Control = M.Numero_Control "
                + "WHERE C.Id_Cita = " + idCita);
        nombreConsultorio = fn.obtenerResultado(" SELECT Co.Nombre_Consultorio "
                + "FROM Cita AS Ci "
                + "INNER JOIN Consultorio AS Co ON Ci.Id_Consultorio = Co.Id_Consultorio "
                + "WHERE Ci.Id_Cita = " + idCita);
        horaCita = fn.obtenerResultado("SELECT Hora FROM Cita WHERE Id_Cita = " + idCita);
        mostrarError("Conflicto de Citas", nombreMedico + " ocupado en el " + nombreConsultorio + " a las " + horaCita);
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void obtenerVariables() {
        aNControl = txtFNControl.getText();
        medSeleccionado = CboxMedico.getSelectedItem().toString();
        conSeleccionado = CboxConsultorio.getSelectedItem().toString();
        serSeleccionado = CboxServicio.getSelectedItem().toString();
        fechaHora = dtpFechaHora.getDate().toString();

        mNControlSQL = "SELECT Numero_Control FROM Medico WHERE CONCAT(Nombre_Medico, ' ', Apellido_Medico) = '" + medSeleccionado + "'"; // Obtener Numero de Control
        idConsultorioSQL = "SELECT Id_Consultorio from Consultorio WHERE Nombre_Consultorio = '" + conSeleccionado + "'";
        idServicio = "SELECT Id_Servicio FROM Servicio WHERE Nombre_Servicio = '" + serSeleccionado + "'";
    }

    private void ActualizarTabla() {
        model = fn.mostrarTablas("SELECT\n"
                + "cita.Id_Cita as 'Cita',\n"
                + "alumno.Numero_Control as 'Alumno',\n"
                + "CONCAT(medico.Nombre_Medico, ' ', medico.Apellido_Medico) as 'Medico',\n"
                + "consultorio.Nombre_Consultorio as 'Consultorio',\n"
                + "servicio.Nombre_Servicio as 'Servicio',\n"
                + "cita.Fecha as 'Fecha',\n"
                + "cita.Hora as 'Hora'\n"
                + "FROM Cita cita\n"
                + "INNER JOIN Alumno alumno ON cita.Alumno_Numero_Control = alumno.Numero_Control\n"
                + "INNER JOIN Medico medico ON cita.Medico_Numero_Control = medico.Numero_Control\n"
                + "INNER JOIN Consultorio consultorio ON cita.Id_Consultorio = consultorio.Id_Consultorio\n"
                + "INNER JOIN Servicio servicio ON cita.Id_Servicio = servicio.Id_Servicio\n"
                + "ORDER BY cita.Fecha ASC"); // Ordenar por 'Fecha' ascendente
        this.tablaCitas.setModel(model);
        fn.realizarSentencia("commit");

        int anchoGeneral = 100;
        for (int i = 0; i < tablaCitas.getColumnCount(); i++) {
            TableColumn columna = tablaCitas.getColumnModel().getColumn(i);
            columna.setPreferredWidth(anchoGeneral);
        }

        TableColumn columna;
        columna = tablaCitas.getColumnModel().getColumn(0); // Columna Id_Cita
        columna.setPreferredWidth(40);
        columna = tablaCitas.getColumnModel().getColumn(1); // Columna Alumno
        columna.setPreferredWidth(90);
        columna = tablaCitas.getColumnModel().getColumn(2); // Nombre Medico
        columna.setPreferredWidth(180);
        columna = tablaCitas.getColumnModel().getColumn(3); // Nombre Consultorio
        columna.setPreferredWidth(100);
        columna = tablaCitas.getColumnModel().getColumn(4); // Nombre Servicio
        columna.setPreferredWidth(180);
        columna = tablaCitas.getColumnModel().getColumn(5); // Fecha
        columna.setPreferredWidth(80);
        columna = tablaCitas.getColumnModel().getColumn(6); // Hora
        columna.setPreferredWidth(65);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tablaCitas.getColumnCount(); i++) {
            tablaCitas.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public void ActualizarCombobox() {
        CboxMedico.removeAllItems();
        CboxConsultorio.removeAllItems();
        CboxServicio.removeAllItems();
        CboxMedico = fn.llenarCombobox("SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS NombreCompleto FROM Medico ORDER BY Numero_Control ASC",
                "NombreCompleto", CboxMedico);
        CboxConsultorio = fn.llenarCombobox("SELECT Nombre_Consultorio FROM Consultorio ORDER BY Id_Consultorio ASC",
                "Nombre_Consultorio", CboxConsultorio);
        CboxServicio = fn.llenarCombobox("SELECT Nombre_Servicio FROM Servicio ORDER BY Id_Servicio ASC",
                "Nombre_Servicio", CboxServicio);
    }

    private void limpiar() {
        txtFNControl.setText("");
        CboxMedico.setSelectedIndex(0);
        CboxConsultorio.setSelectedIndex(0);
        CboxServicio.setSelectedIndex(0);
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
    private javax.swing.JScrollPane jScrollPaneTablaCita;
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
