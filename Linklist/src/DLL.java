public class DLL {


        Node head;
        Node tail;



    public void InsertFirst(int val){
            Node node =new Node(val);
            node.next=head;
            node.pre=null;
            if(head!=null){
                head.pre=node;
            }
            head=node;

        }

        public  void display(){
        Node node=head;
        while(node !=null){
            System.out.print(node.val + "->");
            node=node.next;
        }
            System.out.println("END");
        }

    public  void displayRev(){
        Node node=head;
        Node last=null;
        while(node !=null){
            System.out.print(node.val + "->");
            last=node;
            node=node.next;
        }
        System.out.println("END");


        System.out.println("print in reverse");
        while(last !=null){
            System.out.print(last.val + "->");
           last= last.pre;
        }
        System.out.println("start");
    }


        public void insertLast(int val){
        Node node=new Node(val);
        Node last =head;
        node.next=null;
        if (head==null){
            node.pre=null;
            head=node;
            return;
        }
        while (last.next !=null){
            last=last.next;
        }
        last.next=node;
        node.pre=last;
        }


    public  Node find(int value ){
        Node node=head;
        while(node!=null){
            if(node.val ==value){
                return node;
            }
            node=node.next;
        }
        return   null;
    }



    public void insert(int after , int val){
        Node p =find(after);

        if (p==null){
            System.out.println("dose not exits");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.pre=p;
        if (node.next !=null){
            node.next.pre=node;

        }


            }


    private class Node{
        int val;
        Node next;
        Node pre;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next, Node pre) {
            this.val = val;
            this.next = next;
            this.pre = pre;
        }
    }
}
