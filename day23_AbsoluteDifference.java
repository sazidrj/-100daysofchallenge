import java.util.Scanner;
public class day23_AbsoluteDifference {
  public static void main(String agr[]){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
      }
      int adiff = Math.abs(arr[0]-arr[1]);
      for(int i=0; i<n-1; i++){
          for(int j=i+1; j<n; j++){
              int temp = Math.abs(arr[i]-arr[j]);
              if(temp<adiff){
                  adiff = temp;
              }
          }
      }
      System.out.println(adiff);
  }

}
