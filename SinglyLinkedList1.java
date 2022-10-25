//data structure and Alogrithm in java reverse the linked list


import java.io.*;
import java.util.*;

public class SinglyLinkedList1
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

    public ListNode reverse(ListNode head)
     {
       if(head == null)
       {
          return head;
       }
       
       ListNode current = head;
       ListNode previous = null;
       ListNode next = null;
       
      while(current != null)
            {
              current.next = next;
              current.next = previous;
              previous = current;
              current = next; 
           
           }
            return previous;
     
     }
   
      public static void main(String args [ ])  // main function
     {
       SinglyLinkedList1 sobj = new SinglyLinkedList1();  // node value
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
      
    sobj.reverse(ListNode);
     
    sobj.display();
     
    }  
 
}