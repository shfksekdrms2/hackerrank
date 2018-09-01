package hackerrank.hackerrank.JAVA.ExceptionHandling.JavaExceptionHandling_try_catch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 * Java Exception Handling (Try-catch)
 */

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println((x / y));
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
