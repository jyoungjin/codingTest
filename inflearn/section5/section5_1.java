package section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_1 {

    public String solution(String str){

        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if(x=='(')
                stack.push(x);
            else{
                if(stack.isEmpty()){
                    return "NO";
                }else{
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }


        return answer;
    }

    public static void main(String[] args) {

        section5_1 T = new section5_1();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
