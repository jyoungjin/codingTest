package section3;

import java.util.Scanner;

public class section3_3 {

    public int solution(int n, int k, int[] arr){

        int answer = 0;

        for (int i = 0; i < k; i++) {
            answer += arr[i];
        }

        int max = answer;

        for (int i = 1; i < n - k; i++) {
            max = max - arr[i - 1] + arr[i + k - 1];
            answer = Math.max(answer, max);
        }

        return answer;
    }

    public static void main(String[] args) {

        section3_3 T = new section3_3();
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
