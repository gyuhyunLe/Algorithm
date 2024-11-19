package src.study;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        ex03 ex = new ex03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ex.solution(str));
    }
    public String solution(String str) {
        String[] answer = str.split(" ");
        String temp = "";
        int max = Integer.MIN_VALUE;
        for(int i=0; i<answer.length; i++) {
            int ck = answer[i].length();
            if(ck > max) {
                max = ck;
                temp = answer[i];
            }

        }
        return temp;
    }
}
