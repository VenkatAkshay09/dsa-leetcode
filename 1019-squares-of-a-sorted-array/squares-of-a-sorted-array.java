class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0, j=0, k=0;
        int[] res = new int[nums.length];
        for(int l=0; l<nums.length;l++){
            if(nums[l]<0) i++;
            nums[l] =nums[l] *nums[l];
        }
        j=i;
        while(i>0&&j<nums.length){
            if(nums[i-1]>nums[j]){
                res[k]=nums[j];
                j++;
                k++;
            }
            else{
                res[k] = nums[i-1];
                i--;
                k++;
            }
        }
        while(i>0){
            res[k] = nums[i-1];
            k++;
            i--;
        }
        while(j<nums.length){
            res[k] = nums[j];
            k++;
            j++;
        }
    return res;
        
    }
}