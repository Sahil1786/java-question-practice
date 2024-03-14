import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        int size = arr.length;

        System.out.print("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Subarrays with sum 0:\n");
        subArrReturn(arr, size);


    }

    public static void subArrReturn(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    System.out.print("Subarray Ami Gay Sahil , ekta boka chondra with sum 0 found: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    }
