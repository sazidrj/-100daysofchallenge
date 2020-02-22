class Student{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Name "+this.name+" Age "+ this.age;
    }
}
class StudentStack {
    private Student[] stack;
    private int top = -1;
    private int size;

    public StudentStack(int size) {
        top = -1;
        this.size = size;
        stack = new Student[this.size];
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean push(Student item) {
        if (!isFull()) {
            stack[++top] = item;
            return true;
        } else {
            System.out.println("Stack overflow");
            return false;
        }
    }
    public Student pop() {
        if (!isEmpty())
            return stack[top--];
        else
            System.out.println("Stack underflow");

        return null;
    }

}
public class day20_PrimitiveStack {
    public static void main(String arg[]){
        Student student1 = new Student("Sazid",21);
        Student student2 = new Student("Shalsa", 21);

        StudentStack student = new StudentStack(50);
        student.push(student1);
        student.push(student2);

        System.out.println(student.pop().toString());

    }
}
