package section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_5 {

    public int solution(String str){

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }else{
                stack.pop();
                if(str.charAt(i-1)=='('){
                    answer += stack.size();
                }else{
                    answer++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        section5_5 T = new section5_5();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
