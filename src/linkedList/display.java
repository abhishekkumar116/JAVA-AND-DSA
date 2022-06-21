package linkedList;

import java.io.*;
import java.util.*;

public class display {

    public static class Node {
        int data;
        Node next;
    }
    public static class linkedList {
        Node head;
        Node tail;
        int size;

        void addLAst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int size() {
            return size();
        }

        public void display() {

        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        linkedList list = new linkedList();
        String str = br.readLine();
        while (str.equals("quit") == false){
            if (str.startsWith("addLast")){
                int val = Integer.parseInt(str.split(" ")[1]);
                //list.addLast(val);
            } else if (str.startsWith("display")){
                list.display();
            }
            str = br.readLine();
        }
    }
}
