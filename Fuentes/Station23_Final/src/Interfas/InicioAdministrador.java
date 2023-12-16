/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

/**
 *
 * @author Braya
 */
public class InicioAdministrador extends javax.swing.JFrame {


    public InicioAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtRegistros = new javax.swing.JButton();
        jbtReporteDiario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtRetroceder = new javax.swing.JButton();
        jbtActualizar = new javax.swing.JButton();
        jbtTarifario = new javax.swing.JButton();
        jbtBloquearLugares = new javax.swing.JButton();
        jbtCupones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 35, 35));

        jbtRegistros.setBackground(new java.awt.Color(249, 127, 6));
        jbtRegistros.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtRegistros.setText("Filtrar Registros");
        jbtRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegistrosActionPerformed(evt);
            }
        });

        jbtReporteDiario.setBackground(new java.awt.Color(249, 127, 6));
        jbtReporteDiario.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtReporteDiario.setText("Reporte Diario");
        jbtReporteDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtReporteDiarioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_station23.png"))); // NOI18N

        jbtRetroceder.setBackground(new java.awt.Color(36, 35, 35));
        jbtRetroceder.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.jpeg"))); // NOI18N
        jbtRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRetrocederActionPerformed(evt);
            }
        });

        jbtActualizar.setBackground(new java.awt.Color(249, 127, 6));
        jbtActualizar.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtActualizar.setText("Actualizar Descuentos");
        jbtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarActionPerformed(evt);
            }
        });

        jbtTarifario.setBackground(new java.awt.Color(249, 127, 6));
        jbtTarifario.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtTarifario.setText("Actualizar Tarifario");
        jbtTarifario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTarifarioActionPerformed(evt);
            }
        });

        jbtBloquearLugares.setBackground(new java.awt.Color(249, 127, 6));
        jbtBloquearLugares.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtBloquearLugares.setText("Bloquear Ubicaciones");
        jbtBloquearLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBloquearLugaresActionPerformed(evt);
            }
        });

        jbtCupones.setBackground(new java.awt.Color(249, 127, 6));
        jbtCupones.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtCupones.setText("Añadir Cupones");
        jbtCupones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCuponesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159)
                .addComponent(jbtRetroceder)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jbtRegistros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jbtActualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jbtTarifario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtBloquearLugares)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtReporteDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtCupones))
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jbtRetroceder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBloquearLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtTarifario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtReporteDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCupones, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegistrosActionPerformed
        AdministrarRegistro administrarRegistro = new AdministrarRegistro();
        administrarRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtRegistrosActionPerformed

    private void jbtReporteDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtReporteDiarioActionPerformed
        IngresosDiarios diarios = new IngresosDiarios();
        diarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtReporteDiarioActionPerformed

    private void jbtRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRetrocederActionPerformed
        Login lon = new Login();
        lon.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtRetrocederActionPerformed

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtActualizarActionPerformed

    private void jbtTarifarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTarifarioActionPerformed
        AdministrarTarifario tarifario = new AdministrarTarifario();
        tarifario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtTarifarioActionPerformed

    private void jbtBloquearLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBloquearLugaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtBloquearLugaresActionPerformed

    private void jbtCuponesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCuponesActionPerformed
        AdministrarCupones ac = new AdministrarCupones();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtCuponesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtBloquearLugares;
    private javax.swing.JButton jbtCupones;
    private javax.swing.JButton jbtRegistros;
    private javax.swing.JButton jbtReporteDiario;
    private javax.swing.JButton jbtRetroceder;
    private javax.swing.JButton jbtTarifario;
    // End of variables declaration//GEN-END:variables
}
