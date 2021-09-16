package section1;

import java.util.Scanner;

class section1_2 {

    public String solution(String str){

        String answer = "";

        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)){
                answer+=Character.toUpperCase(c);
            }else{
                answer+=Character.toLowerCase(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_2 T = new section1_2();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
