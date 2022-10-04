package src.programmers.week3;
/*
문제 - 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
       예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

해결 - 두 수를 비교하여 큰수와 작은수 사이 값을 더하는 반복문을 실행한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */
class week3_5 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) {
            return a;
        }else if(a<b) {
            for(int i=a; i<=b; i++) {
                answer += i;
            }
        } else if(a>b){
            for(int i=b; i<=a; i++) {
                answer += i;
            }
        }
        return answer;
    }
}
