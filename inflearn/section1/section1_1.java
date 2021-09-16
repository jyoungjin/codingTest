package section1;

import java.util.Scanner;

class section1_1 {

    public int solution(String str, char x){

        int answer = 0;

        str=str.toUpperCase();
        x=Character.toUpperCase(x);

        /*기존 for문*/
        /*for(int i=0;i<str.length();i++){
            if(str.charAt(i)==x){
                answer++;
            }
        }*/

        /*향상된 for문*/
        for(char c : str.toCharArray()){
            if(c==x) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_1 T = new section1_1();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char input1 = scan.next().charAt(0);

        System.out.println(T.solution(str,input1));
    }
}
