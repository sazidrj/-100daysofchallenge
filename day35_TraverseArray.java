//This is program for traversing array in order of r*c , where r = rows and c = columns
//This program space complexity is O(1)

import java.util.*;
public class day35_TraverseArray {
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

        //Traversing array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }

        System.out.println("Array after traversing");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }
    }
