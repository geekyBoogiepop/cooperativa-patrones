/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsignarRol;

import alertas.principal.AWTUtilities;
import java.util.Timer;
import java.util.TimerTask;
import alertas.principal.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Latitude
 */
public class ModalAsignarRol extends javax.swing.JDialog {
    CargarCombo carga = new CargarCombo();
    Timer timer = null;
    TimerTask task;
    int i = 32;
    /**
     * Creates new form AsignarRol
     */
    public ModalAsignarRol(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
        initComponents();
        this.CBRol.removeAllItems();
        this.CBEmpleado.removeAllItems();
        carga.consultarRoles(CBRol);
        carga.consultarEmpleados(CBEmpleado);
        this.setLocationRelativeTo(null);
        
    }
 private void limpiarCampos() {

        this.txtUsuario.requestFocus();
        this.txtClave.setText("");
        this.CBRol.setSelectedIndex(0);
        this.CBEmpleado.setSelectedIndex(0);

    }

    private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new org.edisoncor.gui.panel.Panel();
        jPanel2 = new javax.swing.JPanel();
        cerrar = new principal.MaterialButton();
        titulo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        limpiar = new principal.MaterialButton();
        registrar = new principal.MaterialButton();
        id = new javax.swing.JLabel();
        DCFechaInicio = new rojeru_san.rsdate.RSDateChooser();
        DCFechaFin = new rojeru_san.rsdate.RSDateChooser();
        txtUsuario = new app.bolivia.swing.JCTextField();
        txtClave = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBEmpleado = new rojerusan.RSComboBox();
        CBRol = new rojerusan.RSComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alertas/img/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));

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

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("TITULO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 10, 620, 80));

        jPanel6.setBackground(new java.awt.Color(58, 159, 171));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setForeground(new java.awt.Color(58, 159, 171));
        limpiar.setText("LIMPIAR CAMPOS");
        limpiar.setToolTipText("<html> <head> <style> #contenedor{background:#3A9FAB;color:white; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Limpiar campos</h4> </body> </html>");
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel6.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 160, 50));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setForeground(new java.awt.Color(58, 159, 171));
        registrar.setText("REGISTRAR");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        registrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registrarKeyTyped(evt);
            }
        });
        jPanel6.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 170, 50));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("id");
        jPanel6.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 30, -1));

        panel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 630, 110));

        DCFechaInicio.setFuente(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DCFechaInicio.setPlaceholder("Fecha de Inicio");
        panel1.add(DCFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        DCFechaFin.setEnabled(false);
        DCFechaFin.setFuente(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DCFechaFin.setPlaceholder("Fecha de Fin");
        panel1.add(DCFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        txtUsuario.setForeground(new java.awt.Color(58, 159, 171));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtUsuario.setPlaceholder("Nombre de usuario");
        panel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        txtClave.setForeground(new java.awt.Color(58, 159, 171));
        txtClave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtClave.setPlaceholder("Clave de usuario");
        panel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Nombre del empleado:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Rol:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nombre de usuario:");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Clave de usuario:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        panel1.add(CBEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        panel1.add(CBRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (this.txtUsuario.getText().equals("") || this.txtClave.getText().equals("")
            || this.CBEmpleado.getSelectedIndex() == 0 || this.CBRol.getSelectedIndex()==0 
                || this.DCFechaInicio.getDatoFecha()!= null || this.DCFechaFin.getDatoFecha()!= null) {

            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("OOPS...");
            er.msj.setText("FALTAN CAMPOS DE LLENAR");
            er.msj1.setText("");
            er.setVisible(true);

        } else {
            if (this.txtClave.getText().length() <= 7) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                er.titulo.setText("OOPS...");
                er.msj.setText("LA CONTRASEÑA DEBE CONTENER");
                er.msj1.setText("MINIMO 8 CARACTERES");
                er.setVisible(true);
            } else {

                if (this.registrar.getText().equals("GUARDAR")) {

                    if (Opciones.verificaUsuario(this.txtUsuario.getText())
                        ) {
                        ErrorAlert er = new ErrorAlert(new JFrame(), true);
                        er.titulo.setText("OOPS...");
                        er.msj.setText("EL NOMBRE DE USUARIO");
                        er.msj1.setText("YA ÉXISTE");
                        er.setVisible(true);
                    } else {
                        Sentencias s = new Sentencias();

                        s.setUsuario(this.txtUsuario.getText());
                        s.setClave(this.txtClave.getText());
                        s.setCodigoEmp(Integer.parseInt(this.CBEmpleado.getSelectedItem().toString()));
                        s.setCodigo(Integer.parseInt(this.id.getText()));
                        s.setCodigoRol(Integer.parseInt(this.CBRol.getSelectedItem().toString()));
                        s.setFechaInicio(this.DCFechaInicio.getDatoFecha());
                        s.setFechaFin(this.DCFechaFin.getDatoFecha());
                        int opcion = Opciones.actualizar(s);
                        if (opcion != 0) {
                            
                            SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                            sa.titulo.setText("¡HECHO!");
                            sa.msj.setText("SE HAN GUARDADO LOS CAMBIOS");
                            sa.msj1.setText("");
                            sa.setVisible(true);
                        }
                    }
                } else {
                    if (Opciones.verificaUsuario(this.txtUsuario.getText())) {
                        ErrorAlert er = new ErrorAlert(new JFrame(), true);
                        er.titulo.setText("OOPS...");
                        er.msj.setText("EL NOMBRE DE USUARIO");
                        er.msj1.setText("YA ÉXISTE");
                        er.setVisible(true);
                    } else {
                        Sentencias s = new Sentencias();

                        s.setUsuario(this.txtUsuario.getText());
                        s.setClave(this.txtClave.getText());
                        s.setCodigoEmp(Integer.parseInt(this.CBEmpleado.getSelectedItem().toString()));
                        s.setCodigo(Integer.parseInt(this.id.getText()));
                        s.setCodigoRol(Integer.parseInt(this.CBRol.getSelectedItem().toString()));
                        s.setFechaInicio(this.DCFechaInicio.getDatoFecha());
                        s.setFechaFin(this.DCFechaFin.getDatoFecha());

                        int opcion = Opciones.registrar(s);
                        if (opcion != 0) {
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
    }//GEN-LAST:event_registrarActionPerformed

    private void registrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarKeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            if (this.txtUsuario.getText().equals("") || this.txtClave.getText().equals("")
            || this.CBEmpleado.getSelectedIndex() == 0 || this.CBRol.getSelectedIndex()==0 
                || this.DCFechaInicio.getDatoFecha()!= null || this.DCFechaFin.getDatoFecha()!= null) {

            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("OOPS...");
            er.msj.setText("FALTAN CAMPOS DE LLENAR");
            er.msj1.setText("");
            er.setVisible(true);

        } else {
            if (this.txtClave.getText().length() <= 7) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                er.titulo.setText("OOPS...");
                er.msj.setText("LA CONTRASEÑA DEBE CONTENER");
                er.msj1.setText("MINIMO 8 CARACTERES");
                er.setVisible(true);
            } else {

                if (this.registrar.getText().equals("GUARDAR")) {

                    if (Opciones.verificaUsuario(this.txtUsuario.getText())
                        ) {
                        ErrorAlert er = new ErrorAlert(new JFrame(), true);
                        er.titulo.setText("OOPS...");
                        er.msj.setText("EL NOMBRE DE USUARIO");
                        er.msj1.setText("YA ÉXISTE");
                        er.setVisible(true);
                    } else {
                        Sentencias s = new Sentencias();

                        s.setUsuario(this.txtUsuario.getText());
                        s.setClave(this.txtClave.getText());
                        s.setCodigoEmp(Integer.parseInt(this.CBEmpleado.getSelectedItem().toString()));
                        s.setCodigo(Integer.parseInt(this.id.getText()));
                        s.setCodigoRol(Integer.parseInt(this.CBRol.getSelectedItem().toString()));
                        s.setFechaInicio(this.DCFechaInicio.getDatoFecha());
                        s.setFechaFin(this.DCFechaFin.getDatoFecha());
                        int opcion = Opciones.actualizar(s);
                        if (opcion != 0) {
                            
                            SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                            sa.titulo.setText("¡HECHO!");
                            sa.msj.setText("SE HAN GUARDADO LOS CAMBIOS");
                            sa.msj1.setText("");
                            sa.setVisible(true);
                        }
                    }
                } else {
                    if (Opciones.verificaUsuario(this.txtUsuario.getText())) {
                        ErrorAlert er = new ErrorAlert(new JFrame(), true);
                        er.titulo.setText("OOPS...");
                        er.msj.setText("EL NOMBRE DE USUARIO");
                        er.msj1.setText("YA ÉXISTE");
                        er.setVisible(true);
                    } else {
                        Sentencias s = new Sentencias();

                        s.setUsuario(this.txtUsuario.getText());
                        s.setClave(this.txtClave.getText());
                        s.setCodigoEmp(Integer.parseInt(this.CBEmpleado.getSelectedItem().toString()));
                        s.setCodigo(Integer.parseInt(this.id.getText()));
                        s.setCodigoRol(Integer.parseInt(this.CBRol.getSelectedItem().toString()));
                        s.setFechaInicio(this.DCFechaInicio.getDatoFecha());
                        s.setFechaFin(this.DCFechaFin.getDatoFecha());

                        int opcion = Opciones.registrar(s);
                        if (opcion != 0) {
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
    }//GEN-LAST:event_registrarKeyTyped

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
            java.util.logging.Logger.getLogger(ModalAsignarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModalAsignarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModalAsignarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModalAsignarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModalAsignarRol dialog = new ModalAsignarRol(new javax.swing.JFrame(), true);
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
    private rojerusan.RSComboBox CBEmpleado;
    private rojerusan.RSComboBox CBRol;
    private rojeru_san.rsdate.RSDateChooser DCFechaFin;
    private rojeru_san.rsdate.RSDateChooser DCFechaInicio;
    private principal.MaterialButton cerrar;
    public static javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private principal.MaterialButton limpiar;
    private org.edisoncor.gui.panel.Panel panel1;
    public static principal.MaterialButton registrar;
    public static javax.swing.JLabel titulo;
    private app.bolivia.swing.JCTextField txtClave;
    private app.bolivia.swing.JCTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
