// chicken      result      
// 100	        11     -> 100 / 10 -> 10
// 1,081	    120    -> 1081/10 -> 108/10 -> 10/10 -> 1
//                     -> 108     -> 10     -> 1                              

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while(coupon >= 10) {
            answer += coupon / 10;
            coupon = coupon /10 + coupon % 10;
        }
        return answer;
    }
}