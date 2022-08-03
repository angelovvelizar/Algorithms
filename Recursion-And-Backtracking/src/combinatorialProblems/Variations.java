package combinatorialProblems;

import java.util.Scanner;

public class Variations {

    public static String[] elements;
    public static boolean[] used;

    public static String[] slots;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elements = sc.nextLine().split("\\s");
        used = new boolean[elements.length];
        int slotsNumber = Integer.parseInt(sc.nextLine());

        slots = new String[slotsNumber];

        variation(0);


    }


    private static void variation(int index) {
        if (index >= slots.length) {
            print(slots);
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                used[i] = true;
                slots[index] = elements[i];
                variation(index + 1);
                used[i] = false;
            }
        }
    }


    private static void print(String[] arr) {
        for (String element : arr) {
            System.out.print(element);
        }
        System.out.println();
    }
}
