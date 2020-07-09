//Lcm of two numbers

import java.util.Scanner;

public class day75_solution {
    private static int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
    private static long lcm(int a, int b){
        int g = gcd(a, b);

        return (long)(a*b)/g;
    }

    public static void main(String argp[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a,b));
    }
}

