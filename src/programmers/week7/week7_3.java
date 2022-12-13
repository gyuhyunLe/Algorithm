package src.programmers.week7;
/*
문제
순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다.
알아볼 수 없는 두 개의 번호를 각각 10, 6이라고 가정하면 3등에 당첨될 수 있습니다.
3등을 만드는 다른 방법들도 존재합니다. 하지만, 2등 이상으로 만드는 것은 불가능합니다.
알아볼 수 없는 두 개의 번호를 각각 11, 7이라고 가정하면 5등에 당첨될 수 있습니다.
5등을 만드는 다른 방법들도 존재합니다. 하지만, 6등(낙첨)으로 만드는 것은 불가능합니다.
민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.

해결
1. win-nums와 , 민수가 적은 lottos가 정확히 맞는 갯수를 저장할 correct 변수, 잊어버린 번호 0을 세는 zero 변수
2.  0개,1개 맞으면 6위
    2개 맞으면 5위
    3개 맞으면 4위
    4개 맞으면 3위
    5개 맞으면 2위
    6개 맞으면 1위
*/
import java.util.*;
class week7_3 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int correct =0;
        int zero =0;
        int[] rank ={6,6,5,4,3,2,1};

        for(int i=0;i<lottos.length;i++){
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i]==0){
                    zero++;
                    break;
                }
                if(lottos[i]==win_nums[j]){
                    correct++;
                    break;
                }
            }
        }

        answer[0]=rank[zero+correct];
        answer[1]=rank[correct];

        return answer;
    }
}
