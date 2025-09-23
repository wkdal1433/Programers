class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = "";
        c += a;
        c += b;
        String d = "";
        d +=b;
        d += a;
        a = Integer.parseInt(c);
        b = Integer.parseInt(d);
        if(a>b) answer = a;
        else answer = b;
        
        return answer;
    }
}