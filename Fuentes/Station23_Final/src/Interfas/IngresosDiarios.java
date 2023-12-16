/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfas;

import Base_De_Datos.DaoRegistro;
import clases.Excel;
import clases.Ingresos;
import clases.RegistroFinal;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Braya
 */
public class IngresosDiarios extends javax.swing.JFrame {

    DaoRegistro daoRegistro = new DaoRegistro();
    ResultSet rs;
    Excel excel = new Excel();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    private Map<String, Object[]> datosPorDia = new LinkedHashMap<>();

    public IngresosDiarios() {
        initComponents();
        jtbRegistros.setModel(modeloTabla());
        jbtExportar.setEnabled(false);
    }

    private DefaultTableModel modeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha");
        modelo.addColumn("Motos");
        modelo.addColumn("Autos");
        modelo.addColumn("Camionetas");
        modelo.addColumn("Total");
        return modelo;
    }

    private void calcularIngresosDiarios() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -30);
        for (int i = 0; i < 31; i++) {
            Date fecha = calendar.getTime();
            String fechaConsulta = formato.format(fecha);
            List<Ingresos> ingresosDiarios = daoRegistro.regFinDiarios(fechaConsulta);
            procesarIngresos(ingresosDiarios, fecha);
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }
        construirModeloTabla();
    }

    private void procesarIngresos(List<Ingresos> lista, Date fecha) {
        Double total_a = 0.0;
        Double total_m = 0.0;
        Double total_c = 0.0;

        if (lista.isEmpty()) {
            lista.add(new Ingresos("Auto", 0.0));
            lista.add(new Ingresos("Camioneta", 0.0));
            lista.add(new Ingresos("Moto", 0.0));
        }

        for (Ingresos ingresos : lista) {
            String tipo = ingresos.getTipo_vehiculo();
            switch (tipo) {
                case "Auto":
                    total_a += ingresos.getMonto();
                    break;
                case "Camioneta":
                    total_c += ingresos.getMonto();
                    break;
                case "Moto":
                    total_m += ingresos.getMonto();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        Double monto_total = total_a + total_c + total_m;
        String pago_a = String.format("%.2f", total_a);
        String pago_m = String.format("%.2f", total_m);
        String pago_c = String.format("%.2f", total_c);
        String monto = String.format("%.2f", monto_total);
        datosPorDia.put(formato.format(fecha), new Object[]{pago_m, pago_a, pago_c, monto});
    }

    private void construirModeloTabla() {
        DefaultTableModel modelo = modeloTabla();
        datosPorDia.forEach((fecha, datos) -> {
            modelo.addRow(new Object[]{fecha, datos[0], datos[1], datos[2], datos[3]});
        });
        jtbRegistros.setModel(modelo);
        jbtExportar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbRegistros = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbtExportar = new javax.swing.JButton();
        jtfSuma = new javax.swing.JTextField();
        jbtRetroceder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbtActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 35, 35));

        jtbRegistros.setFont(new java.awt.Font("Racing Sans One", 0, 10)); // NOI18N
        jtbRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbRegistros);

        jLabel2.setFont(new java.awt.Font("Racing Sans One", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Suma Total");

        jbtExportar.setBackground(new java.awt.Color(249, 138, 7));
        jbtExportar.setFont(new java.awt.Font("Racing Sans One", 0, 12)); // NOI18N
        jbtExportar.setText("Exportar");
        jbtExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExportarActionPerformed(evt);
            }
        });

        jtfSuma.setFont(new java.awt.Font("Racing Sans One", 0, 10)); // NOI18N
        jtfSuma.setEnabled(false);

        jbtRetroceder.setBackground(new java.awt.Color(36, 35, 35));
        jbtRetroceder.setFont(new java.awt.Font("Racing Sans One", 0, 18)); // NOI18N
        jbtRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.jpeg"))); // NOI18N
        jbtRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRetrocederActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Racing Sans One", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reporte Total de Ingresos Diarios");

        jbtActualizar.setBackground(new java.awt.Color(249, 138, 7));
        jbtActualizar.setFont(new java.awt.Font("Racing Sans One", 0, 12)); // NOI18N
        jbtActualizar.setText("Actualizar");
        jbtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtExportar)
                                .addGap(55, 55, 55)
                                .addComponent(jbtActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jtfSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtRetroceder)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel4)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jbtRetroceder)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbtActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExportarActionPerformed
        Excel obj;
        try {
            obj = new Excel();
            obj.exportarExcel(jtbRegistros);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jbtExportarActionPerformed

    private void jbtRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRetrocederActionPerformed
        InicioAdministrador in = new InicioAdministrador();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtRetrocederActionPerformed

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        calcularIngresosDiarios();
    }//GEN-LAST:event_jbtActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtExportar;
    private javax.swing.JButton jbtRetroceder;
    private javax.swing.JTable jtbRegistros;
    private javax.swing.JTextField jtfSuma;
    // End of variables declaration//GEN-END:variables
}
