class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);      
    }
    private int atMost(int[] nums, int k){
        if(k==0) return 0;
        int count=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        int j=0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            while(map.size()>k){
                map.put(nums[j], map.get(nums[j])-1);
                if(map.get(nums[j])==0){
                    map.remove(nums[j]);
                }
                j++;
            }
            count+=i-j+1;
        }
        return count;
    }
}