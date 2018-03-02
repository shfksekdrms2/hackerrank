package hackerrank.hackerrank.JAVA.DataStructs;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaSubarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		while (n-- > 0) {
			int input = sc.nextInt();
			list.add(input);
		}
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			int sum = 0;
			for (int j = i; j < list.size(); j++) {
				sum += list.get(j);
				if (sum < 0) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}
}
