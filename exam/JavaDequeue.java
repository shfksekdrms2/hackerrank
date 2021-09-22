package exam;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

//Java Dequeue
public class JavaDequeue {
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		HashSet<Integer> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int uniqueNumberCnt = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			deque.add(num);
			hs.add(num);

			if (deque.size() == m) {
				if (uniqueNumberCnt < hs.size()) {
					uniqueNumberCnt = hs.size();
				}
				int first = deque.remove();
				if (!deque.contains(first)) {
					hs.remove(first);
				}
			}
		}
		System.out.println(uniqueNumberCnt);
	}
}
