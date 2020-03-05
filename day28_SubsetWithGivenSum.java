import java.io.*;
import java.util.*;
public class day28_SubsetWithGivenSum {
    static void subset(int ar[], int n, Vector<Integer> v, int sum){

        if(sum==0){
            for(int i=0; i<v.size(); i++)
                System.out.print(v.get(i) + " ");
            System.out.println();
            return;
        }

        if(n==0)
            return;

        subset(ar, n-1, v, sum);
        Vector<Integer> v1 = new Vector<Integer>(v);
        v1.add(ar[n-1]);
        subset(ar, n-1, v1, sum-ar[n-1]);

    }

    static void printSubset(int arr[], int n, int sum){
        Vector<Integer> v = new Vector<Integer>();
        subset(arr,n,v,sum);
    }
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] st = reader.readLine().split(" ");
        int sum = Integer.parseInt(reader.readLine());
        int[] arr = new int[st.length];
        for(int i=0; i<st.length; i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        int n = arr.length;
        printSubset(arr, n, sum);


    }
}




