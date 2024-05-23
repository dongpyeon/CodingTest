class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow; //브라운 옐로 합 ex 10+2 = 12
        int sum_mid = sum/2; //브라운 옐로 합 의 중앙값  ex 12/2= 6
        
        while(true)
        {
            int hae = sum/sum_mid; // 중앙값 * 해 == sum 임으로 해 구하기 12/6= 2
            int x = sum_mid;
            int y = hae;
            if((x-2)*(y-2) == yellow)
            {
                answer[0]=x;
                answer[1]=y;
                break; 
            }
            else
            {
                sum_mid--;
            }
        }
        return answer;
    }
}