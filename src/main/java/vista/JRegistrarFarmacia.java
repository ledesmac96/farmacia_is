package vista;

import DAO.FarmaciaDAO;
import DAO.LocalidadDAO;
import DAO.RegionDAO;
import VO.FarmaciaVO;

public class JRegistrarFarmacia extends javax.swing.JFrame {

    public JRegistrarFarmacia() {
        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        
        RegionDAO RDAO = new RegionDAO();
        RDAO.Consultar_Region(jComboBoxProvincia);
        
        LocalidadDAO LDAO = new LocalidadDAO();
        LDAO.Consultar_Localidad(jComboBoxLocalidad);
        
        //Cierra solo el JFrame y no todo el programa
        setDefaultCloseOperation(JRegistrarFarmacia.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFTel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtFEmail = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtFDirec = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jComboBoxProvincia = new javax.swing.JComboBox<>();
        jComboBoxLocalidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(22, 39, 49));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 39, 49));
        jLabel1.setText("Registrar Farmacia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 30, 20));

        btnGuardar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 160, 50));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 39, 49));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 20));

        txtFNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFNombre.setAlignmentX(0.0F);
        txtFNombre.setAlignmentY(0.0F);
        txtFNombre.setBorder(null);
        txtFNombre.setOpaque(false);
        txtFNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 250, 10));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(22, 39, 49));
        jLabel5.setText("Localidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 250, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 250, 10));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(22, 39, 49));
        jLabel6.setText("Provincia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 20));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 39, 49));
        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 20));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 39, 49));
        jLabel9.setText("E-Mail");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, 20));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(22, 39, 49));
        jLabel10.setText("Teléfono");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 20));

        txtFTel.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFTel.setAlignmentX(0.0F);
        txtFTel.setAlignmentY(0.0F);
        txtFTel.setBorder(null);
        txtFTel.setOpaque(false);
        txtFTel.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFTel.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtFTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFTelActionPerformed(evt);
            }
        });
        jPanel1.add(txtFTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 230, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 250, 10));

        txtFEmail.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFEmail.setAlignmentX(0.0F);
        txtFEmail.setAlignmentY(0.0F);
        txtFEmail.setBorder(null);
        txtFEmail.setOpaque(false);
        txtFEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFEmail.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 230, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 250, 10));

        txtFDirec.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFDirec.setAlignmentX(0.0F);
        txtFDirec.setAlignmentY(0.0F);
        txtFDirec.setBorder(null);
        txtFDirec.setOpaque(false);
        txtFDirec.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFDirec.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 230, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 250, 10));

        jPanel1.add(jComboBoxProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 240, -1));

        jPanel1.add(jComboBoxLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //registra los datos cargados
        FarmaciaVO FarmVo = new FarmaciaVO();
        FarmaciaDAO FarmDAO = new FarmaciaDAO();
        //la instancia toma los datos cargados en los jtext
        FarmVo.setNombre(txtFNombre.getText());
        
        //Integer Id_P = jComboBoxProvincia.getSelectedIndex(); no me interesa guardar la region o
        //la provincia porque ya en la localidad tengo el id que va vincular la provincia
                                
        FarmVo.setDireccion(txtFDirec.getText());
        FarmVo.setEMail(txtFEmail.getText());
        FarmVo.setTelefono(Integer.parseInt(txtFTel.getText()));
        
        Integer Id_L = jComboBoxLocalidad.getSelectedIndex();
        FarmVo.setId_Localidad(Id_L);
        
        //FarmVo.setId_Motivo(Integer.parseInt(txtFMotivo.getText()));
        
        FarmVo.setId_Estado(2);
        //llama a la funcion en el DAO que se conecta con la BD para cargar dichos datos
        FarmDAO.Agregar_FarmaciaVO(FarmVo);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtFTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFTelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboBoxLocalidad;
    private javax.swing.JComboBox<String> jComboBoxProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtFDirec;
    private javax.swing.JTextField txtFEmail;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JTextField txtFTel;
    // End of variables declaration//GEN-END:variables
}
