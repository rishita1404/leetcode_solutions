class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        for(int num:set1){
            if(set2.contains(num)){
                res.add(num);
            }
        }
        int[] r=new int[res.size()];
        for(int i=0; i<res.size(); i++){
            r[i]=res.get(i);
        }
        return r;
    }
}