class Solution {
    public int addDigits(int num) {
        int res=num;
        while(res>9){
            int sum=0;
            while(res>0){
                int d=res%10;
                sum+=d;
                res/=10;
            }
            res=sum;
        }
        return res;
    }
}