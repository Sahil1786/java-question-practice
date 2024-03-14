
    import java.util.Scanner;

    public class PrimeConstruction {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            for (int p = 2; p < 1000000000; p++) {
                boolean isPrime = true;
                for (int i = 0; i < n; i++) {
                    if (p % numbers[i] == i) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(p);
                    return;
                }
            }

            System.out.println("None");

    }
