import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
            int salary= Input.nextInt();
            if (salary==10000){
            salary=salary+1000;
            }
            else {
                salary=salary+2000;
            }
        System.out.println(salary);
    }
}
