package vista;

import DAO.FarmaciaDAO;
import VO.FarmaciaVO;

public class JRegistrarFarmacia extends javax.swing.JFrame {

    public JRegistrarFarmacia() {
        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        //Cierra solo el JFrame y no todo el programa
        setDefaultCloseOperation(JRegistrarFarmacia.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtFLocalidad = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFCodPostal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFTel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtFEmail = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtFDirec = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtFMotivo = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();

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

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chant\\Documents\\NetBeansProjects\\FarmaciaIS\\src\\main\\java\\resources\\icon_add.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 30, 20));

        btnCancelar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 160, 50));

        btnGuardar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 160, 50));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 39, 49));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 20));

        txtFNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtFNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFNombre.setForeground(new java.awt.Color(0, 0, 0));
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

        txtFLocalidad.setBackground(new java.awt.Color(255, 255, 255));
        txtFLocalidad.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFLocalidad.setForeground(new java.awt.Color(0, 0, 0));
        txtFLocalidad.setAlignmentX(0.0F);
        txtFLocalidad.setAlignmentY(0.0F);
        txtFLocalidad.setBorder(null);
        txtFLocalidad.setOpaque(false);
        txtFLocalidad.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFLocalidad.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 230, 30));

        txtProvincia.setBackground(new java.awt.Color(255, 255, 255));
        txtProvincia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtProvincia.setForeground(new java.awt.Color(0, 0, 0));
        txtProvincia.setAlignmentX(0.0F);
        txtProvincia.setAlignmentY(0.0F);
        txtProvincia.setBorder(null);
        txtProvincia.setOpaque(false);
        txtProvincia.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtProvincia.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 250, 10));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(22, 39, 49));
        jLabel6.setText("Provincia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 20));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(22, 39, 49));
        jLabel7.setText("Código postal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 20));

        txtFCodPostal.setBackground(new java.awt.Color(255, 255, 255));
        txtFCodPostal.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFCodPostal.setForeground(new java.awt.Color(0, 0, 0));
        txtFCodPostal.setAlignmentX(0.0F);
        txtFCodPostal.setAlignmentY(0.0F);
        txtFCodPostal.setBorder(null);
        txtFCodPostal.setOpaque(false);
        txtFCodPostal.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFCodPostal.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 230, 30));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(22, 39, 49));
        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 20));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(22, 39, 49));
        jLabel9.setText("E-Mail");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 20));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(22, 39, 49));
        jLabel10.setText("Teléfono");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, 20));

        txtFTel.setBackground(new java.awt.Color(255, 255, 255));
        txtFTel.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFTel.setForeground(new java.awt.Color(0, 0, 0));
        txtFTel.setAlignmentX(0.0F);
        txtFTel.setAlignmentY(0.0F);
        txtFTel.setBorder(null);
        txtFTel.setOpaque(false);
        txtFTel.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFTel.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 230, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 250, 10));

        txtFEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtFEmail.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtFEmail.setAlignmentX(0.0F);
        txtFEmail.setAlignmentY(0.0F);
        txtFEmail.setBorder(null);
        txtFEmail.setOpaque(false);
        txtFEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFEmail.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 230, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 250, 10));

        txtFDirec.setBackground(new java.awt.Color(255, 255, 255));
        txtFDirec.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFDirec.setForeground(new java.awt.Color(0, 0, 0));
        txtFDirec.setAlignmentX(0.0F);
        txtFDirec.setAlignmentY(0.0F);
        txtFDirec.setBorder(null);
        txtFDirec.setOpaque(false);
        txtFDirec.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFDirec.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 230, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 250, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 250, 10));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(22, 39, 49));
        jLabel11.setText("Motivo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, 20));

        txtFMotivo.setBackground(new java.awt.Color(255, 255, 255));
        txtFMotivo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtFMotivo.setForeground(new java.awt.Color(0, 0, 0));
        txtFMotivo.setAlignmentX(0.0F);
        txtFMotivo.setAlignmentY(0.0F);
        txtFMotivo.setBorder(null);
        txtFMotivo.setOpaque(false);
        txtFMotivo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFMotivo.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 230, 30));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 250, 10));

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        //cierra la ventana del jframe
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //registra los datos cargados
        FarmaciaVO FarmVo = new FarmaciaVO();
        FarmaciaDAO FarmDAO = new FarmaciaDAO();
        //la instancia toma los datos cargados en los jtext
        FarmVo.setNombre(txtFNombre.getText());
        FarmVo.setDireccion(txtFDirec.getText());
        FarmVo.setEMail(txtFEmail.getText());
        FarmVo.setTelefono(Integer.parseInt(txtFTel.getText()));
        FarmVo.setId_Localidad(Integer.parseInt(txtFLocalidad.getText()));
        FarmVo.setId_Motivo(Integer.parseInt(txtFMotivo.getText()));
        FarmVo.setId_Estado(1);
        //llama a la funcion en el DAO que se conecta con la BD para cargar dichos datos
        FarmDAO.Agregar_FarmaciaVO(FarmVo);
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtFCodPostal;
    private javax.swing.JTextField txtFDirec;
    private javax.swing.JTextField txtFEmail;
    private javax.swing.JTextField txtFLocalidad;
    private javax.swing.JTextField txtFMotivo;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JTextField txtFTel;
    private javax.swing.JTextField txtProvincia;
    // End of variables declaration//GEN-END:variables
}
