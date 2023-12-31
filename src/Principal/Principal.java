/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Cuenta.ModalCuenta;
import Usuarios.ModalUsuario;
import Roles.*;
import Socios.ModalSocio;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import alertas.principal.ErrorAlert;
import alertas.principal.FadeEffect;
import alertas.principal.WarningAlertCerrar;
import alertas.principal.WarningAlertSalir;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Latitude
 */
public class Principal extends javax.swing.JFrame {

    private boolean minimiza = false;
    public static boolean cerra = false;

    /**
     * Creates new form princip
     */
    public Principal() {
        initComponents();

        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        minimizar = new principal.MaterialButton();
        salir = new principal.MaterialButton();
        jLabel1 = new javax.swing.JLabel();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        JPizquierdo = new javax.swing.JPanel();
        BtnUsu = new necesario.RSMaterialButtonCircle();
        BtnUsu1 = new necesario.RSMaterialButtonCircle();
        BtnUsuario = new necesario.RSMaterialButtonCircle();
        BtnRol1 = new necesario.RSMaterialButtonCircle();
        BtnsSocio1 = new necesario.RSMaterialButtonCircle();
        BtnsSocio = new necesario.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(976, 752));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 159, 171), 5));

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));

        minimizar.setForeground(new java.awt.Color(58, 159, 171));
        minimizar.setText("__");
        minimizar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Minimizar</h4> </body> </html>");
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimizar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });

        salir.setForeground(new java.awt.Color(58, 159, 171));
        salir.setText("X");
        salir.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        salir.setAlignmentX(0.5F);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salir.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        salir.setPreferredSize(new java.awt.Dimension(54, 34));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sección de registro y modificación");

        rSPanelImage1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/muñeco_check2.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        JPizquierdo.setBackground(new java.awt.Color(255, 255, 255));

        BtnUsu.setText("MODIFICAR USUARIO");
        BtnUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuActionPerformed(evt);
            }
        });

        BtnUsu1.setText("MODIFICAR  ROL");
        BtnUsu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsu1ActionPerformed(evt);
            }
        });

        BtnUsuario.setText("CREAR USUARIOS");
        BtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioActionPerformed(evt);
            }
        });

        BtnRol1.setText("CREAR ROLES");
        BtnRol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRol1ActionPerformed(evt);
            }
        });

        BtnsSocio1.setText("CREAR CUENTA");
        BtnsSocio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsSocio1ActionPerformed(evt);
            }
        });

        BtnsSocio.setText("CREAR SOCIOS");
        BtnsSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsSocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPizquierdoLayout = new javax.swing.GroupLayout(JPizquierdo);
        JPizquierdo.setLayout(JPizquierdoLayout);
        JPizquierdoLayout.setHorizontalGroup(
            JPizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPizquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnUsu1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnRol1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnsSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnsSocio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        JPizquierdoLayout.setVerticalGroup(
            JPizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPizquierdoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(JPizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRol1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnsSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnsSocio1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPizquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPizquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuActionPerformed
        // TODO add your handling code here:

        ModalUsuario mp = new ModalUsuario(new JFrame(), true);
        mp.titulo.setText("MODIFICAR");
        mp.MBRegistrar.setText("MODIFICAR");
        mp.setVisible(true);
    }//GEN-LAST:event_BtnUsuActionPerformed

    private void BtnsSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsSocioActionPerformed

        ModalSocio ms = new ModalSocio();
        ms.setLocationRelativeTo(null);
        ms.setVisible(true);
    }//GEN-LAST:event_BtnsSocioActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
        wa.titulo.setText("¿ESTAS SEGURO?");
        wa.msj.setText("SE CERRARA LA APLICACIÓN");
        wa.msj1.setText("");
        wa.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        if (this.getExtendedState() != JFrame.ICONIFIED) {
            this.setExtendedState(JFrame.ICONIFIED);
        } else {
            this.setExtendedState(JFrame.NORMAL);
        }
    }//GEN-LAST:event_minimizarActionPerformed


    private void BtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioActionPerformed
        // TODO add your handling code here:

        ModalUsuario mu = new ModalUsuario(new JFrame(), true);
        mu.titulo.setText("REGISTRAR");
        mu.MBRegistrar.setText("REGISTRAR");
        mu.setVisible(true);


    }//GEN-LAST:event_BtnUsuarioActionPerformed

    private void BtnUsu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsu1ActionPerformed
        
        Roles mr;
        try {
            mr = new Roles();
            mr.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_BtnUsu1ActionPerformed

    private void BtnRol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRol1ActionPerformed
        ModalRol mr = new ModalRol(new JFrame(), true);
        mr.titulo.setText("REGISTRAR");
        mr.registrar.setText("REGISTRAR");
        mr.setLocationRelativeTo(null);
        mr.setVisible(true);
    }//GEN-LAST:event_BtnRol1ActionPerformed

    private void BtnsSocio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsSocio1ActionPerformed
        ModalCuenta md = new ModalCuenta(1);
        md.setLocationRelativeTo(null);
        md.setVisible(true);
    }//GEN-LAST:event_BtnsSocio1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.RSMaterialButtonCircle BtnRol1;
    private necesario.RSMaterialButtonCircle BtnUsu;
    private necesario.RSMaterialButtonCircle BtnUsu1;
    private necesario.RSMaterialButtonCircle BtnUsuario;
    private necesario.RSMaterialButtonCircle BtnsSocio;
    private necesario.RSMaterialButtonCircle BtnsSocio1;
    private javax.swing.JPanel JPizquierdo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private principal.MaterialButton minimizar;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private principal.MaterialButton salir;
    // End of variables declaration//GEN-END:variables
}
