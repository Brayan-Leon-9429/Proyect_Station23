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
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author danda
 */
public class Boleta {

    Registro registro = new Registro();
    DaoRegistro daoRegistro = new DaoRegistro();
    DaoTipoVehiculo daoTipoVehiculo = new DaoTipoVehiculo();
    DaoVehiculo daoVehiculo = new DaoVehiculo();
    DaoPago daoPago = new DaoPago();

    // Método para agregar texto sin borde, pegado a la izquierda
    private float agregarTextoIzquierda(PdfContentByte cb, BaseFont baseFont, String texto, float x, float y) {
        float fontSize = 12;

        // Configurar fuente y tamaño
        cb.beginText();
        cb.setFontAndSize(baseFont, fontSize);

        // Configurar posición del texto
        cb.setTextMatrix(x, y);

        // Mostrar texto
        cb.showText(texto);

        // Finalizar el bloque de texto
        cb.endText();

        // Devolver la nueva posición Y después de agregar el texto
        return y - fontSize - 5; // Espaciado entre líneas
    }

    public void imprimirBoleta(Registro registro, Double HORAS_TOTALES_REDONDEADO, double comision, double costo_total) {
        Vehiculo v = daoVehiculo.vehiculoGet(registro.getId_vehiculo());
        String nombreArchivo = v.getPlaca() + "_" + obtenerFechaActual() + ".pdf";

        // Ruta completa donde se guardará el archivo PDF (ajusta esta ruta según tu necesidad)
        String rutaCompleta = "D:/boleta/" + nombreArchivo;

        // Crear el documento PDF con ancho personalizado de 14 cm y alto A4
        Document documento = new Document(new RectangleReadOnly(6 * 60, PageSize.A4.getHeight()));

        try {
            // Crear el escritor PDF
            PdfWriter pdfWriter = PdfWriter.getInstance(documento, new FileOutputStream(rutaCompleta));

            // Abrir el documento
            documento.open();

            // Cambiar la fuente a una que admita caracteres especiales
            BaseFont baseFont = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
            Font font = new Font(baseFont, 12);

            // Agregar contenido al documento
            PdfContentByte cb = pdfWriter.getDirectContent();

            // Agregar el nombre de la empresa a la izquierda
            float xPosNombreEmpresa = 70;
            float yPosNombreEmpresa = PageSize.A4.getHeight() - 20;
            cb.beginText();
            cb.setFontAndSize(baseFont, 18);
            cb.setTextMatrix(xPosNombreEmpresa, yPosNombreEmpresa);
            cb.showText("Station23");
            cb.endText();

            // Línea separadora
            cb.moveTo(xPosNombreEmpresa, yPosNombreEmpresa - 5);
            cb.lineTo(PageSize.A4.getWidth() - 70, yPosNombreEmpresa - 5);
            cb.stroke();

            // Agregar título
            float xPosTitulo = 70;
            float yPosTitulo = yPosNombreEmpresa - 30;
            cb.beginText();
            cb.setFontAndSize(baseFont, 16);
            cb.setTextMatrix(xPosTitulo, yPosTitulo);
            cb.showText("Recibo de Estacionamiento");
            cb.endText();

            // Agregar imagen después del título
            try {
                Image img = Image.getInstance("D:/boleta/logo_boleto.png");
                img.scaleAbsolute(100, 50); // Ajusta el tamaño de la imagen según sea necesario
                img.setAbsolutePosition(xPosTitulo, yPosTitulo - 60);
                documento.add(img);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Datos del recibo
            float y = yPosTitulo - 80; // Coordenada y inicial

            // Placa
            y = agregarTextoIzquierda(cb, baseFont, "Placa: " + v.getPlaca(), 70, y);

            String tipo = daoTipoVehiculo.obtenerTipo(v.getId_tipo_vehiculo());
            y = agregarTextoIzquierda(cb, baseFont, "Tipo vehiculo: " + tipo, 70, y);

            // Ubicación
            y = agregarTextoIzquierda(cb, baseFont, "Ubicación: " + registro.getId_ubicacion(), 70, y);

            // Horas de parking
            y = agregarTextoIzquierda(cb, baseFont, "La cantidad de horas a calcular de parking son: " + HORAS_TOTALES_REDONDEADO + "hs", 70, y);

            // Comisión
            y = agregarTextoIzquierda(cb, baseFont, "Tiene una comisión de: S/. " + comision + "hs", 70, y);

            // Precio total
            y = agregarTextoIzquierda(cb, baseFont, "El precio a pagar es de: S/" + costo_total, 70, y);

            // Mensaje de agradecimiento
            y = agregarTextoIzquierda(cb, baseFont, "Gracias por estacionarse.", 70, y);

            // Cerrar el documento
            documento.close();

            // Abrir el archivo PDF con el visor predeterminado
            try {
                Desktop.getDesktop().open(new File(rutaCompleta));
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("El ticket se ha creado exitosamente en el archivo " + rutaCompleta);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la fecha actual en un formato específico
    private static String obtenerFechaActual() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMdd_HHmmss");
        return formatoFecha.format(new Date());
    }
}
