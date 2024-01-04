package com.tree;

import java.util.LinkedList;
import java.util.Queue;

//if you given the pre order data in array then only use this to create our first tree
public class Q1 {

	static class Node {
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
	}

	// preOrder Traversal
	/*
	 * root left subtree Right Subtree
	 * 
	 */
	public static void preOrder(Node node) {

		if (node == null) {
			return;
		}
		System.out.print(node.data + ",");
		preOrder(node.left);
		preOrder(node.right);
	}

	/*
	 * InOrder Traversal Left subtree root Right subtree
	 */
	public static void inOrder(Node node) {

		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " , ");
		inOrder(node.right);
	}

	/*
	 * PostOrder Traversal Left subtree Right subtree root
	 */
	public static void postOrder(Node node) {

		if (node == null) {
			return;
		}
		inOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " , ");
	}

	/*
	 * Level Order BFS
	 */
	public static void levelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			Node currNode = q.remove();
			if (currNode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}

			} else {

				System.out.print(currNode.data + " ");
				if (currNode.left != null) {
					q.add(currNode.left);
				}
				if (currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree bt = new BinaryTree();
		Node root = bt.buildTree(nodes);
		System.out.println(root.data);
		System.out.println("Preorder .....");
		preOrder(root);
		System.out.println("\n Inorder .....");
		inOrder(root);
		System.out.println("\n Postorder .....");
		postOrder(root);
		System.out.println("\n Level order .....");
		levelOrder(root);

	}

}
