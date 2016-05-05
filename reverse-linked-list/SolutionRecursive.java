public class SolutionRecursive{
  public ListNode reverseList(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode newHead = head;
    head=head.next;
    newHead.next=null;
    return reverseList(head,newHead);
  }
  public ListNode reverseList(ListNode head, ListNode newHead){
    if(head==null) return newHead;
    ListNode temp = head;
    head=head.next;
    temp.next=newHead;
    newHead =temp;
    return reverseList(head,newHead);
  }
}
