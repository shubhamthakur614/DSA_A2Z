package com.linkedlist;

/*
 *  10 12 15 17 
 *  insert at position 1 is 14 and use as start from 0
 *  10 14 12 15  
 */
public class Insert_at_specific_position {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node addNode(int data)
	{
		return new Node(data);
	}
	public static void printLL(Node refNode)
	{
		if(refNode==null)
		{
			System.out.println("LL is Empty ...");
			return;
		}
		Node currNode=refNode;
		while(currNode.next!=null)
		{
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		System.out.println(" Null");
		
	}
	public static void main(String[] args) {

		Node addNode = addNode(10);
		addNode.next=addNode(12);
		addNode.next.next=addNode(15);
		addNode.next.next.next=addNode(17);
		printLL(addNode);
		
		
		Node insert_at_given_position = insert_at_given_position(addNode,1,14);
		printLL(insert_at_given_position);
	}

	public static Node insert_at_given_position(Node refNode, int position, int data) {

		Node newNode = new Node(data);
		if (position == 0) {
			newNode.next = refNode;
			return newNode;
		}
		int count = 1;
		Node currNode = refNode;
		while (count < position) {
			currNode = currNode.next;
			count++;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return refNode;
	}

}
