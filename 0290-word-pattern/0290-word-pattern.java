class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr1=s.split(" ");
        char[] arr2=pattern.toCharArray();
        if(arr1.length != arr2.length){
            return false;
        }
        HashMap<String, Character> hm1=new HashMap<>();
        HashMap<Character, String> hm2=new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            if(hm1.containsKey(arr1[i]) && hm1.get(arr1[i])!=arr2[i]){
                return false;
            }
            if(hm2.containsKey(arr2[i]) && !hm2.get(arr2[i]).equals(arr1[i])){
                return false;
            }
            hm1.put(arr1[i], arr2[i]);
            hm2.put(arr2[i], arr1[i]);
        }
        return true;
    }
}