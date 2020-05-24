import java.util.*;
public class day65_solution {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        boolean flag = true;
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            if(!hm1.containsKey(Character.valueOf(s1.charAt(i))))
                hm1.put(s1.charAt(i), 0);
            else
                hm1.put(s1.charAt(i), hm1.get(Character.valueOf(s1.charAt(i))+1));
        }

        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i=0; i<s2.length(); i++ )
        {
            if(!hm2.containsKey(Character.valueOf(s2.charAt(i))))
                hm2.put(Character.valueOf(s2.charAt(i)),0);
            else
                hm2.put(Character.valueOf(s2.charAt(i)), hm2.get(Character.valueOf(s2.charAt(i)))+1);
        }


        if(s1.length() < s2.length()){
            for(int i=0; i<s1.length(); i++){
                if(hm2.get(Character.valueOf(s2.charAt(i))) < hm1.get(Character.valueOf(s1.charAt(i)))) {
                    flag = false;
                    break;
                }
            }
        }
        else{
            for(int i=0; i<s2.length(); i++){
                if(hm1.get(Character.valueOf(s1.charAt(i))) < hm2.get(Character.valueOf(s2.charAt(i)))) {
                    flag = false;
                    break;
                }

            }
        }

        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
}
