/*
This is the program of rotating matrix in anti clock wise direction
sample input and output
Input : 1 2 3
        4 5 6
        7 8 9
Output : 3 6 9
         2 5 8
         1 4 7
 */

import java.util.*;
public class day36_CounterRotateMatrix {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array=");
        int n = sc.nextInt();
        int ar[][] = new int[n][n];
        System.out.println("Enter the elements of the array=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }

        //Logic for rotating matrix by 90 degree in anti-clockwise direction
        for(int i=0; i<n/2; i++){
            for(int j =0; j<n; j++){
              int temp = ar[i][j];
              ar[i][j] = ar[n-(i+1)][j];
              ar[n-(i+1)][j] = temp;
            }
        }

        System.out.println("Matrix after performing action=");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }
}
