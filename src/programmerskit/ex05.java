package src.programmerskit;

import java.util.ArrayList;
import java.util.List;

/*
같은 숫자는 싫어
 */
public class ex05 {
    public int[] solution(int []arr) {
        int temp = -1;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != temp) {
                list.add(arr[i]);
                temp = arr[i];
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
