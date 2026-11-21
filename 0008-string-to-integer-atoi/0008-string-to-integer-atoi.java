class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        long n=0;
        int i=0;
        int sign=1;
        while(i<len && s.charAt(i)==' '){
            i++;
        }
        if(i>=len) return 0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<len && Character.isDigit(s.charAt(i))){
            int a=s.charAt(i) - '0';
            n=n*10+a;
            if(sign*n > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign*n < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(n*sign);
    }
}