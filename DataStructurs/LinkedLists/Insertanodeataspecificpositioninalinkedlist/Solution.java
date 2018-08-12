package hackerrank.hackerrank.DataStructurs.LinkedLists.Insertanodeataspecificpositioninalinkedlist;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
 * Insert a node at a specific position in a linked list
 */
public class Solution {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		node.data = data;
		SinglyLinkedListNode index = head;
		for (int i = 0; i < position - 1; i++) {
			head = head.next;
		}
		node.next = head.next;
		head.next = node;
		return index;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList llist = new SinglyLinkedList();

		int llistCount = sc.nextInt();

		for (int i = 0; i < llistCount; i++) {
			int llistItem = sc.nextInt();
			llist.insertNode(llistItem);
		}

		int data = sc.nextInt();
		int position = sc.nextInt();

		SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

		printSinglyLinkedList(llist_head);
	}

}
