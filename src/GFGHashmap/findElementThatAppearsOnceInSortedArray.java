package GFGHashmap;

public class findElementThatAppearsOnceInSortedArray {
    public int findElement(int[] arr, int n){
        int x = 0;
        for (int i = 0; i < arr.length; i++){
            x = x^arr[i];
        }
        return x;
    }
}
