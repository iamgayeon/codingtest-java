import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        HashSet<String> set1 = new HashSet<>();
        
        for(int i=0; i<completion.length; i++){
            if(!completion[i].equals(participant[i])){
                return participant[i];
            }
        }
        
       return participant[participant.length-1];
    }
}