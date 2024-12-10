package algorithms;

public class MergeSortedArray {


    public static void main(String[] args) {


    }

    // keep comparing the smallest elements in the array
    // put the smallest elements to the array and increment counter
    // continue this until one of the array is finished
    // the another array elements will be transferred to the new array
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
