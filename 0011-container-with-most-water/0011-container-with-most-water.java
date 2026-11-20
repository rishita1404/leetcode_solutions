class Solution {
    public int maxArea(int[] height) {
        int res=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int h=Math.min(height[left], height[right]);
            int w=right-left;
            res=Math.max(res, h*w);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return res;
    }
}