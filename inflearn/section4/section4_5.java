package section4;

import java.util.Scanner;

public class section4_5 {
    public int solution(int n, int k, int[] arr) {

        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        section4_5 T = new section4_5();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print(T.solution(n,k,arr));

    }
}