package managers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExcelHelper {

    public static ArrayList<HashMap<String, String>> readInputExcel() {

        DataFormatter formatter = new DataFormatter();
        ArrayList<HashMap<String, String>> rowArrayList = null;
        try{
            FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/"+System.getProperty("excelfile")+".xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            List<JSONObject> rowData = new ArrayList<>();

            Row headerRow = sheet.getRow(0);
            Map<Integer, String> headerMap = new HashMap<>();
            for(Cell cell: headerRow) headerMap.put(cell.getColumnIndex(), cell.getStringCellValue());

            for(Row eachRow: sheet) {
                JSONObject cellObj = new JSONObject();
                if(eachRow.getRowNum() > 0) {
                    for(int colInd: headerMap.keySet()) {
                        cellObj.put(headerMap.get(colInd), formatter.formatCellValue(eachRow.getCell(colInd)));
                    }
                }
                if(cellObj.size() !=0) rowData.add(cellObj);

            }
            List<JSONObject> rowList = rowData.stream().collect(Collectors.toList());
            rowArrayList = new ArrayList(rowList);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rowArrayList;
    }


}
