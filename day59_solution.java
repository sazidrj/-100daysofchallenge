/*
Given a binary tree, find a minimum path sum from root to a leaf.
For example, the minimum path in this tree is [10, 5, 1, -1], which has sum 15.
     10
    /  \
   5    5
    \     \
      2    1
          /
        -1
 */

import java.util.*;
import java.util.stream.Collectors;

public class day59_solution {
    private static final class Node{
        private final int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data = data;
        }
    }
    private static Node createTree(){
         Node ten = new Node(10);
         Node leftFive = new Node(5);
         leftFive.right = new Node(2);
         Node rightFive = new Node(5);
         Node one = new Node(1);
         one.left = new Node(-1);
         rightFive.right = one;
         ten.right = rightFive;
         ten.left = leftFive;

         return ten;
    }

    public static List<Node> minPathFromRoot(Node node){
        if(node==null)
            return Collections.emptyList();

        Deque<Node> path = new LinkedList<>();
        dfs(path, node, 0);
        return new ArrayList<>(path);
    }
    private static int dfs(Deque<Node> path, Node node, int sum){
        if (node == null)
            return Integer.MAX_VALUE;

        path.addLast(node);

        if(node.left == null && node.right == null)
            return sum+node.data;

        int size = path.size();
        int leftSum = dfs(path, node.left, sum+node.data);
        repair(path, size);
        int rightSum = dfs(path, node.left, sum+node.data);

        if(leftSum < rightSum){
            repair(path, size);
            return dfs(path, node.left, sum+node.data);
        }
        return rightSum;
    }


    private static void repair(Deque<Node> path, int size){
        while(path.size()>size)
            path.removeLast();
    }
   public static void main(String arg[]){
       Node root = createTree();
       List<Node> path = minPathFromRoot(root);
       System.out.println(path.stream().map(node -> String.valueOf(node.data)).collect(Collectors.joining(" -> "))); // 10 -> 5 -> 1 -> -1
       System.out.println(path.stream().mapToInt(node -> node.data).sum());
   }
}
