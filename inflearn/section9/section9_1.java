package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int height,weight;

    Body(int height,int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height-this.height;
    }
}

public class section9_1 {
    public int solution(int n,ArrayList<Body> arrayList) {

        int answer = 0;
        Collections.sort(arrayList);
        int max = Integer.MIN_VALUE;

        for (Body body : arrayList) {
            if (body.weight > max) {
                answer++;
                max = body.weight;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        section9_1 T = new section9_1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Body> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Body person = new Body(scan.nextInt(),scan.nextInt());
            arrayList.add(person);
        }

        System.out.print(T.solution(n,arrayList));

    }
}