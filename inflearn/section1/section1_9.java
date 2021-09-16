package section1;

import java.util.Scanner;

/*9. 숫자만 추출*/
class section1_9 {

    public int solution(String str) {

        String answer = "";

        /*방법1*/
        /*str = str.toUpperCase().replaceAll("[^0-9]", "");
        answer = str;*/

        /*방법2*/
        for(char x : str.toCharArray()){
            // isDigit 숫자면 true
            if(Character.isDigit(x)){
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

        section1_9 T = new section1_9();

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.println(T.solution(str));

    }
}
