package me.alex4386.gachon.sw14462.day03;

public class WordShuffler {
    public static String moveFirstWordToLast(String sentence) {
        String[] words = sentence.split(" ");
        String firstWord = words[0];

        StringBuilder newSentenceBuilder = new StringBuilder();
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (i == 1) word = word.substring(0, 1).toUpperCase() + word.substring(1);
            newSentenceBuilder.append(word);
            newSentenceBuilder.append(" ");
        }

        newSentenceBuilder.append(firstWord);
        return newSentenceBuilder.toString();
    }
}
