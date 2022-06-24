package leetcodeLinkedList;

public class RemoveDuplicatesfromSortedListTwo {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(-1);
        ListNode itr = dummy;
        itr.next = head;
        ListNode curr = head.next;

        while(curr != null){
            boolean isLoopRun = false;
            while(curr != null && itr.next.val == curr.val){
                isLoopRun =true;
                curr = curr.next;
            }

            if(isLoopRun){
                itr.next = curr;
            }else{
                itr = itr.next;
            }
            if(curr != null) curr = curr.next;
        }
        return dummy.next;
    }
}
