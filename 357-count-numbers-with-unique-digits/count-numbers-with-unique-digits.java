class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int range=10;
        for(int i=1;i<n;i++){
            range*=10;
        }
        if(n==0) range=1;
        int ans=0;
        for(int i=0;i<range;i++){
            int temp=i;
            boolean[] arr=new boolean[10];
            boolean a=true;
            while(temp!=0){
                if(arr[temp%10]){
                    a=false;
                    break;
                }
                arr[temp%10]=true;
                temp/=10;
            }
            if(a){
                ans++;
            }
        }
        return ans;
    }
}