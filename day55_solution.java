/*
Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
For example, given the following matrix:
[[1,  2,  3,  4,  5],
[6,  7,  8,  9,  10],
[11, 12, 13, 14, 15],
[16, 17, 18, 19, 20]]
Y ou should print out the following:
1
2
3
4
5
10
15
20
19
18
17
16
11
6
7
8
9
14
13
12
 */
import java.util.*;
public class day55_solution {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] ar = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                  ar[i][j] = sc.nextInt();
            }
        }

        int k=0,l=0;
        while(k<m && l<n){
            for(int i=l; i<n; i++){
                System.out.println(ar[k][i]);
            }
            k++;
            for(int i=k; i<m; i++){
                System.out.println(ar[i][n-1]);
            }
            n--;
            if(k<m){
                for(int i= n-1; i>l; i--){
                    System.out.println(ar[m-1][i]);
                }
                m--;
            }
            if(l<n){
                for(int i=m-1; i>k; i--){
                    System.out.println(ar[i][l]);
                }
                l++;
            }
        }

    }
}
