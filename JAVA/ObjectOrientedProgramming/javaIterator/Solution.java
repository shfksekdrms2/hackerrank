package hackerrank.hackerrank.JAVA.ObjectOrientedProgramming.javaIterator;

import java.util.*;

/*
 * https://www.hackerrank.com/challenges/java-iterator/problem
 * Java Iterator
 */
public class Solution {
	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String) {
				if (!element.toString().equals("###")) {
					continue;
				}
			}else{
				continue;
			}
			break;
		}
		return it;

	}

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}

		mylist.add("###");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
	}
}
