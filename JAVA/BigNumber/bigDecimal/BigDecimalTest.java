package JAVA.BigNumber.bigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class BigDecimalTest {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, (o1, o2) -> {
            if (o1 == null || o2 == null) {
                return 0;
            }
            BigDecimal first = new BigDecimal(o1);
            BigDecimal second = new BigDecimal(o2);
            return second.compareTo(first);

        });


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}