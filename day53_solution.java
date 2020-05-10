/*
Given a string s and an integer k, break up the string into multiple texts such that each text has a
length of k or less. Y ou must break it up so that words don't break across lines. If there's no way to
break the text up, then return null.
Y ou can assume that there are no spaces at the ends of the string and that there is exactly one
space between each word.
For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you
should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a
length of more than 10.

 */

import java.util.*;
import java.io.*;

public class day53_solution {
    static List<String> splitString(String[] str, int k){
        List<String> lst = new ArrayList<>();
        StringBuilder stb = null;
        for(int i=1; i<str.length; i++){
            if(str.length> k)
                return null;
            if(stb==null)
                stb=new StringBuilder(str[i]);
            else if(stb.length() +str[i].length() +1 <=k)
                stb.append(" ").append(str[i]);
            else {
                lst.add(stb.toString());
                stb = new StringBuilder(str[i]);
            }
        }
        if(stb != null)
            lst.add(stb.toString());
     return lst;
    }
  public static void main(String arg[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      int k = sc.nextInt();
      String[] st = line.split(" ");
      System.out.println(splitString(st, k));

  }
}
