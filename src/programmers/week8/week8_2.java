package src.programmers.week8;
import java.util.ArrayList;
import java.util.Collections;
/*
문제
크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다. 또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다. (그림에서는 화면표시 제약으로 5칸만으로 표현하였음)
게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때, 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.

해결
1. 우선 각각 스테이지 별로 해당 스테이지에 머물러 있는 유저 수(==도달했으나 아직 클리어하지 못한 유저)와 해당 스테이지에 도달한 총 유저의 수를 구한다.
2. 구한 값을 나누어 실패율을 구한다. (스테이지에 도달한 유저가 없을 경우 실패율은 0)
3. 쩡렬하여 stage 번호를 answer에 담는다.
*/
public class week8_2 {
    static class Rate{
        int idx;	// stage number
        double rate;

        public Rate(int idx, double rate) {
            this.idx = idx;
            this.rate = rate;
        }
    }
    public static int[] solution(int N, int[] stages) {
        int[] user_cnt = new int[N + 2];	// 각 stage에 머물러있는 user 수
        int[] user_total_cnt = new int[N + 1];	// 각 stage에 도달한 전체 user 수

        for (int i = 0; i < stages.length; i++) {
            user_cnt[stages[i]]++;
        }

        user_total_cnt[N] = user_cnt[N] + user_cnt[N + 1];
        for (int i = N-1; i >= 1; i--) {
            user_total_cnt[i] = user_cnt[i] + user_total_cnt[i + 1];
        }

        ArrayList<Rate> arr = new ArrayList<>(); // stage 번호와 실패율을 저장
        for (int i = 1; i <= N; i++) {

            if(user_total_cnt[i]==0){
                arr.add(new Rate(i, 0));
                continue;
            }

            double rate = (double) user_cnt[i] / user_total_cnt[i];
            arr.add(new Rate(i, rate));
        }
        Collections.sort(arr, ((o1, o2) -> Double.compare(o2.rate, o1.rate)));

        int[] answer = new int[N];
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i).idx;
        }
        return answer;
    }
}
