import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = new int[triangle.length+1][triangle.length];
        
        for(int i = 1; i<triangle.length+1; i++){
            for(int j = 0; j<triangle[i-1].length; j++){
                for(int k = j-1; k<j+1; k++){
                                        
                    if(k < 0) continue;
                    
                    dp[i][j] = Math.max(dp[i][j], triangle[i-1][j] + dp[i-1][k]);
                    
                    answer = Math.max(dp[i][j], answer);
                }
            }
        }
        
        return answer;
    }
}
// 답안참조 출처: https://ansdyd23.tistory.com/80 [일어나 코드짜야지:티스토리]