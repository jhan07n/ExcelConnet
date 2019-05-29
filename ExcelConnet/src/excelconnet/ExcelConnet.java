/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelconnet;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/**
 *
 * @author jnavarro
 */
public class ExcelConnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se crea el libro
        HSSFWorkbook libro = new HSSFWorkbook();

        // Se crea una hoja dentro del libro
        HSSFSheet hoja = libro.createSheet();

        // Se crea una fila dentro de la hoja
        HSSFRow fila = hoja.createRow(0);

        // Se crea una celda dentro de la fila
        HSSFCell celda = fila.createCell((short) 0);

        // Se crea el contenido de la celda y se mete en ella.
        HSSFRichTextString texto = new HSSFRichTextString("hola mundo");
        celda.setCellValue(texto);

        // Se salva el libro.
        try {
            FileOutputStream elFichero = new FileOutputStream("holamundo.xls");
            libro.write(elFichero);
            elFichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        FrmPrin formulario = new FrmPrin();
        formulario.setVisible(true);
    }
    
}
