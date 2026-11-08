package com.linkedlist;

public class Remove_at_index {
    public static Node head;

    static class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void insert(int data) {
       Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
       Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public static void printLL() {
        if (head == null) {
            System.out.println("Linked List is Empty!!!");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    public static void remove_at_given_index(int index){
        // Negative index
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        // Empty linked list
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        // Remove first node
        if (index == 0) {
            head = head.next;
            return;
        }
        Node curr = head;

        // Traverse to previous node
        for (int i = 0; i < index - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Check if previous node exists
        if (curr == null || curr.next == null) {
            System.out.println("Index out of range");
            return;
        }

        // Remove the node
        curr.next = curr.next.next;


    }


    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        printLL();
        remove_at_given_index(2);
        printLL();

    }

}
