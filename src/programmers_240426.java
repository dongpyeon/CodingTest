class programmers_240426 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] ongal = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String temp = babbling[i];
            for (int j = 0; j < ongal.length; j++) {
                temp = temp.replace(ongal[j], " ");
            }
            temp = temp.replace(" ", "");
            if (temp.isEmpty())
                answer++;
        }

        return answer;
        //발음가능한 옹알이를 배열 빼고
        // babbling에서 옹알이 부분을 전부 띄어쓰기로 바꿈
        // 띄어쓰기를 공백으로 바꾸고
        // 결국 공백이면 발음가능한것
    }


    //코딩테스트 연습 > 코딩테스트 입문 > 옹알이(1)
}