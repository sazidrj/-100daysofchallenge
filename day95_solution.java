import java.util.*;
public class day95_solution {
    public static void convert_to_alpha(int[] ar){
      int len = ar.length;
      char ch = 'a';
      char chArr[] = new char[len];
      for(int i=0; i<len; i++){
          chArr[i] = ch;
          ch++;
      }
      find(ar,ToString(chArr));
    }
    public static void find(int numbers[], String original){
        String duplicate = "";
        char change[] = original.toCharArray();
        int answer = 1;
        int flag = 1;
        while(flag == 1){
            char[] tc = new char[numbers.length];
            for(int i=0; i<numbers.length; i++){
                tc[numbers[i]] = change[i];
            }
            change = tc;
            duplicate = ToString(change);
            if(checkArrays(original, duplicate)==true)
                flag = 0;
            else
                answer = answer+1;
        }
        System.out.println(answer);
    }

    public static String ToString(char[] ch){
        String ret = "";
        for(char c: ch)
            ret = ret+c;
        return ret;
    }



    public static boolean checkArrays(String original, String duplicate){
        char a[] = original.toCharArray();
        char b[] = duplicate.toCharArray();
        int f=0;
        for(int i=0; i<original.length(); i++){
            if(a[i]==b[i])
                f+=1;
        }
        if(original.length()==f)
            return true;
        else
            return false;
    }


    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int t = 1;

        if (t < 1 || t > 10)
            System.exit(0);

        for (int i = 0; i < t; t++) {
            int n = sc.nextInt();
            if (n < 1 || n > 10000)
                System.exit(0);

            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (x < 1 || x > n)
                    System.exit(0);
                arr[j] = x - 1;
            }


            convert_to_alpha(arr);

        }
    }
}
