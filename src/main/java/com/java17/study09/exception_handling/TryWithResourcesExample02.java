package com.java17.study09.exception_handling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TryWithResourcesExample02 {

    public static void removeEmptyLines(String inputFileName, String outputFileName) throws IOException{
        try(BufferedReader in = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
            BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8))) {
            String line;
            while ((line = in.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    out.write(line);
                    out.write(System.lineSeparator());
                }
            }
        }
    }
}
