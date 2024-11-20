package src.study;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        ex05 ex = new ex05();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ex.solution(str));
    }
    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while(left<right) {
            if(!Character.isAlphabetic(s[left])) {
                left++;
            }else if(!Character.isAlphabetic(s[right])) {
                right--;
            }else {
                char c = s[left];
                s[left] = s[right];
                s[right] = c;
                left++;
                right--;
            }
        }
        answer = new String(s);
        return answer;
    }
}
