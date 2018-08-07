package hackerrank.hackerrank;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-1d-array/problem
 * Java 1D Array
 */
public class Java1DArray {
	public static boolean canWin(int leap, int[] game) {
		boolean win = false;
		int index = 0; 
		boolean[] visit = new boolean[game.length];
		visit[index] = true;
		while (true) {
			if ((index + leap > game.length - 1) || (index + 1 > game.length)) {
				win = true;
				break;
			}
			if (game[index + leap] == 0 && !isAlreadyCheckIndex(index + leap, visit)) {
				index += leap;
			} else if (game[index + 1] == 0 && !isAlreadyCheckIndex(index + 1, visit)) {
				index++;
			} else if (index - 1 >= 0 && game[index - 1] == 0 && !isAlreadyCheckIndex(index - 1, visit)) {
				index--;
			}else{
				break;
			}
		}

		return win;
	}

	private static boolean isAlreadyCheckIndex(int index, boolean[] visit) {
		if (visit[index] == true) {
			return true;
		}
		visit[index] = true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
