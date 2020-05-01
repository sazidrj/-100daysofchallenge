/*
  Given a list of integers and we have to find out the maximum of non-adjacent intergers
  for eg. [2,4,6,2,5] should return 13 as 2+6+5
          [5,1,1,5] should return 10 as 5+5
 */
import java.util.*;

public class day47_MaximumNonAdjacentNumbersSum {
    public static int largestNonAdjacentSum(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        if (arr.length == 1)
            return arr[0];
        if (arr.length == 2)
            return Math.max(arr[0], arr[1]);
        if (arr.length > 2) {
            for (int i = 2; i < arr.length; i++) {
                if (i > 2) {
                    arr[i] = Math.max(arr[i - 2], arr[i - 3]) + Math.max(0, arr[i]);
                } else {
                    arr[i] = arr[i - 2] + Math.max(0, arr[i]);
                }
            }
        }
        return Math.max(arr[arr.length-1], arr[arr.length-2]);
    }
  public static void main(String arg[])  {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] ar = new int[n];
      for(int i=0; i<n; i++){
          ar[i] = sc.nextInt();
      }
      System.out.println(largestNonAdjacentSum(ar));

  }
}
