import java.util.*;
import java.io.*;

public class day87_solution {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int[] ar = new int[stops.length+2];
        ar[0] = 0;
        int temp2 = dist;
        ar[ar.length-1] = dist;
        for(int i=0; i<stops.length; i++){
            ar[i+1] = stops[i];
        }
        int i=0;
        int temp = tank;
        int count=0;
        while(dist>0){
            if((ar[i+1]-ar[i])<temp)
            {
                temp  =  temp-(ar[i+1]-ar[i]);
                dist = temp2 - ar[i+1];
                i++;
            }
            else{
                count++;
                temp = tank-(ar[i+1]-ar[i]);
                dist = temp2 - ar[i+1];
                i++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
