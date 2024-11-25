package src.study;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        ex09 ex = new ex09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex.solution(str));
    }
    public int solution(String str) {
        String answer = "";
        for(char x:str.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }
}
