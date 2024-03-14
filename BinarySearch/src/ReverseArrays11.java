import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }

    static void reverse(int[] arr) {

        int end = arr.length - 1;
        for (int start = 0; start <end ; start++ ,end--) {
            swap(arr,start,end);

        }
    }
}


