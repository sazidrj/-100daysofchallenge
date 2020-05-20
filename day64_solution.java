/*
  A String is given. If palindrome string can be make by rearranging letters of the string then print "Yes", otherwise print "No"
 */

import java.util.*;
public class day64_solution {
 public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     HashMap<Character, Integer> hm = new HashMap<>();
     for(int i=0; i<s.length(); i++){
         if(hm.containsKey(s.charAt(i)))
             hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
         else
             hm.put(s.charAt(i), 1);
     }

     int oddOccur = 0;
     for(Map.Entry<Character, Integer> m : hm.entrySet()){
         if(m.getValue()%2!=0)
         {
             oddOccur++;
         }
     }

     if(oddOccur <= 1)
         System.out.println("Yes");
     else
         System.out.println("No");


 }
}
