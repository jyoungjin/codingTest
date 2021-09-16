package section6;

import java.util.*;

public class section6_8 {
    public int solution(int n, int m, int[] arr) {

        int answer = 0;

        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length-1;
        int mid = (lt + rt) / 2;

        while (lt<=rt) {

            mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid+1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        section6_8 T = new section6_8();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}