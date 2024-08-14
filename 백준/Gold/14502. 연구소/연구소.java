import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N; // 행의 개수 (세로 길이)
    static int M; // 열의 개수 (가로 길이)
    static int[][] board; // 연구소 지도
    static int zeroCount = 0; // 처음 연구소에서 0의 개수
    static int maxSafeArea = 0; // 최대 안전 영역의 크기

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        
        // 연구소 지도 입력 및 0의 개수 계산
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 0) {
                    zeroCount++;
                }
            }
        }
        
        // 벽을 3개 세우는 모든 경우의 수를 탐색
        placeWalls(0, 0);
        System.out.println(maxSafeArea);
        br.close();
    }

    // 벽을 3개 세우는 함수
    public static void placeWalls(int count, int index) {
        if (count == 3) {
            // 바이러스 퍼지기 전의 안전 영역 계산
            maxSafeArea = Math.max(maxSafeArea, calculateSafeArea());
            return;
        }
        
        for (int i = index; i < N * M; i++) {
            int x = i / M;
            int y = i % M;
            if (board[x][y] == 0) {
                board[x][y] = 1; // 벽 세우기
                placeWalls(count + 1, i + 1);
                board[x][y] = 0; // 벽 제거
            }
        }
    }

    // 바이러스가 퍼진 후의 안전 영역을 계산
    public static int calculateSafeArea() {
        int safeArea = zeroCount - 3; // 벽 3개를 세웠으므로 3을 빼줌
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();
        
        // 초기 바이러스 위치 큐에 추가
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        
        // BFS 수행
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && board[nx][ny] == 0) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    safeArea--; // 바이러스가 퍼지면 안전 영역이 줄어듦
                }
            }
        }
        
        return safeArea;
    }
}
