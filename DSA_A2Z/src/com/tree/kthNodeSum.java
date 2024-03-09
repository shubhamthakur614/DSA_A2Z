package com.tree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Find the sum at given kth node and return that
 */
public class kthNodeSum {

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int[] nodes) {

			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}

		public static void print(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			print(root.left);
			print(root.right);
		}

		public static int kthSum(Node root, int k) {
			int level = 0;
			int sum = 0;
			if (root == null) {
				return -1;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			while (!q.isEmpty()) {
				Node currNode = q.remove();
				if (currNode != null) {
					if (level == k) {
						sum += currNode.data;

					}
					if (currNode.left != null) {
						q.add(currNode.left);
					}
					if (currNode.right != null) {
						q.add(currNode.right);
					}

				} else if (!q.isEmpty()) {
					q.add(null);
					level++;

				}
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree bt = new BinaryTree();
		Node root = bt.buildTree(nodes);
		int kthNodeSum = bt.kthSum(root, 2);
		System.out.println("Kth root sum: " + kthNodeSum);
	}
}
