import java.util.*;
public class day90_doleoutCadbury {
    private static int calc(int m, int n){
        if(m<n)
        {
            int temp = m;
            m=n;
            n=m;
        }
        int mul = m*n;
        int sum=0;
        while(mul>0){
            int min = Math.min(m,n);
            sum = sum+mul/(min*min);
            mul = mul%(min*min);
            int temp = Math.min(m,n);
             n = m-n;
             m = temp;
        }
        return sum;
    }
    private static int func(Array[] ar){
        int res = 0;
        for(int i=0; i<ar.length; i++){
            int a = ar[i].a1;
            int b = ar[i].a2;
            res = res + calc(a,b);
        }

        return res;
    }

   private static class Array{
       int a1, a2;
       Array(int a1, int a2)
       {
           this.a1 = a1;
           this.a2 = a2;
       }
   }
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       int p=sc.nextInt();
       int q = sc.nextInt();
       int r = sc.nextInt();
       int s=  sc.nextInt();
       Array[] ar = new Array[(q-p+1)*(s-r+1)];
       int a = p, k=0;
       for(int i=0; i<q-p+1; i++) {
           int b = r;
           for (int j = 0; j < s - r + 1; j++) {
                ar[k++] = new Array(a,b);
                 b++;
           }
           a++;
       }
       System.out.println(func(ar));

   }
}
