package section3;

import java.util.Scanner;

public class section3_5_pro {

    public int solution(int n){

        int answer = 0;
        int cnt = 1;
        n--;

        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section3_5_pro T = new section3_5_pro();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(T.solution(n));

    }
}
