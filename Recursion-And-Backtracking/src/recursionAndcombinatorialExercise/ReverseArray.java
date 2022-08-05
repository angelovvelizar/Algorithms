package recursionAndcombinatorialExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        reverseArray(array, array.length - 1);
    }

    private static void reverseArray(int[] array, int index) {
        if(index < 0){
            return;
        }

        System.out.print(array[index] + " ");
        reverseArray(array, index - 1);
    }

}
