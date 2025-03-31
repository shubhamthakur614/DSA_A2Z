package com.test;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Test {

	public static Node insertFirst(int data, Node head) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}

	public static Node insertLast(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null || head.next == null) {
			head = null;
			return head;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return head;
	}

	public static Node removeFirst(Node head) {

		if (head == null || head.next == null) {
			head = null;
			return head;
		}
		head = head.next;
		return head;
	}

	public static Node removeLast(Node head) {

		if (head == null || head.next == null) {
			head = null;
			return head;
		}

		Node prev = head;
		Node curr = head.next;
		while (curr.next != null) {
			curr = curr.next;
			prev = prev.next;
		}
		prev.next = null;
		return head;
	}

	public static Node insert_At_any(int data, int node_position, Node head) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		int count=1;
		if(node_position==1) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		Node temp=head;
		while(count<node_position-1) {
			count++;
			temp=temp.next;
			
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
		

	}

	public static void revome_At_any(int node_position) {

	}

	public static Node remove_at_any_data(int data,Node head) {

		if(head==null) {
			return head;
		}
		if(head.data==data) {
			head=head.next;
			return head;
		}
		Node curr=head;
		Node prev=null;
		while(curr!=null && curr.data!=data) {
			prev=curr;
			curr=curr.next;
		}
		if(curr==null) {
			System.out.println("Not fount the element");
			return head;
		}
		
		prev.next=curr.next;
		return head;
	}

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

	public static Node reverseLL(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node endNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = endNode;
		}
		head.next = null;
		return prev;
	}

	public static Node recursionReverse() {
		return null;
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		printLL(head);
//		head = reverseLL(head);
//		printLL(head);
//		head=insertFirst(6, head);
//		printLL(head);
//		head=insertLast(head, 8);
//		printLL(head);
//		head=removeFirst(head);
//		printLL(head);
//		head=removeLast(head);
//		printLL(head);
		head=insert_At_any(12,3,head);
		printLL(head);
		head=remove_at_any_data(4,head);
		printLL(head);
		

	}
}