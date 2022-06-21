package gameTheory;

public class nimGame {
    public boolean nimGame(int n){
        if (n < 4){
            return true;
        }
        if (n % 4 == 1 || n % 4 == 2 || n % 4 == 3){
            return true;
        }else {
            return false;
        }
    }
}
