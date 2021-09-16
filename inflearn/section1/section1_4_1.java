package section1;

import java.util.ArrayList;
import java.util.Scanner;

class section1_4_1 {

    public ArrayList<String> solution(int n, String[] strArray) {

        ArrayList<String> answer = new ArrayList<>();

        /*내가 짠 코드*/
        /*for(String x : strArray){
            String tmp = "";
            for(int i=x.length()-1;i>=0;i--){
                tmp+=x.substring(i,i+1);
            }
            answer.add(tmp);
        }*/

        /*수업 코드*/
        for(String x : strArray){
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;

            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++; rt--;
            }

            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_4_1 T = new section1_4_1();

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
