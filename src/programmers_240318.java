import java.util.*;

class programmers_240318 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
        //코딩테스트 연습 > 해시 > 완주하지 못한 선수
    }
}