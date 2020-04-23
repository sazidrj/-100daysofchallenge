import java.io.*;
import java.util.*;

public class day41_GreedyCode {
    public static void main(String arg[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            long[] ar1 = new long[n];
            long[] ar2 = new long[n];
            for(int p=0; p<n; p++)
                ar1[p] = sc.nextLong();

            for(int q=0; q<n; q++)
                ar2[q] = sc.nextLong();

            Arrays.sort(ar1);
            Arrays.sort(ar2);
            boolean flag=true;
            int count=0,pos=0;
            for(int j=0; j<n; j++){
                if(flag==true) {
                    if (ar1[j] > ar2[j]) {
                        count++;
                        pos++;
                    }
                     else{
                         flag = false;
                    }
                }
                else{
                    if(ar1[j]>ar2[pos]){
                        count++;
                        pos++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
