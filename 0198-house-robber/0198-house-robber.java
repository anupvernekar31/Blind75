// class Solution {
//     public int ans(int ind,int nums[], int dp[]){
//         if(ind == 0)
//             return nums[ind];
//         if(ind<0)
//             return 0;
//         if(dp[ind] !=-1) return dp[ind];
//         int pick = nums[ind] + ans(ind-2, nums, dp);
//         int dontpick = 0+ ans(ind-1, nums, dp);
//         return dp[ind] = Math.max(pick, dontpick);
//     }
//     public int rob(int[] nums) {
//         int dp[] = new int[nums.length];
//         Arrays.fill(dp,-1);
//         return ans(nums.length-1, nums, dp);
        
//     }
// }

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[n - 1];        
    }
}