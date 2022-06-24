package leetcodeLinkedList;

public class mergeKSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null) return list1 != null ? list1 : list2;

        ListNode c1 = list1;
        ListNode c2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while(c1 != null && c2 != null){
            if(c1.val < c2.val){
                prev.next = c1;
                c1 = c1.next;
            }else{
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }
        prev.next = c1 != null ? c1 : c2;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        return mergeKLists(lists, 0, lists.length - 1);
    }
    public ListNode mergeKLists(ListNode[] lists, int si, int ei) {
        if(si > ei){
            return null;
        }
        if(si == ei) return lists[si];

        int mid = (si + ei)/2;

        ListNode l1 = mergeKLists(lists, si, mid);
        ListNode l2 = mergeKLists(lists, mid + 1, ei);

        return mergeTwoLists(l1, l2);
    }
}
