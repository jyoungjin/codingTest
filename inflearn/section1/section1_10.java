package section1;

import java.util.ArrayList;
import java.util.Scanner;

/*10. 가장 짧은 문자거리*/
class section1_10 {

    public String solution(String str, char ch) {

        String answer = "";

        ArrayList<Integer> indexArray = new ArrayList<>();
        int n=0;

        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == ch) {
                indexArray.add(i);
            }
        }

        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) != ch) {
                int tmpMin = Integer.MAX_VALUE;
                for (int a : indexArray) {
                    int tmpInt = a-i;
                    tmpInt = Math.abs(tmpInt);
                    if (tmpMin > tmpInt) {
                        tmpMin = tmpInt;
                    }
                }
                answer += " "+tmpMin;
            }else{
                answer += " 0";
            }
        }

        answer = answer.trim();

        return answer;
    }

    public static void main(String[] args) {

        section1_10 T = new section1_10();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = scan.next().charAt(0);

        System.out.println(T.solution(str, ch));

    }
}
