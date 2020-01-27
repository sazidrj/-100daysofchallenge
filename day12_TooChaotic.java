import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day12_TooChaotic {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        for(int i=0; i<q.length; i++){
            if(q[i]-(i+1)>2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        int count=0;
        for(int i=0; i<q.length; i++){
            for(int j=i+1; j<q.length; j++){
                if(q[i]>q[j]){
                    int temp = q[j];
                    q[j] = q[i];
                    q[i] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
