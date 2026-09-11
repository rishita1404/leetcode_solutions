class Solution {
    public int characterReplacement(String s, int k) {
        int res=0;
        int maxFreq=0;
        int left=0;
        HashMap<Character, Integer> freq=new HashMap<>();
        for(int right=0; right<s.length(); right++){
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0)+1);
            maxFreq=Math.max(maxFreq, freq.get(s.charAt(right)));
            while(right-left+1-maxFreq > k){
                freq.put(s.charAt(left), freq.get(s.charAt(left))-1);
                if(freq.get(s.charAt(left))==0){
                    freq.remove(s.charAt(left));
                }
                left++;
            }
            res=Math.max(res, right-left+1);
        }
        return res;
    }
}