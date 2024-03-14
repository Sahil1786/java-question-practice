import java.util.Scanner;

public class Withdrawl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int money =5945;
        int sum = 0;
        int product = 1;
        while (  money>0){
            int digit = money%10;
              money=money/10;
            sum = sum+digit;
             product= digit*product;
        }
        System.out.println("sum is :" + sum);
        System.out.println("product is : " + product);

    }

}
