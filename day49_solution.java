/*
Given a list of words, find all pairs of unique indices such that the concatenation of the two words is a
palindrome.
For example, given the list ["code", "edoc", "da", "d"], return [(0, 1), (1, 0), (2, 3)].
 */
import javafx.util.Pair;

import java.util.*;
import java.io.*;
public class day49_solution {
    public static List<Pair> palindromePair(String[] str){
      List<Pair> ls = new ArrayList<>();
      for(int i=0; i<str.length; i++){
          for(int j=i+1; j<str.length; j++){
              if(isPalindrome(str[i]+str[j])){
                  ls.add(new Pair(i,j));
              }
              if(isPalindrome(str[j]+str[i])){
                  ls.add(new Pair(j,i));
              }
          }
      }
      return ls;
    }
    public static boolean isPalindrome(String s){
        for(int i=0, j=s.length()-1; i<j; i++,j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
  public static void main(String arg[]) throws IOException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String st = reader.readLine();
      String[] stArray = st.split(" ");
     List<Pair> ls = palindromePair(stArray);
     ls.forEach(l -> System.out.println("("+l.getKey()+","+ l.getValue()+")"));
  }
}
