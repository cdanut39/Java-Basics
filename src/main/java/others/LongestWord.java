package others;

import java.util.Arrays;
import java.util.Comparator;

class LongestWord {
    public static void main(String[] args) {
        String s = "Today is the happiest day of my life";
        longestWord(s);
        longestWordWithLambda(s);

    }

    public static void longestWord(String s) {
        String maxWord = "";
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }
        System.out.println(maxWord + " --> " + maxWord.length()+" characters");
    }

    public static void longestWordWithLambda(String s){
        System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
    }
}