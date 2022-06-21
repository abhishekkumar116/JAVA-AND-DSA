package GenericTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class sizeOfTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + ", ";
        for (Node child : node.children){
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children){
            display(child);
        }
    }
    public static Node construct(int[] arr){
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == -1){
                st.pop();
            } else{
                Node temp = new Node();
                temp.data = arr[i];

                if (st.size() > 0){
                    st.peek().children.add(temp);
                } else {
                    root = temp;
                }
                st.push(temp);
            }
        }
        return root;
    }
    public static int size(Node node){
        int s = 0;

        for (Node child : node.children){
            int cs = size(child);

            s = s + cs;
        }
        s = s + 1;
        return s;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        int sz = size(root);
        System.out.println(sz);
    }
}
