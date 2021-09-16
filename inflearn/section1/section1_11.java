package section1;

import java.util.Scanner;

/*11. 문자열 압축*/
class section1_11 {

    public String solution(String str) {

        String answer = "";
        char beforeChar = ' ';
        int n = 1;

        for (char x : str.toCharArray()) {
            if (x != beforeChar) {
                if(n!=1){
                    answer += n;
                }
                answer += x;
                n=1;
            }else{
                n++;
            }
            beforeChar = x;
        }

        if(n!=1){
            answer +=n;
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_11 T = new section1_11();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));

    }
}
