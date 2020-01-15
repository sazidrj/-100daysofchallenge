import java.util.Scanner;
public class Anagram_Hackerank {
    static boolean isAnagram(String a, String b) {
        if (a == "" || b == "")
            return false;
        if (a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int ar1[] = new int[26];
        int ar2[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
                 ar1[a.charAt(i)-'a']++;
                 ar2[b.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(ar1[i] != ar2[i])
                return false;
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
