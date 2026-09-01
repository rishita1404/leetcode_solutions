class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> freq=new HashMap<>();
        int n=s.length();
        for(int i=0; i<n; i++){
            char c=s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<n; i++){
            char c=t.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0)-1);
        }
        for(char key : freq.keySet()){
            if(freq.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}