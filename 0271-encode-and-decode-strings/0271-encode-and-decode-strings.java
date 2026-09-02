class Solution {

    public String encode(List<String> strs) {
        StringBuilder result=new StringBuilder();
        for(String s:strs){
            int n=s.length();
            result.append(n);
            result.append(',');
        }
        result.append('#');
        for(String s:strs){
            result.append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        ArrayList<Integer> lens=new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#'){
            StringBuilder num=new StringBuilder();
            while(str.charAt(i)!=','){
                num.append(str.charAt(i));
                i++;
            }
            lens.add(Integer.parseInt(num.toString()));
            i++;
        }
        i++;
        for(int len:lens){
            res.add(str.substring(i, i+len));
            i+=len;
        }
        return res;
    }
}
