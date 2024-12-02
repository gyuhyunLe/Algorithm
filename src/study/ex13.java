package src.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        ex13 ex = new ex13();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] str = new int[n];
        for(int i : ex.solution(str)) {
            System.out.print(i+ " ");
        }
    }
    public ArrayList<Integer> solution(int[] str) {
        int temp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(str[0]);
        for(int i=0; i<str.length-1; i++) {
            if(str[i] < str[i+1]) {
                list.add(str[i+1]);
            }
        }
        return list;
    }
}
