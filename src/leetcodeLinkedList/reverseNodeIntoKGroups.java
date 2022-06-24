package leetcodeLinkedList;

public class reverseNodeIntoKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1){
            return head;
        }
        if(head == null || head.next == null || k == 0){
            return null;
        }
        ListNode oh = null;
        ListNode ot = null;

        int len = length(head);
        ListNode curr = head;
        while(len >= k){
            int tempK = k;

            while(tempK --> 0){
                ListNode fwd = curr.next;

                curr.next = null;
                addFirstNode(curr);
                curr = fwd;
            }
            if(oh == null){
                oh = th;
                ot = tt;

            }else{
                ot.next = th;
                ot = tt;
            }
            th = null;
            tt = null;
            len -= k;
        }
        ot.next = curr;

        return oh;
    }
    public static int length(ListNode node){
        ListNode curr = node;
        int len = 0;

        while(curr != null){
            curr = curr.next;
            len++;
        }
        return len;
    }
    static ListNode th = null;
    static ListNode tt = null;
    public static void addFirstNode(ListNode node){
        if(th == null){
            th = node;
            tt = node;
        }else{
            node.next = th;
            th = node;
        }
    }
}
