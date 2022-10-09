package src.programmers.week4;
/*
문제 - 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
      약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

해결 - 입력받은 두 수 사이 반복문을 실행하여 약수의 갯수를 구하여 짝수이면 리턴하는 변수에 더해주고 홀수이면 빼줘서 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/77884
*/
class week4_1 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int cnt = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    cnt++;
                }
            }
            if(cnt%2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
