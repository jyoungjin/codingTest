package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section5_6 {

    public int solution(int n, int k) {

        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int pos = 0;

        while (queue.size() > 1) {
            /*if(pos==k-1){
                queue.remove();
                pos = 0;
            }else{
                queue.add(queue.poll());
                pos++;
            }*/
            for(int i=0;i<k-1;i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        return queue.peek();
    }

    public static void main(String[] args) {

        section5_6 T = new section5_6();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(T.solution(n, k));
    }
}
