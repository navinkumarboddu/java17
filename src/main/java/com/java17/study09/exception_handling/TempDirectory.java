package com.java17.study09.exception_handling;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class TempDirectory implements AutoCloseable {

    private final Path directory;

    public TempDirectory(String prefix) throws IOException {
        this.directory = Files.createTempDirectory(prefix);
    }

    public Path getDirectory(){
        return directory;
    }

    @Override
    public void close() throws Exception {
        Files.walkFileTree(directory,new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException
            {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                    throws IOException
            {
                if (exc == null) {
                    Files.delete(dir);
                    return FileVisitResult.CONTINUE;
                } else {
                    throw exc;
                }
            }

        });
    }
}
