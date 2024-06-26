import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        // 점을 x, y 좌표로 분리
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];
        
        // 두 점 사이의 기울기 비교 (정수 나눗셈 대신 분수로 비교)
        if ((y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1)) {
            answer = 1;
        } else if ((y3 - y1) * (x4 - x2) == (y4 - y2) * (x3 - x1)) {
            answer = 1;
        } else if ((y4 - y1) * (x3 - x2) == (y3 - y2) * (x4 - x1)) {
            answer = 1;
        }
        
        return answer;
    }
}
