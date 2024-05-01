import java.util.*;
class programmers_240501 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        int len = 0;
        while (len < progresses.length) {
            int count = 0; // 완료된 작업의 개수 초기화

            // 각 작업의 진행률 업데이트
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            // 첫 번째 작업이 완료될 때까지
            while (len < progresses.length && progresses[len] >= 100) {
                len++;
                count++;
            }

            if (count > 0) {
                answerList.add(count);
            }
        }

        // List를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }



    //코딩테스트 연습 > 스택/큐 > 기능개발
}