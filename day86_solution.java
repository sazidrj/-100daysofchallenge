/*
 Program to check whether the strings rotations of each others.
 */
import java.util.*;
public class day86_solution {
    private static boolean isRotString(String str1, String str2){
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      String str1 = sc.next();
      String str2 = sc.next();

      System.out.println(isRotString(str1,str2));

    }
}
