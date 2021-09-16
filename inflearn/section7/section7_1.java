package section7;

import java.util.*;

public class section7_1 {

    public void DFS(int n){
        if (n == 0) {
            return;
        }else{
            System.out.println(n);
            DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        section7_1 T = new section7_1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        T.DFS(n);
    }
}
