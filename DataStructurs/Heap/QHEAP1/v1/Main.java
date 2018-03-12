package hackerrank.hackerrank.DataStructurs.Heap.QHEAP1.v1;

import java.util.PriorityQueue;
import java.util.Scanner;

//priorityQueue
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int q = sc.nextInt();

		while (q-- > 0) {
			switch (sc.nextInt()) {
				case 1:
					pq.add(sc.nextInt());
					break;
				case 2:
					pq.remove(sc.nextInt());
					break;
				case 3:
					System.out.println(pq.peek());
					break;
				default:
					break;
			}
		}
	}
}
