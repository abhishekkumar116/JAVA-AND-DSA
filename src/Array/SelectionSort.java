package Array;

public class SelectionSort {
    public static void main(String[] args) {

        int a[] = {6,9,2,3,20,78,-2,-3};
        int n = a.length;

        for (int i = 0; i<n-1; i++){

            int minValue = i;
            for (int j = i; j<n; j++){
                if (a[j]<a[minValue]){
                    minValue = j;
                }
            }
            int temp = a[i];
            a[i] = a[minValue];
            a[minValue] = temp;
        }
        for (int e: a){
            System.out.print(e+ " ");
        }
    }
}
