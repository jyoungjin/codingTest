package section7;

import java.util.Scanner;

/*
 * 피보나치 수열
 * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * 입력설명: 첫 번째 줄에 자연수 N(3<=N<=45)이 주어집니다.
 * 출력설명: 첫 번째 줄에 피보나치 수열을 출력합니다
 * 입력예제 1: 10
 * 출력예제 1: 1 1 2 3 5 8 13 21 34 55
 * */
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
