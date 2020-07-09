// nth Fibonacci number

import java.util.Scanner;

public class day72_solution {
    private static long calc_fib(int n) {
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<=n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return (long)fibo[n];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
