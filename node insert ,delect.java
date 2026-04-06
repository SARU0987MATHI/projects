class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head, tail;

    public void insert(int data) {
        Node n = new Node(data);
        n.next = null;

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void inserBeg(int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void insertAt(int pos,int data)
    {
        Node n=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
            n.next = temp.next;  
            temp.next = n;       

        }

    }
    public  void deleteBeg()
    {
      Node temp=head;
      head=head.next;
      temp.next=null;
    }
    public  void deleteEnd()
    {
       Node temp=head;
       while(temp.next!=tail) {
           temp = temp.next;
       }
       temp.next=null;
       tail=temp;
    }
    public void deleteAt(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;

        }
        temp.next=temp.next.next;
    }

}


public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.inserBeg(5);
        ll.insertAt(2,25);
        ll.display();
        ll.deleteBeg();
        System.out.println("After deletion at beg");
        ll.display();
        System.out.println("After deletion at end");
        ll.deleteEnd();
        ll.display();
        System.out.println("After deletion at Specified position");
        ll.deleteAt(2);
        ll.display();
    }
}