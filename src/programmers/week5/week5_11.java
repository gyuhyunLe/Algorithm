package src.programmers.week5;
/*
문제 - 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
      Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
      Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

해결 - 1. 배열 값을 우선순위 큐에 담는다.
      2. K보다 작으면 우선순위 큐에서 poll 후 계속 반복한다.
      3. 반복횟수를 answer 변수에 담는다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42626
*/
import java.util.*;
class week5_11 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            queue.add(scoville[i]);
        }
        while(queue.peek() < K) {
            if(queue.size() == 1) return -1;
            queue.add(queue.poll() + (queue.poll()*2));
            answer++;
        }

        return answer;
    }
}
