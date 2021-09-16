package section1;

import java.util.Scanner;

/*10. 가장 짧은 문자거리*/
class section1_10_pro {

    public int[] solution(String str, char ch) {

        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                p++;
                answer[i] = p;
            }else{
                p = 0;
                answer[i] = p;
            }
        }

        p = 1000;

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=ch){
                p++;
                answer[i] = Math.min(answer[i], p);
            }else{
                p = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_10_pro T = new section1_10_pro();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = scan.next().charAt(0);

        for (int x : T.solution(str, ch)) {
            System.out.print(x+" ");
        }

    }
}
