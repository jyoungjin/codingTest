package section1;

import java.util.Scanner;

class section1_5 {

    public String solution(String str) {

        String answer = "";

        char[] s = str.toCharArray();
        int lt = 0, rt = s.length-1;
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char ch = s[lt];
                s[lt] = s[rt];
                s[rt] = ch;
                lt++; rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {

        section1_5 T = new section1_5();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));

    }
}
