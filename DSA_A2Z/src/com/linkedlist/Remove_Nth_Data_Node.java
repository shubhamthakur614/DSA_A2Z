package com.linkedlist;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Remove_Nth_Data_Node {

	public static void printLL(Node head) {

		if (head == null) {
			System.out.println("LInkedList is Empty!!!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}
	
	
	public static Node removeNthDataNode(Node head,int data) {
		 // Case 1: If the linked list is empty
        if (head == null) {
            System.out.println("The list is empty. No nodes to delete.");
            return head;
        }

        // Case 2: If the node to be deleted is the head
        if (head.data == data) {
            head = head.next; // Move head to the next node
            return head;
        }

        // Case 3: Traverse the list to find the node to delete
        Node current = head;
        Node previous = null;

        // Traverse until we find the node with the given data
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        // Case 4: If the node is not found
        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return head;
        }

        // Case 5: If the node is found, remove it by changing the next pointer of the previous node
        previous.next = current.next;

        return head;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		printLL(head);
		head=removeNthDataNode(head,3);
		printLL(head);

	}
}
