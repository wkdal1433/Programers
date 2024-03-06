class Solution {
    public int solution(int n) {
        int b = 1;
        int answer = 0;

        while(b!=n+1){
            if(n%b==0){
                answer = answer+b;
            }
            b++;
        }
        
        return answer;
    }
}