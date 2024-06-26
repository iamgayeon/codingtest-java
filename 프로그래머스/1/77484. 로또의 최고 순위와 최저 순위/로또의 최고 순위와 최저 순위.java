// lottos	                win_nums	                result
// [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	    [3, 5]
// [0, 0, 1, 25, 44, 31]    [1, 6, 10, 10, 31, 45]
// [0, 0, 0, 0, 0, 0]	    [38, 19, 20, 40, 15, 25]	[1, 6]
// [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	    [1, 1]


import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int lcount = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i=0;i<lottos.length;i++){
            if(lottos[i] == 0){
                    lcount+=1; 
                }
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i] == win_nums[j]){
                    count +=1;
                    break;
                }
                
            }
        }
        if(count + lcount == 6){
            answer[0] = 1;
        }else if(count + lcount == 5){
            answer[0] = 2;
        }else if (count + lcount == 4){
            answer[0] = 3;
        }else if (count + lcount == 3){
            answer[0] = 4;
        }else if (count + lcount == 2){
            answer[0] = 5;
        }else{
            answer[0] = 6;
        }
        answer[1] = 7 - count;
        if(answer[1] == 7){
            answer[1] = 6;
        }
        
        return answer;
    }
}