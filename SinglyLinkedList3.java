//data structure and Alogrithm in java find nt (last node) frpm linked list
import java.io.*;
import java.util.*;

public class SinglyLinkedList3
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
    
    public ListNode NtNode(int n )
    {
       ListNode mainptr = head;
       ListNode refptr = head;
       int Count = 0;
       
      if(Count < n)
       {
         refptr = refptr.next;
         Count++;
       }
      while(refptr != null)
         {
            refptr = refptr.next;
            mainptr = mainptr.next;

        }
        return mainptr;
    
    }

     
     
   
      public static void main(String args [ ])  // main function
     {
       SinglyLinkedList3 sobj = new SinglyLinkedList3();  // node value
       sobj.head = new ListNode(10);
       ListNode second = new ListNode(11);
       ListNode third = new ListNode(12);
       ListNode fourth = new ListNode(13);
       ListNode fifth = new ListNode(14);

      sobj.head.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;
      
      sobj.display();
    
     ListNode ntnode = sobj.NtNode(2);
     System.out.println("THE NT NODE IS :" + ntnode.data);
 
    
     
    }  
 
}