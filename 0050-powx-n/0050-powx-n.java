class Solution {
    public double myPow(double x, int n) {
        double result=1.0;
        long b=n;
        if(b<0){
            x=1/x;
            b=-b;
        }
        while(b>0){
            if(b%2==1){
                result*=x;
            }
            x*=x;
            b/=2;
        }
        return result;
    }
}