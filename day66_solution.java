import java.util.*;
public class day66_solution {
    static int stringMatching(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();

        int lps[] = new int[m];
        int j = 0;
        computePiTable(pat, m, lps);

        int i = 0;
        int res = 0;
        int next_i = 0;

        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {

                j++;
                i++;
            }

            if (j == m) {
                j = lps[j - 1];
                res++;

                if (lps[j] != 0)
                    i = ++next_i;

                j = 0;

            }

            else if(i<n && pat.charAt(j) != txt.charAt(i)){
                if(j!=0)
                    j = lps[j-1];

                else
                    i=i+1;
            }
        }
        return res;

    }
    static  void computePiTable(String pat, int m , int lps[]){
        int len = 0;
        int i=1;
        lps[0] = 0;
        while(i<m){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n= sc.nextInt();
            int k = sc.nextInt();
            StringBuilder stb1 = new StringBuilder();
            StringBuilder stb2 = new StringBuilder();
            for(int j=0; j<n; j++){
                int a = sc.nextInt();
                stb1.append(Integer.toString(a));
            }

            for(int m=k; m>0; m--){
                stb2.append(Integer.toString(m));
            }
            int res = stringMatching(stb2.toString(), stb1.toString());
            if(res != 0)
                System.out.println("Case #"+(i+1)+": " + res);
            else
                System.out.println("Case #"+(i+1)+": "+0);

             stb1.setLength(0);
             stb2.setLength(0);
        }
    }
}
