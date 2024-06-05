class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int a =0;
        int index = 0;
        
        for(int i=0;i<numlist.length;i++){
            if(numlist[i] % n == 0){
                a+=1;
            }
        }
        int[] answer = new int[a];
         for(int i=0;i<numlist.length;i++){
            if(numlist[i] % n == 0){
                answer[index] = numlist[i];
                index +=1;
            }
         }
        return answer;
    }
}