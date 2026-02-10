package com.tollsystem.util;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger {

    private static final String FILE_NAME = "toll-log.txt";

    public static void log(String message) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(LocalDateTime.now() + " : " + message + "\n");
        } catch (IOException e) {
            System.out.println("Failed to write log");
        }
    }
}