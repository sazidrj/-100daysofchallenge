// This is the program of Left Rotation of an array in order of n time

import java.util.*;
import java.io.*;
public class day30_ArrayRotation {
    static int[] swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    static int[] reverse(int arr[], int low, int high){
        while(low<high){
            swap(arr, low, high);
            low++;
            high--;
        }
        return arr;
    }
 static int[] Rotation(int ar[], int d){
     reverse(ar,0, d-1);
     reverse(ar, d, ar.length-1);
     reverse(ar, 0, ar.length-1);
     return ar;
 }

 public static void main(String arg[]) throws IOException{
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Please Enter your arrays elements");
     String[] st = reader.readLine().split(" ");
     System.out.println("Please enter the number of rotation=");
     int d = Integer.parseInt(reader.readLine());
     int[] arr = new int[st.length];
     for(int i=0; i<st.length; i++){
         arr[i] = Integer.parseInt(st[i]);
     }

     Rotation(arr, d);
     System.out.println("Rotated Array=");
     for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]);
     }
 }
}
