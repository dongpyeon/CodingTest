import java.util.*;

// Solution 클래스 정의
class Solution {
    // 맵의 크기를 저장할 변수 n과 m
    public static int n, m;
    // 최종 답을 저장할 변수 answer (초기값 -1)
    public static int answer = -1;
    
    // 상하좌우 이동을 위한 배열
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    // 방문 여부를 체크하기 위한 배열
    public static boolean visited[][];
    
    // 주어진 맵을 입력받아 최단 경로를 찾는 함수
    public int solution(int[][] maps) {
        n = maps.length; // 맵의 행 크기
        m = maps[0].length; // 맵의 열 크기
        visited = new boolean[n][m]; // 방문 여부를 저장할 배열 초기화
    
        return bfs(0, 0, maps); // BFS 함수 호출
    }
    
    // BFS를 사용하여 최단 경로를 찾는 함수
    public int bfs(int x, int y, int[][] maps){
        Queue<int[]> que = new LinkedList<>(); // 큐 생성
    
        que.add(new int[]{x, y, 1}); // 시작점 (0, 0)과 초기 이동 거리 1을 큐에 추가
        visited[0][0] = true; // 시작점을 방문 처리

        while (!que.isEmpty()) { // 큐가 비어있지 않을 때까지 반복
            int temp[] = que.poll(); // 큐에서 꺼내기
            x = temp[0];
            y = temp[1];
            int count = temp[2]; // 현재까지의 이동 거리
            
            // 도착점에 도달한 경우
            if (x == n-1 && y == m-1) {
                answer = count; // 이동 거리를 answer에 저장
                break;
            }

            // 상하좌우로 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 맵의 경계를 벗어난 경우 무시
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                // 벽인 경우 무시
                if(maps[nx][ny] == 0) continue;
                // 방문하지 않았고 이동할 수 있는 길인 경우
                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true; // 방문 처리
                    que.add(new int[]{nx, ny, count+1}); // 큐에 추가
                }
            }
        }

        return answer; // 최종 답 반환
    }
}
