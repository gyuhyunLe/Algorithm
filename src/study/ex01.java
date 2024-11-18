package src.study;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        ex01 m = new ex01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.println(m.solution(str,t));
    }
    public int solution(String str, char t) {
        int count = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == t) {
                count++;
            }
        }
        return count;
    }
}
