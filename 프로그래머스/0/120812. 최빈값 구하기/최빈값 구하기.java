// // array	            result
// // [1, 2, 3, 3, 3, 4]   3
// import java.util.*;

// class Solution {
//     public int solution(int[] array) {
//         Arrays.sort(array);
//         int count = 0;
//         int precount = 0;
//         int answer = 0;
//         if(array.length == 1){
//             return array[0];
//         }
//         for(int i=0; i<array.length-1; i++){
//             if(array[i] == array[i+1]){
//                 answer = array[i+1];
//                 count +=1;
//             } else{
//                 answer = array[i];
//                 precount = count;
//                 count = 0;
//             }
//         }
//         if(count == precount){
//             answer = -1;
//         }
        
//         return answer;
//     }
// }

import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int count = 1;
        int maxcount = 1;
        int answer = array[0];
        boolean iscount = false;
        
        for(int i=1; i<array.length; i++){
            if(array[i] == array[i-1]){
                count ++;
            }else{
                count =1;
            }
            if(count > maxcount){
                maxcount = count;
                answer = array[i];
                iscount = false;
                
            }else if(count == maxcount){
                iscount = true;
            }
        }
        return iscount ? -1 : answer;
        }
}
        


