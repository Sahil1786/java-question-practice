public class Swapping {
    public static void main(String[] args) {
        int a =4;
        int b=5;
//        int temp=a;
//        a =b;
//        b=temp;
        swap(a,b);
        System.out.println(a+" "+b);

        }

        static void swap(int a , int b){
            int temp=a;
            a=b;
            b=temp;

    }
}
