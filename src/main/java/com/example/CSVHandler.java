package com.example;

public class CSVHandler implements IFileHandler{
    @Override
    public String exportData(String data) {
        return "Exporting data to CSV: " + data;
    }

    @Override
    public String importData(String filePath) {
        return "Importing data from CSV: " + filePath;
    }
}
