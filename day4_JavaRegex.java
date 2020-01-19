import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

      class day4_JavaRegex{
          public static void main(String[] args){
              Scanner in = new Scanner(System.in);
              while(in.hasNext()){
                  String IP = in.next();
                  System.out.println(IP.matches(new MyRegex().pattern));
              }

          }
      }
class MyRegex{
          String check = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
          String pattern = check+"\\."+check+"\\."+check+"\\."+check;

}

