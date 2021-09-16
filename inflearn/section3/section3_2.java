package section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class section3_2 {

    public ArrayList<Integer> solution(int n, int[] arr1 , int m, int[] arr2){

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;p2++;
            } else if (arr1[p1] > arr2[p2]) {
                p2++;
            } else {
                p1++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section3_2 T = new section3_2();
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
