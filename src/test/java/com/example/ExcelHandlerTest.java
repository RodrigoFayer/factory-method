package com.example;

import org.junit.jupiter.api.Test;

public class ExcelHandlerTest {
    @Test
    void shouldExportDataToExcel() {
        IFileHandler fileHandler = FileHandlerFactory.getFileHandler("Excel");
        String data = "data";

        String expected = "Exporting data to Excel: " + data;
        String actual = fileHandler.exportData(data);

        assert(expected.equals(actual));
    }

    @Test
    void shouldImportDataFromExcel() {
        IFileHandler fileHandler = FileHandlerFactory.getFileHandler("Excel");
        String filePath = "filePath";

        String expected = "Importing data from Excel: " + filePath;
        String actual = fileHandler.importData(filePath);

        assert(expected.equals(actual));
    }
}
