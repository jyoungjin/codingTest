package section7;

import java.util.Scanner;

public class section7_2 {

    public void DFS(int n){
        if (n == 0) {
            return;
        }else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        section7_2 T = new section7_2();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        T.DFS(n);
    }
}
