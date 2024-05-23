import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int answer=0;
        for(int i = 1; i < n ; i++) {
	for(int j = 0; j < triangle[i].length ; j++) {

		if(j == 0) {//왼쪽 끝
			triangle[i][j] += triangle[i-1][j];
		}
		else if(j == i) {//오른쪽 끝
			triangle[i][j] += triangle[i-1][j-1];
		}
		else {
			triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
		}

		answer = Math.max(answer, triangle[i][j]);
	}
}
return answer;
    }
}
// 답안참조 출처: https://ansdyd23.tistory.com/80 [일어나 코드짜야지:티스토리]