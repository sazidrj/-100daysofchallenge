import java.util.*;
public class day70_solution {
    static int i, j;
    static int[] array;
    static int[] array1;
    static int[] array2;
    static int sum = 0;
    static int max = 0;
    static int min = 0;
    static int min1 = 0;
    static int max1 = 0;
    static int swap1 = 0, swap2 = 0;

    static int swapping(int c, int a, int b) {
        int temp;
        if (c == 1) {
            temp = array2[a];
            array2[a] = array2[b];
            array2[b] = temp;
            return array[2] * array2[b];

        } else {
            temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            return array[a] * array[b];
        }
    }


    static int prep() {
        for (int k = 0; k < array.length; k++) {
            for (int k2 = 0; k2 < array1.length; k2++) {
                if (array[k2] == array1[k]) {
                    if (k2 == k) {
                        break;
                    }

                } else {
                    if (array[k2] > array[k]) {
                        min1 = k;
                        max1 = k2;
                    } else {
                        min1 = k2;
                        max1 = k;
                    }
                    swap1 = swapping(1, k2, k);
                    swap2 = swapping(2, 0, min1) + swapping(2, min1, max1) + swapping(2, 0, max1);
                    if (swap1 < swap2) {
                        sum = sum + swap1;
                        for (int i = 0; i < array.length; i++) {
                            array[i] = array2[i];
                        }
                    } else {
                        for (int i = 0; i < array.length; i++) {
                            array2[i] = array1[i];
                        }
                        sum = sum + swap2;
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String arg[]){

            Scanner sc = new Scanner(System.in);
            i=sc.nextInt();
            j=sc.nextInt();
            array = new int[i];
            array1 = new int[i];
            array2 = new int[i];
            for(int k=0; k<i; k++){
                array[k] = sc.nextInt();
            }

            for(int k=0; k<i; k++){
                array1[k] = array[k];
            }

            Arrays.sort(array1);
            int max = array1[array1.length-1];
            for(int i=array1.length-1; i>j; i--){
                array1[i] = array1[i-1];
            }
            array1[j] = max1;

            System.out.println(prep());
            System.out.println();
        }
    }

