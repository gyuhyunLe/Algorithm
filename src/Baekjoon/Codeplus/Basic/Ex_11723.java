package src.Baekjoon.Codeplus.Basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
문제
비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
all: S를 {1, 2, ..., 20} 으로 바꾼다.
empty: S를 공집합으로 바꾼다.

해결
1. 중복 허용하지 않는 set 인터페이스 이용한다.
2. switch - case 문 이용하여 구현한다.
3.
*/
class Ex_11723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            String cal = sc.next();
            int x = 0;

            switch (cal) {
                case "add":
                    x = sc.nextInt();
                    set.add(x);
                    break;
                case "remove":
                    x = sc.nextInt();
                    set.remove(x);
                    break;
                case "check":
                    x = sc.nextInt();
                    if(set.contains(x)) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "toggle":
                    x = sc.nextInt();
                    if(set.contains(x)) {
                        set.remove(x);
                    } else {
                        set.add(x);
                    }
                    break;
                case "all":
                    for(int j=0; j<20; j++) {
                        set.add(j+1);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
