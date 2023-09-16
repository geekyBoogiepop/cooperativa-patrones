/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Natural;

import Conexion.ConexionBD;
import alertas.principal.ErrorAlert;
import alertas.principal.SuccessAlert;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author criso
 */
public class ModalNatural extends javax.swing.JFrame {

    static ConexionBD cc = new ConexionBD();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    private Integer codigoSocio;

    /**
     * Creates new form ModalNatural
     */
    public ModalNatural(Integer codigoSocio) {
        initComponents();
        this.codigoSocio = codigoSocio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cerrar = new principal.MaterialButton();
        jPanel4 = new javax.swing.JPanel();
        MBRegistrar = new necesario.MaterialButton();
        MBLimpiar = new necesario.MaterialButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNacionalidad = new app.bolivia.swing.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProfesion = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAmaterno = new app.bolivia.swing.JCTextField();
        txtEducacional = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEstadoCivil = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtVivienda = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDependencia = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        txtApaterno = new app.bolivia.swing.JCTextField();
        DCFechaNac = new rojeru_san.rsdate.RSDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtEstado = new app.bolivia.swing.JCTextField();
        txtSectorEconomico = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtActividadPrincipal = new app.bolivia.swing.JCTextField();
        jLabel15 = new javax.swing.JLabel();
        txtActividadSecundaria = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        txtOcupacion = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(58, 159, 171));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("NATURAL");

        cerrar.setBackground(new java.awt.Color(251, 255, 255));
        cerrar.setForeground(new java.awt.Color(58, 159, 171));
        cerrar.setText("X");
        cerrar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 789, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(58, 159, 171));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray));

        MBRegistrar.setBackground(new java.awt.Color(251, 255, 255));
        MBRegistrar.setForeground(new java.awt.Color(58, 159, 171));
        MBRegistrar.setText("REGISTRAR");
        MBRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        MBLimpiar.setBackground(new java.awt.Color(251, 255, 255));
        MBLimpiar.setForeground(new java.awt.Color(58, 159, 171));
        MBLimpiar.setText("lIMPIAR CAMPOS");
        MBLimpiar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        MBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(MBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        jPanel5.setBorder(dropShadowBorder1);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Apellido Materno:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtNombres.setForeground(new java.awt.Color(58, 159, 171));
        txtNombres.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombres.setPlaceholder("Nombres");
        jPanel5.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 330, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nombres:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        txtNacionalidad.setForeground(new java.awt.Color(58, 159, 171));
        txtNacionalidad.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNacionalidad.setPlaceholder("Nacionalidad");
        jPanel5.add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 330, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Nacionalidad:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        txtProfesion.setForeground(new java.awt.Color(58, 159, 171));
        txtProfesion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtProfesion.setPlaceholder("Profesión");
        jPanel5.add(txtProfesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 330, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Profesión:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        txtAmaterno.setForeground(new java.awt.Color(58, 159, 171));
        txtAmaterno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtAmaterno.setPlaceholder("Apellido Materno");
        jPanel5.add(txtAmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 330, 40));

        txtEducacional.setForeground(new java.awt.Color(58, 159, 171));
        txtEducacional.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtEducacional.setPlaceholder("Nivel Educacional");
        jPanel5.add(txtEducacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 330, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Nivel Educacional:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));

        txtEstadoCivil.setForeground(new java.awt.Color(58, 159, 171));
        txtEstadoCivil.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtEstadoCivil.setPlaceholder("Estado Civil");
        jPanel5.add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 330, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Estado Civil:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Fecha Nacimiento:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 20));

        txtVivienda.setForeground(new java.awt.Color(58, 159, 171));
        txtVivienda.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtVivienda.setPlaceholder("Tipo Vivienda");
        jPanel5.add(txtVivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 330, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Tipo Vivienda:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Número Dependencia:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 20));

        txtDependencia.setForeground(new java.awt.Color(58, 159, 171));
        txtDependencia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtDependencia.setPlaceholder("Número Dependencia");
        jPanel5.add(txtDependencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 330, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Apellido Paterno:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        txtApaterno.setForeground(new java.awt.Color(58, 159, 171));
        txtApaterno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtApaterno.setPlaceholder("Apellido Paterno");
        jPanel5.add(txtApaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 330, 40));

        DCFechaNac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DCFechaNac.setPlaceholder("Fecha de nacimiento");
        jPanel5.add(DCFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 310, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Estado:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, 20));

        txtEstado.setForeground(new java.awt.Color(58, 159, 171));
        txtEstado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtEstado.setPlaceholder("Estado");
        jPanel5.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 330, 40));

        txtSectorEconomico.setForeground(new java.awt.Color(58, 159, 171));
        txtSectorEconomico.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSectorEconomico.setPlaceholder("Sector Económico");
        jPanel5.add(txtSectorEconomico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 330, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Sector Económico:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Actividad Principal:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 20));

        txtActividadPrincipal.setForeground(new java.awt.Color(58, 159, 171));
        txtActividadPrincipal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtActividadPrincipal.setPlaceholder("Actividad Principal:");
        jPanel5.add(txtActividadPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 330, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Actividad Secundaria:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 20));

        txtActividadSecundaria.setForeground(new java.awt.Color(58, 159, 171));
        txtActividadSecundaria.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtActividadSecundaria.setPlaceholder("Actividad Secundaria:");
        jPanel5.add(txtActividadSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 330, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Ocupación:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, 20));

        txtOcupacion.setForeground(new java.awt.Color(58, 159, 171));
        txtOcupacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtOcupacion.setPlaceholder("Ocupacion");
        jPanel5.add(txtOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 654, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void MBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBRegistrarActionPerformed

        String aPaterno = txtApaterno.getText();
        String aMaterno = txtAmaterno.getText();
        String nombres = txtNombres.getText();
        String nacionalidad = txtNacionalidad.getText();
        String profesion = txtProfesion.getText();
        String nivelEducacional = txtEducacional.getText();
        String estadoCivil = txtEstadoCivil.getText();
        String tipoVivienda = txtVivienda.getText();
        String estado = txtEstado.getText();
        String sectorEconomico = txtSectorEconomico.getText();
        String actividadPrincipal = txtActividadPrincipal.getText();
        String actividadSecundaria = txtActividadSecundaria.getText();
        String ocupacion = txtOcupacion.getText();

        if (aPaterno.isEmpty() || aMaterno.isEmpty() || nombres.isEmpty() || nacionalidad.isEmpty()
                || profesion.isEmpty() || nivelEducacional.isEmpty() || estadoCivil.isEmpty() || tipoVivienda.isEmpty()
                || estado.isEmpty() || sectorEconomico.isEmpty() || actividadPrincipal.isEmpty() || actividadSecundaria.isEmpty()
                || ocupacion.isEmpty()) {

            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("Error al ingresar los datos...");
            er.msj.setText("Por favor");
            er.msj1.setText(" complete todos los campos.");
            er.setVisible(true);
        }

        Date fecha = DCFechaNac.getDatoFecha();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaISO = dateFormat.format(fecha);

        try {
            Integer dependencia = Integer.valueOf(txtDependencia.getText());

            String query = "INSERT INTO `natural` (codigoSocio, apellidoPaterno, apellidoMaterno, nombres, nacionalidad, profesion, nivelEducacional, estadoCivil, fechaNacimiento, tipoVivienda, numeroDependencia, estado, sectorEconomico, actividadPrincipal, actividadSecundaria, ocupacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = cn.prepareStatement(query);
            ps.setInt(1, codigoSocio);
            ps.setString(2, aPaterno);
            ps.setString(3, aMaterno);
            ps.setString(4, nombres);
            ps.setString(5, nacionalidad);
            ps.setString(6, profesion);
            ps.setString(7, nivelEducacional);
            ps.setString(8, estadoCivil);
            ps.setString(9, fechaISO);
            ps.setString(10, tipoVivienda);
            ps.setInt(11, dependencia);
            ps.setString(12, estado);
            ps.setString(13, sectorEconomico);
            ps.setString(14, actividadPrincipal);
            ps.setString(15, actividadSecundaria);
            ps.setString(16, ocupacion);
            
            ps.executeUpdate();

            limpiarCampos();
            SuccessAlert sa = new SuccessAlert(new JFrame(), true);
            sa.titulo.setText("¡HECHO!");
            sa.msj.setText("SE HA REGISTRADO");
            sa.msj1.setText("LOS DATOS DEL SOCIO");
            sa.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("Error al ingresar los datos...");
            er.msj.setText("ERROR AL INGRESAR LOS DATOS");
            er.msj1.setText(e.getMessage());
            er.setVisible(true);
        } catch (NumberFormatException e) {
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("Error al ingresar los datos...");
            er.msj.setText("Por favor, ingrese");
            er.msj1.setText("valores numéricos válidos en los campos correspondientes.");
            er.setVisible(true);
        }


    }//GEN-LAST:event_MBRegistrarActionPerformed

    private void MBRegistrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MBRegistrarKeyTyped

    }//GEN-LAST:event_MBRegistrarKeyTyped

    private void MBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_MBLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModalNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModalNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModalNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModalNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModalNatural().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojeru_san.rsdate.RSDateChooser DCFechaNac;
    private necesario.MaterialButton MBLimpiar;
    public static necesario.MaterialButton MBRegistrar;
    private principal.MaterialButton cerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel titulo;
    public static app.bolivia.swing.JCTextField txtActividadPrincipal;
    public static app.bolivia.swing.JCTextField txtActividadSecundaria;
    public static app.bolivia.swing.JCTextField txtAmaterno;
    public static app.bolivia.swing.JCTextField txtApaterno;
    public static app.bolivia.swing.JCTextField txtDependencia;
    public static app.bolivia.swing.JCTextField txtEducacional;
    public static app.bolivia.swing.JCTextField txtEstado;
    public static app.bolivia.swing.JCTextField txtEstadoCivil;
    public static app.bolivia.swing.JCTextField txtNacionalidad;
    public static app.bolivia.swing.JCTextField txtNombres;
    public static app.bolivia.swing.JCTextField txtOcupacion;
    public static app.bolivia.swing.JCTextField txtProfesion;
    public static app.bolivia.swing.JCTextField txtSectorEconomico;
    public static app.bolivia.swing.JCTextField txtVivienda;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txtActividadPrincipal.setText("");
        txtActividadSecundaria.setText("");
        txtAmaterno.setText("");
        txtApaterno.setText("");
        txtDependencia.setText("");
        txtEducacional.setText("");
        txtEstado.setText("");
        txtEstadoCivil.setText("");
        txtNacionalidad.setText("");
        txtNombres.setText("");
        txtOcupacion.setText("");
        txtProfesion.setText("");
        txtSectorEconomico.setText("");
        txtVivienda.setText("");
    }
}
