import java.util.*;
import java.io.*;
public class day33_trappingRainwater {
    static int function(int ar[], int pos){
        int[] ar1 = new int[ar.length];
        int [] ar2 = new int[ar.length];
        for(int i=0; i<pos; i++)
            ar1[i] = ar[i];
        for(int i=pos+1; i<ar.length; i++)
            ar2[i] = ar[i];
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int min = Math.min(ar1[ar1.length-1], ar2[ar2.length-1]);
        return min-ar[pos];
    }
 public static void main(String arg[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] ar = new int[n];
   for(int i=0; i<n; i++)
       ar[i] = sc.nextInt();

    int ans = 0;
    for(int i=1; i<n-1; i++){
        ans += function(ar, i);
    }

    System.out.println("units of trapped water="+ans);
 }
}

