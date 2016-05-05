public class SolutionNonRecursive {
  public ListNode reverseList(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode newHead = head;
    head=head.next;
    newHead.next=null;
    while (head!=null){
      ListNode temp = head;
      head=head.next;
      temp.next=newHead;
      newHead =temp;
    }
    return newHead;
  }
}
