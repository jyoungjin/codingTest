package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class section2_6 {

    public boolean isPrime(int n){

        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        section2_6 T = new section2_6();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x+" ");
        }

    }
}
