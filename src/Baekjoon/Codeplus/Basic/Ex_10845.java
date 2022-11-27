package src.Baekjoon.Codeplus.Basic;
/*
문제
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

해결
1. queue.peek 맨 앞 출력한다.
2. queue.poll 맨 앞 정수를 뺸다.
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex_10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        Queue<Integer> que = new LinkedList<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            switch (sc.next()) {
                case "push":
                    int x = sc.nextInt();
                    temp = x;
                    que.add(x);
                    break;
                case "pop":
                    if(que.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que.poll());
                    }
                    break;
                case "size":
                    System.out.println(que.size());
                    break;
                case "empty":
                    if(que.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(que.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que.peek());
                    }
                    break;
                case "back":
                    if(que.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(temp);
                    }
                    break;
            }
        }

    }
}
