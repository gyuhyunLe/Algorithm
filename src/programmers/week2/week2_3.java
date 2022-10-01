package src.programmers.week2;
/*
문제 - 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

해결 - list를 선언하여 입력받은 수를 뒤집는다.
      list 크기만큼 배열에 담아 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
import java.util.*;
class week2_3 {
    public int[] solution(long n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            list.add((int)(n%10));
            n /= 10;
        }
        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

