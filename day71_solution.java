/*
Maximum pairwise product
 */

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class day71_solution {
    static long getMaxPairwiseProduct(int[] numbers) {
        int n=numbers.length;

        int max_index1 = -1;
        for(int i=0; i<n; i++){
            if(max_index1==-1 || (numbers[i] > numbers[max_index1]))
                max_index1=i;
        }
        int max_index2 = -1;
        for(int i=0; i<n; i++){
            if((i!=max_index1) && ((max_index2==-1) || (numbers[i] > numbers[max_index2])))
                max_index2 = i;
        }

        return (long)(numbers[max_index1]*numbers[max_index2]);
    }
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));


        /*

        //Stress Test

        while(true){
        Random ran = new Random();
        int max = 5;
        int min = 2;

        int randomNum = ran.nextInt(max-min)+1 + min;
        System.out.println("Random Number: " + randomNum);

        int[] list = new int[randomNum];

        for(int i=0; i<randomNum; i++){
        list[i] = ran.nextInt((10)+1);
        System.out.println(list[i]);
        }

        System.out.println("");

        double result1 = getMaxPairwiseProduct1(list);
        double result2 = getMaxPairwiseProduct2(list);

        if(result != result)
        {
        System.out.println("Error! slow: "+ result1 + "fast:" + result2);
        break;
        }
        else{
        System.out.println("OK");
        }


         */
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}