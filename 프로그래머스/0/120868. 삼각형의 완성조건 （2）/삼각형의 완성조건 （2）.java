import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1];
        int min =sides[0];
        
        int low = max - min;
        int high = max + min;
        
        answer = high - low -1;
        
        return answer;
    }
}