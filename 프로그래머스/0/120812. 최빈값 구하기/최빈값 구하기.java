class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int prev = -1;
        int prevcount = -1;
        int count = -1;
        for(int i=1; i<array.length;i++){
            if(prev!=array[i]){
                if(prevcount < count){
                    prevcount = count;
                    prev = array[i];
                    count ++;
                }
                
            }
        }
        answer = prevcount;
        return answer;
    }
}