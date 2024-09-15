package src.programmers.lv01;
/*
문제 - 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

해결 - 입력받은 두 배열 원소끼리 곱한 후 answer에 합쳐 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/70128
*/
class ex07 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
