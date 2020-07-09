// GCD
import java.util.Scanner;
public class day74_solution {
  private static int gcd(int a, int b){
      if(b==0)
          return a;
      else
          return gcd(b, a%b);
  }

  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(gcd(a,b));
  }
}
