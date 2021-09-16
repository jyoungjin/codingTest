package section4;

import java.util.HashMap;
import java.util.Scanner;

public class section4_1 {
    public char solution(int n,String str) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char x : str.toCharArray()) {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        /* 해당 키를 포함하는지 boolean return */
        System.out.println(map.containsKey('A'));
        /* key의 개수 */
        System.out.println(map.size());
        /* key 삭제 */
        System.out.println(map.remove('A'));

        int max = Integer.MIN_VALUE;

        /* map 탐색시  */
        for (char x : map.keySet()) {
            if(map.get(x)>max){
                max = map.get(x);
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        section4_1 T = new section4_1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(T.solution(n,str));
    }
}