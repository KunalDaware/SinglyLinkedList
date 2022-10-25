// data structure and alogrithm  find the given linkedlist contain loops

import java.io.*;
import java.util.*;

public class SinglyLinkedList8
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

    public boolean checkloop()
    {
      ListNode slwptr = head;
      ListNode fstptr = head;

    while(fstptr != null && fstptr.next != null)
          {
             fstptr = fstptr.next.next;
             slwptr = slwptr.next;
               if(slwptr == fstptr)
                {
                 return true;
                

                }
             }
                 return false;
               
               
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
     SinglyLinkedList8 sobj = new SinglyLinkedList8();
     
     sobj.Display(); 
     sobj.createloop();
     System.out.println(sobj.checkloop());
            
   }














}