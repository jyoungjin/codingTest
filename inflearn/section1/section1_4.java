package section1;

import java.util.ArrayList;
import java.util.Scanner;

class section1_4 {

    public ArrayList<String> solution(int n, String[] strArray) {

        ArrayList<String> answer = new ArrayList<>();

        for(String x : strArray){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_4 T = new section1_4();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] strArray = new String[n];

        for(int i=0;i<n;i++){
            strArray[i] = scan.next();
        }

        for(String x : T.solution(n,strArray)){
            System.out.println(x);
        }

    }
}
