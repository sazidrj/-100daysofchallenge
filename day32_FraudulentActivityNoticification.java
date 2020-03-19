//This is a problem of Hackerrank
import java.util.*;
import java.io.*;

public class day32_FraudulentActivityNoticification {
    static float median(int arr[], int i, int j) {
        float ans; int c = 0;
        int[] arr2 = new int[j - i + 1];
        for (int k = i; k <= j; k++) {
            arr2[c] = arr[k];
            c++;
        }
        Arrays.sort(arr2);
        if ((arr2.length-1) % 2 == 0) {
                    ans = arr2[(arr2.length-1)/2];
        } else {
            int first = (int)Math.floor((arr2.length-1)/2);
            int second = first+1;
            ans = (arr2[first]+arr2[second])/(float)2;
        }

        return ans;
    }

    public static void main(String arg[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] st1 = reader.readLine().split(" ");
        String[] st2 = reader.readLine().split(" ");
        int[] arr = new int[st2.length];
        int n = Integer.parseInt(st1[0]);
        int d = Integer.parseInt(st1[1]);
        int count = 0, ans=0; float med = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st2[i]);
        }
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (count >= d) {
                med = median(arr, k, i - 1);
                k++;
                count--;
                if (arr[i] >= 2 * med) {
                    ans++;
                }
            }
            count++;
        }
            System.out.println("Number of noticification=" + ans);
        }
    }

