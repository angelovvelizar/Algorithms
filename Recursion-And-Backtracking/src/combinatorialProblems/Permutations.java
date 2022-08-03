package combinatorialProblems;

import java.util.HashSet;
import java.util.Scanner;

public class Permutations {

    public static String[] elements;
    public static String[] permutes;
    public static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elements = sc.nextLine().split("\\s");
        permutes = new String[elements.length];
        used = new boolean[elements.length];


        permute(0);
    }

    //Without repetition!
   /* private static void permute(int index) {
        if(index >= elements.length){
            print();
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                used[i] = true;
                permutes[index] = elements[i];
                permute(index + 1);
                used[i] = false;
            }
        }
    }*/

    //With swap algorithm - better memory optimization
    /*private static void permute(int index) {
        if (index >= elements.length) {
            print(elements);
            return;
        }
        permute(index + 1);


        for (int i = index + 1; i < elements.length; i++) {
            swap(elements,index, i);
            permute(index + 1);
            swap(elements,index, i);
        }
    }*/

    //With repetition
    private static void permute(int index) {
        if (index >= elements.length) {
            print(elements);
            return;
        }
        permute(index + 1);
        HashSet<String> swapped = new HashSet<>();
        swapped.add(elements[index]);

        for (int i = index + 1; i < elements.length; i++) {
            if(!swapped.contains(elements[i])) {
                swap(elements, index, i);
                permute(index + 1);
                swap(elements, index, i);
                swapped.add(elements[i]);
            }
        }
    }

    private static void swap(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static void print(String[] arr) {
        for (String element : arr) {
            System.out.print(element);
        }
        System.out.println();
    }
}
