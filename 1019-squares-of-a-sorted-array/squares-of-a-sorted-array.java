class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0, r=0;
        boolean found = false;
        int[] res = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                l=i-1;
                r=i;
                found=true;
                break;
            }
        }
        if(!found){
            l = nums.length - 1;
            r = nums.length;
        }
        for(int k=0;k<nums.length;k++) nums[k]*=nums[k];
        while(l>=0 && r<nums.length){
            if(nums[l]<nums[r]){
                res[j]=nums[l];
                j++;
                l--;
            }
            else{
                res[j]=nums[r];
                j++;
                r++;
            }
        }
        while(l>=0){
            res[j] = nums[l];
            l--;
            j++;
        }
        while(r<nums.length){
            res[j]= nums[r];
            r++;
            j++;
        }
        return res;
    }
}