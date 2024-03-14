import java.util.Scanner;

public class Calclutor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the First Number :");
//        int a = input.nextInt();
//        System.out.print("Enter the Sceound Number :");
//        int b  = input.nextInt();
//
        int Result = 0;
        while (true) {
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the First Number :");
                int num1 = input.nextInt();
                System.out.print("Enter the Sceound Number :");
                int num2 = input.nextInt();
                if (op == '+') {

                    Result = num1 + num2;


                }
                if (op == '-') {

                    Result = num1 - num2;


                }
                if (op == '*') {

                    Result = num1 * num2;


                }
                if (op == '/') {
                    if(num2 !=0){
                        Result = num1 / num2;
                    }
                }

                if (op == '%') {
                    Result=num1%num2;
                }
                } else if (op=='x' || op=='X') {
                break;

            }else {
                System.out.println("invalid opration");
            }
            System.out.println(Result);
        }

        }
    }

