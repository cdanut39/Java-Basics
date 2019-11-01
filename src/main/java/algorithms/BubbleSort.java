package algorithms;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr = {23, 45, 56, 2, 65, 15, 9, 17, 11, 20, 100, 34};
        System.out.println("Array before Bubble Sort");
        displayArray(arr);
        System.out.println("\nArray after Bubble Sort");
        bubbleSort(arr);
        displayArray(arr);

    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
    }
        return arr;
}


    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}
