package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section5_7 {

    public String solution(String str1, String str2) {

        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char x : str1.toCharArray()) {
            queue.offer(x);
        }

        for (char x : str2.toCharArray()) {
            if (queue.contains(x)) {
                if (queue.poll() != x) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {

        section5_7 T = new section5_7();
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(T.solution(str1,str2));
    }
}
