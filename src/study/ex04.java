package src.study;

import java.util.ArrayList;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        ex04 ex = new ex04();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String[] str = new String[cnt];
        for(int i=0; i<cnt; i++) {
            str[i] = sc.next();
        }

        for(String x : ex.solution(str,cnt)){
            System.out.println(x);
        }
    }
    public ArrayList<String> solution(String[] str, int cnt) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<str.length; i++) {
            String temp = new StringBuilder(str[i]).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }
}
