package com.array;

import java.util.Arrays;

public class Test {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Test insert(Test list, int data) {

		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node currNode = list.head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
		return list;
	}

	public static void printLL(Test list) {
		if (list.head == null) {
			System.out.println("List is Empty");
		}
		Node currNode = list.head;
		while (currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.insert(t, 1);
		t.insert(t, 2);
		t.insert(t, 3);
		t.printLL(t);
	}

}
