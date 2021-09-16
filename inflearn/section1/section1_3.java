package section1;

import java.util.Scanner;

class section1_3 {

    public String solution(String str){

        String answer = "";
        int maxNum = Integer.MIN_VALUE;

        /*
        String[] s = str.split(" ");
        for(String x :s){
            int len = x.length();
            if(len>maxNum){
                maxNum = len;
                answer = x;
            }
        }*/

        int pos;
        /*indexOf 메서드는 발견하지 못하면 -1을 return 한다*/
        while( (pos=str.indexOf(' ') ) != -1){
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len>maxNum){
                maxNum = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        if(str.length() > maxNum){
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_3 T = new section1_3();

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(T.solution(str));
    }
}
