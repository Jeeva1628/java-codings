import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int data1=sc.nextInt();
        int data2=sc.nextInt();
        int data3=sc.nextInt();
        Singly s=new Singly();
        s.Add(data1);
        s.Add(data2);
        s.Add(data3);
        s.display();
        s.reverse();
        s.display();
    }
}
class Node
{
    int data;
    Node address;
    Node(int data)
    {
        this.data=data;
        this.address=null;
    }
}
class Singly
{
    Node head;
    Singly()
    {
      head=null;
    }
    void Add(int data)
    {
        Node n1=new Node(data);
        if(head==null)
        {
            head=n1;
        }
        else
        {
            Node temp=head;
            while(temp.address!=null)
            {
                temp=temp.address;
                
            }temp.address=n1;
        }
    }
    void reverse()
    {
        Node temp=head;
        Node prev=null;
        Node next=null;
        while(temp!=null)
        {
            next=temp.address;
            temp.address=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }
    void display()
    {
        Node temp=head;
        System.out.println("--------");
        while(temp.address!=null)
        {
            System.out.println(temp.data);
            temp=temp.address;
        }
        System.out.println(temp.data);
    }
}
    
