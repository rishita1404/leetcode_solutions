class Solution {
    public int findMaxLength(int[] nums) {
        int[] prefixSum=new int[nums.length];
        int balance=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                prefixSum[i]=balance-1;
                balance--;
            }
            else{
                prefixSum[i]=balance+1;
                balance++;
            }
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,-1);
        int res=0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(prefixSum[i])){
                int j=map.get(prefixSum[i]);
                res=Math.max(res, i-j);
            }
            else{
                map.put(prefixSum[i], i);
            }
        }
        return res;
    }
}