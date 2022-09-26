package org.example;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Main {
    public static void main(String[] args) {


        try {
            print();
            create();

        } catch (IOException e) {
            System.out.println("File invalid for writing.");
        }

    }
    public static void print() {
        try {
            FileInputStream inputStream = new FileInputStream(new File("domaci22.xlsx"));

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int i = 0;
            while (sheet.getRow(i).getCell(0).getStringCellValue() != null) {
                XSSFRow row = sheet.getRow(i);
                System.out.print(row.getCell(0) + " ");
                System.out.println(row.getCell(1));

                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println();
        }
/*        for (int i = 0; i < listaImena.size(); i++) {

            if (i % 2 == 0){
                System.out.println();
            }
            System.out.print(listaImena.get(i) + " ");
        }*/
    }

    public static void create() throws IOException {
        Faker faker = new Faker();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        for (int i = 2; i < 10; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            XSSFRow row = sheet.createRow(i);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(firstName + " ");
            XSSFCell cell1 = row.createCell(1);
            cell1.setCellValue(lastName);
        }
        FileOutputStream fileOutputStream = new FileOutputStream("domaci22.xlsx");
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
    }
}