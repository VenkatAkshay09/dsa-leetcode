class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum= 0;
        int count = Integer.MAX_VALUE;
        int low =0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            // int temp_count=(i-low)+1;
            while(sum>=target){
                int temp_count=(i-low)+1;
                count = Math.min(temp_count, count);
                sum -= nums[low];
                low++;
            }
            
        }
        return count== Integer.MAX_VALUE ? 0 : count;
        
    }
}