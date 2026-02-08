class Solution {
    public int removeDuplicates(int[] nums) {
        int unq=1;
        int l=1;
        int uVal = nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==0) continue;
            else if(nums[i]==uVal) continue;
            else {
                nums[l]=nums[i];
                uVal = nums[i];
                unq++;
                l++;
            }
        }
        return unq;
        
    }
}