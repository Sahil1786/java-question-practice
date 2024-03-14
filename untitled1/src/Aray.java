import java.util.Arrays;
import java.util.Scanner;

public class Aray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr [0]=13;
        arr [1]=16;
        arr [2]=02;
        arr [3]=102;




        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();


        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+ " ");
//
//        }
        for (int num :arr) {
            System.out.println(num + " ");

        }
    }
}
