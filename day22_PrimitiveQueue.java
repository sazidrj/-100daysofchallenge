class Student2{
    private String name;
    private int age;
    public Student2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name:"+this.name+" Age: "+this.age;
    }
}
class StudentQueue{
    private Student2[] queue;
    private int front;
    private int rear;
    private int size;
    private int total;
    public StudentQueue(int size){
        this.size = size;
        front = 0;
        rear = 0;
        total = 0;
        queue = new Student2[size];
    }

    public boolean isFull(){
        if(total == queue.length){
            return true;
        }
        else
            return false;
    }

    public boolean isEmpty(){
        if(total == 0)
            return true;
        else
            return false;
    }

    public void StudentEnqueue(Student2 item){
        if(!isFull()){
            queue[rear] = item;
            rear = (rear+1)%queue.length;
            total = total+1;
        }
    }

    public Student2 StudentDequeue(){
        if(!isEmpty()){
            Student2 studentItem = queue[front];
            front = (front+1)%queue.length;
            total--;
            return studentItem;
        }
        else {
            System.out.println("Your Queue have any record");
            return null;

        }
    }
}

public class day22_PrimitiveQueue {
    public static void main(String arg[]){
        Student2 student1 = new Student2("Sazid", 21);
        Student2 student2 = new Student2("Shalsa", 21);

        StudentQueue q = new StudentQueue(100);
        q.StudentEnqueue(student1);
        q.StudentEnqueue(student2);

        System.out.println(q.StudentDequeue().toString());
    }
}
