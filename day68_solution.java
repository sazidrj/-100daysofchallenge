/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to
k.
For example, given [10, 15, 3, 7]and kof 17, return true since 10 + 7is 17.
Bonus: Can you do this in one pass?

 */
import java.util.*;
public class day68_solution {
    static boolean givenSumExist(int[] ar, int k){
        Arrays.sort(ar);
        int end = ar.length-1;
        for(int i=0; i<ar.length; i++){
            if(ar[i] + ar[end] == k)
                return true;
            else if(ar[i]+ar[end]>k){
                end--;
            }
        }
        return false;
    }
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ar[] = new int[n];
    for(int i=0; i<ar.length; i++){
        ar[i] = sc.nextInt();
    }

    int k = sc.nextInt();

    System.out.println(givenSumExist(ar, k));
    }
}
