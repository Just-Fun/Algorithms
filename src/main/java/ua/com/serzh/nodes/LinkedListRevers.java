package ua.com.serzh.nodes;

/**
 * Created by Sergey on 5/25/17.
 */
public class LinkedListRevers {

    private Node top;

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private void addToEnd(Node n){
        if(top == null)
            top = n;
        else{
            Node temp = top;
            while(temp.next != null)
                temp = temp.next;
            temp.next = n;
        }

    }

    public static void main(String[] args) {

        LinkedListRevers list = new LinkedListRevers();

        Node top = new Node(30);
        list.addToEnd(top);
        list.addToEnd(new Node(10));
        list.addToEnd(new Node(5));
        list.addToEnd(new Node(23));
        list.addToEnd(new Node(20));

        System.out.println("Printing nodes in current order");

        list.printList(top);

        System.out.println("\n\nPrinting nodes in reverse order");

        list.reverse(top);

    }

    public void printList(Node top){
        while(top != null){
            System.out.printf("%d ", top.value);
            top = top.next;
        }
    }

    //reverse using Recursion
    public void reverse(Node current) {
        if (current != null) {
            reverse(current.next);
            System.out.printf("%d ", current.value);
        }
    }

}
