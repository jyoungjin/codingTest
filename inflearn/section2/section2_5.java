package section2;

import java.util.Scanner;

/*시간초과*/
public class section2_5 {

    public int solution(int n){

        int answer = 0;

        for (int i = 2; i <= n; i++) {

            Boolean flag = true;

            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag = false;
                }
            }

            if (flag == true) {
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        section2_5 T = new section2_5();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print(T.solution(n));

    }
}
