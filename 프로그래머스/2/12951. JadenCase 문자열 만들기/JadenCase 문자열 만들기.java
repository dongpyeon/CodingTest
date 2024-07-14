class Solution {
    public String solution(String s) {
        String answer = "";
        boolean check = true; // 단어의 시작을 확인하는 플래그
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isWhitespace(temp)) { // 공백 문자인지 확인
                check = true;
                answer += temp;
            } else if (check) { // 단어의 시작인 경우
                answer += Character.toUpperCase(temp);
                check = false;
            } else { // 단어의 나머지 부분
                answer += Character.toLowerCase(temp);
            }
        }
        return answer;
    }
}
