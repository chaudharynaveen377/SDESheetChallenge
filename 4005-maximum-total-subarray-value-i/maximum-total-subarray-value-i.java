class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long ans=0;
        long max=nums[0];
        long min=nums[0];
        for(int val:nums){
            max=Math.max(max,val);
            min=Math.min(min,val);
        }
        return k*(max-min);
    }
}