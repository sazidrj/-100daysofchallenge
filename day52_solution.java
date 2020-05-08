/*
Given an array of numbers, find the maximum sum of any contiguous subarray of the array.
For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we
would take elements 42, 14, -5, and 86.
Given the array [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any
elements.
 */


import java.io.*;
import java.util.*;
public class day52_solution {
    static int maxSum(int[] arr){
        int sum=0, max=0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            max = Math.max(max, sum=Math.max(sum+arr[i], arr[i]));
        }
        return max;

    }
  public static void main(String arg[]) throws IOException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine();
      String[] stArr = s.split(" ");
      int[] ar = new int[stArr.length];
      for(int i=0; i<stArr.length; i++){
          ar[i] = Integer.parseInt(stArr[i]);
      }

  }
}
