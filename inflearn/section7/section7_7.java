package section7;

import java.util.LinkedList;
import java.util.Queue;


/* 이진트리 레벨탐색(넓이우선탐색(레벨탐색) BFS : Breadth-First Search)
*          1
*      2       3
*    4   5   6   7
* */
public class section7_7 {

    Node root;

    public void BFS(Node root){

        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node current = Q.poll();

                if (current.lt != null) {
                    Q.offer(current.lt);
                }
                if(current.rt!=null) {
                    Q.offer(current.rt);
                }

                System.out.print(current.data + " ");
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {

        section7_7 tree = new section7_7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);


    }
}