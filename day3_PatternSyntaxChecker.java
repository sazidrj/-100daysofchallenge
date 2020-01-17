import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class day3_PatternSyntaxChecker {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        while(num>0){
            String s1 = sc.nextLine();
            try{
                Pattern.compile(s1);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            num--;
        }
    }
}
