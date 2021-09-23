package section6;

import java.util.Arrays;
import java.util.Scanner;

public class section6_5 {
    public char solution(int n, int[] arr) {

        char answer = 'U';

        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = 'D';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        section6_5 T = new section6_5();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}