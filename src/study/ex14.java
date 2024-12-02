package src.study;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        ex14 ex = new ex14();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] str = new int[n];
        for(int i=0; i<n; i++) {
            str[i] = sc.nextInt();
        }
        System.out.println(ex.solution(n,str));
    }
    public int solution(int n, int[] str) {
        int answer = 1;
        int temp = str[0];

        for(int i=1; i<n; i++) {
            if(temp < str[i]) {
                temp = str[i];
                answer++;
            }
        }
        return answer;
    }
}
