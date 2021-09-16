package section2;

import java.util.Scanner;

public class section2_12 {

    public int solution(int n, int m, int[][] arr){

        int answer = 0;
        int pmento = 0 ;
        int pmenti = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt=0;
                for (int k = 0; k < m; k++) {
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) {
                            pmento = s;
                        }
                        if (arr[k][s] == j) {
                            pmenti = s;
                        }
                    }
                    if (pmenti > pmento) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        section2_12 T = new section2_12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.print(T.solution(n,m,arr));

    }
}
