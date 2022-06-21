package lists;

public class pair<X, Y> {
    X x;
    Y y;

    public pair(X x, Y y){
        this.x = x;
        this.y = y;
    }
    public void getDescription(){
        System.out.println(x + " and "+y);
    }
}
