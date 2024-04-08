package org.java9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class StringApiChanges {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/resources/lyrics.txt");

        String lyrics = Files.readString(path);
        String[] lyricsArray = lyrics.split(">>");

        //Java 9
        List<String> chorus =
               Arrays.stream(lyricsArray)
                       .filter(lyric -> !lyric.isBlank())
                       .map(line -> line.strip())
                       .map(line -> line.repeat(3))
                       .collect(Collectors.toList());

        //Java 11
        List<String> chorus1 =
                Arrays.stream(lyricsArray)
                        .filter(not(String::isBlank))
                        .map(String::strip)
                        .map(line -> line.repeat(3))
                        .collect(Collectors.toList());

        Files.write(Path.of("src/main/resources/lyrics_with_chorus.txt"),chorus1);
    }
}
