import java.util.*;
public class Fedor_and_newGame {
    int countOnes(int n){
        int total_ones=0;
        int x=0;
        while(n>0){
            x=n%2;
            if(x==1){
                total_ones++;
            }
            n=n/2;
        }
        return total_ones;
    }
  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int k = sc.nextInt();
      int[] ar = new int[m+1];
      for(int i=0; i<m+1;i++ ){
          ar[i] = sc.nextInt();
      }
      int count=0;
      Fedor_and_newGame ob = new Fedor_and_newGame();
      for(int i=0; i<m; i++){
          int a = ob.countOnes(ar[i]^ar[m]);
          if(a<=k){
              count++;
          }
      }
     System.out.println(count);

  }
}
