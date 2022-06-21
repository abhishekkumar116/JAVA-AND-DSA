package Singlylinkedlist;

import java.sql.SQLOutput;

public class singlylinkedlist {
    private ListNode head;
    private static class ListNode{
        private int data;   //Generic type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void display(){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data+"-->");
            current =current.next;
        }
        System.out.print("null");
    }
    public void InsertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void InsertLast(int nextvalue){
        ListNode newNode = new ListNode(nextvalue);
        if (head==null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null!=current.next){
            current = current.next;
        }
        current.next = newNode;
    }


    public static void main(String[] args) {
        singlylinkedlist sll = new singlylinkedlist();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        // Now we will connect them together to form a chain

        sll.head.next=second;  // 10--> 1
        second.next=third;  // 10--> 1 --> 8
        third.next=fourth;// 10--> 1 --> 8 --> 11 --> null

//        ListNode current = sll.head;
//        while (current != null){
//            System.out.print(current.data+"-->");
//            current=current.next;
//        sll.insertFirst(80);
        sll.InsertLast(30);
        sll.InsertFirst(12);
        sll.InsertFirst(20);
        sll.display();
    }
//        System.out.println("Null");

}
