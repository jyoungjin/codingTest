package section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_3 {

    public int solution(int n,int[][] board, int m,int[] moves){

        int answer = 0;

        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < m; i++) {
            int col = moves[i]-1;
            int height = 0;
            while(board[height][col] == 0){
                height++;
                if (height == n) {
                    break;
                }
            }
            if (height < n) {
                if(!result.isEmpty() && result.peek()==board[height][col]){
                    answer+=2;
                    result.pop();
                }else{
                    result.push(board[height][col]);
                }
                board[height][col] = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section5_3 T = new section5_3();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scan.nextInt();
            }
        }

        int m = scan.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,board,m,moves));
    }
}
