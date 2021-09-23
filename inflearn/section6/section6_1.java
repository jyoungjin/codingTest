package section6;

import java.util.Arrays;
import java.util.Scanner;

public class section6_1 {

    public int[] solution(int n, int[] arr) {


        return arr;
    }

    public static void main(String[] args) {

        section6_1 T = new section6_1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
