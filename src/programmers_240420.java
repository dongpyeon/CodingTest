class programmers_240420 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1count =0;
        int cards2count =0;
        String answer = "Yes";

        for(String word : goal)
        {
            if(cards1[cards1count].equals(word))
            {
                cards1count++;
            }

            else if(cards2[cards2count].equals(word))
            {
                cards2count++;
            }

            else
            {
                answer="No";
                break;
            }
        }
        return answer;
    }
    //코딩테스트 연습 > 연습문제 > 카드 뭉치
}