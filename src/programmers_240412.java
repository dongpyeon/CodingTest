import java.util.*;

class programmers_240412 {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        for (int l : lost) {
            lostList.add(l);
        }

        List<Integer> reserveList = new ArrayList<>();
        for (int r : reserve) {
            reserveList.add(r);
        }

        Collections.sort(lostList);
        Collections.sort(reserveList);

        // 여벌 체육복을 가져왔지만 도난당한 학생 처리
        List<Integer> removeList = new ArrayList<>();
        for (int lostStudent : lostList) {
            if (reserveList.contains(lostStudent)) {
                removeList.add(lostStudent);
            }
        }

        lostList.removeAll(removeList);
        reserveList.removeAll(removeList);

        int answer = n - lostList.size();

        for (int i = 0; i < lostList.size(); i++) {
            int lostStudent = lostList.get(i);
            for (int j = 0; j < reserveList.size(); j++) {
                int reserveStudent = reserveList.get(j);
                if (lostStudent == reserveStudent || lostStudent == reserveStudent - 1 || lostStudent == reserveStudent + 1) {
                    reserveList.remove(j);
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
    //코딩테스트 연습 > 탐욕법 > 체육복
}
