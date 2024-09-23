package src.programmerskit;

import java.util.HashMap;

/*
의상
 */
public class ex04 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int answer = 0;

        for (int i = 0; i < clothes.length; i++) {
            // 현재 의상의 종류가 존재하지 않으면 1개 넣고, 존재하면 +1
            if (map.get(clothes[i][1]) == null) map.put(clothes[i][1], 1);
            else map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }
        for (String keys : map.keySet())
            answer *= (map.get(keys) + 1);

        return answer - 1;
    }
}
