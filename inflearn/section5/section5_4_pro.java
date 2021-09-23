package section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_4_pro {

    public int solution(String str){

        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                // stack.push(Integer.parseInt(String.valueOf(x)));
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        section5_4_pro T = new section5_4_pro();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
