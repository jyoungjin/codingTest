package section2;

import java.util.Scanner;

public class section2_10 {

    public int solution(int n, int[][] arr){

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int point = arr[i][j];
                if (point > arr[i - 1][j] && point > arr[i + 1][j] && point > arr[i][j - 1] && point > arr[i][j + 1]) {
                    answer++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        section2_10 T = new section2_10();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n+2][n+2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.print(T.solution(n,arr));

    }
}
