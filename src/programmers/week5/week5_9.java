package src.programmers.week5;
/*
문제 - 트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
       다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다. 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.
       예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
       solution 함수의 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length, 다리가 견딜 수 있는 무게 weight,
       트럭 별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.

해결 - 1. 마지막 트럭을 제외한 모든 트럭을 통과시키기 위한 무한 반복한다.
      2. 다리에 있는 트럭이 끝에 도달하면, 도달한 트럭의 무게를 현재 다리의 트럭 무게 총합에서 빼준다.
      3. 현재 다리의 트럭 무게 총합 + 다리에 올라가야 하는 트럭의 무게 > 다리의 하중인 경우.
      4. 다리의 길이를 고려하기 위해 0인 값을 넣어 자리를 채우고, 1초 증가한다.
      5. 위를 제외하고는 다리에 트럭이 올라간다.
      6. 마지막 트럭이 다리에 올라간 상태에서 다리의 길이를 더해주면, 모든 트럭이 통과하는데 걸린 시간.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42583
*/
import java.util.*;
class week5_9 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        //마지막 트럭을 제외한 모든 트럭이 다리를 통과하는 데 걸린 시간.
        int answer = 0;
        //현재 다리의 트럭 무게 총합, 트럭들의 무게를 참조 할 변수.
        int sum = 0, idx=0;
        Queue<Integer> queue = new LinkedList<>();

        while(true){
            if(idx == truck_weights.length)break;

            if(queue.size() == bridge_length){
                sum -= queue.poll();
            } else if(sum + truck_weights[idx] > weight){
                queue.add(0);
                answer++;
            }else{
                queue.add(truck_weights[idx]);
                sum += truck_weights[idx];
                answer++;
                idx++;
            }
        }
        return answer + bridge_length;
    }
}
