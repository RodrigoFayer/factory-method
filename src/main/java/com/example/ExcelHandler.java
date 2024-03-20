package com.example;

public class ExcelHandler implements IFileHandler{
    @Override
    public String exportData(String data) {
        return "Exporting data to Excel: " + data;
    }

    @Override
    public String importData(String filePath) {
        return "Importing data from Excel: " + filePath;
    }
}
