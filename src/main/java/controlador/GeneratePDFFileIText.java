package controlador;

import VO.MedicamentosVO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

import java.awt.Font;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Example of using the iText library to work with PDF documents on Java, lets
 * you create, analyze, modify and maintain documents in this format. Ejemplo de
 * uso de la librería iText para trabajar con documentos PDF en Java, nos
 * permite crear, analizar, modificar y mantener documentos en este formato.
 *
 * @author xules You can follow me on my website http://www.codigoxules.org/en
 * Puedes seguirme en mi web http://www.codigoxules.org
 */
public class GeneratePDFFileIText {

    //Ruta del archivo dentro del proyecto de Netbeans.
    public static String archivo = System.getProperty("user.dir") + "/lista_clientes.pdf";

    /*
    * writePDF(): genera un archivo pdf plano
     */
    /*public static void writePDF() throws DocumentException {

        Document document = new Document();

        try {
            String path = new File(".").getCanonicalPath();
            String FILE_NAME = path + "/itext-test-file.pdf";

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            document.open();

            Paragraph paragraphHello = new Paragraph();
            paragraphHello.add("Hello iText paragraph!");
            paragraphHello.setAlignment(Element.ALIGN_JUSTIFIED);

            document.add(paragraphHello);

            Paragraph paragraphLorem = new Paragraph();
            paragraphLorem.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                    + "Maecenas finibus fringilla turpis, vitae fringilla justo."
                    + "Sed imperdiet purus quis tellus molestie, et finibus risus placerat."
                    + "Donec convallis eget felis vitae interdum. Praesent varius risus et dictum hendrerit."
                    + "Aenean eu semper nunc. Aenean posuere viverra orci in hendrerit. Aenean dui purus, eleifend nec tellus vitae,"
                    + " pretium dignissim ex. Aliquam erat volutpat. ");

            java.util.List<Element> paragraphList = new ArrayList<>();

            paragraphList = paragraphLorem.breakUp();

            Paragraph p3 = new Paragraph();
            p3.addAll(paragraphList);
            p3.add("TEST LOREM IPSUM DOLOR SIT AMET CONSECTETUR ADIPISCING ELIT!");

            document.add(paragraphLorem);
            document.add(p3);
            document.close();

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void crearPDF(ArrayList<MedicamentosVO> med, float total) throws DocumentException {
        //Declaramos un documento como un objecto Document. 
        Document documento = new Document(PageSize.LETTER, 80, 80, 75, 75);
        //writer es declarado como el método utilizado para escribir en el archivo.
        PdfWriter writer = null;

        try {
            //Obtenemos la instancia del archivo a utilizar.
            writer = PdfWriter.getInstance(documento, new FileOutputStream(archivo));
        } catch (FileNotFoundException | DocumentException ex) {
            ex.getMessage();
        }

        //Agregamos un título al documento.
        documento.addTitle("ARCHIVO PDF GENERADO DESDE JAVA");

        //Abrimos el documento a editar.
        documento.open();

        try {
            //Obtenemos la instancia de la imagen/logo.
            Image imagen = Image.getInstance("..\\resourses\\logo_principal.png");

            //Alineamos la imagen al centro del documento.
            imagen.setAlignment(Image.ALIGN_CENTER);
            //Agregamos la imagen al documento.
            documento.add(imagen);
        } catch (IOException | DocumentException ex) {
            ex.getMessage();
        }

        //Creamos un párrafo nuevo llamado "vacio1" para espaciar los elementos.
        Paragraph vacio1 = new Paragraph();
        vacio1.add("\n\n");
        documento.add(vacio1);

        //Declaramos un texto como Paragraph. Le podemos dar formato alineado, tamaño, color, etc.
        Paragraph titulo = new Paragraph();
        titulo.setAlignment(Paragraph.ALIGN_CENTER);
        titulo.setFont(FontFactory.getFont("Times New Roman", 24, Font.BOLD, BaseColor.RED));
        titulo.add("LISTADO DEL PEDIDO");

        try {
            //Agregamos el texto al documento.
            documento.add(titulo);
        } catch (DocumentException ex) {
            ex.getMessage();
        }

        //Creamos un párrafo nuevo llamado "saltolinea" simulando un salto de linea para espaciar
        //los elementos del PDF.
        Paragraph saltolinea = new Paragraph();
        saltolinea.add("\n\n");
        documento.add(saltolinea);

        //Creamos un párrafo llamado "parrafo" donde irá el contenido del PDF.
        Paragraph parrafo = new Paragraph();
        for (int i = 0; i < med.size(); i++) {
            parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK));
            //Añadimos al párrafo "parrafo" los clientes de la lista clientes.
            //parrafo.add(med.get(i));
            //Añadimos ese párrafo "parrafo" al documento "documento".
            documento.add(parrafo);

            //https://es.stackoverflow.com/questions/39307/generar-pdf-con-itext-insertar-datos-en-tabla-java //LEER
        }

        //Cerramos el documento.
        documento.close();
        //Cerramos el writer.
        writer.close();
    }

    public static void createPDF(PedidoCliente pedidoCliente) throws DocumentException {
        //Declaramos un documento como un objecto Document.
        Document documento = new Document(PageSize.LETTER, 80, 80, 75, 75);
        //writer es declarado como el método utilizado para escribir en el archivo.
        PdfWriter writer = null;
        try {
            //Obtenemos la instancia del archivo a utilizar.
            writer = PdfWriter.getInstance(documento, new FileOutputStream(archivo));
        } catch (FileNotFoundException | DocumentException ex) {
            ex.getMessage();
        }
        documento.open();
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        String fechaHora = String.format("%s/%s/%s - %02d:%02d:%02d", dia, mes, anio, hora, minuto, segundo);
        //PdfFont font = PdfFontFactory.createFont();
        //PdfFont font = PdfFontFactory.createFont("assets/product_sans_regular.ttf", PdfEncodings.IDENTITY_H, true);
        documento.add(getText("SYSTOCK", 15, true));
        documento.add(getText("Sistema de Gestión de Mercadería, Facturación y Gestión de Clientes", 12, true));
        documento.add(getText("----------------------------------------------------------------------------------------------------------------------", 11, true));
        documento.add(getText("Datos del Pedido", 12, false));
        documento.add(getText("Fecha de Generación de Factura: " + fechaHora, 10 , true));
        documento.add(getText(pedidoCliente.toString(), 11, false));
        documento.add(getText("----------------------------------------------------------------------------", 11, false));
        documento.add(getText("Datos del Cliente", 12, false));
        documento.add(getText(pedidoCliente.getCliente().toString(), 11, false));
        documento.add(getText("Lista de Productos", 12, true));
        Table table = new Table(new UnitValue[]{new UnitValue(UnitValue.PERCENT, 5.f),
            new UnitValue(UnitValue.PERCENT, 20f),
            new UnitValue(UnitValue.PERCENT, 30f),
            new UnitValue(UnitValue.PERCENT, 10f),
            new UnitValue(UnitValue.PERCENT, 10f),
            new UnitValue(UnitValue.PERCENT, 10f),}).setWidth(UnitValue.createPercentValue(100))
                .setMarginTop(10).setMarginBottom(10);
        table.addHeaderCell(createCell("ID", true));
        table.addHeaderCell(createCell("Nombre", true));
        table.addHeaderCell(createCell("Descripcion", true));
        table.addHeaderCell(createCell("Cantidad", true));
        table.addHeaderCell(createCell("Precio", true));
        table.addHeaderCell(createCell("Total", true));
        for (DetalleProducto detalleProducto : pedidoCliente.getProductos()) {
            table.addCell(createCell(String.valueOf(detalleProducto.getProducto().getCodProducto()), true));
            table.addCell(createCell(String.valueOf(detalleProducto.getProducto().getNombre()), true));
            table.addCell(createCell(String.valueOf(detalleProducto.getProducto().getDescripcion()), true));
            table.addCell(createCell(String.valueOf(detalleProducto.getCantidad()), true));
            table.addCell(createCell(String.format("%.2f", detalleProducto.getProducto().getPrecio()), true));
            table.addCell(createCell(String.format("%.2f", detalleProducto.getProducto().getPrecio() * detalleProducto.getCantidad()), true));
        }
        documento.add(table);
        documento.add(getText(String.format("SubTotal: %.2f", pedidoCliente.getMonto()), 12, false).setTextAlignment(TextAlignment.RIGHT));
        documento.add(getText(String.format("Total: %.2f", pedidoCliente.getMontoTotal()), 13, false).setTextAlignment(TextAlignment.RIGHT));
        documento.add(getText(observaciones, 11, false));
        documento.close();

        dialogoFinalizarPedido.close();
    }

*/
}
