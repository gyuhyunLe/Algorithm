package src.programmers.week6;
/*
문제 - n명이 입국심사를 위해 줄을 서서 기다리고 있습니다. 각 입국심사대에 있는 심사관마다 심사하는데 걸리는 시간은 다릅니다.
    처음에 모든 심사대는 비어있습니다. 한 심사대에서는 동시에 한 명만 심사를 할 수 있습니다.
    가장 앞에 서 있는 사람은 비어 있는 심사대로 가서 심사를 받을 수 있습니다.
    하지만 더 빨리 끝나는 심사대가 있으면 기다렸다가 그곳으로 가서 심사를 받을 수도 있습니다.
    모든 사람이 심사를 받는데 걸리는 시간을 최소로 하고 싶습니다.
    입국심사를 기다리는 사람 수 n, 각 심사관이 한 명을 심사하는데 걸리는 시간이 담긴 배열 times가 매개변수로 주어질 때, 모든 사람이 심사를 받는데 걸리는 시간의 최솟값을 return 하도록 solution 함수를 작성해주세요.

해결 - 1. times배열을 오름차순으로 정렬시킨다.
      2. start에는 최선의 경우인 속도가 1이며 사람이 1명일때인 1을 대입하고 end에는 최악의 경우인 times배열의 마지막 원소를 대입한다.
      3. start가 end와 같이질 때까지 반복하며 times의 원소를 하나하나 mid의 값을 나누고 sum에 더해준다.
          -> sum의 값은 주어진 시간이 mid일때 심사관들이 심사해준 사람들의 합
      4. sum이 n 보다 크거나 같으면 시간을 줄일 수 있으므로 end에 mid-1값을 넣어준다. 그리고 answer에 mid값을 넣어준다.
      5. 반대로 sum이 n보다 작으면 심사된 사람의 수가 목표치보다 작은 것이므로 start에 mid+1의 값을 넣어준다.
      6. while문이 끝나면 answer를 리턴해주면 된다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/43238
*/
import java.util.*;
class week6_8 {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long left = 0;
        long right = (long) n * times[times.length -1]; //가장 최악의 경우의(오래걸리는) 시간

        while(left <= right) {
            long mid = (left+right) / 2;
            long sum = 0; // 총 심사한 인원
            for(int i=0; i<times.length; i++) { //빨리 심사하는 심사관 순으로 심사처리
                sum += mid / times[i];
            }
            if (sum < n) { //해야할 인원보다 심사처리 못함 -> 시간 더 필요
                left = mid + 1;
            } else { //해야할 인원보다 심사처리 많이함 -> 시간을 줄여서 더 최고 경우의 시간을 만든다.
                right = mid - 1;
                answer = mid;
            }
        }

        return answer;
    }
}
