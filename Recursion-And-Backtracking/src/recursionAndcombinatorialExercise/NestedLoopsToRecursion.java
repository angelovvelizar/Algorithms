package recursionAndcombinatorialExercise;

import java.util.Scanner;

public class NestedLoopsToRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] results = new int[number];

        fillArray(results, 0);
    }

    private static void fillArray(int[] results, int index) {
        if(index >= results.length){
            print(results);
            return;
        }

        for (int i = 1; i <= results.length; i++) {
            results[index] = i;
            fillArray(results, index + 1);
        }


    }

    private static void print(int[] results) {
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }

}
