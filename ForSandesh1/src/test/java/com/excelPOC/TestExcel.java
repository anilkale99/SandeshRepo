package com.excelPOC;

import org.testng.annotations.Test;

public class TestExcel {
	
	@Test
	public void test() throws Exception {
		
		
		ReadExcelData exl = new ReadExcelData("src/test/java/com/ReadFromExcel/DataSheet.xlsx");
		
		String s  =exl.getCellData(0, 0);
		

	}
	
	
//	public static void main(String args[]){
//		System.out.println("hello");
//	}

}
