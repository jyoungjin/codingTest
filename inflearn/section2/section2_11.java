package section2;

import java.util.Scanner;

public class section2_11 {

    public int solution(int n, int[][] arr){

        int answer = 0;
        int max = Integer.MIN_VALUE;
        int cnt=0;

        for (int i = 0; i < n; i++) {
            cnt=0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k] && i != j) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i+1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        section2_11 T = new section2_11();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.print(T.solution(n,arr));

    }
}
