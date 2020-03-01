import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day24_SherlockAndAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        int count = 0;
        int n = s.length();
        for(int i=1; i<n; i++){
            for(int j=0; j<n&&(j+i)<=n; j++){
                char[] sub1 = s.substring(j,j+i).toCharArray();
                Arrays.sort(sub1);
                String sub = new String(sub1);
                if(hm.containsKey(sub)){
                    hm.put(sub, hm.get(sub) + 1);
                }
                else
                     hm.put(sub,1);
            }
            for(String j: hm.keySet()){
                count += (hm.get(j)*(hm.get(j)-1))/2;

            }
            hm.clear();
        }
        return count;
        }




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
