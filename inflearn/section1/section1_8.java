package section1;

import java.util.Scanner;

/*8. 유효한 팰린드롬*/
class section1_8 {

    public String solution(String str) {

        String answer = "";

        String tmp = new StringBuilder(str).reverse().toString();

        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                answer+=str.charAt(i);
            }
        }

        /*
        A-Z 제외하고 빈칸으로 변경
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        * */

        String reverseAnswer = new StringBuilder(answer).reverse().toString();

        if(answer.equalsIgnoreCase(reverseAnswer)){
            answer = "YES";
        }else{
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_8 T = new section1_8();

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.println(T.solution(str));

    }
}
