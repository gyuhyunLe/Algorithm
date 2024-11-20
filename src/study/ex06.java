package src.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        ex06 ex = new ex06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex.solution(str));
    }
    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}
