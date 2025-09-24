class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        answer = (eq.equals("=")&&n==m)|(ineq.equals(">")&& n>m)|(ineq.equals("<")&& n<m) ?1:0;
        
        return answer;
        
    }
}