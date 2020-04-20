//This is the program of printing matrix in snake patter
//Sample input and output
//Input : 1 2 3
//        4 5 6
//        7 8 9
//output: 1 2 3
//        6 5 4
//        7 8 9

import java.util.*;
public class day34_ArraySnakePattern {
 public static void main(String arg[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array=");
     int n = sc.nextInt();
     int ar[][] = new int[n][n];
     System.out.println("Enter the elements of the array=");
     for(int i=0; i<n; i++){
         for(int j=0; j<n; j++){
             ar[i][j] = sc.nextInt();
         }
     }
     System.out.println("Your array");
     for(int i=0; i<n; i++){
         for(int j=0; j<n; j++){
             System.out.print(ar[i][j]+" ");
         }
         System.out.println();
     }

     System.out.println("Snake pattern of the matrix=");
     for(int i=0; i<n; i++){
         if(i%2==0) {
             for (int j = 0; j < n; j++) {
                 System.out.println(ar[i][j] + " ");
             }
         }
         else {
             for (int j = n - 1; j >= 0; j--) {
                 System.out.println(ar[i][j] + " ");
             }
         }
         System.out.println();
         }

 }
}
