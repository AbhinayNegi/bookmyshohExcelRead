package test;

import java.io.IOException;
import java.util.List;

import utility.ExcelRead;

public class ExcelTest {

	public ExcelTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		List<String> row = ExcelRead.readRow("D:\\Java personal projects\\BookmyshowExcelRead\\MovieDetails.xlsx");
		
		System.out.println(row);
	}

}
