package section3;

import java.util.Scanner;

public class section3_1 {

    public int[] solution(int n, int[] arr1 ,int m, int[] arr2){

        int[] answer = new int[n+m];
        int p1 = 0;
        int p2 = 0;
        int p = 0;


        while (p1 < n && p2 < m) {

            if (arr1[p1] < arr2[p2]) {
                answer[p++] = arr1[p1++];
            } else {
                answer[p++] = arr2[p2++];
            }

        }

        while (p1 < n) {
            answer[p++] = arr1[p1++];
        }
        while (p2 < m) {
            answer[p++] = arr2[p2++];
        }


        return answer;
    }

    public static void main(String[] args) {

        section3_1 T = new section3_1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr2 = new int[m];

        for(int i=0;i<m;i++){
            arr2[i] = scan.nextInt();
        }

        for (int x : T.solution(n,arr1,m,arr2)) {
            System.out.print(x+" ");
        }

    }
}
