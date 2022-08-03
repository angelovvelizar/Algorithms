package combinatorialProblems;

import java.util.Scanner;

public class Combinations {

    public static String[] elements;
    public static String[] slots;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elements = sc.nextLine().split("\\s");
        int slotsNumber = Integer.parseInt(sc.nextLine());

        slots = new String[slotsNumber];

        combinations(0, 0);


    }


    private static void combinations(int index, int start) {
        if (index == slots.length) {
            print(slots);
            return;
        }

        for (int i = start; i < elements.length; i++) {
            slots[index] = elements[i];
            combinations(index + 1, i + 1);
        }

    }


    private static void print(String[] arr) {
        for (String element : arr) {
            System.out.print(element);
        }
        System.out.println();
    }
}
