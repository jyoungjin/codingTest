package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class section2_1 {

    public ArrayList<Integer> solution(int n, int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();

        int before = arr[0];
        answer.add(arr[0]);

        for (int x : arr) {
            if (x > before) {
                answer.add(x);
            }
            before = x;
        }

        return  answer;
    }

    public static void main(String[] args) {

        section2_1 T = new section2_1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        for (int x : T.solution(n,arr)) {
            System.out.print(x+" ");
        }

    }
}
