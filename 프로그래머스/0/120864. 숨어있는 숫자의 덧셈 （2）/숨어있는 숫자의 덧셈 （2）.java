class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] alp = my_string.split("[^0-9]+");  // 정규 표현식을 사용하여 숫자가 아닌 문자들을 기준으로 문자열을 분할
        for(int i=0; i<alp.length; i++){
            if(!alp[i].isEmpty()){  // 빈 문자열이 아닌 경우
                answer += Integer.parseInt(alp[i]);  // 문자열을 정수로 변환하여 합산
            }
        }
        return answer;
    }
}