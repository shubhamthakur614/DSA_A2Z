package com.tree;

import com.tree.Diameter.BinaryTree;
import com.tree.Diameter.Node;

/*
 * https://leetcode.com/problems/subtree-of-another-tree/description/
 * leetcode 572
 */
public class Subtree_of_another_tree {
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

		public static void print(Node node) {

			if (node == null) {
				return;
			}
			System.out.print(node.data + ",");
			print(node.left);
			print(node.right);
		}
	}

	public static void main(String[] args) {
		int[] node1 = { 3, 4, 1, -1, -1, 2, -1, -1, 5, -1, -1 };
		BinaryTree bt = new BinaryTree();
		Node root1 = bt.buildTree(node1);
		bt.print(root1);
		int[] nodes2 = { 4, 1, -1, -1, 2, -1, -1 };
		BinaryTree bt2 = new BinaryTree();
		Node root2 = bt2.buildTree(nodes2);
		bt2.print(root2);
		// please do check the senario online as it is not possble to recreate

		// solution given below

	}

	public static boolean isIdentical(Node root, Node subRoot) {

		if (root == null && subRoot == null) {
			return true;
		}
		if (root == null || subRoot == null) {
			return false;
		}
		if (root.data == subRoot.data) {
			return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
		}
		return false;
	}

	public static boolean isSubtree(Node root, Node subRoot) {
		if (subRoot == null) {
			return true;
		}
		if (root == null) {
			return false;
		}
		if (root.data == subRoot.data) {
			if (isIdentical(root, subRoot)) {
				return true;
			}
		}
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

}
