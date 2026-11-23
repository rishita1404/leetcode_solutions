class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> freq=new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            freq.put(magazine.charAt(i), freq.getOrDefault(magazine.charAt(i), 0)+1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            freq.put(ransomNote.charAt(i), freq.getOrDefault(ransomNote.charAt(i), 0)-1);
        }
        for(char ch:freq.keySet()){
            if(freq.get(ch)<0){
                return false;
            }
        }
        return true;
    }
}