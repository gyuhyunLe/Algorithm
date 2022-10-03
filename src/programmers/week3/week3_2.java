package src.programmers.week3;
/*
문제 - 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
      다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

해결 - 배열 첫번째 값은 입력받은 정수를 담고, 다음번째 값부터는 배열 길이(length)만큼 반복하여 배열 전 주소값에 더하여 담고 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
class week3_2 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i=1; i<answer.length; i++) {
            answer[i] = answer[i-1] + x;
        }
        return answer;
    }
}
