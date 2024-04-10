package org.java9;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class TeeingCollector {

    public static void main(String[] args) throws IOException {

        Files.write(Path.of("src/main/resources/10000words.txt"),WordGeneratorUtil.generateWordList());

        Path path = Path.of("src/main/resources/10000words.txt");

        //Solution 1
        System.out.println("Solution 1");
        readAndStreamTwice(path);

        //Solution 2
        System.out.println("Solution 2");
        streamTwice(path);

        //Solution 3
        System.out.println("Solution 3");
        teeingCollector(path);
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

    private static void streamTwice(Path path) throws IOException {

        try(Stream<String> line = Files.lines(path)){
            Optional<String> min = line.min(comparing(String::length));
            //Optional<String> max = line.max(comparing(String::length));
            //stream has already been operated upon or closed

            System.out.println("Smallest word : " + min.orElseGet(() -> "Word not found"));
            //System.out.println("Longest word : " + max.orElseGet(() -> "Word not found"));
        }
    }

    private static void teeingCollector(Path path) throws IOException {

        try(Stream<String> line = Files.lines(path)){
            Statistics data = line.collect(Collectors.teeing(
                    minBy(comparing(String::length)),
                    maxBy(comparing(String::length)),
                    (smallestWord, longestWord) -> new Statistics(smallestWord.orElse(null), longestWord.orElse(null))
            ));

            System.out.println(data);
        }


    }
}

class Statistics {

    final private String smallestWord;
    final private String longestWord;

    public Statistics(String smallestWord, String longestWord) {
        this.smallestWord = smallestWord;
        this.longestWord = longestWord;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "smallestWord='" + smallestWord + '\'' +
                ", longestWord='" + longestWord + '\'' +
                '}';
    }
}
