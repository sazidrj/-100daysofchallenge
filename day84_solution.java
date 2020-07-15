//Fractional Knapsack implementation

import java.util.*;
public class day84_solution {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here
        double[] ar = new double[values.length];
        for(int i=0; i<values.length; i++)
            ar[i] = (double)values[i]/weights[i];

        for(int i=0; i<values.length-1; i++){
            for(int j=0; j<values.length-i-1; j++){
                if(ar[j] < ar[j+1]){
                    double swap = ar[j];
                    int swap1 = values[j];
                    int swap2 = weights[j];
                     ar[j] = ar[j+1];
                     values[j] = values[j+1];
                     weights[j] = weights[j+1];
                     ar[j+1] = swap;
                     values[j+1] = swap1;
                     weights[j+1] = swap2;
                }
            }
        }
        int i=0;
        double sum = 0;
        while(capacity>0){
            if(capacity>weights[i]){
                capacity = capacity-weights[i];
                sum = sum + values[i];
                i++;
            }
            else{
                sum = capacity*ar[i];
                capacity = 0;
            }
        }
      return sum;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
}

