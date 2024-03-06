import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        int p = 0;
        int l = A.length;

        for(int i =0; i<l;i++){
            p = p+A[i]*B[l-1-i];
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.


        return p;
    }
}