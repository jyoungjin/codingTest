package section7;

import java.util.Scanner;

public class section7_4 {

    static int[] fibo;

    public int DFS(int n){
        if (n == 1 || n == 2) {
            return fibo[n]=1;
        } else {
            return fibo[n]=DFS(n-1)+DFS(n-2);
        }
    }

    public static void main(String[] args) {
        section7_4 T = new section7_4();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibo = new int[n + 1];
        T.DFS(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }
}
