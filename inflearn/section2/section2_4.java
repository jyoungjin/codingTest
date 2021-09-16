package section2;

import java.util.Scanner;

public class section2_4 {

    public int[] solution(int n){

        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = answer[0];

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {

        section2_4 T = new section2_4();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int x : T.solution(n)) {
            System.out.print(x+" ");
        }

    }
}
