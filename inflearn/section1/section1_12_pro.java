package section1;

import java.util.Scanner;

/*12. 암호*/
class section1_12_pro {

    public String solution(int n,String str) {

        String answer = "";
        for(int i=0;i<n;i++){
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_12_pro T = new section1_12_pro();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String str = scan.next();

        System.out.println(T.solution(n,str));

    }
}
