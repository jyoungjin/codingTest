package section2;

import java.util.Scanner;

public class section2_9 {

    public int solution(int n, int[][] arr){

        int answer = Integer.MIN_VALUE;
        int sum1,sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        return answer;
    }


    public static void main(String[] args) {

        section2_9 T = new section2_9();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.print(T.solution(n,arr));

    }
}
