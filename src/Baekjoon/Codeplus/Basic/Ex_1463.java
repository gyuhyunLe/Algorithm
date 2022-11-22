package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

해결
1. 6으로 나눠 지는 경우, 3으로 나누는 경우, 2로 나누는 경우ㅡ 1을 빼는 경우 재귀호출한다.
2. 최솟값으로 갱신해야 하며 1을 더한 값이 최소연산 횟수가 된다.
3.
*/
class Ex_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N+1];
        arr = new int[N+1];
        arr[0] = 0;
        arr[1] = 0;

        for(int i=2; i<=N; i++) {
            arr[i] = arr[i-1] + 1;
            if(i%2 == 0) {
                arr[i] = Math.min(arr[i],arr[i/2] + 1);
            }
            if(i%3 == 0) {
                arr[i] = Math.min(arr[i],arr[i/3] + 1);
            }
        }
        System.out.println(arr[N]);

    }
}
