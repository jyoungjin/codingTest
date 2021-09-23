package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class section6_6 {
    public ArrayList<Integer> solution(int n, int[] arr) {

        int[] compareArr = new int[n];
        ArrayList<Integer> answer = new ArrayList<>();
        compareArr = arr.clone();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] != compareArr[i]) {
                answer.add(i+1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        section6_6 T = new section6_6();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}