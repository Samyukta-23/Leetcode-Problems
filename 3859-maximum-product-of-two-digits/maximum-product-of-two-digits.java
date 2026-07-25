class Solution {
    public int maxProduct(int n) {
        int[] freq=new int[10];
        while(n!=0){
            freq[n%10]++;
            n/=10;
        }
        int num1=0,num2=0;
        for(int i=9;i>=0;i--){
            if(freq[i]>=1 && num1==0){
                freq[i]--;
                num1=i;
            }
            if(freq[i]>=1 && num2==0){
                num2=i;
                break;
            }
        }
        return num1*num2;
    }
}