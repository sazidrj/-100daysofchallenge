class StackFunction {
    private int[] stack;
    private int size;
    private int top = -1;
    //Default sized stack constructor
    public StackFunction(){
        top = -1;
        size = 100;
        stack = new int[size];
    }
    //user defined sized stack constructor
    public StackFunction(int size){
        top=-1;
        this.size = size;
        stack = new int[size];
    }

    public boolean isFull(){
        return(top==stack.length-1);
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean push(int item) {
        if (!isFull()) {
            stack[++top] = item;
            return true;
        }
        else{
            System.out.println("Stack overflow");
            return false;
        }
    }
    public int pop(){
        if(!isEmpty()){
            return stack[top--];
        }
        else{
            System.out.println("Stack underflow");
            return -1;
        }

    }
}


public class day19_Stack {
    public static void main(String arg[]){
        StackFunction stack = new StackFunction(); //Object of default stack
        StackFunction stackUser = new StackFunction(50); // Object of user defined stack
        stack.push(20);
        stack.push(21);
        stack.push(22);

        stack.pop();
        stack.pop();

    }
}
