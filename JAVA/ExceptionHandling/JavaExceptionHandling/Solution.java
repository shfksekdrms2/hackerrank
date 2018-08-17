package hackerrank.hackerrank.JAVA.ExceptionHandling.JavaExceptionHandling;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-exception-handling/problem
 * Java Exception Handling
 */
public class Solution {
	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyCalculator {

	/*
	 * Create the method long power(int, int) here.
	 */
	public String power(int n, int p) {
		// TODO Auto-generated method stub
		if (n < 0 || p < 0) {
			return "java.lang.Exception: n or p should not be negative.";
		} else if (n == 0 && p == 0) {
			return "java.lang.Exception: n and p should not be zero.";
		}
		return String.valueOf((int) Math.pow(n, p));
	}

}
