package src.programmers.week5;
/*
문제 - 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
      또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
       먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

해결 -   1. 작업일 수 배열(works)을 구한다.
        2. works를 for문을 돌린다.
        3. 전에 나온게(x) 나중에 나온 것(works[i])보다 크거나 같으면 count를 증가,
        아니면 count를 list에 추가, count를 1로 초기화, x=works[i] 처리
        4. for문을 빠져나와서 마지막 처리 count를 리스트에 추가한다.
        5. list를 출력한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42586
*/
import java.util.*;
class week5_6 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] works = new int[progresses.length];
        for(int i=0; i<works.length; i++) {
            if((100-progresses[i]) / speeds[i] == 0) {
                works[i] = (100-progresses[i]) / speeds[i];
            } else {
                works[i] = (100-progresses[i]) / speeds[i] + 1;
            }
        }
        int x = works[0];
        int count = 1;
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<works.length; i++) {
            if(x < works[i]) {
                list.add(count);
                count = 1;
                x = works[i];
            } else {
                count++;
            }
        }
        list.add(count);
        int[] answer = new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
