class Solution {
    public int maxProduct(int[] nums) {
        int min=1;
        int max=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int newmax=Math.max(nums[i], Math.max(nums[i]*max, nums[i]*min));
            int newmin=Math.min(nums[i], Math.min(nums[i]*max, nums[i]*min));
            max=newmax;
            min=newmin;
            ans=Math.max(ans, max);
        }
        return ans;
    }
}