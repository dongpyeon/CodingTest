class Solution {
    static boolean[] visited;
    static int answer = 0; 
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        DFS(0,k,dungeons);
        return answer;
    }
    public static void DFS(int depth, int k, int[][] dungeons)
    {
        for(int i=0; i<dungeons.length; i++)
        {
            if(visited[i] || k-dungeons[i][0]<0){
                continue;
            }
            
            visited[i] = true;
            DFS(depth+1,k-dungeons[i][1],dungeons);
            visited[i] = false;
        }
        answer = Math.max(answer, depth);
    }
}