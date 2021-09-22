package exam;

import java.util.*;

public class JavaComparator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if (o2.score - o1.score == 0) {
			int length = (o2.name.length() > o1.name.length()) ? o1.name.length() : o2.name.length();
			for(int i=0; i<length; i++){
				if(o2.name.charAt(i) - o1.name.charAt(i) != 0){
					return o1.name.charAt(i) - o2.name.charAt(i);
				}
			}
			return o1.name.length() - o2.name.length();
		} else {
			return o2.score - o1.score;
		}
	}
}
