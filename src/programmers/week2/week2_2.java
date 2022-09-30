package src.programmers.week2;
/*
문제 - 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
       n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

해결 - 입력받은 수를 동일한 두 개의 수로 곱해서 같으면 제곱근인 것을 확인한다.
       제곱근일 시 return 한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
class week2_2 {
    public long solution(long n) {
        long answer = 0;
        for(long i=1; i<=n; i++) {
            if(i * i == n){
                answer = (i+1) * (i+1);
                return answer;
            }
        }
        return -1;
    }
}
