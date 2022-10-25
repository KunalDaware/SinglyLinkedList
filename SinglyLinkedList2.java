//data structure and Alogrithm in java find middle node in java



import java.io.*;
import java.util.*;

public class SinglyLinkedList2
{
  private ListNode head;  // instance veriable head
  
  private static class ListNode  // creating data and next
  {
      private int data;
      private ListNode next;
  
    public ListNode(int data)
    {
       this.data =  data;
       this.next = null;
    }
  } 
    public void display()   // display Linkedlist
    {
      ListNode current = head;
      while(current != null )
      {
        System.out.print(current.data + " -->");
         current = current.next;
      }
     System.out.println("null");
    }

    public ListNode getMiddleNode()
    {
       if(head == null)
        {
           return null; 
        } 
      
      ListNode slwptr = head;
      ListNode fstptr = head;

     while(fstptr != null && fstptr.next != null)
             {
                slwptr = slwptr.next;
                fstptr = fstptr.next.next; 
             }
             return slwptr;
    }
     
     
   
      public static void main(String args [ ])  // main function
     {
       SinglyLinkedList2 sobj = new SinglyLinkedList2();  // node value
       sobj.head = new ListNode(11);
       ListNode second = new ListNode(21);
       ListNode third = new ListNode(31);
       ListNode fourth = new ListNode(41);
       ListNode fifth = new ListNode(51);

      sobj.head.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;
      
      sobj.display();
    
     ListNode Middlenode = sobj.getMiddleNode();
     System.out.println("THE MIDDLE NODE IS :" + Middlenode.data);
 
    
     
    }  
 
}