//Program to find binomisl  coefficient  nCm

import java.util.*;
public class day82_solution {
    private static int binomialCoeff(int n, int m){
        int[][] ar = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
         for(int j=0; j<=m; j++){
               if(i==0 || i<j)
                   ar[i][j] = 0;
               else if(j==0)
                   ar[i][j] = 1;
               else if(j==1 || (i-j)==1)
                   ar[i][j] = i;
               else
                   ar[i][j] = ar[i-1][j] + ar[i-1][j-1];
            }
        }
        return ar[n][m];

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(binomialCoeff(n, m));

    }
}
