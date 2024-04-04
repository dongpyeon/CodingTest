import java.util.*;

class programmers_240404 {
    boolean solution(String s) {
        boolean answer = true;
        String arr[] = s.split("");
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i].equals("("))
                check++;
            else
                check--;

            if (check < 0)
                return false;
        }
        return check == 0;
        //코딩테스트 연습 > 스택/큐 > 올바른 괄호
    }
}
