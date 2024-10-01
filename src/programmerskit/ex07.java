package src.programmerskit;

public class ex07 {
    boolean solution(String s) {
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else if(s.charAt(i) == ')') {
                count--;
            }
            if(count < 0) {
                return false;
            }
        }
        if(count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
