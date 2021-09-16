package section2;

import java.util.Scanner;

/*에라토스테네스 체*/
public class section2_5_pro {

    public int solution(int n){

        int answer = 0;

        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        section2_5_pro T = new section2_5_pro();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.print(T.solution(n));

    }
}
