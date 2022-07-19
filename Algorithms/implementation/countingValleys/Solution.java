package hackerrank.hackerrank.Algorithms.implementation.countingValleys;

public class Solution {

    public static void main(String[] args){
        int velly = countingValleys(8, "UDDDUDUU");
        System.out.println(velly);
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        String[] split = path.split("");
        int result = 0;
        int position = 0;
        for (int i = 0; i < steps; i++) {
            if (split[i].equals("U")) {
                if (position == -1) {
                    result++;
                }
                position++;
            } else {
                position--;
            }
        }
        return result;
    }

}
