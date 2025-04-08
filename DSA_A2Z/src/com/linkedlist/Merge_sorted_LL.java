package com.linkedlist;

/*
 * 
 * Merge two sorted LinkedList
 */
public class Merge_sorted_LL {
	
	public static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
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
	
	public static Node merge_Two_sorted_LL(Node head1,Node head2) {
		
		Node dummy=new Node(-1);
		Node temp=dummy;
		while(head1!=null && head2!=null) {
			if(head1.data<=head2.data) {
				temp.next=head1;
				temp=temp.next;
				head1=head1.next;
			}else {
				temp.next=head2;
				temp=temp.next;
				head2=head2.next;
			}
		}
		if(head1!=null) {
			temp.next=head1;
		}else {
			temp.next=head2;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
    
		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(7);
		head.next.next.next.next = new Node(9);
		
		Node head1 = new Node(1);
		head1.next = new Node(3);
		head1.next.next = new Node(5);
		head1.next.next.next = new Node(6);
		
		printLL(head);
		printLL(head1);
		head=merge_Two_sorted_LL(head,head1);
		printLL(head);
	}
}
