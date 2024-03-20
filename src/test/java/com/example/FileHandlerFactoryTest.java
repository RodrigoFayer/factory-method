package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileHandlerFactoryTest {
    @Test
    void shouldThrowExceptionWhenFileTypeIsInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FileHandlerFactory.getFileHandler("InvalidFileType");
        });

        String expectedMessage = "Undefined Service";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void shouldThrowExceptionWhenFileHandlerIsInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FileHandlerFactory.getFileHandler("Txt");
        });

        String expectedMessage = "Invalid Service";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void shouldReturnFileHandlerWhenFileTypeIsValid() {
        IFileHandler fileHandler = FileHandlerFactory.getFileHandler("PDF");

        assertEquals(PDFHandlerTest.class, fileHandler.getClass());
    }
}
