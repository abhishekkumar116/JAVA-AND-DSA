package ArrayLeetcode;
import javax.xml.validation.Validator;
import java.util.*;

public class nQueen {
    public List<List<String>> queen(int n){
        char[][] chess = new char[n][n];
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                chess[i][j] = '.';
            }
        }
        backtrack(result,chess, 0);
        return result;
    }
    public List<String> construct(char[][] chess){
        List<String> list = new ArrayList<>();

        for(int i = 0; i < chess.length; i++){
            list.add(new String(chess[i]));
        }
        return list;
    }
    public boolean isValid(char[][] chess, int row, int col){

        for(int i = 0; i < row; i++){
            if(chess[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public void backtrack(List<List<String>> result, char[][] chess, int row){
        if(row == chess.length){
            result.add(construct(chess));
            return;
        }
        for(int col = 0; col < chess[0].length; col++){
            if(isValid(chess, row, col)){
                chess[row][col] = 'Q';
                backtrack(result, chess, row + 1);
                chess[row][col] = '.';
            }
        }
    }
}
