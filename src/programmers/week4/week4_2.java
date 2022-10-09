package src.programmers.week4;
/*
문제 - 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
       2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

해결 - 이차원 배열이기 때문에 행만큼 반복 후 열만큼 반복하여 더해줘서 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12950
*/
class week4_2 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
