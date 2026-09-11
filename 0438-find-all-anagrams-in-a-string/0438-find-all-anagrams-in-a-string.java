class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        if(m>n){
            return new ArrayList<>();
        }
        List<Integer> res=new ArrayList<>();
        HashMap<Character, Integer> hm1=new HashMap<>();
        HashMap<Character, Integer> hm2=new HashMap<>();
        for(int i=0; i<m; i++){
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0)+1);
            hm2.put(p.charAt(i), hm2.getOrDefault(p.charAt(i), 0)+1);
        }
        if(hm1.equals(hm2)){
            res.add(0);
        }
        for(int i=m; i<n; i++){
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0)+1);
            hm1.put(s.charAt(i-m), hm1.get(s.charAt(i-m))-1);
            if(hm1.get(s.charAt(i-m))==0){
                hm1.remove(s.charAt(i-m));
            }
            if(hm1.equals(hm2)){
                res.add(i-m+1);
            }
        }
        return res;
    }
}