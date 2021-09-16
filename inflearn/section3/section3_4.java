package section3;

import java.util.Scanner;

public class section3_4 {

    public int solution(int n, int m, int[] arr){

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int cnt = i;
            while (sum < m && cnt < n) {
                sum += arr[cnt++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section3_4 T = new section3_4();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.print(T.solution(n,m,arr));

    }
}
