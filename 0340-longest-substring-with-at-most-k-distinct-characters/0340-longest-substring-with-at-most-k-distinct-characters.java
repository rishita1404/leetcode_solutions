class Solution {
    public int kDistinctChar(String s, int k) {
        //your code goes here
        int res=0;
        HashMap<Character, Integer> map=new HashMap<>();
        int left=0;
        for(int right=0; right<s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            while(map.size()>k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            res=Math.max(res, right-left+1);
        }
        return res;
    }
}
