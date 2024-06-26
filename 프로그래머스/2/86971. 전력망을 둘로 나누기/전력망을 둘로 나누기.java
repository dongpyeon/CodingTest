import java.util.*;
 
class Solution {
    static int n;
    static int[][] wires;
    
    static ArrayList<Integer>[] A;   // 인접 리스트
    static boolean[] visited;        // 방문 배열
    static int min = Integer.MAX_VALUE;    // 트리의 최소 크기
    
    public int solution(int n, int[][] wires) { // 송전탑 개수, 전선정보
        this.n = n;
        this.wires = wires;
        
        A = new ArrayList[n + 1];
        for(int i = 1 ; i <= n ; i++) A[i] = new ArrayList<>();
        
        // 양방향 간선
        for(int i = 0 ; i < wires.length ; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            A[a].add(b);
            A[b].add(a);
        }
        
        // 모든 간선에 대해 한 번씩 끊어봄 (완전탐색)
        for(int i = 0 ; i < wires.length ; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            
            visited = new boolean[n + 1];    // 반복문 돌 때마다 매번 새롭게 선언해줘야 함
            
            // 1. 해당 간선을 그래프에서 제거
            A[a].remove(Integer.valueOf(b));
            A[b].remove(Integer.valueOf(a));
            
            int cnt = dfs(1);   // 2. 임의의 시작점에서 dfs 탐색하며 각 그룹의 노드 개수 계산
            
            int diff = Math.abs(cnt - (n - cnt));   // 3. |송전탑 개수 차이| 계산
            min = Math.min(min, diff);              // 4. 최솟값 갱신
            
            // 5. 그래프에 다시 간선 추가
            A[a].add(b);
            A[b].add(a);
        }
        
        return min;
    }
    
    static int dfs(int v) {
        visited[v] = true;
        int cnt = 1;    // 노드 세는 변수 초기화
        
        for(int next : A[v]) {
            if(!visited[next]) {    // 방문하지 않은 인접 노드 방문하며 cnt 업데이트
                cnt += dfs(next);
            }
        }
        
        return cnt;
        
    }
}
