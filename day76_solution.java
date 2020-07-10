
//Program of finding length of maximum increasing subsequence of an array
import java.util.Scanner;
public class day76_solution {

    private static int maxSubsequence(int ar[] , int n){
        int[] ar2 = new int[n];
        int  max = 0;

        for(int i=0; i<n; i++)
            ar2[i] = 1;

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(ar[i]>ar[j] && ar2[i] < ar2[j] + 1){
                    ar2[i] = ar2[j] + 1;
                }
            }
        }

        for(int i=0; i<n; i++)
            if(max<ar2[i])
                max = ar2[i];

        return max;

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println(maxSubsequence(ar, n));
    }
}
