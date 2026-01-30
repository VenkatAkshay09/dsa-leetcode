class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        for (int high = 0; high < n; high++) {
            sum += nums[high];   // expand window

            while (sum >= target) {  // shrink as much as possible
                res = Math.min(res, high - low + 1);
                sum -= nums[low];
                low++;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
