/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Natural;

/**
 *
 * @author criso
 */
public class ModalNatural extends javax.swing.JFrame {

    /**
     * Creates new form ModalNatural
     */
    public ModalNatural() {
        initComponents();
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
        txtNombre1 = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre2 = new app.bolivia.swing.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre3 = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new app.bolivia.swing.JCTextField();
        txtNombre4 = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre5 = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre7 = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre8 = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombre9 = new app.bolivia.swing.JCTextField();
        DCFechaNac = new rojeru_san.rsdate.RSDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtNombre10 = new app.bolivia.swing.JCTextField();
        txtNombre11 = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombre12 = new app.bolivia.swing.JCTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombre13 = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNombre14 = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        txtNombre1.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre1.setPlaceholder("Nombres");
        jPanel5.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 330, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nombres:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        txtNombre2.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre2.setPlaceholder("Nacionalidad");
        jPanel5.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 330, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Nacionalidad:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        txtNombre3.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre3.setPlaceholder("Profesión");
        jPanel5.add(txtNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 330, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Profesión:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        txtNombre.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre.setPlaceholder("Apellido Materno");
        jPanel5.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 330, 40));

        txtNombre4.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre4.setPlaceholder("Nivel Eduacional");
        jPanel5.add(txtNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 330, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Nivel Eduacional:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 20));

        txtNombre5.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre5.setPlaceholder("Estado Civil");
        jPanel5.add(txtNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 330, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Estado Civil:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Fecha Nacimiento:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 20));

        txtNombre7.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre7.setPlaceholder("Tipo Vivienda");
        jPanel5.add(txtNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 330, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Tipo Vivienda:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Número Dependencia:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 20));

        txtNombre8.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre8.setPlaceholder("Número Dependencia");
        jPanel5.add(txtNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 330, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Apellido Paterno:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        txtNombre9.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre9.setPlaceholder("Apellido Paterno");
        jPanel5.add(txtNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 330, 40));

        DCFechaNac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DCFechaNac.setPlaceholder("Fecha de nacimiento");
        jPanel5.add(DCFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 310, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Estado:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, 20));

        txtNombre10.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre10.setPlaceholder("Estado");
        jPanel5.add(txtNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 330, 40));

        txtNombre11.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre11.setPlaceholder("Sector Económico");
        jPanel5.add(txtNombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 330, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Sector Económico:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Actividad Principal:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 20));

        txtNombre12.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre12.setPlaceholder("Actividad Principal:");
        jPanel5.add(txtNombre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 330, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Secundaria Principal:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 20));

        txtNombre13.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre13.setPlaceholder("Secundaria Principal:");
        jPanel5.add(txtNombre13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 330, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Ocupación:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, 20));

        txtNombre14.setForeground(new java.awt.Color(58, 159, 171));
        txtNombre14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNombre14.setPlaceholder("Secundaria Principal:");
        jPanel5.add(txtNombre14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 330, 40));

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

    }//GEN-LAST:event_MBRegistrarActionPerformed

    private void MBRegistrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MBRegistrarKeyTyped

    }//GEN-LAST:event_MBRegistrarKeyTyped

    private void MBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBLimpiarActionPerformed

    }//GEN-LAST:event_MBLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(ModalNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModalNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModalNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModalNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModalNatural().setVisible(true);
            }
        });
    }

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
    public static app.bolivia.swing.JCTextField txtNombre;
    public static app.bolivia.swing.JCTextField txtNombre1;
    public static app.bolivia.swing.JCTextField txtNombre10;
    public static app.bolivia.swing.JCTextField txtNombre11;
    public static app.bolivia.swing.JCTextField txtNombre12;
    public static app.bolivia.swing.JCTextField txtNombre13;
    public static app.bolivia.swing.JCTextField txtNombre14;
    public static app.bolivia.swing.JCTextField txtNombre2;
    public static app.bolivia.swing.JCTextField txtNombre3;
    public static app.bolivia.swing.JCTextField txtNombre4;
    public static app.bolivia.swing.JCTextField txtNombre5;
    public static app.bolivia.swing.JCTextField txtNombre7;
    public static app.bolivia.swing.JCTextField txtNombre8;
    public static app.bolivia.swing.JCTextField txtNombre9;
    // End of variables declaration//GEN-END:variables
}
