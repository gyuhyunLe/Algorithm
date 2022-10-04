package src.programmers.week3;
/*
문제 - array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
       divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

해결 - 리스트를 선언하고 비교할 수 있는 변수값을 선언한다.
       나누어 떨어지는 수면 리스트에 담고 변수 값을 증가시킨다.
       나누어 떨어지지 않으면 -1 배열에 담아 리턴한다.
       리스트에 담긴 값을 리턴하는 배열에 sort 정렬하여 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12910
*/
import java.util.*;
class week3_8 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> aList = new ArrayList<Integer>();
        int temp = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                aList.add(arr[i]);
                temp++;
            }
        }
        int[] answer = new int[aList.size()];

        for(int i=0; i<aList.size(); i++) {
            answer[i] = aList.get(i);
        }
        if(temp == 0) {
            return new int[]{-1};
        }
        Arrays.sort(answer);
        return answer;
    }
}
