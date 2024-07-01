import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] b1 = before.toCharArray();
        char[] a1 = after.toCharArray();
        Arrays.sort(b1);
        Arrays.sort(a1);
        for(int i=0;i<b1.length; i++){
            if(b1[i] == a1[i]){
                answer = 1;
            }
            else{
                answer = 0;
                break;
            }
        }
        return answer;
    }
}