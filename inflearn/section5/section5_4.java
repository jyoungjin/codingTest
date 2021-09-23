package section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_4 {

    public int solution(String str){

        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '+') {
                answer = stack.pop() + stack.pop();
                stack.push(answer);
            } else if (x == '-') {
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a2 - a1);
            } else if (x == '*') {
                answer = stack.pop() * stack.pop();
                stack.push(answer);
            } else if (x == '/') {
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a2 / a1);
            } else {
                stack.push(Integer.parseInt(String.valueOf(x)));
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        section5_4 T = new section5_4();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
