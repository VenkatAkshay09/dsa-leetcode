class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean broken = false;

        // left → right: find min in broken region
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                broken = true;
            }
            if (broken) {
                min = Math.min(min, nums[i]);
            }
        }

        broken = false;

        // right → left: find max in broken region
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                broken = true;
            }
            if (broken) {
                max = Math.max(max, nums[i]);
            }
        }

        // find correct left boundary
        int left = 0;
        while (left < n && nums[left] <= min) {
            left++;
        }

        // find correct right boundary
        int right = n - 1;
        while (right >= 0 && nums[right] >= max) {
            right--;
        }

        return right > left ? right - left + 1 : 0;
    }
}
