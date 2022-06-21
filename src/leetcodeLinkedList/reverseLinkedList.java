package leetcodeLinkedList;

public class reverseLinkedList {
    public ListNode reverse(ListNode head){
        ListNode newHead = null;

        while (head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
