import java.util.Scanner;

public class SquareFreeNum {
    // Function to check if a number is square-free
    public static boolean isSquareFree(int num) {
        if (num < 1) {
            return false; // Negative numbers are not square-free
        }

        for (int i = 2; i * i <= num; i++) {
            int count = 0;
            while (num % i == 0) {
                num /= i;
                count++;
            }
            if (count > 1) {
                return false; // The number has a repeated prime factor (not square-free)
            }
        }

        return num > 1; // If num > 1, it has a prime factor > sqrt(num)
    }

    // Function to find all divisors of a given number
    public static int countSquareFreeDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isSquareFree(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 20;
        int result = countSquareFreeDivisors(number);
        System.out.println(result);
    }


}
