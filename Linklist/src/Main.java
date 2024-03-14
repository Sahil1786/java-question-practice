




public class Main {

    public static void main(String[] args) {
        LL list =new LL();
        list.insertFist(3);
        list.insertFist(2);
        list.insertFist(8);
        list.insertFist(17);
        list.insertLast(99);
        list.insert(100,3);
        list.dispaly();
        System.out.println(list.deleitFist());

        list.dispaly();

        System.out.println(list.deleteLst());
        list.dispaly();
    }

}