class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int r = nums.length - 1;
            
            while (l < r) {
                int s = nums[i] + nums[l] + nums[r];
            int d = Math.abs(s - target);
                if (s == target)
                    return s;
                else {
                    if (d < diff) {
                        diff = d;
                        sum = s;
                    }
                    if (s < target)
                        l++;
                    else
                        r--;
                }
            }

        }
        return sum;

    }
}