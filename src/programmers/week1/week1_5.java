package src.programmers.week1;
/*
문제 - 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

해결 - 입력받은 배열 크기만큼 for문 반복한다.
       sum 변수에 담아서 배열 크기만큼 나눠 평균값 구한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */
class week1_5 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        answer = sum / arr.length;
        return answer;
    }
}
