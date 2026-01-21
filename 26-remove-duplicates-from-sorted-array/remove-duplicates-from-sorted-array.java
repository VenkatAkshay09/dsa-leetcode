class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
		int len = nums.length;	
        while (j<len) {
            if (nums[i] == nums[j])
                j++;
            else{
		            nums[i+1]=nums[j];
		            j++;
		            i++;
            }    
        }
        return i+1;
    }
}