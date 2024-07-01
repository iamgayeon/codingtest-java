import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 100;
        int index = -1;
        int[] a1 = new int[array.length];
        for(int i=0; i<array.length; i++){
            if(Math.abs(array[i] - n) < answer){
                answer = Math.abs(array[i] - n);
                index = i;
            }else if(Math.abs(array[i] - n) == answer){
                if(array[index] > array[i]){
                    index = i;
                }
            }
        }
        answer  = array[index];
        return answer;
        
    }
}