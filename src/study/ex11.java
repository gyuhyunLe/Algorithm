package src.study;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        ex11 ex = new ex11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex.solution(str));
    }
    public String solution(String str) {
        int cnt = 1;
        String answer = "";
        str = str + " ";
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            }else {
                answer += str.charAt(i);
                if(cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

}
