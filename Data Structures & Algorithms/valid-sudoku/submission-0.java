class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character> set=new HashSet<>();
                for(int l=i;l<i+3;l++){
                    for(int r=j;r<j+3;r++){
                        if(board[l][r]=='.'){
                            continue;
                        }
                        if(set.contains(board[l][r])){
                            return false;
                        }
                        set.add(board[l][r]);
                    }
                }
            }
        }
        return true;
    }
}
