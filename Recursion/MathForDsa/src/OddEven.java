

public class OddEven {


        public static void main(String[] args) {
            int num=69;
            System.out.println(isOdd(num));
        }
        private static boolean isOdd(int n){
            return (n & 1) ==1;
        }



}