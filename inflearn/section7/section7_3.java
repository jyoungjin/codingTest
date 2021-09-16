package section7;

import java.util.Scanner;

public class section7_3 {


    public int DFS(int n){
        if (n == 1) {
            return 1;
        }else{
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        section7_3 T = new section7_3();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(T.DFS(n));
    }
}
