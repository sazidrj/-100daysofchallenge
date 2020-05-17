/*
Gray code is a binary code where each successive value differ in only one bit, as well as when
wrapping around. Gray code is common in hardware so that we don't see temporary spurious
values during transitions.
Given a number of bits n, generate a possible gray code for it.
For example, for n = 2, one gray code would be [00, 01, 11, 10].
 */

import java.util.*;

public class day60_solution {
   public static int[] grayCode(int n){
       return gray(0, n, new int[(int)Math.pow(2,n)]);
   }
private static int[] gray(int curLength, int maxLength, int[] codes) {
    if (curLength > maxLength)
        return codes;
    if (curLength == 0)
        codes[0] = 0;
    else
        for (int i = 0, t = 1 << (curLength - 1); i < t; i++)
            codes[t + i] = codes[t - i] + (1 << curLength);
     return gray(curLength+1, maxLength, codes);
}
  public static void main(String arg[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   Arrays.stream(grayCode(n)).mapToObj(code -> String.format("%" + n + 's', Integer.toBinaryString(code)).replace(' ','0')).forEach(System.out::println);
  }
}

