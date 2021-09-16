package section3;

import java.util.Scanner;

public class section3_5 {

    public int solution(int n){

        int answer = 0;
        int lt = 1, rt = 1;
        int sum = 1;

        while (rt <= n / 2 + 1) {

            if (sum == n) {
                answer++;
                sum -= lt++;
            } else if (sum < n) {
                sum += ++rt;
            } else {
                sum -= lt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section3_5 T = new section3_5();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(T.solution(n));

    }
}
