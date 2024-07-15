class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int i =0;
        for(i=0; i<phone_number.length()-4; i++)
        {
            answer+="*";
        }
        
        while(i<phone_number.length())
        {
            String n = String.valueOf(phone_number.charAt(i));
            answer+=n;
            i++;
        }
        
        return answer;
    }
}