class Node {
    int item;
    Node next;
    public Node(int item) {
        this.item=item;
    }
}

public class StackUsingLL {
    int size=0;
    Node head=null;
    Node tail=null;
    public void push(int item) {
        Node n1=new  Node(item);
        if(size==0) {
            head=n1;
            tail=n1;
        }
        else {
            tail.next=n1;
            n1.next=null;
        }
    }
    public void deleteAtLast() {
        if(this.head==null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null) {
            head=null;
            return;
        }
//        Node node=new Node();
        Node prevNode=this.head;
        Node current=this.head.next;
        while(current.next!=null) {
            prevNode=prevNode.next;
            current=current.next;
        }
        prevNode.next=null;
    }
    public void display() {
        Node current=this.head;
        for(int i=0;i<size;i++) {
            System.out.println(current.item +"->");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLL S=new StackUsingLL();
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        S.push(50);
        S.display();
    }

}
