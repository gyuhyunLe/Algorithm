package src.programmers.week6;
/*
문제 -   n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
        -1+1+1+1+1 = 3
        +1-1+1+1+1 = 3
        +1+1-1+1+1 = 3
        +1+1+1-1+1 = 3
        +1+1+1+1-1 = 3
        사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

해결 - 1. 초기 depth, sum값을 0으로 세팅하여 알고리즘 실행후 answer 값 return
      2. 마지막 노드까지 탐색했을 경우, 즉 depth와 numbers 배열의 길이가 같을 때에는 target과 sum값을 비교하여 일치하면 answer 카운트 증가
      3. 탐색할 노드가 남아있는 경우 이전 노드까지의 합에서 현재 노드 값을 더하고 빼는 두 가지 경우로 깊이 우선 탐색 알고리즘 재실행

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/43105
*/
class week6_5 {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    // 깊이 우선 탐색
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){ // 마지막 노드 까지 탐색한 경우
            if(target == sum) answer++; //depth와 numbers 배열의 길이가 같을 때에는 target과 sum값을 비교하여 일치하면 answer 카운트 증가
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
        }
    }
}
