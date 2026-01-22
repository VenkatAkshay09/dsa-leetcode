class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resList = new ArrayList<>();
        for (int i = 0; i < nums.length-2 && nums[i] <= 0; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // two pointer way
            int l = i + 1;
            for (int r = nums.length - 1; l < r;) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    resList.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (r > l && nums[r] == nums[r + 1])
                        r--;
                } else if (nums[i] < -1 * (nums[l] + nums[r])) {
                    l++;
                } else
                    r--;
            }

        }
        return resList;
    }
}