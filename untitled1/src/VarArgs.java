import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,35,667,889,987,98);
        Muktiple(12,13,"sahil","sonia");
    }

    static void Muktiple(int a ,int b , String...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));

    }

}
