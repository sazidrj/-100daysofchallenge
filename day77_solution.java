//Longest common ssubsequence

import java.util.Scanner;
public class day77_solution {
     static int longestComSub(char[] x, char[] y, int m, int n){
         int[][] ar = new int[m+1][n+1];

         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 if(i==0 || j==0)
                     ar[i][j] = 0;
                 else if(x[i-1] == y[j-1])
                     ar[i][j] = ar[i-1][j-1]+1;
                 else
                     ar[i][j] = Math.max(ar[i-1][j], ar[i][j-1]);
             }
         }

         return ar[m][n];

     }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();

        char[] ch1 = st1.toCharArray();
        char[] ch2 = st2.toCharArray();
        int m = ch1.length;
        int n = ch2.length;

        System.out.println("Longest common subsequence length="+longestComSub(ch1,ch2,m,n));



    }
}
