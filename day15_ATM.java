import java.io.*;
import java.util.*;
public class day15_ATM {
    public static void main(String arg[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            float b = sc.nextFloat();
            if (a % 5 == 0 && b >= (a + 0.50)) {
                float c = (float) (b - (a + 0.50));
                System.out.printf("%.2f", c);
            } else
                System.out.println(b);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
