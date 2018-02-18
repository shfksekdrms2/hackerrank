package hackerrank.hackerrank.DataStructurs.Queues;

import java.util.Scanner;
import java.util.Stack;

//Queue using Two Stacks
public class QueueusingTwoStacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<String> firstQueue = new Stack<>();
		Stack<String> secondQueue = new Stack<>();
		sc.nextLine();
		while (n-- > 0) {
			String[] input = sc.nextLine().split(" ");
			if (input[0].equals("1")) {
				firstQueue.push(input[1]);
			} else if (input[0].equals("2")) {
				if (secondQueue.isEmpty()) {
					while (!firstQueue.isEmpty()) {
						secondQueue.add(firstQueue.pop());
					}
				}
				secondQueue.pop();
			} else if (input[0].equals("3")) {
				if (secondQueue.isEmpty()) {
					while (!firstQueue.isEmpty()) {
						secondQueue.add(firstQueue.pop());
					}
				}

				System.out.println(secondQueue.peek());
			}
		}
	}
}
