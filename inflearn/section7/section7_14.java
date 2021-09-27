package section7;

/*
 * 그래프 최단거리 - BFS
 * 다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
 * 입력설명: 첫 번째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 * 출력설명: 1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.
 *  */

import java.util.ArrayList;
import java.util.Scanner;

public class section7_14 {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {

        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }


    }

    public static void main(String[] args) {

        section7_14 T = new section7_14();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);

        System.out.println(answer);

    }
}