class Solution {
    boolean solution(String s) {
        
        int p_count = 0;
        int q_count = 0;

        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'p' || arr[i] == 'P'){
                p_count +=1;
            }else if(arr[i] == 'Y' || arr[i] == 'y'){
                q_count +=1;
            }
        }
        
       
        return p_count == q_count;
    }
}