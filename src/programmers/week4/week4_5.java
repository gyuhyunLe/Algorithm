package src.programmers.week4;
/*
문제 - 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
      배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
      예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

해결 - 최대공약수는 두수중에 작은수에 최대로 큰 약수이며 최소공배수는 두개의 수를 곱한 후 최대공약수로 나눠준다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12940
*/
class week4_5 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int key = (n<m) ? n : m;
        for(int i=1; i<=key; i++) {
            if(n%i == 0 && m%i == 0) {
                answer[0] = i;
                answer[1] = n*m / i;
            }
        }
        return answer;
    }
}
