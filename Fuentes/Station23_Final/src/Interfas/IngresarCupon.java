/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import Base_De_Datos.DaoRegistro;
import clases.Cupon;
import javax.swing.JOptionPane;

public class IngresarCupon extends javax.swing.JFrame {

    DaoRegistro daoRegistro = new DaoRegistro();
    Cupon cupon = new Cupon();
    int ing;

    public IngresarCupon(int n) {
        initComponents();
        ing = n;
    }

    private void devolverCupon(int i, Cupon c) {
        if (i == 1) {
            SalidaRetiro sr = new SalidaRetiro();
            sr.traerCupon(c, false);
            sr.setVisible(true);
            this.dispose();
        } else if (i == 2) {
            SalidaPerdida sp = new SalidaPerdida();
            sp.traerCupon(c, false);
            sp.setVisible(true);
            this.dispose();
        }
    }
    
    private void salir(int i){
        if (i == 1) {
            SalidaRetiro sr = new SalidaRetiro();
            sr.setVisible(true);
            this.dispose();
        } else if (i == 2) {
            SalidaPerdida sp = new SalidaPerdida();
            sp.setVisible(true);
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtBuscarCupon = new javax.swing.JButton();
        jtfCupon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 35, 35));

        jbtBuscarCupon.setBackground(new java.awt.Color(249, 138, 7));
        jbtBuscarCupon.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtBuscarCupon.setText("Buscar");
        jbtBuscarCupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarCuponActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el codigo de su Cupon");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_station23.png"))); // NOI18N

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtfCupon, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jbtBuscarCupon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbtRetroceder)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jbtRetroceder)))
                .addGap(18, 18, 18)
                .addComponent(jtfCupon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jbtBuscarCupon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
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

    private void jbtBuscarCuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarCuponActionPerformed
        cupon = daoRegistro.buscarCupon(jtfCupon.getText());
        if (cupon != null) {
            JOptionPane.showMessageDialog(null, "Se valido su Cupon, se le hara su respectivo descuento.");
            devolverCupon(ing, cupon);
            daoRegistro.eliminarCupon(cupon.getId_cupon());
        } else {
            JOptionPane.showMessageDialog(null, "Ingreso un cupon no registrado, intentelo de nuevo");
        }
    }//GEN-LAST:event_jbtBuscarCuponActionPerformed

    private void jbtRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRetrocederActionPerformed
        salir(ing);
    }//GEN-LAST:event_jbtRetrocederActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtBuscarCupon;
    private javax.swing.JButton jbtRetroceder;
    private javax.swing.JTextField jtfCupon;
    // End of variables declaration//GEN-END:variables
}
