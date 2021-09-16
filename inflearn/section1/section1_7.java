package section1;

import java.util.Scanner;

/*7. 회문 문자열*/
class section1_7 {

    public String solution(String str) {

        String answer = "";

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }else{
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_7 T = new section1_7();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.println(T.solution(str));

    }
}
