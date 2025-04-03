package com.string;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Test {
	// Function to print the linked list
	static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public static Node removeLast(Node head) {

		if (head == null || head.next == null) {
			head = null;
			return head;
		}
		Node curr = head;
		Node prev = null;

		while (curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = null;
		return head;
	}

	public static Node insert_at(Node head, int data, int index) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		if (index == 1) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		int count = 1;
		Node curr = head;
		while (count < index - 1) {
			curr = curr.next;
			count++;
		}
		curr.next = curr.next.next;
		return head;
	}

	public static Node reverseLL(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node headNode = reverseLL(head.next);
		Node frontNode = head.next;
		frontNode.next = head;
		head.next = null;
		return headNode;
	}

	public static Node findMiddle(Node head) {

		int n=getLength(head);
		Node curr=head;
		int mid=n/2+1;
		while(curr!=null && mid>0) {
			mid--;
			if(mid==0) {
				break;
			}
			curr=curr.next;
			
		}
		return curr;
	}

	public static int getLength(Node temp) {
		if (temp == null) {
			return 0;
		}
		int count = 1;
		while (temp.next != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	//bruteforce approach
	public static Node segregate(Node head) {
		if (head == null) {
			return head;
		}
		int count1 = 0, count2 = 0, count0 = 0;
		Node temp=head;
		while (temp != null) {
			if (temp.data == 0) {
				count0++;
			} else if (temp.data == 1) {
				count1++;
			} else {
				count2++;
			}
			temp = temp.next;
		}
		temp=head;
		while(temp!=null) {
			if(count0>0) {
				temp.data=0;
				count0--;
			}
			else if(count1>0) {
				temp.data=1;
				count1--;
			}
			else {
				temp.data=2;
				count2--;
			}
			temp=temp.next;
		}
		return head;
	}

	public static void main(String[] args) {

		Node head = new Node(0);
		head.next = new Node(2);
		head.next.next = new Node(1);
		head.next.next.next = new Node(0);
		head.next.next.next.next = new Node(1);
//		head.next.next.next.next.next = new Node(6);

		printLinkedList(head);
		head = segregate(head);
		printLinkedList(head);

	}

}
