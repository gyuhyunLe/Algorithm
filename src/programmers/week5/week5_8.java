package src.programmers.week5;
/*
문제 - 현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때,
       내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.
      1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
      2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
      3. 그렇지 않으면 J를 인쇄합니다.

해결 - 1.
      2.
      3.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42587
*/
import java.util.*;
class week5_8 {
    public int solution(int[] priorities, int location) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : priorities) list.add(i);
        int loc = location, cnt = 0;
        while (!list.isEmpty()) {
            int max_priority = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(0) < list.get(i)) {
                    if (loc == 0) loc = list.size() - 1;
                    else loc--;

                    int tmp_priority = list.get(0);
                    list.remove(0);
                    list.add(tmp_priority);
                    max_priority = 0;
                    break;
                }
            }
            if (max_priority != 0) {
                list.remove(0);
                cnt++;
                if (loc == 0) break;
                else loc--;
            }
        }
        return cnt;
    }
}
