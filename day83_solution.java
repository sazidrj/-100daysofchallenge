/*
Given coins of value 1, 5, 10
we have to find out the minimum number of the coins needed to get required sum.
 */

import java.util.Scanner;

public class day83_solution {
    private static int getChange(int m) {
        int count=0;
        count = count+m/10;
        m = m-(m/10)*10;
        count = count+m/5;
        m = m-(m/5)*5;
        count =  count+m;
        m=count;
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}


