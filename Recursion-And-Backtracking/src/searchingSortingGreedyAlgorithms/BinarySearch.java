package searchingSortingGreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter integer array: ");

        int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Please enter the number which index you want to find: ");
        int key = Integer.parseInt(sc.nextLine());

        System.out.println(getIndex(arr, key));
    }

    private static  int getIndex(int[] arr, int key) {
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;



        while(start <= end){

            int mid = (start + end) / 2;
            if(key > arr[mid]){
                start = mid + 1;
            } else if (key < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
