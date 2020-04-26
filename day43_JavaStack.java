import javax.xml.stream.events.Characters;
import java.util.*;
class day43_JavaStack{
    static boolean isBalancedParan(String st){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch == '(' || ch == '[' || ch=='{'){
                stack.push(ch);
            }
            else if(stack.empty()){
                return false;
            }
            else{
                char top = stack.pop();
                if((top=='(' && ch!=')') || (top == '[' && ch != ']') || (top == '{' && ch != '}')){
                    return false;
                }
            }
        }
        return stack.empty();
    }


    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(isBalancedParan(sc.next()));
        }


    }
    }




