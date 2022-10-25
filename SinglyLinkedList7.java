// data structure and alogrithm  insert first node in empty LinkedList\

import java.io.*;
import java.util.*;

public class SinglyLinkedList7
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

    public void Insert(int value)
    {
      ListNode  newNode = new ListNode(value);
      newNode.next = head;
      head = newNode;
      
      
    }
   
   public static void main(String arg [ ])
   {
     SinglyLinkedList7 sobj = new SinglyLinkedList7();
                 sobj.Insert(11);
                 sobj.Insert(12);
	sobj.Insert(13);
	sobj.Insert(14);
	sobj.Insert(15);
	sobj.Insert(16);
	sobj.Insert(17);
	sobj.Insert(18);
	sobj.Insert(19);
	sobj.Insert(20);
	sobj.Insert(21);
                 sobj.Display();
   
   }














}