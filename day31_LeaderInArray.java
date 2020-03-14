//Program of finding leaders in  array
//Leader is a element which are greater than all the element which are on the right hand side of the leader

import java.util.*;
public class day31_LeaderInArray {
 public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array=");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of array=");
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    int largest = arr[arr.length-1];
    for(int i=arr.length-1; i>0; i--){
        if(arr[i]>=largest){
            System.out.print(" "+arr[i]+ " ");
            largest = arr[i];
        }
    }
 }
}
