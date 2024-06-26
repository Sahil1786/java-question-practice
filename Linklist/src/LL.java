



public class LL {

    private static Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = size;
    }





    public void insertFirst(int val ){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }


    public  void insertLast(int val){
        if (tail==null){
            insertLast(val);
            return;
        }
            Node node=new Node(val);
            tail.next=node;
            tail=node;
            size++;

    }


    public void insert(int val,int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;

        }

        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public  void display(){
        Node temp= head;
        while (temp !=null){
            System.out.print(temp.value + "-> " );
            temp=temp.next;
        }
        System.out.println("end");
    }



    public int delete(int index){
        if (index ==0){
            return deleteFirst();

        }
        if (index==size-1){
            return  deleteLast();
        }
        Node pre =get(size=1);
        int val = pre.next.value;
        pre.next=pre.next.next;
        return val;
    }


    public int deleteLast(){
        if(size<=1){
           return deleteFirst();
        }
        Node secoundLaast=get(size-2);
        int  val = tail.value;
        tail=secoundLaast;
        tail.next=null;
        return val;
    }


    public  Node find(int value ){
        Node node=head;
       while(node!=null){
           if(node.value ==value){
                return node;
           }
           node=node.next;
       }
        return   null;
    }


    public  Node get(int index ){
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return  node;
    }

    public int deleteFirst() {
        int val =head.value;
        head=head.next;
        if (head==null) {
            tail = null;
        }
        size--;
        return val;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
