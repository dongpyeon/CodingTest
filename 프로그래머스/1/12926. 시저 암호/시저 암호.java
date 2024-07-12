class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i =0; i<s.length(); i++)
        {
            char temp = s.charAt(i);
            if(temp<65) //소문자나 대문자가 아니면 공백으로 처리
            {
                answer+=" ";
                continue;
            }
            else if(temp<97 && temp+n> 90) //소문자인데 z를 넘어섰을때
            {
                temp +=n-26;
            }
            else if(temp+n>122) //대문자인데 Z를 넘어섰을때
            {
                temp +=n-26;
            }
            else
            {
                temp+=n;
            }
            answer += String.valueOf(temp);
                
        } 
        return answer;
        //A 65 a97 알파벳은 총25개
    }
}