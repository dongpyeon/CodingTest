class Solution {
    public int solution(String s) {
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int idx = 0;
        for(String n : arr)
        {
            String temp = String.valueOf(idx);
            s = s.replace(arr[idx++],temp);
        }
        int answer = 0;
        answer = Integer.valueOf(s);
        return answer;
    }
}