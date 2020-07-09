import java.util.*;
public class day69_solution {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int r = sc.nextInt();
        int ar[] = new int[s];
        for(int i=0; i<ar.length; i++){
            ar[i] = sc.nextInt();
        }

        int res = 0;
       for(int i=0; i<r; i++){
           int l1 = sc.nextInt();
           int l2 = sc.nextInt();

           for(int j=0; j<s; j++){
               if(ar[j]>=l1 && ar[j]<=l2){
                   res++;
               }
           }
           System.out.print(res+" ");
           res=0;
       }

    }
}
