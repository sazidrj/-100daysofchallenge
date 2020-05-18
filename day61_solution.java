
/*
Given two array, we have to return the sum of the element of the arrays. Length of both the array need not to be true.
 */
import java.util.*;
public class day61_solution {
    static int[] sumArray(int a[], int b[]){
        StringBuilder stb  = new StringBuilder();

        for(int i=0; i<a.length; i++)
            stb.append(a[i]);

        int n1 = Integer.parseInt(new String(stb));

        stb.setLength(0);

        for(int i=0; i<b.length; i++)
            stb.append(b[i]);

        int n2 = Integer.parseInt(new String(stb));

        int result = n1+n2;
        int len = (Integer.toString(result).length());
        int finalArr[] = new int[len];

        for(int i=len-1; i>=0; i--){
            finalArr[i] = result%10;
            result = result/10;
        }
        return finalArr;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        int m = sc.nextInt();
        int[] ar2 = new int[m];
        for(int i=0; i<n; i++)
            ar1[i] =  sc.nextInt();

        for(int i=0; i<m; i++)
            ar2[i] = sc.nextInt();

        int[] res = sumArray(ar1, ar2);
        for(int elm: res)
            System.out.print(elm + " ");
    }
}
