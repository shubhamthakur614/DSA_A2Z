package com.tree;

/*
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 * leetcode 543
 */
public class Diameter {

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

	public static class BinaryTree {
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

		// bruteforce approach with O(n^2)
		/*
		 * The apporach here is we are using height function
		 */
		public static int diameter(Node root) {
			if (root == null) {
				return 0;
			}
			int left = diameter(root.left);
			int right = diameter(root.right);
			int dia = height(root.left) + height(root.right) + 1;
			return Math.max(dia, Math.max(left, right));

		}

		public static int height(Node root) {
			if (root == null)
				return 0;
			int left = height(root.left);
			int right = height(root.right);
			return Math.max(left, right) + 1;

		}

		// approach 2 with o(n) by suing heigh within calculating diameter
		static int ans = 0;

		public static int diamerter1(Node root) {
			dia(root);
			return ans;
		}

		public static int dia(Node root) {

			if (root == null) {
				return 0;
			}
			int left = height(root.left);
			int right = height(root.right);
			int combine = left + right + 1;
			ans = Math.max(ans, combine);
			return Math.max(left, right) + 1;

		}
	}

	public static void main(String[] args) {

		int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree bt = new BinaryTree();
		Node root = bt.buildTree(nodes);
		int Diameter = bt.diameter(root);
		System.out.println("Diameter is " + Diameter);
		int dia1 = bt.diamerter1(root);
		System.out.println("Diameter is " + dia1);
	}
}
