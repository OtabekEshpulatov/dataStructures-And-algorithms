package algorithms.searching;

public class BinarySearch {
    public static void main(String... args) {

        int[] arr = {1, 2, 8, 9, 16, 19, 21, 24, 67};
        int target = 1231231231;

        int search = search(arr, target);
        if (search > -1) {
            System.out.println("Target found at index " + search);
        } else {
            System.out.println("Target cannot be found!");
        }


    }

    //    array must be sorted in ASC order
    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }

        }

        return -1;
    }


}
