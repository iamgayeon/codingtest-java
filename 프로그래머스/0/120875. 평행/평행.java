class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        double x1 = lines[0][0], y1 = lines[0][1];
        double x2 = lines[1][0], y2 = lines[1][1];
        double x3 = lines[2][0], y3 = lines[2][1];
        double x4 = lines[3][0], y4 = lines[3][1];
        
        if((y1-y2)/(x1-x2)==(y3-y4)/(x3-x4)){
            answer= 1;
        }
        else if((y1-y3)/(x1-x3)==(y2-y4)/(x2-x4)){
            answer=1;
        }
        else if((y1-y4)/(x1-x4)==(y2-y3)/(x2-x3)){
            answer=1;
        }
        // else if(x1==x2 && x3==x4){
        //     answer=1;
        // }
        // else if(x1==x3 && x2==x4){
        //     answer=1;
        // }
        // else if(y1==y2 && y3==y4){
        //     answer=1;
        // }
        // else if(y1=y3 && y2=y4){
        //     answer=1;
        // }
        else {
            answer=0;
        }
        return answer;
    }
}