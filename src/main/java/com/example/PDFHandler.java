package com.example;

public class PDFHandler implements IFileHandler{
    @Override
    public String exportData(String data) {
        return "Exporting data to PDF: " + data;
    }

    @Override
    public String importData(String filePath) {
        return "Importing data from PDF: " + filePath;
    }
}
