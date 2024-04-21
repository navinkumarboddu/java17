package com.java17.study09.exception_handling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class TryWithResourceExmaple06 {

    public static void main(String[] args) throws Exception {
        try(var tempDir = new TempDirectory("test");
            var out = Files.newBufferedWriter(tempDir.getDirectory().resolve("test.txt"), StandardCharsets.UTF_8)){
            System.out.println("Temporary Directory: " + tempDir.getDirectory());
            out.write("Pluralsight");
        }
    }
}
