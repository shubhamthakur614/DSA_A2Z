package com.linkedlist;

public class Sort_0_1_2 {

	public static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	// bruteforce approach

	/*
	 * Intution :
	 * take 3 ptr and make them zero and start traversing linked list from
	 * head to null while traversing what ever data found put into that particular
	 * ptr and move and increase ptr count . after all count again make temp to head
	 * and check if ptr0 has data if yes then put into curr position and reduce
	 * count till null
	 * 
	 */
	static Node segregate(Node head) {
		if (head == null) {
			return head;
		}
		int cnt0 = 0, cnt1 = 0, cnt2 = 0;
		Node curr = head;
		while (curr != null) {
			if (curr.data == 0) {
				cnt0++;
			} else if (curr.data == 1) {
				cnt1++;
			} else {
				cnt2++;
			}
			curr = curr.next;
		}

		curr = head;

		while (curr != null) {
			if (cnt0 > 0) {
				curr.data = 0;
				cnt0--;
			} else if (cnt1 > 0) {
				curr.data = 1;
				cnt1--;
			} else {
				curr.data = 2;
				cnt2--;
			}
			curr = curr.next;
		}
		return head;
	}
	
	// Function to print the linked list
	static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
     
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(2);
		head.next.next.next.next.next = new Node(0);
		head.next.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next.next = new Node(0);
		
		printLinkedList(head);
		head=segregate(head);
		printLinkedList(head);
		
	}

}
