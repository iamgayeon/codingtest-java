import java.util.*;

class Solution {
    public int solution(String dirs) {
        // 시작 위치
        int x = 0;
        int y = 0;

        // 방문한 경로를 저장할 Set
        Set<String> visited = new HashSet<>();

        // 이동 명령 처리
        for (char dir : dirs.toCharArray()) {
            // 현재 위치를 기준으로 다음 위치 계산
            int newX = x;
            int newY = y;

            // 방향에 따라 좌표 업데이트
            switch (dir) {
                case 'U': // 위
                    newY++;
                    break;
                case 'D': // 아래
                    newY--;
                    break;
                case 'L': // 왼쪽
                    newX--;
                    break;
                case 'R': // 오른쪽
                    newX++;
                    break;
            }

            // 경계를 넘어가는 경우 무시
            if (newX < -5 || newX > 5 || newY < -5 || newY > 5) {
                continue;
            }

            // 방문한 경로를 문자열로 저장 (양방향 저장)
            String path1 = x + "," + y + " " + newX + "," + newY;
            String path2 = newX + "," + newY + " " + x + "," + y;
            visited.add(path1);
            visited.add(path2);

            // 현재 위치 갱신
            x = newX;
            y = newY;
        }

        // 방문한 경로의 개수 반환
        return visited.size() / 2; // 각 경로가 양방향으로 저장되므로 2로 나눔
    }
}
