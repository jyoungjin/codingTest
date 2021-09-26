package section7;

import java.util.*;

/*
* 재귀함수
* 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
* 입력 설명: 첫번째 줄은 정수 N(3<=N<=10)이 입력된다.
* 입력예제 1 : 3
* 출력예제 1 : 1 2 3
*/
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
