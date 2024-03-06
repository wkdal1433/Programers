class Solution {
    public int solution(int n) {
        int a = n-1;
        int b = 3;
        if(a%2 ==0){
            return 2;
        }else{
            while(a%b!=0){
                b=b+2;
            } 
            return b;
        }
    }
}