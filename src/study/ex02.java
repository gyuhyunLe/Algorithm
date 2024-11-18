package src.study;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        ex02 e = new ex02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(e.solution(str));

    }
    public String solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) {
                answer += Character.isUpperCase(c);
            }else {
                answer += Character.isLowerCase(c);
            }
        }
        return answer;

    }
}
