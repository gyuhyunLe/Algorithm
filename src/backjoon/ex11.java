package src.backjoon;

import java.util.Scanner;
/*
문제 - 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

헤결 -
n = 1 일 때,
1
한 가지이므로 dp[1] = 1 이다.

n = 2 일 때,
1 + 1
2
두 가지이므로 dp[2] = 2 이다.

n = 3 일 때,
1 + 1 + 1
2 + 1
1 + 2
3
총 4가지이므로 dp[3] = 4 이다.

n = 4 일 때,
1 + 1 + 1 +1
2 + 1 + 1
1 + 2 + 1
3 + 1
1 + 1 + 2
2 + 2
1 + 3
총 7가지이므로 dp[4] = 7 이다.
*/
class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[11];

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;

        int a = 0;
        for(int i = 0; i < num; i++) {
            a = sc.nextInt();
            for(int j = 4; j <= a; j++) {
                array[j] = array[j - 1] + array[j - 2] + array[j - 3];
            }
            System.out.println(array[a]);
        }
    }
}
