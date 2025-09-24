class Solution {
    public int solution(int[] numbers) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0; i<numbers.length; i++){
            a = (a<numbers[i])? numbers[i]:a;
        }
        for(int i=0; i<numbers.length; i++){
            b = (b<numbers[i]&&numbers[i]<a)? numbers[i]:b;
            if(numbers[i]==a) c++;
            
        }
        b = c>1 ? a:b;
        
        return a*b;
    }
}