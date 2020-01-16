import java.io.*;
import java.util.*;
import java.lang.*;

public class day2_StringToken {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.length()>400000) {
            return;
        }
        else if(s.length()==0){
            System.out.println(0);
            return;
        }
        else {
            String[] s1 = s.split("[ !,?._'@]+");
            int l = s1.length;
            System.out.println(l);
            for (int i = 0; i < s1.length; i++)
                System.out.println(s1[i]);
        }
        scan.close();
    }
}
