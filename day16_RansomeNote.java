import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class day16_RansomeNote {

        // Complete the checkMagazine function below.
        static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineHash = new HashMap<String, Integer>();
        Map<String, Integer> ransomHash = new HashMap<String, Integer>();
        for( String s : magazine){
              if(!magazineHash.containsKey(s)){
                  magazineHash.put(s, 1);
              }
              else{
                  magazineHash.put(s, magazineHash.get(s)+1);
              }
        }
        for(String s : note){
            if(!ransomHash.containsKey(s)){
                ransomHash.put(s, 1);
            }
            else{
                ransomHash.put(s, ransomHash.get(s)+1);
            }
        }
        for(String key: ransomHash.keySet()) {
            if (!magazineHash.containsKey(key)) {
                System.out.println("No");
                return;
            }
            if (magazineHash.get(key) < ransomHash.get(key)) {
                System.out.println("No");
                return;
            }
        }
            System.out.println("Yes");

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            String[] mn = scanner.nextLine().split(" ");

            int m = Integer.parseInt(mn[0]);

            int n = Integer.parseInt(mn[1]);

            String[] magazine = new String[m];

            String[] magazineItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < m; i++) {
                String magazineItem = magazineItems[i];
                magazine[i] = magazineItem;
            }

            String[] note = new String[n];

            String[] noteItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                String noteItem = noteItems[i];
                note[i] = noteItem;
            }

            checkMagazine(magazine, note);

            scanner.close();
        }
    }


