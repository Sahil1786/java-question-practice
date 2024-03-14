import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<Integer> (10);

//        list.add(67);
//        list.add(69);
//        list.add(56);
//        list.add(876);
////        System.out.println(list.contains(67));
//        list.set(0 ,88);
//        list.remove(2);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list);
    }
}
