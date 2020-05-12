/*
  Given a pivot x, and a list lst, partition the list into three parts.
The first part contains all elements in lstthat are less than x
The second part contains all elements in lstthat are equal to x
The third part contains all elements in lstthat are larger than x
Ordering within a part can be arbitrary.
For example, given x = 10and lst = [9, 12, 3, 5, 14, 10, 10], one partition may be `[9, 3, 5, 10, 10, 12, 14].

 */

import java.util.*;

class day56_solution{
    static void swap(int a, int b, int []arr){
        int temp = arr[a];
        arr[a] = arr[b];
          arr[b] = temp;
     }

     static int[] partitionList(int x, int[] l){
         int i=0, j=0, k = l.length-1;
         for(;i<k;){
            if(l[i] > x){
                swap(i, k, l);
                i++;
                k--;
            }
            else if(l[i] < x){
               swap(i,j, l);
               i++;
               j++;
            }
            else{
               i++;
               j++;
            }
         }

         return l;
     }
    public static void main(String arg[]) {
       Scanner sc = new Scanner(System.in);

       int x = sc.nextInt();
       int n = sc.nextInt();
       int[] ar = new int[n];
       int i=0;
       while(n-- >0){
         ar[i++] = sc.nextInt();
       }
       sc.close();

       int[] result = partitionList(x, ar);
       for(int elm : result)
          System.out.print(elm+ " ");


    }
}