class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int l1= i+1;l1<nums.length-2;l1++){
                if(l1>i+1 && nums[l1]==nums[l1-1]) continue;
                int l2= l1+1;
                int r= nums.length-1;
                while(l2<r){
                    long sum=(long) nums[i]+nums[l1]+nums[l2]+nums[r];
                    if(sum==target){
                        res.add(Arrays.asList(nums[i],nums[l1],nums[l2],nums[r]));
                        l2++;
                        r--;
                        while(l2<r && nums[l2]==nums[l2-1]) l2++;
                        while(l2<r && nums[r]==nums[r+1]) r--;
                    }
                    else if(sum<target) l2++;
                    else r--;

                }
            }
            
            

        }
        return res;
    }
}