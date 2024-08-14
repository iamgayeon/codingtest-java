import java.util.*;
class Solution {
    // 전체 방들의 자리 배치에 대한 결과를 담아 반환하는 메서드
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];  // 각 방의 결과를 저장할 배열
        for (int i = 0; i < answer.length; i++)   // 각 방을 순회
            // 각 방이 거리두기 규칙을 지키는지 검사
            if (check(places[i])) 
                answer[i] = 1;  // 규칙을 지키면 1을 저장
            else
                answer[i] = 0; // 규칙을 지키지 않으면 0을 저장
        
        return answer;  // 모든 방의 검사 결과를 반환
    }
    
    // 주어진 방의 자리 배치가 거리두기 규칙을 지키는지 검사하는 메서드
    // 모든 사람이 거리두기를 잘 하고 있는지 체크하는 함수
    // 모두 다 잘 지키고 있으면 return true
    // 한 명이라도 잘 안 지키면 return false
    boolean check(String[] place) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                // 현재 위치가 'P' (사람)일 경우
                if (place[r].charAt(c) == 'P') {
                    // BFS를 사용하여 거리두기 규칙을 검사
                    // 거리 2이하에 사람(P)가 없으면 true 반환하고, 있으면 false를 반환하는 함수
                    if (!bfs(r, c, place)) 
                        return false;  // 규칙을 지키지 않으면 false 반환
                }
            }
        }
        return true;  // 모든 검사에서 규칙을 지키면 true 반환
    }
    
    // BFS를 사용하여 주어진 위치에서 거리두기 규칙을 검사하는 메서드
    boolean bfs(int startRow, int startCol, String[] place) {
        // 상하좌우 탐색을 위한 이동 방향 배열
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { -1, 0,1,0};
        boolean[][] visited = new boolean[5][5];  // 방문 여부를 기록할 배열
        Queue<int[]> queue = new ArrayDeque<>();  // BFS를 위한 큐
        queue.add(new int[]{ startRow, startCol, 0 });  // 시작 위치와 거리 0을 큐에 추가
        visited[startRow][startCol] = true;  // 시작 위치를 방문 처리
        
    while(!queue.isEmpty()){
        // 방문
        int[] cur = queue.remove();
        int r = cur[0];
        int c = cur[1];
        int dist = cur[2];
        
        // 예약(거리가 2 이상이면 예약 안 함)
        if (dist >=2) continue;
        
        for(int i=0; i < 4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr>=0 && nr < 5 && nc>=0 && nc < 5 && place[nr].charAt(nc)!='X'){
                if(!visited[nr][nc]){
                    if(place[nr].charAt(nc) == 'P'){
                        return false;
                    }
                    queue.add(new int[]{nr, nc, dist+1});
                    visited[nr][nc] = true;
                    
                }
            }
        }
        
    }
        
        return true;
    }
}