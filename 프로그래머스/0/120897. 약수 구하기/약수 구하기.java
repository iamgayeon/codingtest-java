import java.util.*;
class Solution {
    public int[] solution(int n) {
       
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i ==0){
                count+=1;
            }
        }
         int[] answer = new int[count];
        int j =0;
         for(int i=1;i<=n;i++){
            if(n%i ==0){
                answer[j] = i;
                count+=1;
                j++;
            }
         }
        
        return answer;
    }
}