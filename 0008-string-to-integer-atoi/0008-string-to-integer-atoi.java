class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        long ans=0;

        if(n==0){
            return 0;
        }
        boolean first=false;
        int i=0;

        if(s.charAt(0)=='-'){
            first=true;
            i++;
        }else if(s.charAt(0)=='+'){
            i++;
        }
        while(i<n){
            char c=s.charAt(i);
            if(!Character.isDigit(c)){
                break;
            }
            ans=ans*10+(c-'0');
            
            if(!first && ans>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(first && -ans<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }

        if(first){
            ans=-ans;
        }

        return (int)ans;


    }
}