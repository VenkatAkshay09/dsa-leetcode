class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int len = nums.length;
        int j=0;
        for(int i=0; i<len; i++){
            if(nums[i]<0){
                nums[i] *= nums[i];
                j++;
            }
            else nums[i] *= nums[i];
        }
        int i= j-1;
        int k=0;
        while(i>=0 && j<len){
            if(nums[i]<nums[j]){
                res[k]=nums[i];
                i--;
                k++;
            }
            else {
                res[k]=nums[j];
                j++;
                k++;
            }

        }
        while(i>=0){
            res[k]=nums[i];
            i--;
            k++;
        }
        while(j<len){
            res[k]=nums[j];
            j++;
            k++;
        }
        return res;
        
    }
}
