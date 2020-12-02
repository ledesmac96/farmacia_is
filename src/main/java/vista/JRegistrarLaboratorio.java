/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import DAO.LaboratorioDAO;
import DAO.LocalidadDAO;
import DAO.RegionDAO;

import VO.LaboratorioVO;

/**
 *
 * @author Chant
 */
public class JRegistrarLaboratorio extends javax.swing.JFrame {

    /**
     * Creates new form JRegistrarFarmacia
     */
    public JRegistrarLaboratorio() {
        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        
        //utiliza 2 combobox para mostrar las provicias y las localidades que se encuentran 
        //registradas en la BD
        RegionDAO RDAO = new RegionDAO();
        RDAO.Consultar_Region(jComboBoxProvincia);
        
        LocalidadDAO LDAO = new LocalidadDAO();
        LDAO.Consultar_Localidad(jComboBoxLocalidad);
        
        //Cierra solo el JFrame y no todo el programa
        setDefaultCloseOperation(JRegistrarFarmacia.DISPOSE_ON_CLOSE);
        
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
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextTelefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jComboBoxProvincia = new javax.swing.JComboBox<>();
        jComboBoxLocalidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(22, 39, 49));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 39, 49));
        jLabel1.setText("Registrar Laboratorio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 30, 20));

        jButton2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 160, 50));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 39, 49));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 20));

        jTextNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextNombre.setAlignmentX(0.0F);
        jTextNombre.setAlignmentY(0.0F);
        jTextNombre.setBorder(null);
        jTextNombre.setOpaque(false);
        jTextNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 230, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 10));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(22, 39, 49));
        jLabel5.setText("E-Mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 250, 10));

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
        jPanel1.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 230, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 250, 10));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(22, 39, 49));
        jLabel6.setText("Dirección");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 40));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 39, 49));
        jLabel7.setText("Localidad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 20));

        jTextDireccion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextDireccion.setAlignmentX(0.0F);
        jTextDireccion.setAlignmentY(0.0F);
        jTextDireccion.setBorder(null);
        jTextDireccion.setOpaque(false);
        jTextDireccion.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextDireccion.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 230, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 250, 10));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 39, 49));
        jLabel8.setText("Teléfono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 250, 20));

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
        jPanel1.add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 230, 30));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 39, 49));
        jLabel9.setText("Provincia");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 250, 10));

        jComboBoxProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProvinciaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 240, -1));

        jPanel1.add(jComboBoxLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //registra los datos cargados
        LaboratorioVO LabVO = new LaboratorioVO();
        LaboratorioDAO LabDAO = new LaboratorioDAO();
        //la instancia toma los datos cargados en los jtext
        
        LabVO.setNombre(jTextNombre.getText());
        
      //Integer Id_P = jComboBoxProvincia.getSelectedIndex(); no me interesa guardar la region o
        //la provincia porque ya en la localidad tengo el id que va vincular la provincia
                                
        LabVO.setDireccion(jTextDireccion.getText());
        LabVO.setE_mail(jTextEmail.getText());
        LabVO.setTelefono(Integer.parseInt(jTextTelefono.getText()));
        
        Integer Id_L = jComboBoxLocalidad.getSelectedIndex();
        LabVO.setId_Localidad(Id_L);//aqui se obtiene el indice en que se encuentra el item seleccionado 
        //en el combobox que es el mismo al id en la tabla. 
                
        LabVO.setId_Estado(2);// el valor 2 corresponde a verdadero en la tabla de estado.
        
        //llama a la funcion en el DAO que se conecta con la BD para cargar dichos datos
        LabDAO.Agregar_LaboratorioVO(LabVO);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    private void jTextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDireccionActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jComboBoxProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProvinciaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxLocalidad;
    private javax.swing.JComboBox<String> jComboBoxProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
