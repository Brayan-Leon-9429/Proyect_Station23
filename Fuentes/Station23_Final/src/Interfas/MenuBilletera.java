/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import Base_De_Datos.DaoVehiculo;
import clases.JPanelConFondo;
import clases.Pago;
import clases.Registro;
import clases.Vehiculo;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Braya
 */
public class MenuBilletera extends javax.swing.JFrame {

    Vehiculo vehiculo;
    DaoVehiculo daoVehiculo = new DaoVehiculo();
    Registro registro = new Registro();
    Pago pago = new Pago();
    Double comision = 0.0;
    Double horas = 0.0;
    Double monto = 0.0;

    public MenuBilletera(Registro r, Pago p, double HORAS_TOTALES_REDONDEADO, double c, double costo_total) {
        initComponents();
        comision=c;
        horas=HORAS_TOTALES_REDONDEADO;
        monto=costo_total;
        JPanelConFondo panelFondo = new JPanelConFondo("src/img/fondo.png");
        panelFondo.setBounds(0, 0, jpnlFondoImagen.getWidth(), jpnlFondoImagen.getHeight());
        jpnlFondoImagen.add(panelFondo);
        jpnlFondoImagen.setOpaque(false);
        jrbYape.setActionCommand("Billetera - Yape");
        jrbPlin.setActionCommand("Billetera - Plin");
        jrbTunki.setActionCommand("Billetera - Tunki");
        bgVehiculos.add(jrbYape);
        bgVehiculos.add(jrbPlin);
        bgVehiculos.add(jrbTunki);
        pago = p;
        registro = r;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgVehiculos = new javax.swing.ButtonGroup();
        jpnlFondoImagen = new javax.swing.JPanel();
        jrbYape = new javax.swing.JRadioButton();
        jrbTunki = new javax.swing.JRadioButton();
        jrbPlin = new javax.swing.JRadioButton();
        jbtSiguiente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtYape = new javax.swing.JButton();
        jbtPlin = new javax.swing.JButton();
        jbtTunki = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlFondoImagen.setBackground(new java.awt.Color(59, 54, 47));
        jpnlFondoImagen.setPreferredSize(new java.awt.Dimension(570, 505));

        jrbYape.setBackground(new java.awt.Color(59, 54, 47));
        bgVehiculos.add(jrbYape);
        jrbYape.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jrbYape.setForeground(new java.awt.Color(255, 255, 255));
        jrbYape.setText("Yape");
        jrbYape.setBorder(null);
        jrbYape.setBorderPainted(true);
        jrbYape.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jrbYape.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jrbYape.setIconTextGap(75);

        jrbTunki.setBackground(new java.awt.Color(59, 54, 47));
        bgVehiculos.add(jrbTunki);
        jrbTunki.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jrbTunki.setForeground(new java.awt.Color(255, 255, 255));
        jrbTunki.setText("Tunki");
        jrbTunki.setBorder(null);
        jrbTunki.setBorderPainted(true);
        jrbTunki.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jrbTunki.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jrbTunki.setIconTextGap(75);
        jrbTunki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTunkiActionPerformed(evt);
            }
        });

        jrbPlin.setBackground(new java.awt.Color(59, 54, 47));
        bgVehiculos.add(jrbPlin);
        jrbPlin.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jrbPlin.setForeground(new java.awt.Color(255, 255, 255));
        jrbPlin.setText("Plin");
        jrbPlin.setBorder(null);
        jrbPlin.setBorderPainted(true);
        jrbPlin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jrbPlin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jrbPlin.setIconTextGap(75);

        jbtSiguiente.setBackground(new java.awt.Color(167, 190, 56));
        jbtSiguiente.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jbtSiguiente.setText("siguiente");
        jbtSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSiguienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(249, 138, 7));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("de preferencia");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecciona tu Billetera Digital");

        jbtYape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/M_Yape.png"))); // NOI18N

        jbtPlin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/M_Plin.png"))); // NOI18N

        jbtTunki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/M_Tunki.png"))); // NOI18N

        javax.swing.GroupLayout jpnlFondoImagenLayout = new javax.swing.GroupLayout(jpnlFondoImagen);
        jpnlFondoImagen.setLayout(jpnlFondoImagenLayout);
        jpnlFondoImagenLayout.setHorizontalGroup(
            jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnlFondoImagenLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jpnlFondoImagenLayout.createSequentialGroup()
                            .addComponent(jrbTunki, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtTunki, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlFondoImagenLayout.createSequentialGroup()
                            .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jrbPlin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbYape, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80)
                            .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbtYape, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtPlin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                        .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        jpnlFondoImagenLayout.setVerticalGroup(
            jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondoImagenLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtYape, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbYape, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbPlin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtPlin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtTunki, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbTunki, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlFondoImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSiguienteActionPerformed
        ButtonModel selectedButton = bgVehiculos.getSelection();
        if (selectedButton != null) {
            String tarjeta = selectedButton.getActionCommand();
            switch (tarjeta) {
                case "Billetera - Yape":
                    PagoYape yape = new PagoYape(registro, pago,horas,comision,monto);
                    yape.setVisible(true);
                    this.dispose();
                    break;
                case "Billetera - Plin":
                    PagoPlin plin = new PagoPlin(registro, pago,horas,comision,monto);
                    plin.setVisible(true);
                    this.dispose();
                    break;
                case "Billetera - Tunki":
                    PagoTunki tunki = new PagoTunki(registro, pago,horas,comision,monto);
                    tunki.setVisible(true);
                    this.dispose();
                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor selecciona un vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtSiguienteActionPerformed

    private void jrbTunkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTunkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbTunkiActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtPlin;
    private javax.swing.JButton jbtSiguiente;
    private javax.swing.JButton jbtTunki;
    private javax.swing.JButton jbtYape;
    private javax.swing.JPanel jpnlFondoImagen;
    private javax.swing.JRadioButton jrbPlin;
    private javax.swing.JRadioButton jrbTunki;
    private javax.swing.JRadioButton jrbYape;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
