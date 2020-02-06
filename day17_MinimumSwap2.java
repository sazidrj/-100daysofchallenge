import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class day17_MinimumSwap2 {

        // Complete the minimumSwaps function below.
        static int minimumSwaps(int[] arr) {
            int[] arr2 = new int[arr.length];
            for(int i=0; i<arr.length;i++){
                arr2[arr[i]-1] = i;
            }
            int sum=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] != i+1){
                    int temp1 = arr[i];
                    arr[i] = arr[arr2[i]];
                    arr[arr2[i]] = temp1;
                    sum=sum+1;

                    int temp2 = arr2[i];
                    arr2[i]=arr2[temp1-1];
                    arr2[temp1-1] = temp2;
                }
            }

            return sum;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int res = minimumSwaps(arr);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

