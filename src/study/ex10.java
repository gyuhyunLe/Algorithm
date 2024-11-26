package src.study;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        ex10 ex = new ex10();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        for(int x:ex.solution(str,c)) {
            System.out.println(x+" ");
        }
    }
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int temp = Integer.MAX_VALUE;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                temp = 0;
                answer[i] = temp;
            }else {
                temp++;
                answer[i] = temp;
            }
        }
        temp = Integer.MAX_VALUE;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == c) {
                temp = 0;
            }else {
                temp++;
                answer[i] = Math.min(answer[i], temp);
            }
        }
        return answer;
    }

}
