/*
An sorted array of integers was rotated an unknown number of times.
Given such an array, find the index of the element in the array in faster than linear time. If the
element doesn't exist in the array, return null.
For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the
array).
Y ou can assume all the integers in the array are unique.
 */

import java.util.*;
import java.io.*;
public class day54_solution {
    static Integer findElement(int[] ar, int elm){
        return find_pos(ar,elm,0, ar.length-1);
    }
    static Integer find_pos(int[] arr, int em, int start, int end){
        if(start == end){
            if(arr[start] == em){
                return start;
            }
            else
                return null;
        }

        int mid = (start+end)/2;

        if((arr[start] <= arr[mid] &&  arr[start]<= em && arr[em]<=arr[mid]) || ( arr[mid+1]<=arr[end] && (em < arr[mid+1] || em > arr[end]) )){
            return find_pos(arr, em , start, mid);
        }
        else{
            return find_pos(arr, em, mid+1, end);
        }

    }
 public static void main(String arg[]) throws IOException{
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String st1 = reader.readLine();
     String st2 = reader.readLine();
     String st1Arr[] = st1.split(" ");
     int[] ar = new int[st1Arr.length];
     int i=0;
     for(String s: st1Arr){
         ar[i++] = Integer.parseInt(s);
     }
     int m = Integer.parseInt(st2);
     System.out.println(findElement(ar, m));
 }
}
