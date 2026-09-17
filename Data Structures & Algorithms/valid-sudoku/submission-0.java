class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        //col
        for(int j=0;j<n;j++){
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<m;i++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        //box\

        for(int i=0;i<m;i+=3){
            for(int j=0;j<n;j+=3){
                HashSet<Character> set = new HashSet<>();
                for(int a=i; a<i+3;a++){
                    for(int b=j;b<j+3;b++){
                        if(board[a][b] == '.') continue;
                if(set.contains(board[a][b])) return false;
                set.add(board[a][b]);
                    }
                }
            }
        }
        return true;
    }
}
