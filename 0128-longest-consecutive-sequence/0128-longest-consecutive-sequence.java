class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=1;
                while(set.contains(num+curr)){
                    curr++;
                }
                longest=Math.max(longest, curr);
            }
        }
        return longest;
    }
}