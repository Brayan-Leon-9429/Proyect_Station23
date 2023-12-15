
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

/**
 *
 * @author danda
 */
import Base_De_Datos.DaoPago;
import clases.Tarifario;
import Base_De_Datos.DaoTarifario;
import Base_De_Datos.DaoTipoVehiculo;
import Base_De_Datos.DaoUbicacion;
import Base_De_Datos.DaoVehiculo;
import clases.Pago;
import clases.Registro;
import clases.Vehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConfirmarRetiro extends javax.swing.JFrame {

    Registro registro = new Registro();
    DaoUbicacion daoUbicacion = new DaoUbicacion();
    DaoTarifario daoTarifario = new DaoTarifario();
    DaoTipoVehiculo daoTipoVehiculo = new DaoTipoVehiculo();
    DaoPago daoPago = new DaoPago();
    DaoVehiculo daoVehiculo = new DaoVehiculo();
    Tarifario tarifario = new Tarifario();
    Pago pago = new Pago();
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    String Hora_E, Hora_S;
    Double comision = 0.0;

    public ConfirmarRetiro(Registro r, int origen) {
        initComponents();
        registro = r;
        jtfCodigoRegistro.setText(registro.getId_vehiculo());
        Vehiculo v = daoVehiculo.vehiculoGet(registro.getId_vehiculo());
        jtfPlaca.setText(v.getPlaca());
        Hora_E = formato.format(registro.getHora_entrada());
        jtfHoraEntrada.setText(Hora_E);
        Hora_S = formato.format(registro.getHora_salida());
        jtfHoraSalida.setText(Hora_S);
        jtfUbi.setText(registro.getId_ubicacion());
        String tipo = daoTipoVehiculo.obtenerTipo(v.getId_tipo_vehiculo());
        jtfTipoVehi.setText(tipo);
        comision(origen);
        pago=calcularHorasYValorAPagar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbtPagar = new javax.swing.JButton();
        jtfCodigoRegistro = new javax.swing.JTextField();
        jtfHoraEntrada = new javax.swing.JTextField();
        jtfPlaca = new javax.swing.JTextField();
        jtfHoraSalida = new javax.swing.JTextField();
        jtfTipoVehi = new javax.swing.JTextField();
        jtfCntHoras = new javax.swing.JTextField();
        jtfPago = new javax.swing.JTextField();
        jtfUbi = new javax.swing.JTextField();
        jtfComision = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(36, 35, 35));

        jLabel27.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Placa:");

        jLabel28.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Hora de entrada:");

        jLabel44.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Hora de salida:");

        jLabel45.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Cantidad de horas:");

        jLabel46.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Valor a Pagar:");

        jLabel48.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Ubicación:");

        jLabel49.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Tipo de Vehiculo:");

        jLabel47.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Código de Registro:");

        jLabel1.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comisión:");

        jbtPagar.setBackground(new java.awt.Color(167, 190, 56));
        jbtPagar.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jbtPagar.setForeground(new java.awt.Color(255, 255, 255));
        jbtPagar.setText("Pagar");
        jbtPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPagarActionPerformed(evt);
            }
        });

        jtfCodigoRegistro.setBackground(new java.awt.Color(249, 138, 7));
        jtfCodigoRegistro.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfCodigoRegistro.setForeground(new java.awt.Color(255, 255, 0));
        jtfCodigoRegistro.setToolTipText("");
        jtfCodigoRegistro.setFocusable(false);

        jtfHoraEntrada.setBackground(new java.awt.Color(249, 138, 7));
        jtfHoraEntrada.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfHoraEntrada.setFocusable(false);

        jtfPlaca.setBackground(new java.awt.Color(249, 138, 7));
        jtfPlaca.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfPlaca.setFocusable(false);
        jtfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPlacaActionPerformed(evt);
            }
        });

        jtfHoraSalida.setBackground(new java.awt.Color(249, 138, 7));
        jtfHoraSalida.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfHoraSalida.setFocusable(false);

        jtfTipoVehi.setBackground(new java.awt.Color(249, 138, 7));
        jtfTipoVehi.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfTipoVehi.setFocusable(false);

        jtfCntHoras.setBackground(new java.awt.Color(249, 138, 7));
        jtfCntHoras.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfCntHoras.setFocusable(false);

        jtfPago.setBackground(new java.awt.Color(249, 138, 7));
        jtfPago.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfPago.setFocusable(false);

        jtfUbi.setBackground(new java.awt.Color(249, 138, 7));
        jtfUbi.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfUbi.setFocusable(false);

        jtfComision.setBackground(new java.awt.Color(249, 138, 7));
        jtfComision.setFont(new java.awt.Font("Racing Sans One", 1, 18)); // NOI18N
        jtfComision.setFocusable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jbtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfUbi, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCntHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPago, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfComision, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(271, 271, 271))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTipoVehi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCntHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfComision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(32, 32, 32)
                .addComponent(jbtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPagarActionPerformed
        daoUbicacion.ubicacionUpdEstado(registro.getId_ubicacion(), "libre");
        PagoYape yap = new PagoYape(registro, pago);
        yap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtPagarActionPerformed

    private void jtfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlacaActionPerformed

    private Pago calcularHorasYValorAPagar() {
        Pago p = new Pago();
        try {
            Date horaEntrada = formato.parse(Hora_E);
            Date horaSalida = formato.parse(Hora_S);
            long diferenciaEnMilisegundos = horaSalida.getTime() - horaEntrada.getTime();

            if (diferenciaEnMilisegundos < 60 * 60 * 1000) {
                diferenciaEnMilisegundos = 60 * 60 * 1000;
            } else {
                long diezMinutosEnMilisegundos = 10 * 60 * 1000;
                diferenciaEnMilisegundos -= diezMinutosEnMilisegundos;
            }

            double diferenciaEnHoras = diferenciaEnMilisegundos / (60.0 * 60.0 * 1000.0);

            double valorAPagar = (diferenciaEnHoras * tarifario.getTarifa_hora()) + comision;

            String codigo = daoPago.idPago();
            p.setId_pago(codigo);
            p.setPago_total(valorAPagar);
            jtfCntHoras.setText(String.format("%.2f", diferenciaEnHoras));
            jtfPago.setText("S/. " + String.format("%.2f", valorAPagar));
        } catch (ParseException e) {
            System.out.println("Error al calcular horas y valor a pagar: " + e.getMessage());
        }
        return p;
    }

    private void comision(int n) {
        switch (n) {
            case 1 -> {
                jtfComision.setText("S/. 0.00");
                Vehiculo v = daoVehiculo.vehiculoGet(registro.getId_vehiculo());
                tarifario = daoTarifario.tarifarioGet(v.getId_tipo_vehiculo());
            }
            case 2 -> {
                Vehiculo v = daoVehiculo.vehiculoGet(registro.getId_vehiculo());
                tarifario = daoTarifario.tarifarioGet(v.getId_tipo_vehiculo());
                jtfComision.setText("S/. " + String.valueOf(tarifario.getComision()));
                comision = tarifario.getComision();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JButton jbtPagar;
    private javax.swing.JTextField jtfCntHoras;
    private javax.swing.JTextField jtfCodigoRegistro;
    private javax.swing.JTextField jtfComision;
    private javax.swing.JTextField jtfHoraEntrada;
    private javax.swing.JTextField jtfHoraSalida;
    private javax.swing.JTextField jtfPago;
    private javax.swing.JTextField jtfPlaca;
    private javax.swing.JTextField jtfTipoVehi;
    private javax.swing.JTextField jtfUbi;
    // End of variables declaration//GEN-END:variables
}
