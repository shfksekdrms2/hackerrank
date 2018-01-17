package hackerrank.hackerrank;

import java.util.Scanner;

//Java 1D Array
public class Java1DArray {
	public static boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.
		boolean win = false;
		int position = -1;	//because first index is zero
		int[] visit = new int[game.length];
//		System.out.println("----------------------------");
//		System.out.println("leap: "+leap);
		while (true) {
			if(position+1 < game.length && game[position+1] == 0){
				if(visit[position+1] >= 1){
					break;
				}
//				System.out.println("position+1: "+ (position+1));
				position++;
				visit[position]++;
			}else{
//				System.out.println("position+leap: "+ (position+leap));
//				System.out.println("position: "+position);
//				System.out.println("game.length-1: "+(game.length-1));
				if(position+leap >= game.length-1){
					win = true;
					break;
				}
				if(game[position+leap] == 0){
					position += leap;
					visit[position]++;
				}else if( position-1 >= 0 && game[position-1] == 0){
					position--;
					visit[position]++;
				}else{
					win = false;
					break;
				}
			}
		}
//		System.out.println("----------------------------");

		return win;
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
