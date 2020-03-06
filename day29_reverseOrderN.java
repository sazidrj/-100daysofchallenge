// This is program of reversing an array in time order of n

import java.util.*;
import java.io.*;

public class day29_reverseOrderN {
    static int[] swap(int arr[], int a, int b){
        int temp = arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            return arr;
    }
    static int[] reverse(int ar[]){
        int low=0, high=ar.length-1;
        while(low<high){
            swap(ar, low, high);
            low++;
            high--;
        }
        return ar;
    }
    public static void main(String arg[]) throws IOException{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] st = reader.readLine().split(" ");
       int[] ar = new int[st.length];
       for(int i=0; i<st.length; i++){
           ar[i] = Integer.parseInt(st[i]);
       }

       System.out.print("Reverse array=" );
       reverse(ar);
       for(int i=0; i<ar.length; i++){
           System.out.print(ar[i]);
       }
  }
}
