/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Base_De_Datos.DaoPago;
import Base_De_Datos.DaoRegistro;
import Base_De_Datos.DaoTipoVehiculo;
import Base_De_Datos.DaoVehiculo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 *
 * @author danda
 */
public class boleta {

    Registro registro = new Registro();
    DaoRegistro daoRegistroFinal = new DaoRegistro();
    DaoTipoVehiculo daoTipoVehiculo = new DaoTipoVehiculo();
    DaoVehiculo daoVehiculo = new DaoVehiculo();
    DaoPago daoPago = new DaoPago();

    public void ticket_Salida(String id_vehiculo) {
        // Obtén los datos de la base de datos y asigna a ClasPDF
        registro = daoRegistroFinal.buscarIDVehiculo(id_vehiculo);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // Variables de fuentes
        Font f = FontFactory.getFont(FontFactory.COURIER, 12.0f, Font.NORMAL, BaseColor.BLACK);
        Font fo = FontFactory.getFont(FontFactory.HELVETICA, 12.0f, Font.NORMAL, BaseColor.BLACK);

        try {
            // Crear un nuevo documento PDF
            Document doc = new Document(PageSize.A6);
            String dest = "C:/Users/Braya/OneDrive/Escritorio/reporte.pdf";
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream(dest));
            doc.open();

            Barcode39 bc = new Barcode39();
            bc.setCode(id_vehiculo);
            Image img = bc.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
            img.scalePercent(210);
            img.setAlignment(Element.ALIGN_CENTER);

            Paragraph para = new Paragraph("Ticket de salida", f);
            para.setAlignment(Element.ALIGN_CENTER);

            // Agregar los campos del objeto ClasPDF
            Vehiculo v = daoVehiculo.vehiculoGet(registro.getId_vehiculo());
            String tipo = daoTipoVehiculo.obtenerTipo(v.getId_tipo_vehiculo());
            String codigoReg = registro.getId_vehiculo();
            String tipoVehiculo = tipo;
            String idUbicacion = registro.getId_ubicacion();
            String horaEntrada = formato.format(registro.getHora_entrada());
            String horaSalida = formato.format(registro.getHora_salida());
            Pago pago = daoPago.pagoGet(registro.getId_pago());
            String pagoTotal = String.valueOf(pago);
            String horaPago = formato.format(pago.getHora_pago());

            Paragraph para11 = new Paragraph("Código Registro: " + codigoReg, fo);
            para11.setAlignment(Element.ALIGN_CENTER);

            Paragraph para12 = new Paragraph("Tipo de Vehículo: " + tipoVehiculo, fo);
            para12.setAlignment(Element.ALIGN_CENTER);

            Paragraph para13 = new Paragraph("ID de Ubicación: " + idUbicacion, fo);
            para13.setAlignment(Element.ALIGN_CENTER);

            Paragraph para14 = new Paragraph("Hora de Entrada: " + horaEntrada, fo);
            para14.setAlignment(Element.ALIGN_CENTER);

            Paragraph para15 = new Paragraph("Hora de Salida: " + horaSalida, fo);
            para15.setAlignment(Element.ALIGN_CENTER);

            Paragraph para16 = new Paragraph("Pago Total: " + pagoTotal, fo);
            para16.setAlignment(Element.ALIGN_CENTER);

            Paragraph para17 = new Paragraph("Hora de Pago: " + horaPago, fo);
            para17.setAlignment(Element.ALIGN_CENTER);

            doc.add(para);
            // Agregar los campos al documento
            doc.add(para11);
            doc.add(para12);
            doc.add(para13);
            doc.add(para14);
            doc.add(para15);
            doc.add(para16);
            doc.add(para17);

            doc.add(img);
            doc.close();

            abrirEnEdge(dest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void abrirEnEdge(String archivo) {
        try {
            String osName = System.getProperty("os.name").toLowerCase();
            if (osName.contains("win")) {
                ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "start microsoft-edge: " + archivo);
                builder.start();
            } else {
                System.out.println("No se puede abrir en Edge en este sistema operativo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
