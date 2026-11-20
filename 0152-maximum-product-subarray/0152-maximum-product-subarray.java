class Solution {
    public int maxProduct(int[] nums) {
        int max=1;
        int min=1;
        int res=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int newmax=Math.max(nums[i], Math.max(max*nums[i], min*nums[i]));
            int newmin=Math.min(nums[i], Math.min(max*nums[i], min*nums[i]));
            max=newmax;
            min=newmin;
            res=Math.max(res, max);
        }
        return res;
    }
}