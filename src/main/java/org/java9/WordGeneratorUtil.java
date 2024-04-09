package org.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class WordGeneratorUtil {
    // Define arrays of vowels and consonants
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    private static final char[] CONSONANTS = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    private static final Random random = new Random();

    public static List<String> generateWordList(){
        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            wordList.add(generateWord());
        }
        return wordList;
    }

    // Generate a random English word
    public static String generateWord() {
        int length = random.nextInt(8) + 3; // Random length between 3 and 10 characters
        boolean isVowel = random.nextBoolean(); // Decide whether the word starts with a vowel or consonant

        return random.ints(length, 0, isVowel ? VOWELS.length : CONSONANTS.length)
                .mapToObj(i -> isVowel ? VOWELS[i] : CONSONANTS[i])
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
