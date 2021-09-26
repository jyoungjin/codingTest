package section7;

import java.util.Scanner;

/*
 * 팩토리얼
 * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
 * 입력설명: 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
 * 출력설명: 첫 번째 줄에 N팩토리얼 값을 출력합니다
 * 입력예제 1: 5
 * 출력예제 1: 120
 * */
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
