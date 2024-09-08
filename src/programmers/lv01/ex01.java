package src.programmers.lv01;
/*
문제 - 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.

해결 - 입력받은 수를 2로 나눠 나머지가 1인 수를 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
class ex01 {
    public int solution(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 1) {
                return i;
            }
        }
        return 0;
    }
}
