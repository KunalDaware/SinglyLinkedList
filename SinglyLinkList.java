// searching using singlylinked list

  public class SinglylinkList
{
    private ListNode head;  // instance veriable}

  private  static classListNode
  {
    private int data;
    private int next;
  
  }
   publicListNode(int data)
   {
    this.data = data;
    this.next = null;
   }

   public static void main(String args[])
  {
    SinglyLinklst sobj = new SinglyLinklst();
    sobj.head = new ListNode(20);
     ListNode second = new ListNode(30);
     ListNode third = new ListNode(40);
     ListNode fourth = new ListNode(50);

     sobj.head.next = second;
     second.next = third;
     third.next = fourth;

  }
}