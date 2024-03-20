package com.example;

public class FileHandlerFactory {
    public static IFileHandler getFileHandler(String fileType) {
        Class fileHandlerClass = null;
        Object fileHandler = null;

        try {
            fileHandlerClass = Class.forName("com.example." + fileType + "Handler");
            fileHandler = fileHandlerClass.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new IllegalArgumentException("Undefined Service");
        }

        if (!(fileHandler instanceof IFileHandler)) {
            throw new IllegalArgumentException("Invalid Service");
        }

        return (IFileHandler) fileHandler;
    }
}
