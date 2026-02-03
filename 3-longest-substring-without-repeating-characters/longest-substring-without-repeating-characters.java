class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> res = new HashMap<>();
        int count = Integer.MIN_VALUE;
        int low=0;
        for(int high=0;high<s.length();high++){
            if(!res.containsKey(s.charAt(high)))
                res.put(s.charAt(high),high);
            else{
                    count = Math.max(count,high-low);
                    low = Math.max(low, res.get(s.charAt(high)) + 1);
                    res.put(s.charAt(high),high);
                } 
        }
        count = Math.max(count, s.length() - low);
        
        return count;
        
    }
}