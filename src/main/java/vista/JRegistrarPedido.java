/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import DAO.FarmaciaDAO;
import DAO.LocalidadDAO;
import VO.FarmaciaVO;
import VO.LocalidadVO;
import java.util.ArrayList;

/**
 *
 * @author Chant
 */
public class JRegistrarPedido extends javax.swing.JFrame {

    /**
     * Creates new form JRegistrarFarmacia
     */
    public JRegistrarPedido() {
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
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtFBuscarFarm = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnGenFactura = new javax.swing.JButton();
        btnBuscarFarm = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelLoc = new javax.swing.JLabel();
        jLabelDirec = new javax.swing.JLabel();
        jLabelCP = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(22, 39, 49));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 39, 49));
        jLabel1.setText("Registrar pedido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chant\\Documents\\NetBeansProjects\\FarmaciaIS\\src\\main\\java\\resources\\icon_add.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 30, 20));

        jButton1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 120, 30));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 39, 49));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(22, 39, 49));
        jLabel6.setText("Localidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 39, 49));
        jLabel7.setText("Código postal:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 39, 49));
        jLabel8.setText("Dirección:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 39, 49));
        jLabel9.setText("E-Mail:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(22, 39, 49));
        jLabel10.setText("Teléfono:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chant\\Documents\\NetBeansProjects\\FarmaciaIS\\src\\main\\java\\resources\\icon_search.png")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(22, 39, 49));
        jLabel11.setText("Buscar Farmacia: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 250, 10));

        txtFBuscarFarm.setBackground(new java.awt.Color(255, 255, 255));
        txtFBuscarFarm.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtFBuscarFarm.setForeground(new java.awt.Color(0, 0, 0));
        txtFBuscarFarm.setAlignmentX(0.0F);
        txtFBuscarFarm.setAlignmentY(0.0F);
        txtFBuscarFarm.setBorder(null);
        txtFBuscarFarm.setOpaque(false);
        txtFBuscarFarm.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFBuscarFarm.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFBuscarFarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 230, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(22, 39, 49));
        jLabel3.setText("Pedido");
        jLabel3.setAlignmentY(0.0F);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código Med.", "Descripción", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAlignmentX(0.0F);
        jTable1.setAlignmentY(0.0F);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 460, 290));

        jTextField1.setBackground(java.awt.SystemColor.info);
        jTextField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setAlignmentX(0.0F);
        jTextField1.setAlignmentY(0.0F);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 30));
        jTextField1.getAccessibleContext().setAccessibleName("");
        jTextField1.getAccessibleContext().setAccessibleDescription("Código med.");

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cód. Medicamento");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jButton5.setBackground(new java.awt.Color(22, 39, 49));
        jButton5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jButton5.setText("Agregar");
        jButton5.setAlignmentY(0.0F);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 45, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 460, 370));

        jButton4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 120, 30));

        btnGenFactura.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnGenFactura.setText("Imprimir");
        btnGenFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 120, 30));

        btnBuscarFarm.setBackground(new java.awt.Color(22, 39, 49));
        btnBuscarFarm.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnBuscarFarm.setText("Buscar");
        btnBuscarFarm.setAlignmentY(0.0F);
        btnBuscarFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFarmActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarFarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, 20));

        jLabelNombre.setText("jLabel14");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 390, -1));

        jLabelLoc.setText("jLabel14");
        jPanel1.add(jLabelLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, -1));

        jLabelDirec.setText("jLabel14");
        jPanel1.add(jLabelDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 380, -1));

        jLabelCP.setText("jLabel14");
        jPanel1.add(jLabelCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, -1));

        jLabelTel.setText("jLabel14");
        jPanel1.add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 160, -1));

        jLabelEmail.setText("jLabel14");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 400, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnGenFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenFacturaActionPerformed

    private void btnBuscarFarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFarmActionPerformed
        int id = Integer.valueOf(txtFBuscarFarm.getText());
        FarmaciaVO fvos = new FarmaciaVO();
        FarmaciaDAO farmDAO = new FarmaciaDAO();
        LocalidadDAO ldao = new LocalidadDAO();
        fvos = farmDAO.Buscar_FarmaciaVO(id);
        LocalidadVO lvo = ldao.Buscar_LocalidadVO(fvos.getId_Localidad());
        
        jLabelNombre.setText(fvos.getNombre());
        jLabelDirec.setText(fvos.getDireccion());
        jLabelLoc.setText(lvo.getNombre());
        jLabelCP.setText(lvo.getCodp());
        jLabelTel.setText(String.valueOf(fvos.getTelefono()));
        jLabelEmail.setText(fvos.getEMail());
              
    }//GEN-LAST:event_btnBuscarFarmActionPerformed

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
            java.util.logging.Logger.getLogger(JRegistrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRegistrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRegistrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRegistrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JRegistrarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFarm;
    private javax.swing.JButton btnGenFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCP;
    private javax.swing.JLabel jLabelDirec;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelLoc;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtFBuscarFarm;
    // End of variables declaration//GEN-END:variables
}
