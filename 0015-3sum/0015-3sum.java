class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            HashSet<Integer> seen=new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int need=-(nums[i]+nums[j]);
                if(seen.contains(need)){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(need);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}