package src.programmers.week5;
/*
문제 - Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
        제한사항
        갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
        노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
        카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.

해결 - 1. 3보다 크거나 같을 시 brown+yellow 더한 값의 약수 일시 조건을 비교한다.
      2. yellow 값 특징은 가로/세로 길이의 모서리 2개 뺀 값이므로 2를 빼고 곱하여 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42842
*/
class week5_14 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for(int i=3; i<=sum; i++) {
            int temp = sum/i;
            if(sum%i == 0 && temp >= 3) {
                int max = Math.max(i,temp);
                int min = Math.min(i,temp);
                int yellow_i = (max-2) * (min-2);
                if(yellow_i == yellow) {
                    answer[0] = max;
                    answer[1] = min;
                }
            }
        }

        return answer;
    }
}
