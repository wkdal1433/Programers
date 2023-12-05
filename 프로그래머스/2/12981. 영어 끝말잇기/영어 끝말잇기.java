import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int answerA = 0;
        int answerB = 0;
        int answerA2 = 0;
        int answerB2 = 0;
        int answerNum = 0;
        int answerNum2 = 0;
        List<int[]> answerlist = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(i==words.length-1) break;
            if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0)){
                answerNum = i+2;
                break;
            }
            if(answerNum!=0) break;
        }

        for(int i=words.length-1; 1<=i; i--){
            for(int j=i-1; 0<=j;j--){
                if(words[i].equals(words[j])) {
                    answerNum2 = i+1;
                }
            }
//            if(answerNum2!=0) break;
        }

        if(answerNum==0&&answerNum2==0){return answer;}
        else{
            if(answerNum%n==0){
                answerA = n;
                answerB = answerNum/n;
            }else{
                answerA = answerNum%n;
                answerB = 1+answerNum/n;
            }
            if(answerNum2%n==0){
                answerA2 = n;
                answerB2 = answerNum2/n;
            }else{
                answerA2 = answerNum2%n;
                answerB2 = 1+answerNum2/n;
            }
            if(answerNum ==0){
                int[]result = {answerA2,answerB2};
                return result;
            }
            if(answerNum2==0){
                int[]result = {answerA,answerB};
                return result;
            }
            if(answerB==answerB2){
                if(answerA>answerA2){
                    int[]result = {answerA2,answerB2};
                    return result;
                }else{
                    int[]result = {answerA,answerB};
                    return result;
                }
            }else{
                if(answerB>answerB2){
                    int[]result = {answerA2,answerB2};
                    return result;
                }else{
                    int[]result = {answerA,answerB};
                    return result;
                }
            }
        }

    }
}