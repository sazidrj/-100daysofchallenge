/*
Rotate the matrix by 90 degree
 */
import java.util.*;
public class day63_solution {
    static int[][] rotMatrix(int[][] ar, int n){
        int ar1[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ar1[j][n-1-i] = ar[i][j];
            }
        }
        return ar1;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                ar[i][j] = sc.nextInt();
        }

        int ar2[][] = rotMatrix(ar, n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ar2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
