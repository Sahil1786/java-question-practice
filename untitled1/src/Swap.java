import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[]  arr = {12,14,15,16,17};
           reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr ){
        int start=0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
      start++;
      end--;


        }
    }

    static  void swap (int [] arr, int index1,int indwx2){
        int temp = arr [index1];
        arr[index1]=arr[indwx2];
        arr[indwx2]=temp;

    }
}
