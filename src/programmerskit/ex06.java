package src.programmerskit;

import java.util.ArrayList;
import java.util.List;

/*
기능개발
 */
public class ex06 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int[] works = new int[progresses.length];

        for(int i=0; i< speeds.length; i++) {
            works[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) {
                works[i] += 1;
            }
        }
        int a = works[0];
        int count = 1;

        for(int i=1;i<progresses.length;i++){
            if(a>=works[i]){
                count++;
            }else{
                list.add(count);
                count = 1;
                a= works[i];
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
