import java.util.Arrays;

public class DynamicArry {
    public static void main(String[] args) {
        int [][] arr = {
                {1,32,45},
                {32,3},
                {76,78,98,87}

        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print( arr[row][col] + " ");

            }
            System.out.println("");

        }
        for(int[] nums : arr){
            System.out.println(Arrays.toString(nums));
        }
    }

}
