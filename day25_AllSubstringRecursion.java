import java.util.*;

public class day25_AllSubstringRecursion {
  private static void SubstringFind(String str, String ret){
     int l = str.length();
     if(l==0){
         System.out.println(ret);
         return;
     }
     SubstringFind(str.substring(1),ret);
     SubstringFind(str.substring(1), ret+str.charAt(0));

  }

  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      String st = sc.nextLine();
      SubstringFind(st, " ");

  }



}
