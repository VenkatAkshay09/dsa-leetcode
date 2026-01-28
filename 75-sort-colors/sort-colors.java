class Solution {
    public void sortColors(int[] nums) {
        int l=0, m=0;
        int r=nums.length-1;
        while(m<=r){
            if(nums[m]==2){
                int x= nums[r];
                nums[r]=nums[m];
                nums[m]=x;
                r--;
            }
            else if(nums[m]==0){
                int x = nums[l];
                nums[l] = nums[m];
                nums[m]=x;
                l++;
                m++;
            }
            else m++;
        }
    }
}