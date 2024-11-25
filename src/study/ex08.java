package src.study;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        ex08 ex = new ex08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ex.solution(str));
    }
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String temp = new StringBuilder(str).reverse().toString();
        if(!str.equals(temp)) {
            answer = "NO";
        }
        return answer;
    }
}
