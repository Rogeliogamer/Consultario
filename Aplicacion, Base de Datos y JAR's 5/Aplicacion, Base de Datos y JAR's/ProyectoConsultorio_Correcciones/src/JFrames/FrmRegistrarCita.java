package JFrames;

import Complementos.Funciones;
import Complementos.FuncionesFecha;
import Complementos.FuncionesInterface;
import Complementos.FuncionesValidar;
import Complementos.TextPrompt;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmRegistrarCita extends javax.swing.JFrame {

    Funciones fn = new Funciones(); // Conjunto de funciones SQL.
    FuncionesInterface di = new FuncionesInterface(); // Conjunto de funciones de diseño.
    FuncionesValidar validar = new FuncionesValidar(); // Conjunto de funciones  de validación.
    FuncionesFecha fe = new FuncionesFecha(); // Conjunto de funciones  de fechas.

    String medSeleccionado, serSeleccionado; // String's de las opciones seleccionadas en los ComboBox.
    String aNControl, fechaHora; // String's de los campos de número de control y fecha.
    String mNControlSQL, idServicioSQL; // String's de las sentencias SQL.

    String idCitaSeleccionada = ""; // String para la cita a modificar.
    
    String horaInicioServicio, horaCierreServicio;

    public FrmRegistrarCita() {
        initComponents();

        this.setLocationRelativeTo(null);

        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl);

        btnIconoLupa.setIcon(di.pintarImagenBtn(btnIconoLupa, "src/Imagenes/IMG_Icono_Lupa.png"));

        validar.validarNControlRegex(txtFNControl);

        actualizarCombobox();
        desactivarModificar();
    }

    public FrmRegistrarCita(String idCitaSeleccionada, String alumnoSeleccionado, String medicoSeleccionado, String servicioSeleccionado, Date fechaCitaSeleccionada) {
        initComponents();

        this.setLocationRelativeTo(null);

        actualizarCombobox();

        this.idCitaSeleccionada = idCitaSeleccionada;
        txtFNControl.setText(alumnoSeleccionado);
        CboxMedico.setSelectedItem(medicoSeleccionado);
        CboxServicio.setSelectedItem(servicioSeleccionado);
        dtpFechaHora.setDate(fechaCitaSeleccionada);

        TextPrompt pHNControl = new TextPrompt("Número de Control", txtFNControl);

        btnIconoLupa.setIcon(di.pintarImagenBtn(btnIconoLupa, "src/Imagenes/IMG_Icono_Lupa.png"));

        validar.validarNControlRegex(txtFNControl);

        activarModificar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpControlCitas = new javax.swing.JPanel();
        lblNControl = new javax.swing.JLabel();
        txtFNControl = new javax.swing.JTextField();
        dtpFechaHora = new com.lavantech.gui.comp.DateTimePicker();
        lblFechaHora = new javax.swing.JLabel();
        lblMedico = new javax.swing.JLabel();
        btnIconoLupa = new javax.swing.JButton();
        lblServicio = new javax.swing.JLabel();
        CboxMedico = new javax.swing.JComboBox<>();
        CboxServicio = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnVerCitas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblIdCitaSeleccionada = new javax.swing.JLabel();
        btnDeseleccionar = new javax.swing.JButton();
        lblTitular = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 360));
        setMinimumSize(new java.awt.Dimension(610, 360));
        setResizable(false);

        jpControlCitas.setBackground(new java.awt.Color(36, 130, 119));
        jpControlCitas.setMaximumSize(new java.awt.Dimension(610, 360));
        jpControlCitas.setMinimumSize(new java.awt.Dimension(610, 360));

        lblNControl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNControl.setForeground(new java.awt.Color(255, 255, 255));
        lblNControl.setText("N. Control:");

        txtFNControl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtFNControl.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFNControl.setToolTipText("");
        txtFNControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 4, 5, 4));
        txtFNControl.setMargin(new java.awt.Insets(3, 8, 3, 8));
        txtFNControl.setMaximumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setMinimumSize(new java.awt.Dimension(160, 30));
        txtFNControl.setPreferredSize(new java.awt.Dimension(160, 30));

        dtpFechaHora.setMaximumSize(new java.awt.Dimension(135, 30));
        dtpFechaHora.setMinimumSize(new java.awt.Dimension(135, 30));
        dtpFechaHora.setPreferredSize(new java.awt.Dimension(135, 30));

        lblFechaHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaHora.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaHora.setText("Fecha:");

        lblMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMedico.setForeground(new java.awt.Color(255, 255, 255));
        lblMedico.setText("Médico:");

        btnIconoLupa.setBackground(new java.awt.Color(36, 130, 119));
        btnIconoLupa.setBorder(null);
        btnIconoLupa.setFocusPainted(false);
        btnIconoLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconoLupaActionPerformed(evt);
            }
        });

        lblServicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblServicio.setText("Servicio:");

        CboxMedico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxMedico.setBorder(null);
        CboxMedico.setMaximumSize(new java.awt.Dimension(135, 30));
        CboxMedico.setMinimumSize(new java.awt.Dimension(135, 30));
        CboxMedico.setPreferredSize(new java.awt.Dimension(135, 30));

        CboxServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        CboxServicio.setBorder(null);
        CboxServicio.setMaximumSize(new java.awt.Dimension(135, 30));
        CboxServicio.setMinimumSize(new java.awt.Dimension(135, 30));
        CboxServicio.setPreferredSize(new java.awt.Dimension(135, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVerCitas.setText("Ver Citas");
        btnVerCitas.setFocusPainted(false);
        btnVerCitas.setMaximumSize(new java.awt.Dimension(100, 30));
        btnVerCitas.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVerCitas.setPreferredSize(new java.awt.Dimension(100, 30));
        btnVerCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCitasActionPerformed(evt);
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

        lblIdCitaSeleccionada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIdCitaSeleccionada.setForeground(new java.awt.Color(255, 255, 255));

        btnDeseleccionar.setText("No Editar");
        btnDeseleccionar.setFocusPainted(false);
        btnDeseleccionar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnDeseleccionar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnDeseleccionar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDeseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeseleccionarActionPerformed(evt);
            }
        });

        lblTitular.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setText("Registro de Citas:");
        lblTitular.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpControlCitasLayout = new javax.swing.GroupLayout(jpControlCitas);
        jpControlCitas.setLayout(jpControlCitasLayout);
        jpControlCitasLayout.setHorizontalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addComponent(lblNControl)
                        .addGap(18, 18, 18)
                        .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMedico)
                                    .addComponent(lblServicio))
                                .addGap(33, 33, 33))
                            .addGroup(jpControlCitasLayout.createSequentialGroup()
                                .addComponent(lblFechaHora)
                                .addGap(49, 49, 49)))
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CboxServicio, 0, 160, Short.MAX_VALUE)
                            .addComponent(CboxMedico, 0, 160, Short.MAX_VALUE)
                            .addComponent(dtpFechaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addComponent(btnIconoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnDeseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(lblIdCitaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpControlCitasLayout.setVerticalGroup(
            jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlCitasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnIconoLupa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNControl)
                            .addComponent(txtFNControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnDeseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIdCitaSeleccionada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CboxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpControlCitasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dtpFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jpControlCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
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

        if (!camposVacios()) {
            if (fn.verificarExistencia(nControlExiste) == true) {
                if (rangoDelServicio()) {
                    if (!conflictoCita()) {
                        if (idCitaSeleccionada.length() == 0) {
                            insertarCita();
                            limpiar();
                        } else {
                            modificarCita();
                            desactivarModificar();
                            limpiar();
                        }
                    }
                }else{
                    mostrarError("Cita fuera de servicio", serSeleccionado + " - " + horaInicioServicio + " a " + horaCierreServicio);
                }
            } else {
                mostrarError("Alumno NO ENCONTRADO", "El número de control no existe o no pertenece a un alumno");
            }
        } else {
            mostrarError("Datos Faltantes", "Completa todos los campos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVerCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCitasActionPerformed
        FrmVerCitas frm_verCitas = new FrmVerCitas();
        frm_verCitas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVerCitasActionPerformed

    private void btnDeseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeseleccionarActionPerformed
        desactivarModificar();
        limpiar();
    }//GEN-LAST:event_btnDeseleccionarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FrmMenuSecretario frm_menu_secretario = new FrmMenuSecretario();
        frm_menu_secretario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIconoLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconoLupaActionPerformed
        aNControl = txtFNControl.getText();
        if (aNControl.isEmpty()) {
            mostrarError("Campo vacio", "Escribe un numero de control");
        } else {
            String nombreCompleto = "SELECT CONCAT(Nombre_Alumno, ' ', Apellido_Alumno) AS NombreCompleto "
                    + "FROM Alumno "
                    + "WHERE Numero_Control = " + aNControl;

            if (fn.verificarExistencia(nombreCompleto) == true) {
                JOptionPane.showMessageDialog(null, "Este usuario es: " + fn.obtenerResultado(nombreCompleto));
            } else {
                mostrarError("Alumno NO Encontrado", "El número de control no existe o no pertenece a un alumno");
            }
        }
    }//GEN-LAST:event_btnIconoLupaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertarCita() {
        String[] resultado = fe.separarFechaYHora(fechaHora);
        String citaSQL = "INSERT INTO Cita (Medico_Numero_Control, Alumno_Numero_Control, Id_Servicio, Fecha, Hora) "
                + "VALUES ((" + mNControlSQL + "), " + aNControl + ", (" + idServicioSQL + "), '" + resultado[0] + "', '" + resultado[1] + "')";
        fn.ejecutarSentencia(citaSQL, true);
    }

    private void modificarCita() {
        String[] resultado = fe.separarFechaYHora(fechaHora);
        String modificarCitaSQL = "UPDATE Cita SET "
                + "Medico_Numero_Control = (" + mNControlSQL + "), Alumno_Numero_Control = " + aNControl + ", "
                + "Id_Servicio = (" + idServicioSQL + "), Fecha = '" + resultado[0] + "', Hora = '" + resultado[1] + "' "
                + "WHERE Id_Cita = " + idCitaSeleccionada;
        fn.ejecutarSentencia(modificarCitaSQL, true);
    }

    private Boolean rangoDelServicio() {
        String[] resultado = fe.separarFechaYHora(fechaHora);
        String horaInicioSQL = "SELECT Hora_Inicio FROM Servicio WHERE Id_Servicio = (" + idServicioSQL + ")";
        String horaInicio = fn.obtenerResultado(horaInicioSQL);
        String horaCierreSQL = "SELECT Hora_Termino FROM Servicio WHERE Id_Servicio = (" + idServicioSQL + ")";
        String horaCierre = fn.obtenerResultado(horaCierreSQL);

        String[] partesHoraInicio = horaInicio.split(":");
        String[] partesHoraCierre = horaCierre.split(":");
        String[] partesHoraCita = resultado[1].split(":");

        horaInicio = partesHoraInicio[0] + ":" + partesHoraInicio[1];
        String horaCita = partesHoraCita[0] + ":" + partesHoraCita[1];
        horaCierre = partesHoraCierre[0] + ":" + partesHoraCierre[1];
        
        System.out.println(horaInicio + " - " + horaCita + " - " + horaCierre);
        
        horaInicioServicio = horaInicio;
        horaCierreServicio = horaCierre;
        
        return fe.estaDentroDelRango(horaCita, horaInicio, horaCierre);
    }

    private Boolean conflictoCita() {
        String[] fechaYHora = fe.separarFechaYHora(fechaHora);
        boolean adelante;
        boolean atras;

        /* Sentencia SQL que busca coincidencias entre citas que comparten Médicos en función de la fecha
        y hora, considerando un intervalo de 20 minutos hacia adelante. 
         */
        String rangoAdelanteSQL = "SELECT Id_Cita FROM Cita WHERE "
                + "Medico_Numero_Control = (" + mNControlSQL + ") "
                + "AND Fecha = '" + fechaYHora[0] + "' "
                + "AND Hora BETWEEN '" + fechaYHora[1] + "' AND ADDTIME('" + fechaYHora[1] + "', '00:20:00') "
                + "LIMIT 1; ";

        /* Sentencia SQL que busca coincidencias entre citas que comparten Médicos en función de la fecha
        y hora, considerando un intervalo de 20 minutos hacia atrás. 
         */
        String rangoAtrasSQL = "SELECT Id_Cita FROM Cita WHERE "
                + "Medico_Numero_Control = (" + mNControlSQL + ") "
                + "AND Fecha = '" + fechaYHora[0] + "' "
                + "AND Hora BETWEEN SUBTIME('" + fechaYHora[1] + "', '00:20:00') AND '" + fechaYHora[1] + "' "
                + "LIMIT 1; ";

        adelante = fn.verificarExistencia(rangoAdelanteSQL);
        atras = fn.verificarExistencia(rangoAtrasSQL);

        String[] datos;

        if (adelante && atras) {
            String idCitaConflictivaAtras = fn.obtenerResultado(rangoAtrasSQL);
            String idCitaConflictivaAdelante = fn.obtenerResultado(rangoAdelanteSQL);

            if ((idCitaConflictivaAtras.equals(idCitaConflictivaAdelante) && idCitaSeleccionada.equals(idCitaConflictivaAtras))) {
                System.out.println("Editado: " + idCitaSeleccionada + " Atras:" + idCitaConflictivaAtras + " Adelante: " + idCitaConflictivaAdelante);
                return false;
            } else {
                System.out.println("Atras:" + idCitaConflictivaAtras + " Adelante: " + idCitaConflictivaAdelante);
                mostrarError("Conflicto de Citas", "Cambia de Médico o Fecha");
                return true;
            }

        } else if (atras && !adelante) {
            String idCitaConflictivaAtras = fn.obtenerResultado(rangoAtrasSQL);
            datos = obtenerDatosConflicto(idCitaConflictivaAtras);
            mostrarError("Conflicto de Citas", datos[0] + " ocupado a las " + datos[1]);
            System.out.println("Atras: " + idCitaConflictivaAtras);
            return true;
        } else if (!atras && adelante) {
            String idCitaConflictivaAdelante = fn.obtenerResultado(rangoAdelanteSQL);
            datos = obtenerDatosConflicto(idCitaConflictivaAdelante);
            mostrarError("Conflicto de Citas", datos[0] + " ocupado a las " + datos[1]);
            System.out.println("Adelante: " + idCitaConflictivaAdelante);
            return true;
        } else {
            return false;
        }
    }

    private String[] obtenerDatosConflicto(String idCita) {
        String[] datos = new String[2];
        datos[0] = fn.obtenerResultado("SELECT CONCAT(M.Nombre_Medico, ' ', M.Apellido_Medico) AS NombreCompleto "
                + "FROM Cita AS C "
                + "INNER JOIN Medico AS M ON C.Medico_Numero_Control = M.Numero_Control "
                + "WHERE C.Id_Cita = " + idCita);
        datos[1] = fn.obtenerResultado("SELECT Hora FROM Cita WHERE Id_Cita = " + idCita);
        return datos;
    }

    private void activarModificar() {
        lblIdCitaSeleccionada.setEnabled(true);
        lblIdCitaSeleccionada.setVisible(true);
        btnDeseleccionar.setEnabled(true);
        btnDeseleccionar.setVisible(true);
        lblIdCitaSeleccionada.setText("Estás editando la cita número: " + idCitaSeleccionada);
    }

    private void desactivarModificar() {
        lblIdCitaSeleccionada.setEnabled(false);
        lblIdCitaSeleccionada.setVisible(false);
        btnDeseleccionar.setEnabled(false);
        btnDeseleccionar.setVisible(false);
        idCitaSeleccionada = "";
    }

    private void obtenerVariables() {
        aNControl = txtFNControl.getText();
        medSeleccionado = CboxMedico.getSelectedItem().toString();
        serSeleccionado = CboxServicio.getSelectedItem().toString();
        fechaHora = dtpFechaHora.getDate().toString();

        mNControlSQL = "SELECT Numero_Control FROM Medico WHERE CONCAT(Nombre_Medico, ' ', Apellido_Medico) = '" + medSeleccionado + "'"; // Obtener Numero de Control
        idServicioSQL = "SELECT Id_Servicio FROM Servicio WHERE Nombre_Servicio = '" + serSeleccionado + "'";
    }

    private Boolean camposVacios() {
        obtenerVariables();
        String[] comboBoxes = {medSeleccionado, serSeleccionado};
        String defSeleccionado = "Seleccione una opcion";

        for (String comboBox : comboBoxes) {
            if (comboBox.equals(defSeleccionado) || comboBox.isEmpty()) {
                return true;
            }
        }

        return aNControl.isEmpty() || fechaHora.isEmpty();
    }

    private void mostrarError(String titulo, String contenido) {
        JOptionPane.showMessageDialog(this, contenido, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public void actualizarCombobox() {
        CboxMedico.removeAllItems();
        CboxServicio.removeAllItems();
        CboxMedico = fn.llenarCombobox("SELECT CONCAT(Nombre_Medico, ' ', Apellido_Medico) AS NombreCompleto FROM Medico ORDER BY Numero_Control ASC",
                "NombreCompleto", CboxMedico);
        CboxServicio = fn.llenarCombobox("SELECT Nombre_Servicio FROM Servicio ORDER BY Id_Servicio ASC",
                "Nombre_Servicio", CboxServicio);
    }

    private void limpiar() {
        txtFNControl.setText("");
        CboxMedico.setSelectedIndex(0);
        CboxServicio.setSelectedIndex(0);
        dtpFechaHora.setDate(fe.obtenerFechaActual());
        txtFNControl.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxMedico;
    private javax.swing.JComboBox<String> CboxServicio;
    private javax.swing.JButton btnDeseleccionar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIconoLupa;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerCitas;
    private com.lavantech.gui.comp.DateTimePicker dtpFechaHora;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jpControlCitas;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblIdCitaSeleccionada;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblNControl;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JTextField txtFNControl;
    // End of variables declaration//GEN-END:variables
}
