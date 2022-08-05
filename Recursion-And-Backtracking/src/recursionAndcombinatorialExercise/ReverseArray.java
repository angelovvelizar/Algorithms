package recursionAndcombinatorialExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] reversedArray = new int[array.length];

        reverseArray(array, reversedArray, 0);
    }

    private static void reverseArray(int[] array, int[] reversedArray, int index) {
        if(index >= array.length){
            printReversedArray(reversedArray);
            return;
        }

        reversedArray[index] = array[array.length - 1 - index];

        reverseArray(array, reversedArray, index + 1);
    }

    private static void printReversedArray(int[] reversedArray) {
        for (int number : reversedArray) {
            System.out.print(number + " ");
        }
    }
}
