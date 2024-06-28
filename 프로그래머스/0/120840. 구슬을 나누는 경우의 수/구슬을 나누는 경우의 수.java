import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = BigInteger.ZERO;
        BigInteger result1 = BigInteger.ONE;
        BigInteger result2 = BigInteger.ONE;
        BigInteger result3 = BigInteger.ONE;
        int num = balls - share;
        
        for (int i = balls; i > 0; i--) {
            result1 = result1.multiply(BigInteger.valueOf(i));
        }
        
        for (int i = num; i > 0; i--) {
            result2 = result2.multiply(BigInteger.valueOf(i));
        }
        
        for (int i = share; i > 0; i--) {
            result3 = result3.multiply(BigInteger.valueOf(i));
        }
        
        answer = result1.divide(result2.multiply(result3));

        // 결과가 int 범위 내에 있는지 확인
        return answer.intValue();
    }
}
