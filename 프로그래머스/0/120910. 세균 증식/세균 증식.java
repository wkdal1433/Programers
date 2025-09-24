class Solution {
    public int solution(int n, int t) {
        int answer = 1;
        while (t>0){
            answer=2*answer;
            t--;
        }
        
        return n*answer;
    }
}