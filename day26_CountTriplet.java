import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class day26_CountTriplet {

    static long CountTriplets(List<Long> arr, long r){
        HashMap<Long, Long> leftMap = new HashMap<>();
        HashMap<Long, Long> rightMap = new HashMap<>();

        for(long item : arr){
            rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
        }

        long sum=0;

        for(int i=0; i<arr.size(); i++){
            long mid = arr.get(i);
            long left=0, right=0;
            rightMap.put(mid, rightMap.getOrDefault(mid, 0L) - 1);

            if(leftMap.containsKey(mid/r) && mid%r==0){
                left = leftMap.get(mid/r);
            }

            if(rightMap.containsKey(mid*r) ){
                right = rightMap.get(mid*r);
            }

            sum = sum + left*right;
            leftMap.put(mid, leftMap.getOrDefault(mid, 0L) + 1);
        }
           return sum;
    }

    public static void main(String arg[]) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        long n = Integer.parseInt(st[0]);
        long r = Integer.parseInt(st[1]);
        String[] arrItems = br.readLine().split(" ");
        List<Long> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
              long arrItem = Long.parseLong(arrItems[i]);
              arr.add(arrItem);
        }
        long ans = CountTriplets(arr, r);
        br.close();
        System.out.println(ans);
    }
}
