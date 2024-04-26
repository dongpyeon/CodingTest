class programmers_240426 {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] canSpeak = { "aya", "ye", "woo", "ma" };
        String splitStr = null;

        for (int i = 0; i < babbling.length; i++) {
            splitStr = babbling[i];

            for (int j = 0; j < canSpeak.length; j++) {

                if (splitStr.length() != 0 && splitStr.contains(canSpeak[j])) {

                    if (splitStr.equals(babbling[i])) {
                        splitStr = babbling[i].replaceAll(canSpeak[j], "0");
                    } else {
                        splitStr = splitStr.replaceAll(canSpeak[j], "0");
                    }
                }
            }

            if (splitStr.replaceAll("0", "") == "") {
                answer++;
            }
        }

        return answer;
    }


    //코딩테스트 연습 > 코딩테스트 입문 > 옹알이(1)
}