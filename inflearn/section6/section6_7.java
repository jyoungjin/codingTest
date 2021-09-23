package section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    public int x,y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

public class section6_7 {
    public ArrayList<Point> solution(int n, ArrayList<Point> arr) {

        Collections.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        section6_7 T = new section6_7();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new Point(scan.nextInt(), scan.nextInt()));
        }

        for (Point point : T.solution(n, arr)) {
            System.out.print(point.x+" "+point.y);
            System.out.println();
        }
    }
}