package com.linkedlist;

import com.linkedlist.Insert_at_specific_position.Node;

public class Delete_At_Specific_position {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node addNode(int data) {
		return new Node(data);
	}

	public static void printLL(Node refNode) {
		if (refNode == null) {
			System.out.println("LL is Empty ...");
			return;
		}
		Node currNode = refNode;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println(" Null");

	}

	public static void main(String[] args) {
		Node addNode = addNode(1);
		addNode.next = addNode(2);
		addNode.next.next = addNode(3);
		addNode.next.next.next = addNode(4);
		addNode.next.next.next.next = addNode(5);
		addNode.next.next.next.next.next = addNode(6);
		printLL(addNode);
		Node deleteAtPosition = deleteAtPosition(addNode, 3);
		printLL(deleteAtPosition);
		printLL(addNode);
	}

	public static Node deleteAtPosition(Node refNode, int position) {
		if(refNode==null)
		{
			return null;
		}
		Node currNode=refNode;
		if (position == 0) {
			refNode = currNode.next;
			return refNode;
		}
		int count = 1;  //1,2,3,4,5,6;
		
		while (count < position) {
			currNode = currNode.next;
			count++;
		}
		currNode.next = currNode.next.next;
		return refNode;

	}

}
