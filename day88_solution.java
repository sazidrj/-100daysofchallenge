/*
Activity selection problem
 */

import java.util.*;
public class day88_solution {
   private static int activitySelection(int[] t1, int[] t2){
       Arrays.sort(t2);
       int count=1;
       int start = 0;
       for(int i=1; i<t1.length; i++){

           if(t1[i]>t2[start]) {
               count++;
               start = i;
           }
       }
       return count;

   }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] finish = new int[n];
        for(int i=0; i<n; i++)
            start[i] = sc.nextInt();

        for(int i=0; i<n; i++)
            finish[i] = sc.nextInt();

        System.out.println(activitySelection(start, finish));

    }
}
