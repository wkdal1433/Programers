class Solution {
    public int solution(int n) {
        int answer = 0;
        int loop = n/2;
        if(n%2==0){
            //짝수
            while(loop>0){
                answer += loop*loop*4;
                
                --loop;
            }
        }else{
            //홀수
            while(loop>=0){
                answer += loop*2+1;
                
                --loop;
            }
        }
        
        return answer;
    }
}