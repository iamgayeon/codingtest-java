import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty()){
                int j = stack.peek();
                if(prices[j] > prices[i]){
                    answer[j] = i - j;
                    stack.pop();
                } else
                    break;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int i = stack.pop();
            answer[i] = prices.length - i - 1;
            
        }
        return answer;
    }
}