//data structure and Alogrithm in java find the dublicate node in shortated array
import java.io.*;
import java.util.*;

public class SinglyLinkedList4
{
  private ListNode head;  // instance veriable;
  
  private static class ListNode
  {
    private int data;
    private ListNode next;
  
    public ListNode(int data)
    {
      this.data = data;
      this.next = null;
    }
  }
  
 
  public void display()
  {
    ListNode current = head;
    
    while(current != null)
       {
         System.out.print(current.data + "-->");
         current = current.next;
         
       }
         System.out.println("null");
  }
   
   public void Removedublicate()
   {
     if(head == null)  
      {
          return;
      }

     ListNode current = head;


     while(current != null  && current.next != null)
        {
          if(current.data == current.next.data)
           {
              current.next = current.next.next;
           } 
           else
           {
              current = current.next;  
           }
        }
    }
    
  
 

     
     
   
      public static void main(String args [ ])  // main function
     {
      SinglyLinkedList4 sobj = new SinglyLinkedList4();
      
      sobj.head = new ListNode(11);
      ListNode second = new ListNode(12);
      ListNode third = new ListNode(12);
      ListNode fourth = new ListNode(13);
      ListNode fifth = new ListNode(14);
      ListNode sixth = new ListNode(15);
      ListNode seventh = new ListNode(16);
      ListNode eigth = new ListNode(16);

      sobj.head.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;
      fifth.next = sixth;
      sixth.next = seventh;
      seventh.next = eigth;
      
      sobj.display();
    
      sobj.Removedublicate();
 
     sobj.display();
     
    }  
 
}