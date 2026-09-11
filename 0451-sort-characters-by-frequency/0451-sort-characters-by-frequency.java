class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }
        ArrayList<int[]> list=new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }
        list.sort((a,b) -> b[1]-a[1]);
        StringBuilder res=new StringBuilder();
        for(int[] arr : list){
            char ch=(char) arr[0];
            int count=arr[1];
            for(int i=0; i<count; i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}