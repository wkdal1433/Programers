class Solution {
    public int solution(int a, int b) {
        int c = Integer.parseInt(a+""+b);
        int d = Integer.parseInt(b+""+a);
        int answer = 0;
        return answer = (c>d)?c:d; 
    }
}