package section1;

import java.util.Scanner;

/*6. 중복문자제거*/
class section1_6 {

    public String solution(String str) {

        String answer = "";

        for(int i=0;i<str.length();i++){
            /*str.indexOf(str.charAt(i)) : charAt에 해당하는 문자와 같은 첫번째 index를 반환*/
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_6 T = new section1_6();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.println(T.solution(str));

    }
}
