package section7;

/*
 * 이진트리 순회(깊이우선탐색 DFS)
 *          1
 *      2       3
 *    4   5   6   7
 *
 *  전위순회 출력 : 1 2 4 5 3 6 7
 *  중위순회 출력 : 4 2 5 1 6 3 7
 *  후위순회 출력 : 4 5 2 6 7 3 1
 *
 * */
class Node {
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class section7_5 {

    Node root;

    public void DFS(Node root){

        if(root==null){
            return;
        }else{
            System.out.print(root.data+" ");
            DFS(root.lt);
            DFS(root.rt);
        }

    }

    public static void main(String[] args) {

        section7_5 tree = new section7_5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);


    }
}
