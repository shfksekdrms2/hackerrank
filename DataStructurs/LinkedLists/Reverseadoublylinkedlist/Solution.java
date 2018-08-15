package hackerrank.hackerrank.DataStructurs.LinkedLists.Reverseadoublylinkedlist;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
 * Reverse a doubly linked list
 */
public class Solution {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}

			this.tail = node;
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
		while (node != null) {
			System.out.print(String.valueOf(node.data) + " ");

			node = node.next;

		}
	}

	static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

		while (head.next != null) {
			head = head.next;
		}
		DoublyLinkedListNode first = new DoublyLinkedListNode(head.data);
		DoublyLinkedListNode move = first;
		while (head != null) {
			move.next = head.prev;
			move.prev = head.next;
			move.data = head.data;
			head = head.prev;
			move = move.next;
		}
		return first;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int t = scanner.nextInt();

		for (int tItr = 0; tItr < t; tItr++) {
			DoublyLinkedList llist = new DoublyLinkedList();

			int llistCount = scanner.nextInt();

			for (int i = 0; i < llistCount; i++) {
				int llistItem = scanner.nextInt();

				llist.insertNode(llistItem);
			}

			DoublyLinkedListNode llist1 = reverse(llist.head);
			System.out.println(llist1.data + "-----------------");
			// printDoublyLinkedList(llist1, " ");
		}

		scanner.close();
	}
}
