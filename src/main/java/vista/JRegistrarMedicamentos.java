/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Chant
 */
public class JRegistrarMedicamentos extends javax.swing.JFrame {

    /**
     * Creates new form JRegistrarFarmacia
     */
    public JRegistrarMedicamentos() {
        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jTextField10 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(22, 39, 49));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 39, 49));
        jLabel1.setText("Registrar Medicamento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chant\\Documents\\NetBeansProjects\\FarmaciaIS\\src\\main\\java\\resources\\icon_add.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 30, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chant\\Documents\\NetBeansProjects\\FarmaciaIS\\src\\main\\java\\resources\\icon_search.png")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(22, 39, 49));
        jLabel11.setText("Ingrese ID de Laboratorio: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 250, 10));

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        jTextField9.setAlignmentX(0.0F);
        jTextField9.setAlignmentY(0.0F);
        jTextField9.setBorder(null);
        jTextField9.setOpaque(false);
        jTextField9.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField9.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 230, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(22, 39, 49));
        jLabel3.setText("Datos Medicamentos");
        jLabel3.setAlignmentY(0.0F);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 39, 49));
        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setAlignmentX(0.0F);
        jTextField2.setAlignmentY(0.0F);
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 230, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 250, 10));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(22, 39, 49));
        jLabel5.setText("Detalle");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 90, 10));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setAlignmentX(0.0F);
        jTextField3.setAlignmentY(0.0F);
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jTextField3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField3.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 30));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setAlignmentX(0.0F);
        jTextField4.setAlignmentY(0.0F);
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        jTextField4.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField4.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 230, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 10));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(22, 39, 49));
        jLabel6.setText("Precio");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 39, 49));
        jLabel7.setText("Unidades");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, 20));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setAlignmentX(0.0F);
        jTextField5.setAlignmentY(0.0F);
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        jTextField5.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField5.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 70, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 90, 10));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setAlignmentX(0.0F);
        jTextField6.setAlignmentY(0.0F);
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        jTextField6.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField6.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 230, 30));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 39, 49));
        jLabel8.setText("Nombre Laboratorio");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 20));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 250, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 250, 10));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 39, 49));
        jLabel9.setText("Dirección");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 20));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 250, 10));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(22, 39, 49));
        jLabel10.setText("Teléfono");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 20));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setAlignmentX(0.0F);
        jTextField7.setAlignmentY(0.0F);
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);
        jTextField7.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField7.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 230, 30));

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(22, 39, 49));
        jLabel13.setText("E-Mail");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 20));

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setAlignmentX(0.0F);
        jTextField8.setAlignmentY(0.0F);
        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);
        jTextField8.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField8.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 230, 30));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 250, 10));

        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));
        jTextField10.setAlignmentX(0.0F);
        jTextField10.setAlignmentY(0.0F);
        jTextField10.setBorder(null);
        jTextField10.setOpaque(false);
        jTextField10.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField10.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 230, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 460, 450));

        jButton6.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 160, 50));

        jButton7.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(JRegistrarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRegistrarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRegistrarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRegistrarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRegistrarMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}