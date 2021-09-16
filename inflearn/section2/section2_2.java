package section2;

import java.util.Scanner;

public class section2_2 {

    public int solution(int n, int[] arr){

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int x : arr) {
            if(x>max){
                max = x;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section2_2 T = new section2_2();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));

    }
}
