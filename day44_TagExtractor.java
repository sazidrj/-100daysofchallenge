import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day44_TagExtractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            boolean match = false;
            Matcher m = r.matcher(line);
            while(m.find()){
                System.out.println(m.group(2));
                match = true;
            }
            if(!match){
                System.out.println("None");
            }
            testCases--;
        }
        in.close();
    }
}
