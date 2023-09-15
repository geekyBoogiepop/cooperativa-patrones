/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import alertas.principal.AWTUtilities;
import java.awt.Cursor;
import java.util.Timer;
import java.util.TimerTask;
import alertas.principal.AWTUtilities;
import alertas.principal.ErrorAlert;
import alertas.principal.SuccessAlert;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Latitude
 */
public class ModalUsuario extends javax.swing.JDialog {

    Timer timer = null;
    TimerTask task;
    int i = 32;

    /**
     * Creates new form ModalUsuario
     */
    public ModalUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        AWTUtilities.setOpaque(this, false);
        this.CBNacionalidad.setCursor(new Cursor(12));
        CBNacionalidad.setModel(new javax.swing.DefaultComboBoxModel(Nacionalidad.paises));
        this.id.setVisible(false);
        this.nombreEmp.setVisible(false);
        this.txtNombre.requestFocus();
        this.setLocationRelativeTo(null);

    }

    private void limpiarCampos() {

        this.txtNombre.requestFocus();
        this.txtNombre.setText(null);
        this.DCFechaNac.setDatoFecha(null);
        this.CBNacionalidad.setSelectedIndex(3);
        this.DCFechaIngreso.setDatoFecha(null);
        this.DCFechaSalida.setDatoFecha(null);
        this.txtIdentificacion.setText("");
        this.txtMailPersonal.setText("");
        this.txtMailInterno.setText("");
        this.txtProfesion.setText("");

    }

    private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialShadowRectangle1 = new rojeru_san.efectos.MaterialShadowRectangle();
        jPanel2 = new javax.swing.JPanel();
        rSPanelShadow2 = new rojeru_san.rspanel.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cerrar = new principal.MaterialButton();
        jPanel4 = new javax.swing.JPanel();
        MBRegistrar = new necesario.MaterialButton();
        MBLimpiar = new necesario.MaterialButton();
        id = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombreEmp = new javax.swing.JLabel();
        txtNombre = new app.bolivia.swing.JCTextField();
        txtIdentificacion = new app.bolivia.swing.JCTextField();
        txtMailPersonal = new app.bolivia.swing.JCTextField();
        txtMailInterno = new app.bolivia.swing.JCTextField();
        txtProfesion = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DCFechaNac = new rojeru_san.rsdate.RSDateChooser();
        DCFechaIngreso = new rojeru_san.rsdate.RSDateChooser();
        DCFechaSalida = new rojeru_san.rsdate.RSDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JRBFemenino = new javax.swing.JRadioButton();
        JRBMasculino = new javax.swing.JRadioButton();
        JRBSoltero = new javax.swing.JRadioButton();
        JRBCasado = new javax.swing.JRadioButton();
        JRBAcompañado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30), new java.awt.Dimension(32767, 30));
        CBNacionalidad = new rojerusan.RSComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(58, 159, 171));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("TITULO");

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setForeground(new java.awt.Color(58, 159, 171));
        cerrar.setText("X");
        cerrar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(58, 159, 171));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray));

        MBRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        MBRegistrar.setForeground(new java.awt.Color(58, 159, 171));
        MBRegistrar.setText("REGISTRAR");
        MBRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MBRegistrar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        MBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBRegistrarActionPerformed(evt);
            }
        });
        MBRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MBRegistrarKeyTyped(evt);
            }
        });

        MBLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        MBLimpiar.setForeground(new java.awt.Color(58, 159, 171));
        MBLimpiar.setText("lIMPIAR CAMPOS");
        MBLimpiar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        MBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBLimpiarActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("id");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(MBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(MBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel5.setBorder(dropShadowBorder1);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        nombreEmp.setText("nombreUs");
        jPanel5.add(nombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, -1));

        txtNombre.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre.setPlaceholder("Nombre");
        jPanel5.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 330, 40));

        txtIdentificacion.setForeground(new java.awt.Color(58, 159, 171));
        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtIdentificacion.setPlaceholder("Identificación");
        jPanel5.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 330, 50));

        txtMailPersonal.setForeground(new java.awt.Color(58, 159, 171));
        txtMailPersonal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMailPersonal.setPlaceholder("Mail Personal");
        jPanel5.add(txtMailPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 310, 40));

        txtMailInterno.setForeground(new java.awt.Color(58, 159, 171));
        txtMailInterno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMailInterno.setPlaceholder("Mail Interno");
        jPanel5.add(txtMailInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 310, 40));

        txtProfesion.setForeground(new java.awt.Color(58, 159, 171));
        txtProfesion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtProfesion.setPlaceholder("Profesion");
        jPanel5.add(txtProfesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 310, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Identificación:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Mail Personal:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        jtf.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtf.setText("Mail Interno:");
        jPanel5.add(jtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Profesion:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        DCFechaNac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DCFechaNac.setPlaceholder("Fecha de nacimiento");
        jPanel5.add(DCFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 310, 50));

        DCFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DCFechaIngreso.setPlaceholder("Fecha de ingreso");
        jPanel5.add(DCFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 310, 50));

        DCFechaSalida.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DCFechaSalida.setPlaceholder("Fecha de Salida");
        jPanel5.add(DCFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 310, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Sexo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Estado Civil:");

        JRBFemenino.setBackground(new java.awt.Color(255, 255, 255));
        JRBFemenino.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JRBFemenino.setText("Femenino");

        JRBMasculino.setBackground(new java.awt.Color(255, 255, 255));
        JRBMasculino.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JRBMasculino.setText("Masculino");

        JRBSoltero.setBackground(new java.awt.Color(255, 255, 255));
        JRBSoltero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JRBSoltero.setText("Soltero");

        JRBCasado.setBackground(new java.awt.Color(255, 255, 255));
        JRBCasado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JRBCasado.setText("Casado");

        JRBAcompañado.setBackground(new java.awt.Color(255, 255, 255));
        JRBAcompañado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JRBAcompañado.setText("Acompañado");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBSoltero)
                    .addComponent(JRBFemenino))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBMasculino)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(JRBCasado)
                        .addGap(39, 39, 39)
                        .addComponent(JRBAcompañado)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JRBFemenino)
                    .addComponent(JRBMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JRBSoltero)
                    .addComponent(JRBCasado)
                    .addComponent(JRBAcompañado))
                .addContainerGap())
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 570, 90));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Nacionalidad:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Fecha de Ingreso:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Fecha de Salida:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));
        jPanel5.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));
        jPanel5.add(CBNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 310, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        rSPanelShadow2.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rSPanelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rSPanelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    Cerrar();
                } else {
                    i -= 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_cerrarActionPerformed


    private void MBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBLimpiarActionPerformed
        limpiarCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_MBLimpiarActionPerformed

    private void MBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBRegistrarActionPerformed
        if (this.txtNombre.getText().isEmpty() || this.txtIdentificacion.getText().isEmpty()
                || this.txtProfesion.getText().isEmpty() || this.txtMailInterno.getText().isEmpty()
                || this.txtMailPersonal.getText().isEmpty() || this.CBNacionalidad.getSelectedIndex() == 0
                || this.DCFechaNac.getDatoFecha() == null || this.DCFechaIngreso.getDatoFecha() == null
                || this.DCFechaSalida.getDatoFecha() == null) {

            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("OOPS...");
            er.msj.setText("FALTAN CAMPOS DE LLENAR");
            er.msj1.setText("");
            er.setVisible(true);

        } else {
            if (this.MBRegistrar.getText().equals("GUARDAR")) {
                if (Opciones.verificaEmpleado(this.txtNombre.getText())
                        && !this.txtNombre.getText().equals(this.nombreEmp.getText())) {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    er.titulo.setText("OOPS...");
                    er.msj.setText("EL NOMBRE DEL EMPLEADO YA EXISTE");
                    er.msj1.setText("");
                    er.setVisible(true);
                } else {
                    Sentencias s = new Sentencias();
                    s.setCodigoE(Integer.parseInt(this.id.getText()));
                    s.setNombre(this.txtNombre.getText());
                    s.setProfesion(this.txtProfesion.getText());
                    s.setMailInterno(this.txtMailInterno.getText());
                    s.setIdentificacion(this.txtIdentificacion.getText());
                    s.setMailPersonal(this.txtMailPersonal.getText());

                    if (this.JRBFemenino.isSelected()) {
                        s.setSexo(this.JRBFemenino.getText());
                    } else if (this.JRBMasculino.isSelected()) {
                        s.setSexo(this.JRBMasculino.getText());
                    }

                    if (this.JRBSoltero.isSelected()) {
                        s.setEstadoCivil(this.JRBSoltero.getText());
                    } else if (this.JRBCasado.isSelected()) {
                        s.setEstadoCivil(this.JRBCasado.getText());
                    } else if (this.JRBAcompañado.isSelected()) {
                        s.setEstadoCivil(this.JRBAcompañado.getText());
                    }

                    s.setNacionalidad(this.CBNacionalidad.getSelectedItem().toString());
                    s.setFechaNacimiento(this.DCFechaNac.getDatoFecha());
                    s.setFechaIngreso(this.DCFechaIngreso.getDatoFecha());
                    s.setFechaSalida(this.DCFechaSalida.getDatoFecha());

                    int opcion = Opciones.actualizar(s);

                    if (opcion != 0) {
                        SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                        sa.titulo.setText("¡HECHO!");
                        sa.msj.setText("SE HAN GUARDADO LOS CAMBIOS");
                        sa.msj1.setText("");
                        sa.setVisible(true);
                    } else {
                        ErrorAlert er = new ErrorAlert(new JFrame(), true);
                        er.titulo.setText("OOPS...");
                        er.msj.setText("OCURRIÓ UN ERROR AL ACTUALIZAR");
                        er.msj1.setText("");
                        er.setVisible(true);
                    }
                }
            } else {
                Sentencias v = new Sentencias();
                v.setNombre(this.txtNombre.getText());
                v.setProfesion(this.txtProfesion.getText());
                v.setMailInterno(this.txtMailInterno.getText());
                v.setIdentificacion(this.txtIdentificacion.getText());
                v.setMailPersonal(this.txtMailPersonal.getText());

                if (this.JRBFemenino.isSelected()) {
                    v.setSexo(this.JRBFemenino.getText());
                } else if (this.JRBMasculino.isSelected()) {
                    v.setSexo(this.JRBMasculino.getText());
                }

                if (this.JRBSoltero.isSelected()) {
                    v.setEstadoCivil(this.JRBSoltero.getText());
                } else if (this.JRBCasado.isSelected()) {
                    v.setEstadoCivil(this.JRBCasado.getText());
                } else if (this.JRBAcompañado.isSelected()) {
                    v.setEstadoCivil(this.JRBAcompañado.getText());
                }

                v.setNacionalidad(this.CBNacionalidad.getSelectedItem().toString());
                v.setFechaNacimiento(this.DCFechaNac.getDatoFecha());
                v.setFechaIngreso(this.DCFechaIngreso.getDatoFecha());
                v.setFechaSalida(this.DCFechaSalida.getDatoFecha());

                int op = Opciones.registrar(v);

                if (op != 0) {
                    limpiarCampos();
                    SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                    sa.titulo.setText("¡HECHO!");
                    sa.msj.setText("SE HA REGISTRADO UN NUEVO USUARIO");
                    sa.msj1.setText("");
                    sa.setVisible(true);
                } else {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    er.titulo.setText("OOPS...");
                    er.msj.setText("OCURRIÓ UN ERROR AL REGISTRAR");
                    er.msj1.setText("");
                    er.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_MBRegistrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    i += 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_formWindowOpened

    private void MBRegistrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MBRegistrarKeyTyped

        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            if (this.txtNombre.equals("") || this.txtIdentificacion.equals("")
                    || this.txtProfesion.equals("") || this.txtMailInterno.equals("") || this.txtMailPersonal.equals("")
                    || this.CBNacionalidad.getSelectedIndex() == 0 || this.DCFechaNac.getDatoFecha() == null || this.DCFechaIngreso.getDatoFecha().equals(null) || this.DCFechaSalida.equals(null)) {

                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                er.titulo.setText("OOPS...");
                er.msj.setText("FALTAN CAMPOS DE LLENAR");
                er.msj1.setText("");
                er.setVisible(true);

            } else {
                if (this.MBRegistrar.getText().equals("GUARDAR")) {
                    if (Opciones.verificaEmpleado(this.txtNombre.getText())
                            && !this.txtNombre.getText().equals(this.nombreEmp.getText())) {
                        ErrorAlert er = new ErrorAlert(new JFrame(), true);
                        er.titulo.setText("OOPS...");
                        er.msj.setText("EL NOMBRE DEL EMPLEADO");
                        er.msj1.setText("YA ÉXISTE");
                        er.setVisible(true);
                    } else {
                        Sentencias s = new Sentencias();

                        s.setCodigoE(Integer.parseInt(this.id.getText()));
                        s.setNombre(this.txtNombre.getText());
                        s.setProfesion(this.txtProfesion.getText());
                        s.setMailInterno(this.txtMailInterno.getText());
                        s.setIdentificacion(this.txtIdentificacion.getText());
                        s.setMailPersonal(this.txtMailPersonal.getText());
                        if (this.JRBFemenino.isSelected()) {
                            s.setSexo(this.JRBFemenino.getText());
                        } else {
                            if (this.JRBMasculino.isSelected()) {
                                s.setSexo(this.JRBMasculino.getText());
                            }
                        }

                        if (this.JRBSoltero.isSelected()) {
                            s.setEstadoCivil(this.JRBSoltero.getText());
                        } else {
                            if (this.JRBCasado.isSelected()) {
                                s.setEstadoCivil(this.JRBCasado.getText());
                            } else {
                                if (this.JRBAcompañado.isSelected()) {
                                    s.setEstadoCivil(this.JRBAcompañado.getText());
                                }
                            }
                        }
                        s.setNacionalidad(this.CBNacionalidad.getSelectedItem().toString());
                        s.setFechaNacimiento(this.DCFechaNac.getDatoFecha());
                        s.setFechaIngreso(this.DCFechaIngreso.getDatoFecha());
                        s.setFechaSalida(this.DCFechaSalida.getDatoFecha());

                        int opcion = Opciones.actualizar(s);
                        if (opcion != 0) {
                            SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                            sa.titulo.setText("¡HECHO!");
                            sa.msj.setText("SE HAN GUARDADO LOS CAMBIOS");
                            sa.msj1.setText("");
                            sa.setVisible(true);
                        } else {
                            if (Opciones.verificaEmpleado(this.txtNombre.getText())) {
                                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                                er.titulo.setText("OOPS...");
                                er.msj.setText("EL NOMBRE DE USUARIO");
                                er.msj1.setText("YA ÉXISTE");
                                er.setVisible(true);
                            } else {
                                Sentencias v = new Sentencias();
                                v.setCodigoE(Integer.parseInt(this.id.getText()));
                                v.setNombre(this.txtNombre.getText());
                                v.setProfesion(this.txtProfesion.getText());
                                v.setMailInterno(this.txtMailInterno.getText());
                                v.setIdentificacion(this.txtIdentificacion.getText());
                                v.setMailPersonal(this.txtMailPersonal.getText());
                                if (this.JRBFemenino.isSelected()) {
                                    v.setSexo(this.JRBFemenino.getText());
                                } else {
                                    if (this.JRBMasculino.isSelected()) {
                                        v.setSexo(this.JRBMasculino.getText());
                                    }
                                }

                                if (this.JRBSoltero.isSelected()) {
                                    v.setEstadoCivil(this.JRBSoltero.getText());
                                } else {
                                    if (this.JRBCasado.isSelected()) {
                                        v.setEstadoCivil(this.JRBCasado.getText());
                                    } else {
                                        if (this.JRBAcompañado.isSelected()) {
                                            v.setEstadoCivil(this.JRBAcompañado.getText());
                                        }
                                    }
                                }
                                v.setNacionalidad(this.CBNacionalidad.getSelectedItem().toString());
                                v.setFechaNacimiento(this.DCFechaNac.getDatoFecha());
                                v.setFechaIngreso(this.DCFechaIngreso.getDatoFecha());
                                v.setFechaSalida(this.DCFechaSalida.getDatoFecha());
                                int op = Opciones.registrar(v);
                                if (op != 0) {
                                    limpiarCampos();
                                    SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                                    sa.titulo.setText("¡HECHO!");
                                    sa.msj.setText("SE HA REGISTRADO UN");
                                    sa.msj1.setText("NUEVO USUARIO");
                                    sa.setVisible(true);
                                }
                            }
                        }
                    }

                }
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_MBRegistrarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModalUsuario dialog = new ModalUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojerusan.RSComboBox CBNacionalidad;
    public static rojeru_san.rsdate.RSDateChooser DCFechaIngreso;
    public static rojeru_san.rsdate.RSDateChooser DCFechaNac;
    public static rojeru_san.rsdate.RSDateChooser DCFechaSalida;
    public static javax.swing.JRadioButton JRBAcompañado;
    public static javax.swing.JRadioButton JRBCasado;
    public static javax.swing.JRadioButton JRBFemenino;
    public static javax.swing.JRadioButton JRBMasculino;
    public static javax.swing.JRadioButton JRBSoltero;
    private necesario.MaterialButton MBLimpiar;
    public static necesario.MaterialButton MBRegistrar;
    private principal.MaterialButton cerrar;
    private javax.swing.Box.Filler filler1;
    public static javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jtf;
    private rojeru_san.efectos.MaterialShadowRectangle materialShadowRectangle1;
    public static javax.swing.JLabel nombreEmp;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow2;
    public static javax.swing.JLabel titulo;
    public static app.bolivia.swing.JCTextField txtIdentificacion;
    public static app.bolivia.swing.JCTextField txtMailInterno;
    public static app.bolivia.swing.JCTextField txtMailPersonal;
    public static app.bolivia.swing.JCTextField txtNombre;
    public static app.bolivia.swing.JCTextField txtProfesion;
    // End of variables declaration//GEN-END:variables
}
