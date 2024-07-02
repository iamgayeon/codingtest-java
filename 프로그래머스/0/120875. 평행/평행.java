// 점 1 2
// 점 3 4
// 1 2 그리고 3 4
// 1 3 그리고 2 4
// 1 4 그리고 2 3


import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int x3 = dots[2][0];
        int x4 = dots[3][0];
        
        int y1 = dots[0][1];
        int y2 = dots[1][1];
        int y3 = dots[2][1];
        int y4 = dots[3][1];
        
        int dot1 = 0;
        int dot2 = 0;
        
// 두 점의 기울기를 비교할 때 정수 나눗셈을 사용하면 안됩니다.
//        대신 부동 소수점 또는 분수를 사용해야 합니다.            
//        dot1 = (y2 - y1) / (x2 - x1);
//        dot2 = (y4 - y3) / (x4 - x3);
        
        if((y4 - y3) * (x2 - x1) == (y2 - y1) * (x4 - x3)){
            return 1;
        }
          
//        dot1 = (y3 - y1) / (x3 - x1);
//        dot2 = (y4 - y2) / (x4 - x2);
        if((y3 - y1) * (x4 - x2) == (y4 - y2) * (x3 - x1)){
            return 1;
        }
        
//        dot1 = (y4 - y1) / (x4 - x1);
//        dot2 = (y3 - y2) / (x3 - x2);
        if((y4 - y1) * (x3 - x2) == (y3 - y2) * (x4 - x1)){
            return 1;
        }
        
        return answer;
    }
} 