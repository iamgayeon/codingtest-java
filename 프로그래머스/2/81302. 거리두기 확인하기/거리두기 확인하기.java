import java.util.*;

class Solution {
    // 주어진 장소들에 대해 거리두기 규칙을 확인하는 메서드
    public int[] solution(String[][] places) {
        int[] result = new int[5]; // 각 장소의 거리두기 규칙 준수 여부를 저장할 배열
        for (int i = 0; i < 5; i++) {
            result[i] = checkPlace(places[i]); // 각 장소에 대해 거리두기 규칙 확인
        }
        return result; // 결과 배열 반환
    }
    
    // 주어진 장소에서 거리두기 규칙을 확인하는 메서드
    private int checkPlace(String[] place) {
        int n = 5; // 격자의 크기
        char[][] grid = new char[n][n]; // 2차원 문자 배열로 격자를 표현

        // 입력 문자열 배열을 2차원 문자 배열로 변환
        for (int i = 0; i < n; i++) {
            grid[i] = place[i].toCharArray();
        }

        // 각 사람 'P'에 대해 BFS를 사용하여 거리두기 규칙을 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'P') { // 현재 위치에 사람이 있는 경우
                    if (!bfs(grid, i, j)) { // BFS를 사용하여 거리두기 규칙 검토
                        return 0; // 거리두기 규칙을 위반한 경우
                    }
                }
            }
        }
        return 1; // 모든 규칙을 준수한 경우
    }

    // BFS를 사용하여 거리두기 규칙을 확인하는 메서드
    private boolean bfs(char[][] grid, int startX, int startY) {
        int[] dx = {1, -1, 0, 0}; // 상하좌우 이동을 위한 x 좌표 변화
        int[] dy = {0, 0, 1, -1}; // 상하좌우 이동을 위한 y 좌표 변화
        Queue<int[]> queue = new LinkedList<>(); // BFS를 위한 큐
        boolean[][] visited = new boolean[5][5]; // 방문 여부를 저장하는 배열
        queue.add(new int[]{startX, startY, 0}); // 큐에 시작 위치와 거리 0을 추가
        visited[startX][startY] = true; // 시작 위치 방문 처리

        while (!queue.isEmpty()) { // 큐가 비어있지 않으면 계속 탐색
            int[] cur = queue.poll(); // 큐에서 현재 위치와 거리를 꺼냄
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (dist > 2) continue; // 거리가 2를 초과하면 탐색 중지

            for (int i = 0; i < 4; i++) { // 상하좌우 탐색
                int nr = x + dx[i]; // 새로운 x 좌표
                int nc = y + dy[i]; // 새로운 y 좌표

                // 새로운 위치가 격자 내에 있는지 확인
                if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5) {
                    if (grid[nr][nc] == 'P' && dist + 1 <= 2) {
                        return false; // 2칸 이내 거리에서 또 다른 'P'를 발견한 경우
                    }
                    if (grid[nr][nc] == 'O' && !visited[nr][nc]) {
                        visited[nr][nc] = true; // 새로운 위치 방문 처리
                        queue.add(new int[]{nr, nc, dist + 1}); // 큐에 새로운 위치와 거리 추가
                    }
                }
            }
        }
        return true; // 모든 거리두기 규칙을 준수한 경우
    }
}
