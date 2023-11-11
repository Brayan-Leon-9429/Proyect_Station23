/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Base_De_Datos.DaoRegistroFinal;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;


/**
 *
 * @author danda
 */
public class boleta {
    
    DaoRegistroFinal Pdf = new DaoRegistroFinal();
        RegistroFinal ClasPDF;

    

    public void ticket_Salida(String placa) {
        // Obtén los datos de la base de datos y asigna a ClasPDF
        ClasPDF = Pdf.buscarPlaca(placa);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // Variables de fuentes
        Font f = FontFactory.getFont(FontFactory.COURIER, 12.0f, Font.NORMAL, BaseColor.BLACK);
        Font fo = FontFactory.getFont(FontFactory.HELVETICA, 12.0f, Font.NORMAL, BaseColor.BLACK);

        try {
            // Crear un nuevo documento PDF
            Document doc = new Document(PageSize.A6);
            String dest = "D:/reporte.pdf";
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream(dest));
            doc.open();

            Barcode39 bc = new Barcode39();
            bc.setCode(placa);
            Image img = bc.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
            img.scalePercent(210);
            img.setAlignment(Element.ALIGN_CENTER);

            Paragraph para = new Paragraph("Ticket de salida", f);
            para.setAlignment(Element.ALIGN_CENTER);

            // Agregar los campos del objeto ClasPDF
            String codigoReg = ClasPDF.getCodigo_reg();
            String tipoVehiculo = ClasPDF.getTipo_vehiculo();
            String idUbicacion = ClasPDF.getId_ubicacion();
            String horaEntrada = formato.format(ClasPDF.getHora_entrada());
            String horaSalida = formato.format(ClasPDF.getHora_salida());
            String pagoTotal = String.valueOf(ClasPDF.getPago_total());
            String horaPago = formato.format(ClasPDF.getHora_pago());

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

            // Abrir el documento PDF con el visor predeterminado
            if ((new File(dest)).exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + dest);
                p.waitFor();
            } else {
                System.out.println("El documento no existe");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
