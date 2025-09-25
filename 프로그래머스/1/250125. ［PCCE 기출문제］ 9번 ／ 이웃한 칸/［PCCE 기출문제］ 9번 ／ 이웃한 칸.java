class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String b = board[h][w];
        
        if(h+1<board.length&&b.equals(board[h+1][w])){answer ++;}
        if(w+1<board.length&&b.equals(board[h][w+1])){answer ++;}
        if(0<=h-1&&b.equals(board[h-1][w])){answer ++;}
        if(0<=w-1&&b.equals(board[h][w-1])){answer ++;}    
        return answer;
    }
}