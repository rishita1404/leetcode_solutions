class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character, Integer> hm1=new HashMap<>();
        for(int i=0; i<t.length(); i++){
            hm1.put(t.charAt(i), hm1.getOrDefault(t.charAt(i), 0)+1);
        }
        HashMap<Character, Integer> hm2=new HashMap<>();
        int minLen=Integer.MAX_VALUE;
        int start=0;
        int formed=0;
        int j=0;
        for(int i=0; i<s.length(); i++){
            hm2.put(s.charAt(i), hm2.getOrDefault(s.charAt(i), 0)+1);
            if(hm1.containsKey(s.charAt(i)) && hm1.get(s.charAt(i)).intValue()==hm2.get(s.charAt(i)).intValue()){
                formed++;
            }
            while(formed==hm1.size()){
                if(i-j+1<minLen){
                    minLen=i-j+1;
                    start=j;
                }
                hm2.put(s.charAt(j), hm2.get(s.charAt(j))-1);
                if(hm1.containsKey(s.charAt(j)) && hm2.get(s.charAt(j))<hm1.get(s.charAt(j))){
                    formed--;
                }
                j++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start+minLen);
    }
}