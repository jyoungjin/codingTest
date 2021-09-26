package section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* BFS로 푸는 것이 맞으나 DFS 연습  */
/* Tree 말단노드까지의 가장 짧은 경로(DFS) */

/*
        1
      2   3
    4   5

    말단노드: 3 - Depth: 1
 */
public class section7_9 {

    Node root;

    public int DFS(int L, Node root) {

        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }

    }

    public static void main(String[] args) {

        section7_9 tree = new section7_9();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.DFS(0,tree.root));

    }
}