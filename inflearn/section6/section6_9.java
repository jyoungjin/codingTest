package section6;

import java.util.*;

public class section6_9 {

    public int count(int[] arr, int mid){

        int cnt = 1;
        int sum = 0;

        for (int x : arr) {
            if (sum + x > mid) {
                cnt++;
                sum = x;
            }else{
                sum += x;
            }
        }

        return cnt;
    }

    public int solution(int n, int m, int[] arr) {

        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                rt = mid - 1;
                answer = mid;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        section6_9 T = new section6_9();
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