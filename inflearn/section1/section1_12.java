package section1;

import java.util.Scanner;

/*12. 암호*/
class section1_12 {

    public String solution(int n,String str) {

        String answer = "";
        String binaryAnswer = "";
        int[] tmpArr = new int[n];

        for (char x : str.toCharArray()) {
            if (x == '#') {
                binaryAnswer += '1';
            } else {
                binaryAnswer += '0';
            }
        }

        for(int i=0;i<n;i++){
            tmpArr[i] = Integer.parseInt(binaryAnswer.substring(i*7,7+i*7),2);
        }

        for (int a : tmpArr) {
            answer += (char) a;
        }

        return answer;
    }

    public static void main(String[] args) {

        section1_12 T = new section1_12();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String str = scan.next();

        System.out.println(T.solution(n,str));

    }
}
