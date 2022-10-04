package src.programmers.week3;
/*
문제 - 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
      단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

해결 - 배열을 복제하여 새로 생성 후 오름차순 정렬하여 최솟값을 구하기 위해 첫번째 원소 값을 변수에 담는다.
      그 변수와 입력받은 배열과 비교하여 리스트를 선언하여 최솟값을 제외한 값만 리스트에 담는다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12935
*/
import java.util.*;
class week3_9 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] temp = arr.clone();
        Arrays.sort(temp);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int min = temp[0];

        for (int i = 0; i < arr.length; i++) {
            if (min != arr[i]) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        for (int i = 0; i < list.size(); i++) {
            answer = new int[list.size()];
            answer[i] = list.get(i);
        }
        return answer;
    }
}
