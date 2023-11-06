package com.linkedlist;

//https://www.codingninjas.com/studio/problems/interview-shuriken-42-detect-and-remove-loop_241049?leftPanelTab=0%3Fsource%3Dyoutube&campaign=YouTube_codestudio_lovebabbar28thjan&utm_source=youtube&utm_medium=affiliate&utm_campaign=YouTube_codestudio_lovebabbar28thjan
public class FloyedsAlgorithm {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node floyedDetectionLoop(Node head) {

		if (head == null) {
			return null;
		}
		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
			}
			slow = slow.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;

	}

	public static Node getStartingNode(Node head) {
		if (head == null) {
			return null;
		}
		Node intersection = floyedDetectionLoop(head);

		if (intersection == null) {
			return null;
		}
		Node slow = head;
		while (slow != intersection) {
			slow = slow.next;
			intersection = intersection.next;
		}
		return slow;

	}

	public static Node removeLoop(Node head) {
		// Write your code here.
		if (head == null) {
			return null;
		}
		Node startOfLoop = getStartingNode(head);
		// chances of getting a null pointer exception
		if (startOfLoop == null) {
			return head;
		}
		Node temp = startOfLoop;
		while (temp.next != startOfLoop) {
			temp = temp.next;
		}
		temp.next = null;
		return head;

	}

	public static void main(String[] args) {

		//we dont know how to run through our main but logic work perfectly fine with leetcode
	}
}
