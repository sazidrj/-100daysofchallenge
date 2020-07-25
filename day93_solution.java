/*
Check whether array permutaion exist such that each element indicates either number of elements before ore after it.
 */
import java.io.*;
import java.util.*;
public class day93_solution {
    public static boolean func(int ar[]){
        int n = ar.length;
        int [] freq = new int[n];

        for(int i=0; i<n; i++)
            freq[ar[i]]++;

        for(int i=0; i<n; i++){
            if(freq[i]!=0)
                freq[i]--;
            else if(freq[n-i-1]!=0)
                freq[n-i-1]--;
            else
                return false;
        }
        return true;
    }
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int ar[] = new int[n];
       for(int i=0; i<n; i++){
           ar[i] = sc.nextInt();
       }

       boolean bool = func(ar);
       if(bool)
           System.out.println("Yes");
       else
           System.out.println("No");
   }
}
