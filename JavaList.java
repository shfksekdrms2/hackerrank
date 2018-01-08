package hackerrank.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

//Java List
public class JavaList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		while (n-- > 0) {
			list.add(sc.nextInt());
		}
		int q = sc.nextInt();

		while (q-- > 0) {
			if (sc.next().equals("Insert")) {
				list.add(sc.nextInt(), sc.nextInt());
			} else {
				list.remove(sc.nextInt());
			}
		}

		while (!list.isEmpty()) {
			System.out.print(list.remove(0) + " ");
		}
	}
}
