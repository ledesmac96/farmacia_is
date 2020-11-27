package vista;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_lat = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JButton();
        iconFarmacias = new javax.swing.JLabel();
        btnFarmacias1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnMedicamentos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnInformes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnLabo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menu_sup = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelOptions = new javax.swing.JPanel();
        optionsFarmacias = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        opRegFarmacia = new javax.swing.JButton();
        opElimFarmacia = new javax.swing.JButton();
        optionsVentas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        opRegPedidos = new javax.swing.JButton();
        opRegFactura = new javax.swing.JButton();
        opGenInformeP = new javax.swing.JButton();
        optionsMedicamentos = new javax.swing.JPanel();
        opRegCompra = new javax.swing.JButton();
        opModfDatosMed = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        optionsLaboratorios = new javax.swing.JPanel();
        opRegLab = new javax.swing.JButton();
        opModfDatosLab = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        optionsInformes = new javax.swing.JPanel();
        opGenInfPrecios = new javax.swing.JButton();
        opRegInfPrecios = new javax.swing.JButton();
        opGenDetalleMes = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        opGenResTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_lat.setToolTipText("Menu lateral");
        menu_lat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setAlignmentY(0.0F);
        menu_lat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, 40));

        btnVentas.setBackground(new java.awt.Color(0, 102, 102));
        btnVentas.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        menu_lat.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 80));

        iconFarmacias.setAlignmentY(0.0F);
        menu_lat.add(iconFarmacias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, 40));

        btnFarmacias1.setBackground(new java.awt.Color(0, 102, 102));
        btnFarmacias1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnFarmacias1.setForeground(new java.awt.Color(255, 255, 255));
        btnFarmacias1.setText("Farmacias");
        btnFarmacias1.setToolTipText("");
        btnFarmacias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmacias1ActionPerformed(evt);
            }
        });
        menu_lat.add(btnFarmacias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 80));

        jLabel5.setAlignmentY(0.0F);
        menu_lat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 40));

        btnMedicamentos.setBackground(new java.awt.Color(0, 102, 102));
        btnMedicamentos.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicamentos.setText("Medicamentos");
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });
        menu_lat.add(btnMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 280, 80));

        jLabel7.setAlignmentY(0.0F);
        menu_lat.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 40, 40));

        btnInformes.setBackground(new java.awt.Color(0, 102, 102));
        btnInformes.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnInformes.setForeground(new java.awt.Color(255, 255, 255));
        btnInformes.setText("Gestión de Informes");
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });
        menu_lat.add(btnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 280, 80));

        jLabel6.setAlignmentY(0.0F);
        menu_lat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 40));

        btnLabo.setBackground(new java.awt.Color(0, 102, 102));
        btnLabo.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnLabo.setForeground(new java.awt.Color(255, 255, 255));
        btnLabo.setText("Laboratorios");
        btnLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboActionPerformed(evt);
            }
        });
        menu_lat.add(btnLabo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 280, 80));

        jLabel1.setBackground(new java.awt.Color(22, 39, 49));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\unse\\cursadas =p\\Ingenieria del Software\\Taller\\farmacia_is\\src\\main\\java\\resources\\menu_lat.png")); // NOI18N
        jLabel1.setText("jLabel1");
        menu_lat.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 770));

        getContentPane().add(menu_lat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu_sup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menu_sup.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 70, 70));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Administrador");
        menu_sup.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 110, 30));
        menu_sup.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, -1));

        getContentPane().add(menu_sup, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jPanelOptions.setBackground(new java.awt.Color(245, 245, 245));
        jPanelOptions.setAlignmentX(0.0F);
        jPanelOptions.setAlignmentY(0.0F);
        jPanelOptions.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanelOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionsFarmacias.setBackground(new java.awt.Color(245, 245, 245));
        optionsFarmacias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel11.setText("Seleccione alguna opción:");
        optionsFarmacias.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        opRegFarmacia.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opRegFarmacia.setText("Registrar Farmacia");
        opRegFarmacia.setAlignmentY(0.0F);
        opRegFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegFarmaciaActionPerformed(evt);
            }
        });
        optionsFarmacias.add(opRegFarmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 88, 287, 68));

        opElimFarmacia.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opElimFarmacia.setText("Modificar datos");
        opElimFarmacia.setAlignmentY(0.0F);
        opElimFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opElimFarmaciaActionPerformed(evt);
            }
        });
        optionsFarmacias.add(opElimFarmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 196, 287, 68));

        jPanelOptions.add(optionsFarmacias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 650, 520));

        optionsVentas.setBackground(new java.awt.Color(245, 245, 245));
        optionsVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel16.setText("Seleccione alguna opción:");
        optionsVentas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        opRegPedidos.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opRegPedidos.setText("Registrar pedidos");
        opRegPedidos.setAlignmentY(0.0F);
        opRegPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegPedidosActionPerformed(evt);
            }
        });
        optionsVentas.add(opRegPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 88, 287, 68));

        opRegFactura.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opRegFactura.setText("RegistrarFactura");
        opRegFactura.setAlignmentY(0.0F);
        opRegFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegFacturaActionPerformed(evt);
            }
        });
        optionsVentas.add(opRegFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 299, 287, 68));

        opGenInformeP.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opGenInformeP.setText("Generar informe pendiente");
        opGenInformeP.setAlignmentY(0.0F);
        opGenInformeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGenInformePActionPerformed(evt);
            }
        });
        optionsVentas.add(opGenInformeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 196, 287, 68));

        jPanelOptions.add(optionsVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 650, 520));

        optionsMedicamentos.setBackground(new java.awt.Color(245, 245, 245));
        optionsMedicamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opRegCompra.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opRegCompra.setText("Registrar Compra");
        opRegCompra.setAlignmentY(0.0F);
        opRegCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegCompraActionPerformed(evt);
            }
        });
        optionsMedicamentos.add(opRegCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 88, 287, 68));

        opModfDatosMed.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opModfDatosMed.setText("Modificar datos");
        opModfDatosMed.setAlignmentY(0.0F);
        opModfDatosMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opModfDatosMedActionPerformed(evt);
            }
        });
        optionsMedicamentos.add(opModfDatosMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 299, 287, 68));

        jLabel12.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel12.setText("Seleccione alguna opción:");
        optionsMedicamentos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jPanelOptions.add(optionsMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 650, 520));

        optionsLaboratorios.setBackground(new java.awt.Color(245, 245, 245));
        optionsLaboratorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opRegLab.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opRegLab.setText("Registrar Laboratorio");
        opRegLab.setAlignmentY(0.0F);
        opRegLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegLabActionPerformed(evt);
            }
        });
        optionsLaboratorios.add(opRegLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 88, 287, 68));

        opModfDatosLab.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opModfDatosLab.setText("Modificar datos");
        opModfDatosLab.setAlignmentY(0.0F);
        opModfDatosLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opModfDatosLabActionPerformed(evt);
            }
        });
        optionsLaboratorios.add(opModfDatosLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 196, 287, 68));

        jLabel17.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel17.setText("Seleccione alguna opción:");
        optionsLaboratorios.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jPanelOptions.add(optionsLaboratorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 650, 520));

        optionsInformes.setBackground(new java.awt.Color(245, 245, 245));
        optionsInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opGenInfPrecios.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opGenInfPrecios.setText("Generar Informe de Precios");
        opGenInfPrecios.setAlignmentY(0.0F);
        opGenInfPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGenInfPreciosActionPerformed(evt);
            }
        });
        optionsInformes.add(opGenInfPrecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 88, 287, 68));

        opRegInfPrecios.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opRegInfPrecios.setText("Registrar Informe de Precios");
        opRegInfPrecios.setAlignmentY(0.0F);
        opRegInfPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegInfPreciosActionPerformed(evt);
            }
        });
        optionsInformes.add(opRegInfPrecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 287, 68));

        opGenDetalleMes.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opGenDetalleMes.setText("Generar Detalle Mensual");
        opGenDetalleMes.setAlignmentY(0.0F);
        opGenDetalleMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGenDetalleMesActionPerformed(evt);
            }
        });
        optionsInformes.add(opGenDetalleMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 196, 287, 68));

        jLabel18.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel18.setText("Seleccione alguna opción:");
        optionsInformes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        opGenResTotal.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        opGenResTotal.setText("Generar Resumen Total");
        opGenResTotal.setAlignmentY(0.0F);
        opGenResTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGenResTotalActionPerformed(evt);
            }
        });
        optionsInformes.add(opGenResTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 299, 287, 68));

        jPanelOptions.add(optionsInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 650, 520));

        getContentPane().add(jPanelOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1150, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        jPanelOptions.removeAll();
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
        jPanelOptions.add(optionsVentas);
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
        
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnFarmacias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmacias1ActionPerformed
        // TODO add your handling code here:
        jPanelOptions.removeAll();
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
        jPanelOptions.add(optionsFarmacias);
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
    }//GEN-LAST:event_btnFarmacias1ActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        // TODO add your handling code here:
        jPanelOptions.removeAll();
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
        jPanelOptions.add(optionsMedicamentos);
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboActionPerformed
        // TODO add your handling code here:
        jPanelOptions.removeAll();
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
        jPanelOptions.add(optionsLaboratorios);
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
    }//GEN-LAST:event_btnLaboActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
        jPanelOptions.removeAll();
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
        jPanelOptions.add(optionsInformes);
        jPanelOptions.repaint();
        jPanelOptions.revalidate();
    }//GEN-LAST:event_btnInformesActionPerformed

    private void opRegFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegFarmaciaActionPerformed
        JRegistrarFarmacia farmacia = new JRegistrarFarmacia();
        farmacia.setVisible(true);
    }//GEN-LAST:event_opRegFarmaciaActionPerformed

    private void opElimFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opElimFarmaciaActionPerformed
                // TODO add your handling code here:
       JBMFarmacia VistaJBMF = new JBMFarmacia();
       VistaJBMF.setVisible(true);
    }//GEN-LAST:event_opElimFarmaciaActionPerformed

    private void opRegPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegPedidosActionPerformed
        JRegistrarPedido ped = new JRegistrarPedido();
        ped.setVisible(true);
    }//GEN-LAST:event_opRegPedidosActionPerformed

    private void opRegFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opRegFacturaActionPerformed

    private void opGenInformePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGenInformePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opGenInformePActionPerformed

    private void opRegCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opRegCompraActionPerformed

    private void opModfDatosMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opModfDatosMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opModfDatosMedActionPerformed

    private void opRegLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opRegLabActionPerformed

    private void opModfDatosLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opModfDatosLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opModfDatosLabActionPerformed

    private void opGenInfPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGenInfPreciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opGenInfPreciosActionPerformed

    private void opRegInfPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegInfPreciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opRegInfPreciosActionPerformed

    private void opGenDetalleMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGenDetalleMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opGenDetalleMesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void opGenResTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGenResTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opGenResTotalActionPerformed

   
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFarmacias1;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnLabo;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel iconFarmacias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelOptions;
    private javax.swing.JPanel menu_lat;
    private javax.swing.JPanel menu_sup;
    private javax.swing.JButton opElimFarmacia;
    private javax.swing.JButton opGenDetalleMes;
    private javax.swing.JButton opGenInfPrecios;
    private javax.swing.JButton opGenInformeP;
    private javax.swing.JButton opGenResTotal;
    private javax.swing.JButton opModfDatosLab;
    private javax.swing.JButton opModfDatosMed;
    private javax.swing.JButton opRegCompra;
    private javax.swing.JButton opRegFactura;
    private javax.swing.JButton opRegFarmacia;
    private javax.swing.JButton opRegInfPrecios;
    private javax.swing.JButton opRegLab;
    private javax.swing.JButton opRegPedidos;
    private javax.swing.JPanel optionsFarmacias;
    private javax.swing.JPanel optionsInformes;
    private javax.swing.JPanel optionsLaboratorios;
    private javax.swing.JPanel optionsMedicamentos;
    private javax.swing.JPanel optionsVentas;
    // End of variables declaration//GEN-END:variables
}
