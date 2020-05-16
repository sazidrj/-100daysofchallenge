/*
Given an array of integers, return a new array such that each element at index  iof the new array is
the product of all the numbers in the original array except the one at  i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be  [120, 60, 40,
30, 24]. If our input was [3, 2, 1], the expected output would be  [2, 3, 6].

 */

import java.util.*;

class day58_solution{
    static int[] newArray(int[] ar) {
        int product = 1;
        for (int i = 0; i < ar.length; i++)
            product *= ar[i];

        for (int i = 0; i < ar.length; i++)
            ar[i] = product / ar[i];

        return ar;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array=");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++)
            ar[i] = sc.nextInt();

        int[] arr = newArray(ar);
        System.out.print("[");
        for(int elem : arr)
            System.out.print(" "+elem+ " ");
        System.out.print(']');
    }
}