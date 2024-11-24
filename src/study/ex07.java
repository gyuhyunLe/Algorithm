package src.study;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
       ex07 ex = new ex07();
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       System.out.println(ex.solution(str));
    }
    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

}
