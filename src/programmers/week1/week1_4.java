package src.programmers.week1;
/*
문제 - 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

해결 - 입력받은 수를 for문 반복으로 실행하여 나눠지는 수를 변수에 담는다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
class week1_4 {
        public int solution(int n) {
            int answer = 0;
            for(int i=1; i<=n; i++) {
                if(n%i == 0) {
                    answer += i;
                }
            }
            return answer;
        }
    }
}
