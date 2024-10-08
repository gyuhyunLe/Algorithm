package src.programmerskit;

import java.util.LinkedList;
import java.util.Queue;

public class ex09 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int temp_weight = 0, idx = 0;

        Queue<Integer> queue = new LinkedList<>();

        while(true){
            // 5. 마지막 트럭이 다리에 올라갔을 때, 벗어난다.
            if(idx == truck_weights.length)break;
            // 6. 다리에 있는 트럭이 끝에 도달하면, 도달한 트럭의 무게를 현재 다리의 트럭 무게 총합에서 빼준다.
            if(queue.size() == bridge_length){
                temp_weight-=queue.poll();
            }
            // 7. 현재 다리의 트럭 무게 총합 + 다리에 올라가야 하는 트럭의 무게 > 다리의 하중인 경우.
            else if(temp_weight+truck_weights[idx]>weight){
                // 7-1. 다리의 길이를 고려하기 위해 0인 값을 넣어 자리를 채우고, 1초 증가.
                queue.add(0);
                answer++;
                // 8. 위를 제외하고는 다리에 트럭이 올라간다.
            }else{
                queue.add(truck_weights[idx]);
                temp_weight+=truck_weights[idx];
                answer++;
                idx++;
            }
        }
        // 9. 마지막 트럭이 다리에 올라간 상태에서 다리의 길이를 더해주면, 모든 트럭이 통과하는데 걸린 시간.
        return answer + bridge_length;
    }
}
