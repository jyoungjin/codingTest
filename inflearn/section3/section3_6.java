package section3;

import java.util.Scanner;

public class section3_6 {

    public int solution(int n, int k, int[] arr){

        int answer = k;

        for (int lt = 0; lt < n - answer; lt++) {
            int rt = lt;
            int cnt = 0;
            int len = 0;
            while (rt<n && cnt <= k) {
                if (arr[rt] == 0 && cnt == k) {
                    cnt++;
                } else if (arr[rt++] == 0) {
                    len++;
                    cnt++;
                } else {
                    len++;
                }
            }
            answer = Math.max(answer, len);
        }

        return answer;
    }

    public static void main(String[] args) {

        section3_6 T = new section3_6();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.print(T.solution(n,k,arr));

    }
}
