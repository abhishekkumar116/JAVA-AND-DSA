package ArrayLeetcode;

public class suffleArray {
    int[] arr;
    int[] orignal;
    public Solution(int[] nums) {
        arr = nums;
        orignal = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            orignal[i] = nums[i];
        }
    }

    public int[] reset() {
        return orignal;
    }

    public int[] shuffle() {
        int r1 = 0;
        int r2 = 0;
        while(r1 == r2)
        {
            r1 = (int)(Math.random()*(arr.length));
            r2 = (int)(Math.random()*(arr.length));

        }

        int temp = arr[r1];
        arr[r1] = arr[r2];
        arr[r2] = temp;
        return arr;
    }
}
