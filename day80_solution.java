/*
Given a cost matrix of size m*n , we have to find out minimum total cost to reach bottom right of the matrix.
 */

import java.util.*;

public class day80_solution {
   private static int minimum(int a,int b, int c){
       if(a>=b && a>=c)
           return a;
       else if(b>=a && b>=c)
           return b;
       else
           return c;
   }

   private static int func(int[][] ar ){
       int m = ar.length;
       int n = ar[0].length;
       int[][] costMat = new int[m][n];

       costMat[0][0] = ar[0][0];
       for(int i=1; i<m; i++){
           costMat[i][0] = costMat[i-1][0] + costMat[i][0];
       }

       for(int i=1; i<n; i++)
       {
           costMat[0][i] = costMat[0][i-1] + costMat[0][i];
       }

       for(int i=1; i<m; i++){
           for(int j=1; j<n; j++){
               costMat[i][j] = minimum(costMat[i-1][j-1], costMat[i-1][j],costMat[i][j-1])+ costMat[i][j];
           }
       }

       return costMat[m-1][n-1];
   }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar  =  new int[m][n];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++){
                ar[i][j] = sc.nextInt();
            }
        }


    }
}
