// class Solution {
//     public int maxProduct(int[] nums) {
//         int n = nums.length; //size of array.

//         int pre = 1, suff = 1;
//         int ans = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             if (pre == 0) pre = 1;
//             if (suff == 0) suff = 1;
//             pre *= nums[i];
//             suff *= nums[n - i - 1];
//             ans = Math.max(ans, Math.max(pre, suff));
//         }
//         return ans;
//     }
// }


class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // Save before changing currentMax
            int previousMax = currentMax;

            currentMax = Math.max(
                num,
                Math.max(num * currentMax, num * currentMin)
            );

            currentMin = Math.min(
                num,
                Math.min(num * previousMax, num * currentMin)
            );


            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}