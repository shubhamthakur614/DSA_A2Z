package com.tree;

public class CreateBinaryTree {
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

		// we start from -1 and to iterate through array every time we increment the idx
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

		public static void printTree(Node root) {
			if (root == null)
				return;
			System.out.print(root.data + ", ");
			printTree(root.left);
			printTree(root.right);
		}
	}

	public static void main(String[] args) {
		int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree bt = new BinaryTree();
		Node root = bt.buildTree(nodes);
//		System.out.println(root.data);//to get the root value as 1
		bt.printTree(root);
	}

}
