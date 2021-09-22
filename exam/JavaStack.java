package exam;

import java.util.Scanner;
import java.util.Stack;

//Java Stack
public class JavaStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean result = true;
		Stack<Character> stack = new Stack<>();
		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			result = true;
			stack.clear();
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if (ch == '{' || ch == '[' || ch == '(') {
					stack.add(ch);
				} else {
					if (!stack.isEmpty()) {
						if (ch == '}') {
							if (stack.pop() != '{') {
								result = false;
								break;
							}
						} else if (ch == ')') {
							if (stack.pop() != '(') {
								result = false;
								break;
							}
						} else if (ch == ']') {
							if (stack.pop() != '[') {
								result = false;
								break;
							}
						}
					} else {
						result = false;
						break;
					}
				}
			}
			if (!stack.isEmpty()) {
				result = false;
			}
			System.out.println(result);
		}
	}
}
