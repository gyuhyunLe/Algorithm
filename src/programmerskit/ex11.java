package src.programmerskit;

import java.util.PriorityQueue;

/*
더 맵게
 */
public class ex11 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            queue.add(scoville[i]);
        }
        while(queue.peek() < K) {
            if(queue.size() == 1) return -1;
            queue.add(queue.poll() + (queue.poll() *2));
            answer++;
        }
        return answer;
    }
}
