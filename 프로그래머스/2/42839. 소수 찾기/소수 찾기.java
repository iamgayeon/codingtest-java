import java.util.*;

class Solution {
    Set<Integer> candidates = new HashSet<>();
    public int solution(String numbers) {
        permutation(numbers, 0, new boolean[numbers.length()+1], 0);
        int answer = 0;
        for(int num : candidates){
            if(isPrime(num)) answer++;
        }
        return answer;
    }
    
    void permutation(String numbers, int current, boolean[] visited, int digit){
        if(digit == numbers.length()) return;
        
        for(int i=0; i<numbers.length(); i++){
            if(visited[i]) continue;
            int newvalue = current + (int)((numbers.charAt(i) - '0') * Math.pow(10, digit));
            
            candidates.add(newvalue);
            
            visited[i] = true;
            permutation(numbers, newvalue, visited, digit+1);
            visited[i] = false;
        }
    }
    
    boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i=2; i*i<=n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}