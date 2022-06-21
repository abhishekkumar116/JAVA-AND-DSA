package Singlylinkedlist;

public class insertmid {

    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int position, int value){
        //1->2->3
        // 1->4->2->3
        ListNode node = new ListNode(value);
        if (position == 1){

        }
    }
}
