package section4;

import java.util.HashMap;
import java.util.Scanner;

public class section4_2 {
    public String solution(String str1,String str2) {

        String answer = "YES";

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0)+1);
        }
        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }

        for (char x : map1.keySet()) {
            if (map1.get(x) != map2.get(x)) {
                answer = "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        section4_2 T = new section4_2();
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(T.solution(str1,str2));
    }
}