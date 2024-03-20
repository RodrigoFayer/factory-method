package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVHandlerTest {
    @Test
    void shouldExportDataToCSV() {
        IFileHandler fileHandler = FileHandlerFactory.getFileHandler("CSV");
        String data = "data";

        String expected = "Exporting data to CSV: " + data;
        String actual = fileHandler.exportData(data);

        assertEquals(expected, actual);
    }

    @Test
    void shouldImportDataFromCSV() {
        IFileHandler fileHandler = FileHandlerFactory.getFileHandler("CSV");
        String filePath = "filePath";

        String expected = "Importing data from CSV: " + filePath;
        String actual = fileHandler.importData(filePath);

        assertEquals(expected, actual);
    }
}
