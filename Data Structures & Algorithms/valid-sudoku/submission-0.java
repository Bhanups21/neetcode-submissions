class Solution {
    public static boolean isValidRow(char[] row){
        // System.out.println(Arrays.toString(row));
        Map<Character,Boolean> map=new HashMap<Character,Boolean>();
        for(int i=0;i<9;i++){
            if(row[i]=='.'){
                continue;
            }
            else{
                if(map.getOrDefault(row[i],false)==false){
                    map.put(row[i],true);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValidColumn(char[][] board){
        Map<Character,Boolean> map=new HashMap<Character,Boolean>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                // System.out.print(board[j][i]);
                if(board[j][i]=='.'){
                    continue;
                }
                else{
                    if(map.getOrDefault(board[j][i],false)==false){
                        map.put(board[j][i],true);
                    }
                    else{
                        return false;
                    }
                }
            }
            // System.out.println();
            map=new HashMap<>();
        }
        return true;
    }
    public static boolean isValidBlock(char[][] board,int rStart,int rEnd,int cStart,int cEnd){
        Map<Character, Boolean> map=new HashMap<>();
        for(int i=rStart;i<rEnd;i++){
            for(int j=cStart;j<cEnd;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else{
                    if(map.getOrDefault(board[i][j],false)==false){
                        map.put(board[i][j],true);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!isValidRow(board[i])){
                return false;
            }
        }
        if(!isValidColumn(board)){
            return false;
        }
        int rStart=0;
        int rEnd=3;
        int cStart=0;
        int cEnd=3;
        for(int i=0;i<9;i++){
            if(i!=0 && i%3==0){
                rStart+=3;
                rEnd+=3;
            }
            if(!isValidBlock(board,rStart,rEnd,cStart,cEnd)){
                return false;
            }
            cStart+=3;
            cEnd+=3;
            if(cStart>8){
                cStart=0;
                cEnd=3;
            }
        }
        return true;
    }
}
