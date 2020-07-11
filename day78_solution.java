/*
  Two Strings are given , str1 & str2
  Three operations are allowed on the string str1
  1. Insert
  2. Delete
  3. Replace

  return minimum number of operations required to make string str1 same as string str2.
 */


import java.util.Scanner;
public class day78_solution {
    private static int minimum(int x, int y, int z){
        if(x<=y && x<=z)
            return x;
        else if(y>=x && y>=z)
            return y;
        else
            return z;
    }

    private static int func(String str1, String str2, int m, int n){
        if(m==0)
            return n;
        if(n==0)
            return m;

        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return func(str1,str2,m-1,n-1);
        }

        return 1+minimum(func(str1,str2,m,n-1),
                         func(str1,str2,m-1,n),
                         func(str1, str2,m-1,n-1));
    }

    public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      String str1 = sc.next();
      String str2 = sc.next();

      System.out.println(func(str1,str2,str1.length(), str2.length()));

    }
}
