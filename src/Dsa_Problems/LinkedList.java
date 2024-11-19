package Dsa_Problems;

import java.util.Optional;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public  Node head;
    public  Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
       ll.head.next = new Node(2);
        ll.tail = new Node(3);
        






    }
}
