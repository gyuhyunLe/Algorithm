package src.programmers.lv01;
/*
문제 - 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

해결 - 1. 리스트를 선언하여 배열 한개의 원소로 나머지 원소와 더한값을 담는다.
      2. contains함수를 사용하여 중복값을 제거 후 오름차순 정렬한다.
      3. 배열에 담아 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/68644
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ex09 {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i< numbers.length; i++) {
            for(int j=i; j< numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if(!list.contains(sum)) list.add(sum);
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
