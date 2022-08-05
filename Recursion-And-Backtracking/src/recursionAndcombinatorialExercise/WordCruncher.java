package recursionAndcombinatorialExercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class WordCruncher {

    public static String[] words;

    public static List<String> newWords = new ArrayList<>();

    public static String[] tooManyWords;

    public static String originalWord;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        words = sc.nextLine().split(", ");
        originalWord = sc.nextLine();

        for (String word : words) {
            if (originalWord.contains(word)) {
                newWords.add(word);
            }
        }

        tooManyWords = new String[newWords.size()];
        for (int i = 0; i < newWords.size(); i++) {
            tooManyWords[i] = newWords.get(i);
        }


        permute(0);


    }

    private static void permute(int index) {
        if (index >= tooManyWords.length) {
            print(tooManyWords);
            return;
        }
        permute(index + 1);


        for (int i = index + 1; i < tooManyWords.length; i++) {
            swap(tooManyWords,index, i);
            permute(index + 1);
            swap(tooManyWords,index, i);
        }
    }

    private static void print(String[] words) {
        if(String.join("", words).equals(originalWord)){
            System.out.println(String.join(" ", words));
        }
    }

    private static void swap(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
