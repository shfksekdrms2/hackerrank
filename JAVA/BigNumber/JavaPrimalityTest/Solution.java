package hackerrank.hackerrank.JAVA.BigNumber.JavaPrimalityTest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/java-primality-test/problem
 * Java Primality Test
 */
public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		BigInteger n = scanner.nextBigInteger();
		if (n.isProbablePrime(100)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

		scanner.close();
	}
}
