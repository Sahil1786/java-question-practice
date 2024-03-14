import java.util.Scanner;
public class CubeSumNumberSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n =in.nextInt();
        for(int i=0; i<=n; i++) {
            if(isCubeSumNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isCubeSumNumber(int num) {
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            sum += (digit * digit * digit);
            temp /= 10;
        }
        return num == sum;
    }

}