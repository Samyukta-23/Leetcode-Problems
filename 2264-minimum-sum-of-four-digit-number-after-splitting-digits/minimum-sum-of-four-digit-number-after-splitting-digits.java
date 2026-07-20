class Solution {
    public int minimumSum(int num) {
        int[] freq=new int[10];
        while(num!=0){
            freq[num%10]++;
            num/=10;
        }
        int min1=0,min2=0,min3=0,min4=0;
        boolean m1=false,m2=false,m3=false,m4=false;
        for(int i=0;i<=9;i++){
            if(freq[i]>=1 && !m1){
                min1=i;
                freq[i]--;
                m1=true;
            }
            if(freq[i]>=1 && !m2){
                min2=i;
                freq[i]--;
                m2=true;
            }
            if(freq[i]>=1 && !m3){
                min3=i;
                freq[i]--;
                m3=true;
            }
            if(freq[i]>=1 && !m4){
                min4=i;
                freq[i]--;
                m4=true;
            }
        }
        
        return (min1*10+min3)+ (min2*10+min4);
    }
}