import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class day26_CountTriplet {

    static long CountTriplets(List<Long> arr, long r){
        HashMap<Long, Integer> hm = new HashMap<>();
        long[] ar = new long[arr.size()];
        int c =0;
        long ans = 0;



        for(int i=0; i<arr.size(); i++){
            if(!hm.containsKey(arr.get(i))){
                hm.put(arr.get(i), 1);
                ar[c] = arr.get(i);
                c++;
            }
            else
                hm.put(arr.get(i), hm.get(arr.get(i))+1);
        }

        if(r!=1){
            for(int i=0; i<ar.length; i++){
                long num = ar[i];
                if(hm.containsKey(ar[i]*r) && hm.containsKey(ar[i]*r*r)) {
                    ans += hm.get(num) *hm.get(num * r) * hm.get(num * r * r);
                }
            }
        }
        else{
            long n = ar[0];
            long num = hm.get(ar[0]);
            long fact = 1;
            for(long i=num; i>=(num-3); i++){
                fact = fact*i;
            }
            ans = ans+fact/6;
        }
           return ans;
    }

    public static void main(String arg[]) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
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
