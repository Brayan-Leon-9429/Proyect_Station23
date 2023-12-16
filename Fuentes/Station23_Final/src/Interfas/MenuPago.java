/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import clases.Pago;
import clases.Registro;

/**
 *
 * @author danda
 */
public class MenuPago extends javax.swing.JFrame {

    Registro registro = new Registro();
    Pago pago = new Pago();
    Double comision = 0.0;
    Double horas = 0.0;
    Double monto = 0.0;

    
    public MenuPago(Registro r, Pago p, double HORAS_TOTALES_REDONDEADO, double c, double costo_total) {
        initComponents();
        pago=p;
        registro=r;
        comision=c;
        horas=HORAS_TOTALES_REDONDEADO;
        monto=costo_total;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtTarjeta = new javax.swing.JButton();
        jbtBilletera = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 54, 47));

        jbtTarjeta.setBackground(new java.awt.Color(167, 190, 56));
        jbtTarjeta.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtTarjeta.setText("Tarjeta");
        jbtTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTarjetaActionPerformed(evt);
            }
        });

        jbtBilletera.setBackground(new java.awt.Color(167, 190, 56));
        jbtBilletera.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtBilletera.setText("Billetera Dígital");
        jbtBilletera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBilleteraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecciona el tipo de  Pago");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jbtBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jbtTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
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

    private void jbtBilleteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBilleteraActionPerformed
        MenuBilletera billetera = new MenuBilletera(registro,pago,horas,comision,monto);
        billetera.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtBilleteraActionPerformed

    private void jbtTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTarjetaActionPerformed
        MenuTarjeta targeta = new MenuTarjeta(registro,pago,horas,comision,monto);
        targeta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtTarjetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtBilletera;
    private javax.swing.JButton jbtTarjeta;
    // End of variables declaration//GEN-END:variables
}
