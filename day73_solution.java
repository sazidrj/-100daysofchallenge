//last digit of nth fibonacci

import java.util.Scanner;

public class day73_solution {
    private static int getFibonacciLastDigit(int n){
        int[] fibo = new int[n+1];

        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=0; i<=n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n]%10;
    }

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);

    }
}
