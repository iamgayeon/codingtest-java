import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(ch >= '0' && ch <= '9') {
                numbers.add(ch - '0'); // 'char' 값을 'int'로 변환하여 추가
            }
            
        }
        
        // ArrayList를 int 배열로 변환
        int[] answer = new int[numbers.size()];
        for(int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
