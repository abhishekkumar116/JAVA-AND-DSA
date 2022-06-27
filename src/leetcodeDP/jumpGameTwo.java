package leetcodeDP;

public class jumpGameTwo {
        public int jump(int[] nums) {
            int jump = 0;
            int des = 0;
            int pos = 0;

            for(int i = 0; i < nums.length - 1; i++){

                des = Math.max(des, nums[i] + i);

                if(pos == i){
                    pos = des;
                    jump++;
                }
            }
            return jump;
//         int n = arr.length;
//         int[] dp = new int[n];
//         dp[n - 1] = 0;

//         for(int i = n - 2; i >= 0; i--){
//                 int min = Integer.MAX_VALUE;
//                 for(int j = 1; j <= arr[i] && i + j < n; j++){
//                     if(dp[i + j] != 0){
//                         min = Math.min(min, dp[i + j]);
//                     }
//                 }
//                 if(min != Integer.MAX_VALUE){
//                     dp[i] = min + 1;
//                 }else{
//                     dp[i] = min;
//                 }
//             }
//         }
//         return dp[0];

        }
    }
// public int jump(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n]; // Tabulation technique
//         dp[n-1] = 0;      // last index --> no jump;

//         /*storing minimum no of moves at each index of my dp array to reach nth index
//         each index of nums[] mention max steps to jump. You are always making jump */
//         for(int i = n - 2; i >= 0; i--){
//             int min = Integer.MAX_VALUE; // reset min

//             // iterate on ith value of nums arr, and i+j < n saves for arrayIdxoutofbond exp in dp arr. i.e you are always looking for elements inside dp[]
//             for(int j = 1; j <= nums[i] && i+j < n; j++){
//                 // very crutial check for test case [2,3,0,1,4]
//                 if(dp[i+j] == 0 && i+j != n-1) continue;
//                 min = Math.min(1 + dp[i+j], min);
//                 dp[i] = min;

//             }
//         }

