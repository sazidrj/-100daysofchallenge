/*
Run-length encoding is a fast and simple method of encoding strings. The basic idea is to

        represent repeated successive characters as a single count and character. For example, the string
        "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
        Implement run-length encoding and decoding. Y ou can assume the string to be encoded have no
        digits and consists solely of alphabetic characters. Y ou can assume the string to be decoded is
        valid.

 */

import java.io.*;
import java.util.*;

public class day51_solution{
    private static String encoding(String st){
        char ch = st.charAt(0);
        String str ="";
        int count=1;
        for(int i=1; i<st.length(); i++ ){

            char ch1 = st.charAt(i);
            if(ch1==ch){
                count++;
            }
            else{
                str = str+count+ch;
                ch=ch1;
                count=1;
            }
        }
        return str;
    }
    public static void main(String arg[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(encoding(s));
    }
}