// data structure and alogrithm  find the given linkedlist contain loops and at wich node loop has started


import java.io.*;
import java.util.*;

public class SinglyLinkedList9
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

    public ListNode checkloop()
    {
      ListNode slwptr = head;
      ListNode fstptr = head;

    while(fstptr != null && fstptr.next != null)
          {
             fstptr = fstptr.next.next;
             slwptr = slwptr.next;
               if(slwptr == fstptr)
                {
                 return getnumber(slwptr);
                

                }
             }
                 return null;
               
               
      }

   public ListNode getnumber( ListNode slwptr)
  {
    ListNode temp = head;
    while(temp != slwptr)
       {
          temp = temp.next;
          slwptr = slwptr.next;
        }
        return temp;
  }
         
     public void createloop()
    {	
	ListNode first = new ListNode(77);   
	ListNode second = new ListNode(88);               
	ListNode third = new ListNode(99);               
	ListNode fourth = new ListNode(78);               
	ListNode fifth = new ListNode(74);               
	ListNode sixth = new ListNode(22);  

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
     SinglyLinkedList9 sobj = new SinglyLinkedList9();
     
     sobj.createloop();
     System.out.println(sobj.checkloop());
    System.out.println(sobj.getnumber().data);
    
            
   }

}