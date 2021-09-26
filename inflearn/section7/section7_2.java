package section7;

import java.util.Scanner;

/*
* 재귀함수를 이용한 이진수 출력
* 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용해서 출력해야 합니다.
* 입력설명: 첫 번째 줄에 10진수 N(1<=N<=1000)이 주어집니다.
* 출력설명: 첫 번째 줄에 이진수를 출력하세요
* 입력예제 1: 11
* 출력예제 1: 1011
* */
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
