import java.util.Arrays;
import java.util.Scanner;
public class day94_solution {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.substring(0,s.length()/2);
        String s2 = "";
        if(s.length()%2==0)
            s2 = s.substring(s.length()/2);
        else
            s2 = s.substring((s.length()/2)+1, s.length());

        s1 = sort(s1);
        s2 = sort(s2);
        System.out.println(s1 + " " + s2);
        if(s1.equals(s2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static String sort(String s){
        char charArray[] = s.toCharArray();
        Arrays.sort(charArray);
        String s1 = "";
        s1 = s1.valueOf(charArray);
        return s1;

    }
}
