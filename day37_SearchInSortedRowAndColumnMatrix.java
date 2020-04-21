/*
This is the program to search the element in the matrix whose rows and columns are sorted.
This program takes time complexity of order of O(R+N)
 */

import java.util.*;

public class day37_SearchInSortedRowAndColumnMatrix {
  public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the matrix=");
      int n = sc.nextInt();
      int ar[][] = new int[n][n];
      System.out.println("Enter the element in sorted rows and columns");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              ar[i][j] = sc.nextInt();
          }
      }
      System.out.println("Enter the element to be search=");
      int m = sc.nextInt();


      //Logic of searching
      int posI = 0, posJ = n-1;
      while(posI>n-1 || posJ>n-1){
          if(ar[posI][posJ]==m){
              System.out.println("Element found at position=");
              System.out.println("row="+posI+"column="+posJ);
              return;
          }
          else if(m>ar[posI][posJ]){
              posI = posI+1;
          }
          else{
              posJ = posJ-1;
          }

      }

      System.out.println("Element is not found");

  }
}
