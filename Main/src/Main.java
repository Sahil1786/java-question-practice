import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t =2;
        while (t --> 0){
            int n =3;
            int someOfSqure=0;
            int sum =0;
            for (int i = 1; i <t ; i++) {
                someOfSqure +=i*i;
                sum+=i;

            }
            int squreOfSome=sum*sum;
            int absuolutediff=squreOfSome -someOfSqure;
            System.out.println(absuolutediff);
        }
    }
}