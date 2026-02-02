class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int count =0;
        int prod = 1;
        int low=0;
        for(int high=0;high<nums.length;high++){
            prod *= nums[high];
            while(prod >= k && low<=high){
                prod /= nums[low];
                low++;
            }
            count += high - low + 1;
        }
        return count;
    }

}