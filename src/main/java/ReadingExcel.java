import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcel {

    public static void main(String[] args) throws IOException {
        String excelPath="";
        FileInputStream fis=new FileInputStream(excelPath);

        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet =workbook.getSheetAt(0);

        int row=sheet.getLastRowNum();
//        int col=ro


    }
}
