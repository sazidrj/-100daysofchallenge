import java.util.*;
import java.io.*;

public class day7_ThePromishedLand {
    public static void main(String arg[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t-- > 0){
            String s[] = reader.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            s = reader.readLine().split(" ");
            int X = Integer.parseInt(s[0]);
            int Y = Integer.parseInt(s[1]);
            int S = Integer.parseInt(s[2]);
            int x[] = new int[X+1];
            int y[] = new int[Y+1];
            if(X!=0) {
                s = reader.readLine().split(" ");
                for (int i = 0; i < X; i++) {
                    x[i] = Integer.parseInt(s[i]);
                }
            }
            x[X] = n+1;

            if(Y!=0) {
                s = reader.readLine().split(" ");
                for (int i = 0; i < Y; i++) {
                    y[i] = Integer.parseInt(s[i]);
                }
            }
            y[Y] = m+1;

            int count = 0;
            int row =0;
            int column =0;
            int a=1;
            for(int i=0; i<=X; i++){
                row = row+(x[i]-a)/S;
                a = x[i]+1;
            }
            int b=1;
            for(int i=0; i<=Y; i++){
                column = column+(y[i]-b)/S;
                b = y[i]+1;
            }
            count = count+row*column;
            System.out.println(count);
        }
    }
}
