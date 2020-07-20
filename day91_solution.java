import java.util.*;

public class day91_solution {
    private static List<Integer> func(int n){
        List<Integer> ls = new ArrayList<>();
        int m = (int)(-1 + (Math.sqrt(1+4*n*2)))/2;
        int num=1,sum=0;
        for(int i=0; i<m-1; i++){
            ls.add(num);
            sum = sum + num;
            num++;
        }

        ls.add(n-sum);

        return ls;
    }
    public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       List<Integer> ls = func(n);
       System.out.println(ls.size());
       for(int elm : ls)
           System.out.print(elm + " ");
    }
}
