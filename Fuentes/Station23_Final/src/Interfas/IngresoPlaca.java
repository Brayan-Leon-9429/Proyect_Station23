/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;


import Base_De_Datos.DaoVehiculo;
import clases.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author Braya
 */
public class IngresoPlaca extends javax.swing.JFrame {

    Vehiculo vehiculo = new Vehiculo();
    DaoVehiculo daoVehiculo = new DaoVehiculo();

    public IngresoPlaca() {
        initComponents();
       
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jbtSiguiente = new javax.swing.JButton();
        jtfPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(36, 35, 35));
        Fondo.setPreferredSize(new java.awt.Dimension(570, 505));

        jbtSiguiente.setBackground(new java.awt.Color(249, 127, 6));
        jbtSiguiente.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtSiguiente.setText("siguiente");
        jbtSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSiguienteActionPerformed(evt);
            }
        });

        jtfPlaca.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        jtfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPlacaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Racing Sans One", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Placa");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_station23.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSiguienteActionPerformed
        String placa = jtfPlaca.getText();
        if (!placa.equals("")) {
            if (placa.length() == 6) {
                SeleccionVehiculo seleccionVehiculo = new SeleccionVehiculo();
                vehiculo.setPlaca(placa);
                String id = daoVehiculo.idVehiculo();
                vehiculo.setId_vehiculo(id);
                seleccionVehiculo.setVehiculo(vehiculo);
                seleccionVehiculo.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese una placa incorrecta no cumple con los estandares de la normativa de transito, intentelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una placa para el registro.", "Solicitud", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbtSiguienteActionPerformed

    private void jtfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlacaActionPerformed

    /**
 
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtSiguiente;
    private javax.swing.JTextField jtfPlaca;
    // End of variables declaration//GEN-END:variables
}
