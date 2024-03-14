import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int [] arr= {1,2,67,89};
        change(arr);
        System.out.println(Arrays.toString(arr) );

    }
    static void change(int [] num){
        num [0] =99;
    }

}
