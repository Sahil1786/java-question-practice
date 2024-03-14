import java.util.Arrays;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int[][] arr=new int[2][2];

        Scanner in =new Scanner(System.in);
        System.out.println("enter arr:");
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=in.nextInt();
            }

        }
//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for (int[] element:arr
             ) {
            System.out.print(Arrays.toString(element));

        }
    }

}
