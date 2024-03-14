import java.util.Scanner;

public class Qustions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        for (int i = 100; i < 1000; i++) {
            if (isAramstrong(i))
            System.out.print(i + " ");
            
        }

    }


    static  boolean isAramstrong(int n){
        int orginal= n;
        int sum =0;

        while (n>0){
         int    rem=n%10;
         n =n/10;
         sum= sum +rem*rem*rem;
        }
        if (sum==orginal){
            return true;
        }

        return false;
    }




    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){

            if (n%c==0){
                return false;
            }
c++;
        }
    if (c*c>n){
        return true;
    }
return false;
    }

}
