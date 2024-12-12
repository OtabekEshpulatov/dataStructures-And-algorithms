package algorithms;

import java.util.Arrays;
import java.util.Objects;

public class RemoveConsecutiveElements {


    public static void main(String... args) {
        Integer[] arr = {1, 2, 2, 2, 3, 3, 3, 4, 6, 7, 7, 7, 19, 20, 20, 19};

        System.out.println("Before= " + Arrays.toString(arr));
        setNullOnConsecutiveElements(arr);
        System.out.println("After= " + Arrays.toString(arr));
    }


    // removes elements in an array if next/prev elements are the same
    // Time Complexity is always O(n) - linear
    static void setNullOnConsecutiveElements(Integer[] arr) {
        Integer prevElement = null;
        Integer currentElement = null;
        int counter = 0;

        for (Integer element : arr) {
            prevElement = currentElement;
            currentElement = element;
            if (Objects.equals(prevElement, currentElement)) {
                arr[counter] = null;
            }
            counter++;
        }

    }
}
