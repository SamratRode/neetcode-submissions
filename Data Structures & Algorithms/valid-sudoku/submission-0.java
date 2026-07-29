class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check standing lines
        for(int i=0;i<9;i++){
            HashSet<Character> hs=new HashSet<>();
            for(int j=0;j<9;j++){
                char ch=board[j][i];
                if(Character.isDigit(ch) && !hs.contains(ch)){
                    hs.add(ch);
                }
                else if(hs.contains(ch)){
                    return false;
                }

            }
        }
        
        //check sleeping lines 
        for(int i=0;i<9;i++){
            HashSet<Character> hs=new HashSet<>();
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(Character.isDigit(ch) && !hs.contains(ch)){
                    hs.add(ch);
                }
                else if(hs.contains(ch)){
                    return false;
                }

            }
        }

        //check boxes
        for(int i=0;i<9;i=i+3){
            for(int j=0;j<9;j=j+3){
                HashSet<Character> hs=new HashSet<>();
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        char ch=board[k][l];
                        if(Character.isDigit(ch) && !hs.contains(ch)){
                            hs.add(ch);
                        }
                        else if(hs.contains(ch)){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
