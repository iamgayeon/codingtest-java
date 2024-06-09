class Solution {
    public int solution(String dartResult) {
        int sum = 0;
        int[] scores = new int[3];
        int index = -1;
        
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            // 숫자일 경우
            if(Character.isDigit(c)) {
                index += 1;
                if(c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    scores[index] = 10;
                    i++; // '0'을 건너뛰기 위해 인덱스 증가
                } else {
                    scores[index] = c - '0';
                }
            } 

            else if(c == 'S') {
                
            } else if(c == 'D') {
                scores[index] = scores[index] * scores[index];
            } else if(c == 'T') {
                scores[index] = scores[index] * scores[index] * scores[index];
            } 
            else if (c == '*') {
                if(index > 0) {
                    scores[index - 1] *= 2;
                }
                scores[index] *= 2;
            } else if(c == '#') {
                scores[index] *= -1;
            }
        }
        
        for(int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        
        return sum;
    }
}
