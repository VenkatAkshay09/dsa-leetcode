class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int sol = 0;
        int maxDiff = Integer.MAX_VALUE;
        int len = nums.length;
        for(int i=0; i<len-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            for(int r=len-1; r<len && l<r; ){
                sum = nums[i]+nums[l]+nums[r];
                if(sum==target)
                    return sum;
                else if(sum<target){
                    int diff = Math.abs(target-sum);
                    if(diff<maxDiff){
                        maxDiff = diff;
                        sol = sum;
                        l++;
                    }
                    else
                        l++;
                }
                else{
                    int diff = Math.abs(target-sum);
                    if(diff<maxDiff){
                        maxDiff = diff;
                        sol = sum;
                        r--;
                    }
                    else
                        r--;
                }
            }
        }
        return sol;
        
    }
}