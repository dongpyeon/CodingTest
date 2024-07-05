class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == ' ') {
                answer += " ";
                idx = 0; // 공백을 만났을 때 idx를 0으로 초기화하여 다음 단어의 첫 글자부터 다시 처리
                continue; // 공백이므로 루프의 다음 반복으로 넘어감
            }
            
            if (idx % 2 == 0) 
            {
                answer += String.valueOf(Character.toUpperCase(temp));
            } else 
            {
                answer += String.valueOf(Character.toLowerCase(temp));
            }
            idx++; // idx는 공백이 아닌 문자에 대해서만 증가
        }
        return answer;
    }
}
