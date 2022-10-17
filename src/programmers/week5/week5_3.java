package src.programmers.week5;
/*
문제 - 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
        1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

해결 - 1. 1번/2번/3번 수표자를 배열에 담는다.
      2. 가장 많은 숫자를 맞힌 사람 3명을 변수에 담는다.
      3. 5개씩/8개씩/10개씩 answers배열 원소값과 비교하여 같을 시에 맞힌 사람 변수를 증가시킨다.
      4. max값을 구하여 list에 1번/2번/3번 값을 담아 배열을 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42840
*/
import java.util.*;
class week5_3 {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int onep = 0, twop = 0, threep = 0, max = 0;

        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == one[i%5]) onep++;
            if(answers[i] == two[i%8]) twop++;
            if(answers[i] == three[i%10]) threep++;
        }
        max = Math.max(Math.max(onep,twop),threep);

        if(max == onep) list.add(1);
        if(max == twop) list.add(2);
        if(max == threep) list.add(3);

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
