package algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String... args) {
        int[] arr = {4, 1, 6, 7, 2, 2, 1, 9, -111, 121213, 123};
        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }


    // all elements on the left side of the pivot should be smaller or equal to the pivot
    // all elements on the right side of the pivot should be larger or equal to the pivot
    static void sort(int[] arr, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int partitionPoint = getPartitionIndex(arr, lowerBound, upperBound);
            sort(arr, lowerBound, partitionPoint - 1);
            sort(arr, partitionPoint + 1, upperBound);
        }
    }

    static int getPartitionIndex(int[] arr, final int lowerBound, final int upperBound) {
        int pivot = arr[lowerBound];
        int start = lowerBound;
        int end = upperBound;

        while (start < end) {
            while (start < end && arr[start] <= pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                swap(arr, start, end);
            }
        }

        swap(arr, end, lowerBound);
        return end;
    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
