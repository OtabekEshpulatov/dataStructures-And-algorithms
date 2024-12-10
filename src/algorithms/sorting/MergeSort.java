package algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    static Random random = new Random();

    public static void main(String... args) {

        int arraySize = 10;
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = random.nextInt(-1_000, 1_000);
        }

        System.out.println("Before Sorting= " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("After Sorting= " + Arrays.toString(arr));

    }


    static void mergeSort(int[] inputArray) {
        int inputSize = inputArray.length;
        if (inputSize < 2) return;

        int medIndex = inputSize / 2;

        int[] leftHalf = new int[medIndex];
        int[] rightHalf = new int[inputSize - medIndex];

        System.arraycopy(inputArray, 0, leftHalf, 0, medIndex);
        System.arraycopy(inputArray, medIndex, rightHalf, 0, inputSize - medIndex);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }


    static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0;
        int counter = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] < rightHalf[j]) {
                inputArray[counter] = leftHalf[i];
                i++;
            } else {
                inputArray[counter] = rightHalf[j];
                j++;
            }
            counter++;
        }

        if (i == leftHalf.length) {
            while (j < rightHalf.length) {
                inputArray[counter++] = rightHalf[j++];
            }
        } else {
            while (i < leftHalf.length) {
                inputArray[counter++] = leftHalf[i++];
            }
        }
    }

}
