package com.example;

import org.junit.jupiter.api.Test;

public class PDFHandlerTest {
    @Test
    void shouldExportDataToPDF() {
        IFileHandler fileHandler = FileHandlerFactory.getFileHandler("PDF");
        String data = "data";

        String expected = "Exporting data to PDF: " + data;
        String actual = fileHandler.exportData(data);

        assert(expected.equals(actual));
    }

    @Test
    void shouldImportDataFromPDF() {
        IFileHandler fileHandler = FileHandlerFactory.getFileHandler("PDF");
        String filePath = "filePath";

        String expected = "Importing data from PDF: " + filePath;
        String actual = fileHandler.importData(filePath);

        assert(expected.equals(actual));
    }
}
