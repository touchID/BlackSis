package tk.network.excel;import java.io.File;import jxl.*;public class DoXLS {			public static void main(String[] args) {		Workbook book = null;		try {			book = Workbook.getWorkbook(new File("/Users/admin/Sites/Xiang.Mu/项目安排.xls"));					//获得第一个工作表对象		Sheet sheet=book.getSheet(0);		//得到第一列第一行的单元格        int rows = sheet.getRows();        for(int i = 0; i < rows; i++) {		Cell cell1=sheet.getCell(0,i);		String result=cell1.getContents();			System.out.println(result);        }        for(int i = 0; i < rows; i++) {    		Cell cell1=sheet.getCell(1,i);    		String result=cell1.getContents();    			System.out.println(result);            }		} catch (Exception e) {			// TODO Auto-generated catch block			e.printStackTrace();		}        book.close();					}}