
class LinkedListFunction {
    class Node{
        private int value;
        private Node link;
    }
    private Node head;

    public LinkedListFunction(int item) {
        head = new Node();
        head.value = item;
        head.link = null;
    }

    public boolean insertionBeg(int item) {
        Node n = new Node();
        n.value = item;
        n.link = head;
        head = n;
        return true;
    }

    public boolean insertionEnd(int item){
        Node n = new Node();
        n.value = item;
        n.link = null;
        Node new_node;
        new_node = head;
        while(new_node.link!=null){
            new_node = new_node.link;
        }

        new_node.link = n;
        return true;

    }

    public boolean deletion(int item) {
        if (head.value == item) {
            head = head.link;
            return true;
        } else {
            Node x = head;
            Node y = head.link;
            while (true) {
                if (y == null || y.value == item) {
                    break;
                } else {
                    x = y;
                    y = y.link;
                }
            }
            if (y != null) {
                x.link = y.link;
                return true;
            } else {
                return false;
            }
        }
    }



        public void display() {
            Node x = head;
            while(x!=null){
                System.out.println(x.value);
                x = x.link;
            }
        }

    }




public class day40_LinkedList<I extends Number> {
    public static void main(String arg[]){
        LinkedListFunction list = new LinkedListFunction(1);
        list.insertionBeg(2);
        list.insertionBeg(3);
        list.insertionBeg(4);
        list.insertionBeg(5);
        list.insertionEnd(7);
        list.insertionEnd(6);
        list.display();

        list.deletion(4);
        list.display();
    }

}
