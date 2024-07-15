import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Queue<Integer> q = new ArrayDeque<>();
        int count = 0;
        for(int i=0;i <citations.length; i++){
            q.add = i;
        }
        q.push = count;
        for(int i=0;i <citations.length; i++){
            if(q.peek(i) > count){
                answer +=1;
            }
        }
        return answer;
    }
}