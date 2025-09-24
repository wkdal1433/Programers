class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 0;
        int d = 0;
        c = Integer.parseInt(a+""+b);
        d = 2*a*b;
        answer = (c>d) ? c:d;
        
        return answer;
    }
}