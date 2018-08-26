package hackerrank.hackerrank.DataStructurs.Trees.BinarySearchTreeInsertion;

import java.util.*;
import java.io.*;

/*
 * https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
 * Binary Search Tree : Insertion
 */

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		preOrder(root);
	}

	public static void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static Node insert(Node root, int data) {
		Node node;
		if (root == null) {
			node = new Node(data);
			root = node;
		}
		if (root.data < data) {
			root.right = insert(root.right, data);
			return root;
		}
		if (root.data > data) {
			root.left = insert(root.left, data);
			return root;
		}

		return root;

	}
}
