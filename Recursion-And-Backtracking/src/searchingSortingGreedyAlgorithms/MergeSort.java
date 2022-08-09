package searchingSortingGreedyAlgorithms;

public class MergeSort {
    public static void main(String[] args) {

        int[] array = {5, 4, 3, 2, 1};

        mergeSort(array, 0, array.length - 1);

        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    private static void mergeSort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int mid = (begin + end) / 2;

        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);

        merge(array, begin, mid, end);
    }

    private static void merge(int[] array, int begin, int mid, int end) {
        if (mid < 0 || mid >= array.length || array[mid] < array[mid + 1]) {
            return;
        }

        int left = begin;
        int right = mid + 1;

        int[] helper = new int[array.length];

        for (int i = begin; i <= end; i++) {
            helper[i] = array[i];
        }

        for (int i = begin; i <= end; i++) {
            if (left > mid) {
                array[i] = helper[right++];
            } else if (right > end) {
                array[i] = helper[left++];
            } else if (helper[left] < helper[right]) {
                array[i] = helper[left++];
            } else {
                array[i] = helper[right++];
            }
        }

    }
}
