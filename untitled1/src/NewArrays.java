import java.util.Arrays;

public class NewArrays {
    public static void main(String[] args) {
        int [] nums = {12,5,78,76,45};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int [] arr){
        arr[2] = 55;
    }

}
