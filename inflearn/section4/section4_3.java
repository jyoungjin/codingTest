package section4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class section4_3 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        answer.add(map.size());

        for (int i = 1; i < n - k + 1; i++) {

            if (map.get(arr[i - 1]) == 1) {
                map.remove(arr[i - 1]);
            } else {
                map.put(arr[i - 1], map.get(arr[i - 1])-1);
            }
            map.put(arr[i + k - 1], map.getOrDefault(arr[i + k - 1], 0) + 1);
            answer.add(map.size());

        }

        return answer;
    }

    public static void main(String[] args) {
        section4_3 T = new section4_3();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : T.solution(n, k, arr)) {
            System.out.print(x+" ");
        }

    }
}