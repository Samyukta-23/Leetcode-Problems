class Solution {
    public int myAtoi(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        boolean neg=false;
        while(i<arr.length && arr[i]==' '){
            arr[i]='#';
            i++;
        }
        if(i<arr.length && (arr[i]=='-'||arr[i]=='+')){
            if(arr[i]=='-') neg=true;
            arr[i]='#';
            i++;
        }

        while(i<arr.length && arr[i]=='0'){
            arr[i]='#';
            i++;
        }

        while(i<arr.length && ( arr[i]>='0' && arr[i]<='9')){
            i++;
        }

        for(int j=i;j<arr.length;j++){
            arr[j]='#';
        }

        StringBuilder str=new StringBuilder();
        for(char ch:arr){
            if(ch!='#'){
                str.append(ch);
            }
        }
        if(str.length()==0) return 0;
        if(str.length()>10){
            if(neg) return -2147483648;
            return 2147483647;
        }
        long num=Long.parseLong(str.toString());
        if(neg) num*=-1;
        if(num>=2147483647) return 2147483647;
        if(num<=-2147483648) return -2147483648;
        return (int)num;
    }
}