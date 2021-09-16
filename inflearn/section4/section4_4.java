package section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class section4_4 {
    public int solution(String str1,String str2) {

        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        if(map1.equals(map2))
            answer++;

        for (int i = 1; i < str1.length() - str2.length() + 1; i++) {
            map1.put(str1.charAt(i-1),map1.get(str1.charAt(i-1))-1);
            if (map1.get(str1.charAt(i - 1))==0) {
                map1.remove(str1.charAt(i - 1));
            }
            map1.put(str1.charAt(i+str2.length()-1),map1.getOrDefault(str1.charAt(i+str2.length()-1),0)+1);
            if(map1.equals(map2))
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        section4_4 T = new section4_4();
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.print(T.solution(str1,str2));

    }
}