class Solution {
    public int[] solution(int[] prices) {
        //0 쭉 돈다 끝까지
        //첨 값보다 높으면 카운트증가 떨어지면끝
        // 
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++)
        {
            int cnt = 0;
            int price = prices[i];
            for(int j=i+1; j<prices.length; j++)
            {
                cnt++;
                if(prices[j]<price)
                {
                    break;
                }
            }
            answer[i]=cnt;
        }
        
        return answer;
    }
}