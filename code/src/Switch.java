import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        String Fruit =in.next();
//        switch (Fruit) {
//            case "mango" -> System.out.println("king of Fruit");
//            case "apple" -> System.out.println("a sweet  red fruit ");
//            case "orange " -> System.out.println("Round Fruit");
//            case "greps" -> System.out.println("Small Fruit");
//            default -> System.out.println("I love you");
//        }
        int Day=in.nextInt();
        switch (Day){
            case 1 -> System.out.println("Monday");
            case 2-> System.out.println("Thuesday");
            case 3 -> System.out.println("Wneasday");
            case 4 -> System.out.println("Thusday");
            case 5-> System.out.println("Friday");
            case 6 -> System.out.println("Sutterday");
            case 7 -> System.out.println("Sunday");
            default-> System.out.println("Enter Valid day");


        }
    }
}
