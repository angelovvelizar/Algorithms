package recursionAndcombinatorialExercise;

import java.util.Scanner;

public class CombinationWithRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());

        int[] elements = getElements(n);
        int[] slots = new int[k];

        combinations(0, 0, elements, slots);
    }


    private static void combinations(int index, int start, int[] elements, int[] slots) {
        if(index == slots.length){
            print(slots);
            return;
        }

        for (int i = start; i < elements.length; i++) {
            slots[index] = elements[i];
            combinations(index + 1, i, elements, slots);
        }

    }

    private static void print(int[] slots) {
        for (int slot : slots) {
            System.out.print(slot + " ");
        }
        System.out.println();
    }

    private static int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 1; i <= n; i++) {
            elements[i - 1] = i;
        }

        return  elements;
    }
}
