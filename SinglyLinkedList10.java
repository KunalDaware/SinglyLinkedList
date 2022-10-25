// data structure and alogrithm  find the given linkedlist contain loops and remove the loop


import java.io.*;
import java.util.*;

public class SinglyLinkedList10
{
   private ListNode head;
   
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

   public void Display()
   {
     ListNode current = head;
      
     while(current != null)
        {
           System.out.print(current.data  + "---->");
            current = current.next;
         }
         
           System.out.println("null");
   }
   
 
      
   
  public void removeloop()
  {
    ListNode fstptr = head;
    ListNode slwptr = head;

    while(fstptr != null && fstptr.next != null)
         {
            fstptr = fstptr.next.next;
            slwptr = slwptr.next;

	if(fstptr == slwptr)
                 {
                     removeloop(slwptr);
                     return;       
                 }
         }

  }

  private void removeloop(ListNode slwptr)
  {
   ListNode temp = head;
   while(temp.next != slwptr.next)
      {
         temp = temp.next;
         slwptr = slwptr.next;
      }
        slwptr.next = null;

  }  

 
    public void createloop()
    {	
	ListNode first = new ListNode(1);   
	ListNode second = new ListNode(2);               
	ListNode third = new ListNode(3);               
	ListNode fourth = new ListNode(4);               
	ListNode fifth = new ListNode(5);               
	ListNode sixth = new ListNode(6);  

                 head = first;
                 first.next = second;
                 second.next = third;
                 third.next = fourth;
                 fourth.next = fifth;
                 fifth.next = sixth;
                 sixth.next = third;       
      }

  
   public static void main(String arg [ ])
   {
     SinglyLinkedList10 sobj = new SinglyLinkedList10();
     sobj.createloop();
     sobj.removeloop();

     sobj.Display();
    
            
   }

}