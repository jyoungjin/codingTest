package section6;

import java.util.Scanner;

public class section6_4 {
    public int[] solution(int s, int n, int[] arr) {

        int[] cashe = new int[s];

        for (int i = 0; i < n; i++) {
            int changeVal = cashe[0];
            int firstVal = cashe[0];
            cashe[0] = arr[i];

            for (int j = 1; j < s; j++) {
                int tmp = cashe[j];
                if (cashe[j] == firstVal) {
                    cashe[j] = changeVal;
                    break;
                }
                cashe[j] = changeVal;
                changeVal = tmp;
            }

        }

        return cashe;
    }

    public static void main(String[] args) {
        section6_4 T = new section6_4();
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : T.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}