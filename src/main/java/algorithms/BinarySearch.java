package algorithms;

import static algorithms.BubbleSort.displayArray;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 9, 11, 15, 17, 20, 23, 34, 45, 56, 65, 100};
        displayArray(arr);
        int l = 0;
        int r = arr.length - 1;
        int searchedNumber = 2;

       resultRecursiveBinarySearch(arr, l, r, searchedNumber);
     //   resultIterativeBinarySearch(arr, l, r, searchedNumber);
    }


    public static int binarySearchRecursive(int[] arr, int left, int right, int searchedNumber) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == searchedNumber) {
                return mid;
            } else if (searchedNumber > arr[mid]) {
                return binarySearchRecursive(arr, mid + 1, right, searchedNumber);
            } else return binarySearchRecursive(arr, left, mid - 1, searchedNumber);
        }
        return -1;
    }

    private static void resultRecursiveBinarySearch(int[] arr, int l, int r, int searchedNumber) {
        int result =binarySearchRecursive(arr, l, r, searchedNumber);
        if ( result== -1) {
            System.out.println("\nNumber " + searchedNumber + " not found!");
        } else {
            System.out.println("\nNumber " + searchedNumber + " found on position: " + result);
        }

    }


    public static int binarySearchIterative(int[] arr, int left, int right, int searchedNumber) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == searchedNumber) {
                return mid;
            } else if (arr[mid] > searchedNumber) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private static void resultIterativeBinarySearch(int[] arr, int l, int r, int searchedNumber) {
        int result=binarySearchIterative(arr, l, r, searchedNumber);
        if (result == -1) {
            System.out.println("\nNumber " + searchedNumber + " not found!");
        } else {
            System.out.println("\nNumber " + searchedNumber + " found on position: " + result);
        }

    }
}
