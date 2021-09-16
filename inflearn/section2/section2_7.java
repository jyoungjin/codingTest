package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class section2_7 {

    public int solution(int n, int[] arr){

        int answer = 0;
        int addNum = 0;

        for (int x : arr) {
            if (x == 0) {
                addNum = 0;
            } else if (x == 1) {
                addNum++;
                answer += addNum;
            }
        }


        return answer;
    }


    public static void main(String[] args) {

        section2_7 T = new section2_7();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));

    }
}
