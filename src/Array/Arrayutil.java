package Array;

public class Arrayutil {
    public static void main(String[] args) {
        Arrayutil arrutil = new Arrayutil();
        arrutil.arrayDemo();
    }
    public void arrayDemo(){
        int[] myArray = new int[5];  //default value
        // printArray(myArray);
        myArray[0] = 3;
        myArray[1] = 5;
        myArray[2] = 6;
        myArray[3] = 10;
        myArray[4] = 13;
        myArray[2] = 33;

        printArray(myArray);
    }
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
