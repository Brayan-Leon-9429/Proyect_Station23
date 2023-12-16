/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import clases.JPanelConFondo;
import clases.Pago;
import clases.Registro;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Braya
 */
public class MenuTarjeta extends javax.swing.JFrame {

    Registro registro = new Registro();
    Pago pago = new Pago();
    Double comision = 0.0;
    Double horas = 0.0;
    Double monto = 0.0;

    public MenuTarjeta(Registro r, Pago p, double HORAS_TOTALES_REDONDEADO, double c, double costo_total) {
        initComponents();
        comision=c;
        horas=HORAS_TOTALES_REDONDEADO;
        monto=costo_total;
        JPanelConFondo panelFondo = new JPanelConFondo("src/img/fondo.png");
        panelFondo.setBounds(0, 0, jpnlFondoImagen.getWidth(), jpnlFondoImagen.getHeight());
        jpnlFondoImagen.add(panelFondo);
        jpnlFondoImagen.setOpaque(false);
        jrbVisa.setActionCommand("Tarjeta - Visa");
        jrbMasterCard.setActionCommand("Tarjeta - MasterCard");
        jrbAmex.setActionCommand("Tarjeta - Amex");
        bgVehiculos.add(jrbVisa);
        bgVehiculos.add(jrbMasterCard);
        bgVehiculos.add(jrbAmex);
        pago = p;
        registro = r;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgVehiculos = new javax.swing.ButtonGroup();
        jpnlFondoImagen = new javax.swing.JPanel();
        jrbVisa = new javax.swing.JRadioButton();
        jrbAmex = new javax.swing.JRadioButton();
        jrbMasterCard = new javax.swing.JRadioButton();
        jbtSiguiente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlFondoImagen.setBackground(new java.awt.Color(59, 54, 47));
        jpnlFondoImagen.setPreferredSize(new java.awt.Dimension(570, 505));

        jrbVisa.setBackground(new java.awt.Color(59, 54, 47));
        bgVehiculos.add(jrbVisa);
        jrbVisa.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jrbVisa.setForeground(new java.awt.Color(255, 255, 255));
        jrbVisa.setBorder(null);
        jrbVisa.setBorderPainted(true);
        jrbVisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbVisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jrbVisa.setIconTextGap(15);
        jrbVisa.setInheritsPopupMenu(true);
        jrbVisa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jrbAmex.setBackground(new java.awt.Color(59, 54, 47));
        bgVehiculos.add(jrbAmex);
        jrbAmex.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jrbAmex.setForeground(new java.awt.Color(255, 255, 255));
        jrbAmex.setBorder(null);
        jrbAmex.setBorderPainted(true);
        jrbAmex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbAmex.setIconTextGap(15);
        jrbAmex.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jrbMasterCard.setBackground(new java.awt.Color(59, 54, 47));
        bgVehiculos.add(jrbMasterCard);
        jrbMasterCard.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jrbMasterCard.setForeground(new java.awt.Color(255, 255, 255));
        jrbMasterCard.setBorder(null);
        jrbMasterCard.setBorderPainted(true);
        jrbMasterCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbMasterCard.setIconTextGap(15);
        jrbMasterCard.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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
        jLabel1.setText(" Vehículo");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecciona el tipo de ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/B_Visa.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/B_MasterCard.png"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/B_Amex.png"))); // NOI18N

        javax.swing.GroupLayout jpnlFondoImagenLayout = new javax.swing.GroupLayout(jpnlFondoImagen);
        jpnlFondoImagen.setLayout(jpnlFondoImagenLayout);
        jpnlFondoImagenLayout.setHorizontalGroup(
            jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoImagenLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jrbVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jrbMasterCard, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jrbAmex, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jpnlFondoImagenLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlFondoImagenLayout.setVerticalGroup(
            jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondoImagenLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbMasterCard)
                    .addComponent(jrbAmex)
                    .addComponent(jrbVisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jbtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpnlFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpnlFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSiguienteActionPerformed
        ButtonModel selectedButton = bgVehiculos.getSelection();
        if (selectedButton != null) {
            String tarjeta = selectedButton.getActionCommand();
            switch (tarjeta) {
                case "Tarjeta - Visa":
                    pago.setModalidad("Tarjeta - Visa");
                    PagoTarjeta ptV = new PagoTarjeta(registro, pago,horas,comision,monto);
                    ptV.setVisible(true);
                    this.dispose();
                    break;
                case "Tarjeta - MasterCard":
                    pago.setModalidad("Tarjeta - MasterCard");
                    PagoTarjeta ptMC = new PagoTarjeta(registro, pago,horas,comision,monto);
                    ptMC.setVisible(true);
                    this.dispose();
                    break;
                case "Tarjeta - Amex":
                    pago.setModalidad("Tarjeta - Amex");
                    PagoTarjeta ptA = new PagoTarjeta(registro, pago,horas,comision,monto);
                    ptA.setVisible(true);
                    this.dispose();
                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor selecciona un vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgVehiculos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtSiguiente;
    private javax.swing.JPanel jpnlFondoImagen;
    private javax.swing.JRadioButton jrbAmex;
    private javax.swing.JRadioButton jrbMasterCard;
    private javax.swing.JRadioButton jrbVisa;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
