/*
Given the different coins values and the sum value. We have to find out the number of ways to get the given sum by choosing the coins value.
(Any coin can be use more than once.)
 */

import java.util.*;
public class day81_solution {
    private static int func(int[] ar, int sum){
        int len = ar.length;
        int[] dp = new int[sum+1];

        Arrays.fill(dp, 0);

        dp[0] = 1;
        for(int i=0; i<len; i++){
            for(int j = ar[i]; j<=sum; j++ ){
                dp[j] = dp[j] + dp[j-ar[i]];
            }
        }
        return dp[sum];
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++)
            ar[i] = sc.nextInt();
        int sum = sc.nextInt();

        System.out.println(func(ar, sum));

    }
}
