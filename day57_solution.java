/*
Y ou are given a 2-d matrixwhere each cell represents number of coins in that cell. Assuming we
start at matrix[0][0], and can only move right or down, find the maximum number of coins you
can collect by the bottom right corner.
For example, in this matrix
0 3 1 1
2 0 0 4
1 5 3 1
The most we can collect is 0 + 2 + 1 + 5 + 3 + 1 = 12 coins.
 */
import java.util.*;
import java.util.function.BiFunction;
public class day57_solution {
     static int maxCoin(int[][] ar){
         BiFunction<Integer, Integer, Integer> fun = (row, col) -> row<0 || row>=ar.length || col<0 || col>=ar[row].length ? 0 : ar[row][col];

         for(int r=0; r< ar.length; r++){
             for(int c=0; c<ar[r].length; c++){
                 ar[r][c] = ar[r][c] + Math.max(fun.apply(r-1,c), fun.apply(r,c-1));
             }
         }

         return ar[ar.length][ar[0].length];
     }

 public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows of the matrix=");
     int r = sc.nextInt();
     System.out.println("Enter the number of the columns of the matrix=");
     int c = sc.nextInt();

     int[][] ar = new int[r][c];
     for(int i=0; i<r; i++){
         for(int j=0; j<c; j++){
             ar[r][c] = sc.nextInt();
         }
     }

     System.out.println(maxCoin(ar));
 }
}
