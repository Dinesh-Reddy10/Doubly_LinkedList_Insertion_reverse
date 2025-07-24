import java.util.*;
class Node
{
    int data;
    Node next;
    Node prev;
    
    Node(int val)
    {
        data=val;
        next=null;
        prev = null;
    }
}

class doublyLinkList
{
    Node head=null;
    Node tail;
    Node curr;
    void Create(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            
            
        }
    }
    
    
    
    void displayForward()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        
    }
    
    
    void displayBackward()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.prev;
        }
        
    }
    
    
    void insertAtBegin(int val)
    {
        Node newNode=new Node(val);
        newNode.next=head;
        head.prev = newNode;
        head=newNode;
    }
    
    
    
    void insertAtend(int val)
    {
        Node newNode=new Node(val);
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }
    
    
    void insertAtpos(int val, int pos)
    {
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next=newNode;
        temp.next.prev=newNode;
    }
}



class Main 
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of doubly linked list");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Integers:");
        
        
        doublyLinkList obj=new doublyLinkList();
        
        
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            obj.Create(num);
        }
        
        
        System.out.println("Printed forwardly");
        obj.displayForward();
        
        
        System.out.println();
        System.out.println("Printed backwardly");
        obj.displayBackward();
        
        
        System.out.println();
        System.out.println("Enter a value to insert at front");
        int val=sc.nextInt();
        obj.insertAtBegin(val);
        obj.displayForward();
        
        
        System.out.println();
        System.out.println("Enter a value to insert at end");
        int end=sc.nextInt();
        obj.insertAtBegin(end);
        obj.displayForward();
        
        
        
        System.out.println();
        System.out.println("Enter a value to insert at middle");
        int mid=sc.nextInt();
        System.out.println("Enter the position to insert");
        int pos=sc.nextInt();
        obj.insertAtpos(mid, pos);
        obj.displayForward();
        
        
    }
}