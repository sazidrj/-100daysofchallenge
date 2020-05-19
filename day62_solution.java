/*
Consider a matrix where each cell contains either a  or a . Any cell containing a  is called a filled cell. Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally. In the following grid, all cells marked X are connected to the cell marked Y.

XXX
XYX
XXX
If one or more filled cells are also connected, they form a region. Note that each cell in a region is connected to zero or more cells in the region but is not necessarily directly connected to all the other cells in the region.

Given an n*m matrix, find and print the number of cells in the largest region in the matrix. Note that there may be more than one region in the matrix.

Sample Input

4
4
1 1 0 0
0 1 1 0
0 0 1 0
1 0 0 0
Sample Output

5


 */

import java.util.*;
public class day62_solution {
    static int res(int[][] ar){
        int max =0;
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[0].length; j++){
                max = Math.max(max, count(ar, i,j));
            }
        }
        return max;
    }
    static int count(int[][] ar, int i, int j){
        if(i<0 || j<0 || i>ar.length-1|| j>ar[0].length-1 || ar[i][j]==0)
            return 0;

        int sum = ar[i][j]--;
        sum = sum+count(ar, i-1, j-1);
        sum = sum+count(ar, i-1, j);
        sum = sum+count(ar, i-1, j+1);
        sum = sum+count(ar, i, j-1);
        sum = sum+count(ar, i, j+1);
        sum = sum+count(ar, i+1, j-1);
        sum = sum+count(ar, i+1, j+1);

        return sum;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ar = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                ar[i][j] = sc.nextInt();
        }
        System.out.println(res(ar));

    }

}
