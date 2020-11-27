/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import DAO.EstadoDAO;
import DAO.FarmaciaDAO;
import DAO.LocalidadDAO;
import DAO.RegionDAO;
import VO.EstadoVO;
import VO.FarmaciaVO;
import VO.LocalidadVO;
import VO.RegionVO;
import java.time.LocalDate;

/**
 *
 * @author Chant
 */
public class JBMFarmacia extends javax.swing.JFrame {

    /**
     * Creates new form JRegistrarFarmacia
     */
    public JBMFarmacia() {
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
        jButtonGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextLocalidad = new javax.swing.JTextField();
        jTextProvincia = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextCodigoPostal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextEstado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jTextEmail = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextDireccion = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jTextBuscarFarmacia = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(22, 39, 49));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 39, 49));
        jLabel1.setText("Modificar datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 40, 30));

        jButton1.setBackground(new java.awt.Color(215, 52, 56));
        jButton1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 160, 50));

        jButtonGuardar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 160, 50));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 39, 49));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 20));

        jTextNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextNombre.setAlignmentX(0.0F);
        jTextNombre.setAlignmentY(0.0F);
        jTextNombre.setBorder(null);
        jTextNombre.setOpaque(false);
        jTextNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 230, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 250, 10));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(22, 39, 49));
        jLabel5.setText("Localidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 250, 10));

        jTextLocalidad.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextLocalidad.setAlignmentX(0.0F);
        jTextLocalidad.setAlignmentY(0.0F);
        jTextLocalidad.setBorder(null);
        jTextLocalidad.setOpaque(false);
        jTextLocalidad.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextLocalidad.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 230, 30));

        jTextProvincia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextProvincia.setAlignmentX(0.0F);
        jTextProvincia.setAlignmentY(0.0F);
        jTextProvincia.setBorder(null);
        jTextProvincia.setOpaque(false);
        jTextProvincia.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextProvincia.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProvinciaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 230, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 250, 10));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(22, 39, 49));
        jLabel6.setText("Provincia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 20));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 39, 49));
        jLabel7.setText("Código postal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, 20));

        jTextCodigoPostal.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextCodigoPostal.setAlignmentX(0.0F);
        jTextCodigoPostal.setAlignmentY(0.0F);
        jTextCodigoPostal.setBorder(null);
        jTextCodigoPostal.setOpaque(false);
        jTextCodigoPostal.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextCodigoPostal.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 230, 30));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 39, 49));
        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, 20));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 39, 49));
        jLabel9.setText("E-Mail");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, 20));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(22, 39, 49));
        jLabel10.setText("Teléfono");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, 20));

        jTextEstado.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextEstado.setAlignmentX(0.0F);
        jTextEstado.setAlignmentY(0.0F);
        jTextEstado.setBorder(null);
        jTextEstado.setOpaque(false);
        jTextEstado.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextEstado.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 230, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 250, 10));

        jTextEmail.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextEmail.setAlignmentX(0.0F);
        jTextEmail.setAlignmentY(0.0F);
        jTextEmail.setBorder(null);
        jTextEmail.setOpaque(false);
        jTextEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextEmail.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 230, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 250, 10));

        jTextDireccion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextDireccion.setAlignmentX(0.0F);
        jTextDireccion.setAlignmentY(0.0F);
        jTextDireccion.setBorder(null);
        jTextDireccion.setOpaque(false);
        jTextDireccion.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextDireccion.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 230, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 250, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 250, 10));

        jTextBuscarFarmacia.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTextBuscarFarmacia.setAlignmentX(0.0F);
        jTextBuscarFarmacia.setAlignmentY(0.0F);
        jTextBuscarFarmacia.setBorder(null);
        jTextBuscarFarmacia.setOpaque(false);
        jTextBuscarFarmacia.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextBuscarFarmacia.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextBuscarFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarFarmaciaActionPerformed(evt);
            }
        });
        jTextBuscarFarmacia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextBuscarFarmaciaKeyReleased(evt);
            }
        });
        jPanel1.add(jTextBuscarFarmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 230, 30));

        jSeparator9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSeparator9KeyReleased(evt);
            }
        });
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 250, 30));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(22, 39, 49));
        jLabel11.setText("Buscar Farmacia: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 20));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 250, 10));

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(22, 39, 49));
        jLabel13.setText("Estado");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, 20));

        jTextTelefono.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextTelefono.setAlignmentX(0.0F);
        jTextTelefono.setAlignmentY(0.0F);
        jTextTelefono.setBorder(null);
        jTextTelefono.setOpaque(false);
        jTextTelefono.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextTelefono.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 230, 30));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

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

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        FarmaciaVO FVO = new FarmaciaVO();
        FarmaciaDAO FDAO = new FarmaciaDAO();
        FVO.setId_Farmacia(Integer.parseInt(jTextBuscarFarmacia.getText()));
        FVO.setNombre(jTextNombre.getText());
        FVO.setDireccion(jTextDireccion.getText());
        FVO.setEMail(jTextEmail.getText());
        FVO.setTelefono(Integer.parseInt(jTextTelefono.getText()));
        FDAO.Modificar_FarmaciaVO(FVO);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextBuscarFarmaciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarFarmaciaKeyReleased
        // TODO add your handling code here:
       /*no me funciono para cuando vaya tipeando le vaya apareciendo las farmacias
        
        FarmaciaDAO miFD= new FarmaciaDAO();
        FarmaciaVO miFVO = new FarmaciaVO();
        
        EstadoVO miEVO = new EstadoVO();
        EstadoDAO miEDAO = new EstadoDAO();
        
        LocalidadVO miLVO = new LocalidadVO();
        LocalidadDAO miLDAO= new LocalidadDAO();
        
        int idmotivo;
        int idlocalidad;
        int idestado;
        
        String texto = jTextBuscarFarmacia.getText();
        
        miFVO = miFD.Buscar_FarmaciaVO_Ingreso_Texto(texto);
        
        idlocalidad = miFVO.getId_Localidad();
       
        idestado = miFVO.getId_Estado();
        
        
        jTextNombre.setText(miFVO.getNombre());
        jTextDireccion.setText(miFVO.getDireccion());
        jTextEmail.setText(miFVO.getEMail());
        jTextTelefono.setText(Integer.toString(miFVO.getTelefono()));
        miLVO = miLDAO.Buscar_LocalidadVO(idlocalidad);
        jTextLocalidad.setText(miLVO.getNombre());
        jTextCodigoPostal.setText(miLVO.getCodp());
        miEVO = miEDAO.Buscar_EstadoVO(idestado);
        jTextEstado.setText(Integer.toString(miEVO.getId_Estado()));
        
        
        
        
        jTextCodigoPostal.setText(miLVO.getCodp());
                */
           
    }//GEN-LAST:event_jTextBuscarFarmaciaKeyReleased

    private void jTextProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextProvinciaActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextBuscarFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarFarmaciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarFarmaciaActionPerformed

    private void jSeparator9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSeparator9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeparator9KeyReleased

    private void jTextEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEstadoActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        Integer id_f = Integer.valueOf(jTextBuscarFarmacia.getText());
        Integer id_l;
        Integer id_m;
        Integer id_e;
        Integer id_r;
          
        
        FarmaciaVO FVO = new FarmaciaVO();
        FarmaciaDAO FDAO = new FarmaciaDAO();
        
        EstadoVO EVO = new EstadoVO();
        EstadoDAO EDAO = new EstadoDAO();
        
        LocalidadVO LVO = new LocalidadVO();
        LocalidadDAO LDAO= new LocalidadDAO();
        
        RegionVO RVO = new RegionVO();
        RegionDAO RDAO= new RegionDAO();
        
        
        FVO = FDAO.Buscar_FarmaciaVO(id_f);
        id_l= FVO.getId_Localidad();
        id_m= FVO.getId_Motivo();
        id_e= FVO.getId_Estado();
        
        LVO = LDAO.Buscar_LocalidadVO(id_l);
        id_r = LVO.getId_Region();
        
        RVO = RDAO.Buscar_RegionVO(id_r);
                
        EVO = EDAO.Buscar_EstadoVO(id_e);
        
        jTextNombre.setText(FVO.getNombre());
        jTextProvincia.setText(RVO.getNombre());
        jTextDireccion.setText(FVO.getDireccion());
        jTextEmail.setText(FVO.getEMail());
        jTextTelefono.setText(Integer.toString(FVO.getTelefono()));
        jTextLocalidad.setText(LVO.getNombre());
        jTextCodigoPostal.setText(LVO.getCodp());
        jTextEstado.setText(Boolean.toString(EVO.isEstado()));
        
       // jButtonGuardar.setEnabled(true);
       // jButtonGuardar.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(JBMFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JBMFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JBMFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JBMFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JBMFarmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextBuscarFarmacia;
    private javax.swing.JTextField jTextCodigoPostal;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEstado;
    private javax.swing.JTextField jTextLocalidad;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextProvincia;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
