package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;
/*
문제
N개의 정수로 이루어진 배열 A가 주어진다. 이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오.
|A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|

해결
1. 모든 경우의 수 구해서 최댓값을 구한다.
2. depth 1씩 증가시키며 target배열에 입력받은 arr배열 값을 담아준다.
3. 방문한 노드는 재방문하지 않게 visit 배열을 사용한다.
*/
class Ex_10819 {
    static int[] arr;
    static int[] target;
    static boolean[] visited;
    static int n;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        target = new int[n];
        visited = new boolean[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0);
        System.out.println(result);
    }

    public static void dfs(int depth) {
        if(n == depth) {
            int sum = 0;
            for(int i=0; i<n; i++) {
                sum += Math.abs(target[i] - target[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                target[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
