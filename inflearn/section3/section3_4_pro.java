package section3;

import java.util.Scanner;

public class section3_4_pro {

    public int solution(int n, int m, int[] arr){

        int answer = 0;

        int sum = arr[0];
        int lt = 0, rt = 0;

        while (rt < n-1) {
            if (sum == m) {
                answer++;
                sum -= arr[lt++];
            } else if (sum < m) {
                sum += arr[++rt];
            } else {
                sum -= arr[lt++];
            }
        }

        if (sum == m) {
            answer++;
        }


        return answer;
    }

    public static void main(String[] args) {

        section3_4_pro T = new section3_4_pro();
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
