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
        jbtLugares = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 35, 35));

        jbtRegistros.setBackground(new java.awt.Color(249, 127, 6));
        jbtRegistros.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtRegistros.setText("Registros");
        jbtRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegistrosActionPerformed(evt);
            }
        });

        jbtLugares.setBackground(new java.awt.Color(249, 127, 6));
        jbtLugares.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtLugares.setText("Ubicaciones");
        jbtLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLugaresActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)
                        .addComponent(jbtRetroceder)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtRegistros)
                        .addGap(74, 74, 74)
                        .addComponent(jbtLugares)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jbtRetroceder)))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jbtLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLugaresActionPerformed
        AdministrarLugaresPisoA administrarLugares = new AdministrarLugaresPisoA();
        administrarLugares.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtLugaresActionPerformed

    private void jbtRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRetrocederActionPerformed
        Login lon = new Login();
        lon.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtRetrocederActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtLugares;
    private javax.swing.JButton jbtRegistros;
    private javax.swing.JButton jbtRetroceder;
    // End of variables declaration//GEN-END:variables
}
