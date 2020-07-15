/*
Find the 1's complement and 2's complement of the binary number.
 */
import java.util.*;
public class day85_solution {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] chArr1 = input.toCharArray();
        char[] chArr2 = input.toCharArray();
        for(int i=0; i<input.length(); i++)
        {
            if(chArr1[i] == '0')
                chArr1[i] = '1';
            else
                chArr1[i] = '0';
        }
        int i=input.length()-1;
        for( i = input.length()-1; i>=0; i--){
            if(chArr2[i] == '1') {
                i--;
                break;
            }
        }

        for(int j=i; j>=0; j--){
            if(chArr2[j] == '0')
                chArr2[j] = '1';
            else
                chArr2[j] = '0';
        }

        String onesComp = new String(chArr1);
        String twosComp = new String(chArr2);

        System.out.println("Ones Complement = " + onesComp);
        System.out.println("Twos Complement = " + twosComp);
    }
}
