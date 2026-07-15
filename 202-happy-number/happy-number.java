class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        int sum=0;
        while(temp!=0){
            sum+=(temp%10)*(temp%10);
            temp/=10;
            if(temp==0){
                if(sum==1) return true;
                if(sum==n || (sum<10 && sum!=7)) break;
                temp=sum;
                sum=0;
            }
        }
        return false;
    }
}