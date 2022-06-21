package GFGRecursion;

public class towerOfHanoi {
    public long toh(int n, int from, int to, int aux){
        long moves = 0;
        if (n == 1){
            System.out.println("move disk " + n + "from rod " + from + " to rod " + to);
            return 1;
        }
        moves += toh(n - 1, from, aux, to);
        System.out.println("move disk " + n + "from rod " + from + " to rod " + to);
        moves += toh(n - 1, aux, to, from);
        return moves;
    }
}
