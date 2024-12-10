package algorithms.searching;

public class BinarySearchRecursive {
    public static void main(String... args) {

        int[] arr = {1, 2, 8, 9, 16, 19, 21, 24, 67};
        int target = 67;

        int search = search(arr, target);
        if (search > -1) {
            System.out.println("Target found at index " + search);
        } else {
            System.out.println("Target cannot be found!");
        }


    }

    //    array must be sorted in ASC order
    static int search(int[] arr, int target) {
        return search(arr, 0, arr.length - 1, target);
    }

    static int search(int[] arr, int start, int end, int target) {
        if(end<start)return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target)
            return search(arr, start, mid - 1, target);
        else
            return search(arr, mid + 1, end, target);
    }


}
