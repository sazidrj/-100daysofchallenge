/*
Given an even number (greater than 2), return two prime numbers whose sum will be equal to the
        given number.
        A solution will always exist. See Goldbach’s conjecture.
        Example:
        Input: 4
        Output: 2 + 2 = 4
        If there are more than one solution possible, return the lexicographically smaller solution.
        If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, then
        [a, b] < [c, d]
        If a < c OR a==c AND b < d.

 */

import java.util.*;
public class day50_solution{
    public static int[] primeSum(int n){
        int[] ar = new int[2];
        for(int i=2; i<=i/2; i++){
            if(isPrime(i) && isPrime(n-i)){
                 ar[0] = i;
                 ar[1] = n-i;
                 return ar;
            }
        }
      return null;
    }
    public static boolean isPrime(int n){
        for(int i=2; i<Math.sqrt(n)+1; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar = primeSum(n);
        for(int a: ar){
            System.out.print(a+" ");
        }

    }

}