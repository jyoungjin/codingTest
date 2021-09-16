package section2;

import java.util.Scanner;

public class section2_3 {

    public char[] solution(int n, int[] arr1, int[] arr2){

        char[] answer = new char[n];

        for (int i = 0; i < n; i++) {

            /*if (arr1[i] == arr2[i]) {
                answer[i] = 'D';
            } else if (arr1[i]==1 && arr2[i]==2) {
                answer[i] = 'B';
            } else if (arr1[i]==1 && arr2[i]==3) {
                answer[i] = 'A';
            } else if (arr1[i]==2 && arr2[i]==1) {
                answer[i] = 'A';
            } else if (arr1[i]==2 && arr2[i]==3) {
                answer[i] = 'B';
            } else if (arr1[i]==3 && arr2[i]==1) {
                answer[i] = 'B';
            } else if (arr1[i]==3 && arr2[i]==2) {
                answer[i] = 'A';
            }*/

            if (arr1[i] == arr2[i]) {
                answer[i] = 'D';
            } else if (arr1[i]==1 && arr2[i]==3) {
                answer[i] = 'A';
            } else if (arr1[i]==2 && arr2[i]==1) {
                answer[i] = 'A';
            } else if (arr1[i]==3 && arr2[i]==2) {
                answer[i] = 'A';
            } else{
                answer[i] = 'B';
            }


        }

        return answer;
    }

    public static void main(String[] args) {

        section2_3 T = new section2_3();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i] = scan.nextInt();
        }

        for (char x : T.solution(n, arr1, arr2)) {
            System.out.println(x);
        }

    }
}
