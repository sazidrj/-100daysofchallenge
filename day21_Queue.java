class QueueFunction{
    private int[] queue;
    private int front;
    private int rear;
    private int total ;
    private  int size;
    public QueueFunction(int size){
        this.size = size;
        front = 0;
        rear = 0;
        total = 0;
        queue = new int[size];
    }

    public boolean isFull(){
        return(total==queue.length-1);
    }
    public boolean isEmpty(){
        return(total==0);
    }
    public void enqueue(int item){
        if(!isFull()){
            queue[rear] = item;
            rear = (rear+1)%queue.length;
            total++;
        }
        else
            System.out.println("Queue is overflow");
    }

    public boolean dequeue(){
        if(!isEmpty()){
            int dq = queue[front];
            System.out.println("Dequeue element="+dq);
            front = (front+1)%queue.length;
            total--;
            return true;
        }
        else
        {
            System.out.println("Queue is empty");
            return false;
        }
    }
}

public class day21_Queue {
    public static void main(String arg[]){
        QueueFunction q = new QueueFunction(100);
        q.enqueue(23);
        q.enqueue(24);
        q.enqueue(44);

        q.dequeue();

    }

}
