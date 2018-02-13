package hackerrank.hackerrank.Algorithms.Greedy;

import java.util.Arrays;
import java.util.Scanner;

//Marc's Cakewalk
public class marcCakewalk {
	static long marcsCakewalk(int[] calorie) {
        // Complete this function
		Arrays.sort(calorie);
		long sum=0;
		for(int i=calorie.length-1; i>=0; i--){
			sum += (calorie[i]*Math.pow(2, calorie.length-i-1));
		}
		
		return sum;
    }
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calorie = new int[n];
        for(int calorie_i = 0; calorie_i < n; calorie_i++){
            calorie[calorie_i] = in.nextInt();
        }
        long result = marcsCakewalk(calorie);
        System.out.println(result);
        in.close();
	}
}
