//data structure and Alogrithm in java Delete a nodein the middle in shortated array
import java.io.*;
import java.util.*;

public class SinglyLinkedList6
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
   
   public void Delete(int Key)
   {
      if(head == null)
       return ;
      
       ListNode current = head;
       ListNode temp = null;
      
       while(current != null && current.data != Key)
              {
                 temp = current;
                 current = current.next;     
              }
	if(current == null) 
                 {
                      return;
                 }
             temp.next = current.next;

    }     
   
      public static void main(String args [ ])  // main function
     {
      SinglyLinkedList6 sobj = new SinglyLinkedList6();
      
      sobj.head = new ListNode(11);
      ListNode second = new ListNode(12);
      ListNode third = new ListNode(13);
      ListNode fourth = new ListNode(14);
      ListNode fifth = new ListNode(15);
      ListNode sixth = new ListNode(16);
      ListNode seventh = new ListNode(18);
      ListNode eigth = new ListNode(19);

      sobj.head.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;
      fifth.next = sixth;
      sixth.next = seventh;
      seventh.next = eigth;
      
      System.out.println("Linked created  : ");
      sobj.display();
    
     System.out.println("Linked List Created After Operation");
      sobj.Delete(18);
      sobj.display();
    }  
 
}