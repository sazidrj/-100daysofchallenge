/*
  Two Strings are given , str1 & str2
  Three operations are allowed on the string str1
  1. Insert
  2. Delete
  3. Replace

  return minimum number of operations required to make string str1 same as string str2.

  Dynamic programming approach is used here.
 */

import java.util.*;

public class day79_solution {
    private static int minimum(int a, int b, int c){
       if(a>=b && a>=c)
           return a;
       else if(b>=a && b>=c)
           return b;
       else
           return c;
    }

    private static int func(String st1, String st2){
        int m=st1.length();
        int n=st2.length();

        int[][] ar = new int[m+1][n+1];

        for(int i=0; i<=m; i++ ){
            for(int j=0; j<=n; j++){
                if(i==0)
                    ar[i][j] = j;
                else if(j==0)
                    ar[i][j] = i;

                else if(st1.charAt(i-1)==st2.charAt(j-1))
                    ar[i][j] = ar[i-1][j-1];

                else{
                    ar[i][j] = 1 + minimum(ar[i][j-1], ar[i-1][j-1], ar[i-1][j]);
                }
            }
        }
         return ar[m][n];
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();

        System.out.println(func(st1,st2));


    }
}
