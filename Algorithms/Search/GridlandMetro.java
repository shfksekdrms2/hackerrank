package hackerrank.hackerrank.Algorithms.Search;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Gridland Metro
public class GridlandMetro {
	static int gridlandMetro(int n, int m, int k, int[][] track) {
//		BigInteger sum = n * m;
		long sum = 0;
		System.out.println(sum);
		Arrays.sort(track, new mySort());
		int min = track[0][1]; 
		int max = track[0][2];
		for(int i=1; i<track.length; i++){
			if(track[i][0] == track[i-1][0]){
				if(((min >= track[i][1] && min <= track[i][2]) || (max >= track[i][1] && max <= track[i][2]) ||
						(min <= track[i][1] && max >= track[i][1]) || (min <= track[i][2] && max >= track[i][2]))){
					if(min > track[i][1]){
						min = track[i][1];
					}
					
					if(max < track[i][2]){
						max = track[i][2];
					}
				}else{
//					System.out.println("111 min: "+min+" max: "+max);
					sum -= (max - min + 1);
					min = track[i][1];
					max = track[i][2];
					if(i == track.length-1){
//						System.out.println("444 min: "+min+" max: "+max);
						sum -= (max - min + 1);
					}
				}
			}else{
//				System.out.println("222 min: "+min+" max: "+max);
				sum -= (max - min + 1);
				min = track[i][1];
				max = track[i][2];
				if(i == track.length-1){
//					System.out.println("333 min: "+min+" max: "+max);
					sum -= (max - min + 1);
				}
			}
		}
		System.out.println(sum);
		System.out.println(((long) n)*((long) m));
		System.out.println((int)(sum + ((long) n)*((long) m)));
		return (int)(sum + ((long) n)*((long) m));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int[][] track = new int[k][3];
		for (int track_i = 0; track_i < k; track_i++) {
			for (int track_j = 0; track_j < 3; track_j++) {
				track[track_i][track_j] = in.nextInt();
			}
		}
		int result = gridlandMetro(n, m, k, track);
		System.out.println(result);
		in.close();
	}
}

class mySort implements Comparator<int[]>{
	@Override
	public int compare(int[] o1, int[] o2) {
		if(o1[0]-o2[0] == 0){
			return o1[1] - o2[1];
		}
		
		return o1[0]-o2[0];
	}
}
