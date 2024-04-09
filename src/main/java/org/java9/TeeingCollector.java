package org.java9;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class TeeingCollector {

    public static void main(String[] args) throws IOException {

        Files.write(Path.of("src/main/resources/10000words.txt"),WordGeneratorUtil.generateWordList());

        Path path = Path.of("src/main/resources/10000words.txt");

        //Solution 1
        System.out.println("Solution 1");
        readAndStreamTwice(path);

    }

    private static void readAndStreamTwice(Path path) throws IOException {
        try(Stream<String> line = Files.lines(path)){
            Optional<String> min = line.min(comparing(String::length));
            System.out.println("Smallest word : " + min.orElseGet(() -> "Word not found"));
        }

        try(Stream<String> line = Files.lines(path)){
            Optional<String> max = line.max(comparing(String::length));
            System.out.println("Longest word : " + max.orElseGet(() -> "Word not found"));
        }
    }
}
