import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

          list.add(69);
          list.add(78);
//      list.set(0,99);
//      list.remove(1);
//        System.out.println(list);
        for (int i = 0; i < 7; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i <7 ; i++) {
            System.out.println(list.get(5));
        }
        System.out.println(list);
    }
}