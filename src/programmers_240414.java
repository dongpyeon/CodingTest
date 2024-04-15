import java.util.*;
class programmers_240414 {
    public int[] solution(int[] answers) {
        int[] su1 = {1, 2, 3, 4, 5};
        int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int su1Count = 0;
        int su2Count = 0;
        int su3Count = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == su1[i % su1.length])
                su1Count++;
            if (answers[i] == su2[i % su2.length])
                su2Count++;
            if (answers[i] == su3[i % su3.length])
                su3Count++;
        }

        int max = Math.max(su1Count, Math.max(su2Count, su3Count));
        List<Integer> list = new ArrayList<>();
        if (su1Count == max) list.add(1);
        if (su2Count == max) list.add(2);
        if (su3Count == max) list.add(3);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    //코딩테스트 연습 > 완전탐색 > 모의고사
}