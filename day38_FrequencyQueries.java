import java.io.*;
import java.util.*;
public class day38_FrequencyQueries {
    static void solution(long arr[][], int r){
        HashMap<Long, Long> hm = new HashMap<Long, Long>();
        for(int i=0; i<r; i++){
            if(arr[i][0]==1){
                if(!hm.containsKey(arr[i][1])){
                    hm.put(arr[i][1], 1L);
                }
                else{
                    hm.put(arr[i][1],hm.get(arr[i][1])+1);
                }
            }
            else if(arr[i][0]==2){
                if(hm.containsKey(arr[i][1])){
                    hm.put(arr[i][1], hm.get(arr[i][1])-1);
                }
            }
            else {
                if (hm.containsValue(arr[i][1])) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
 public static void main(String arg[]) throws IOException{
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     int q = Integer.valueOf(reader.readLine());
     long[][] arr = new long[q][2];
     for(int i=0; i<q; i++){
         String s = reader.readLine();
         arr[i][0] = Integer.valueOf(s.split(" ")[0]);
         arr[i][1] = Integer.valueOf(s.split(" ")[1]);
     }

     solution(arr, q);


 }
}
