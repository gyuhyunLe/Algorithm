package src.programmers.week8;

import java.util.Stack;
/*
문제
크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다. 또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다. (그림에서는 화면표시 제약으로 5칸만으로 표현하였음)
게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때, 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.

해결
1. 바구니 역할을 해줄 stack을 준비하고, 0을 넣는다.
   0을 넣는 이유는 stack의 맨 위 값과 비교해야하는데 아무것도 없으면 오류가 나기 때문이다.
2. moves의 길이만큼 for문을 돌린다.
   board의 길이만큼 for문을 돌린다. (해당 라인에서 인형을 뽑기 위해)
3. 만약 board[j][move - 1]이 0이라면 인형이 없는 것이기 때문에 넘어간다.
   0이 아니라면
4. Stack(바구니)의 가장 윗 요소와 board[j][move - 1]가 같은지 비교한다.
5. 같다면 인형이 터지는 것이기 때문에 Stack에 pop을 하고 answer에 2를 더한다.
   다르다면 Stack에 board[j][move - 1]를 push한다.
*/
public class week8_1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(
        int move :moves)

        {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
