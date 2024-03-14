import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String depertment=input.next();
        switch (empID){
            case 1:
                System.out.println("sahil Hossain");
                break;
            case 2:
                System.out.println("sonia khatun");
                break;
            case 3 :
                System.out.println("emp  number 3");
                switch (depertment){
                    case "it":
                        System.out.println("it");
                        break;
                    case "managment":
                        System.out.println("managment");
                        break;
                    default:
                        System.out.println("no depertment enter");
                }
                break;
            default:
                System.out.println("enter correct empId");
        }
    }
}
