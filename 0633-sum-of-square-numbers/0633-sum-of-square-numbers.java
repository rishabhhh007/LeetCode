class Solution {
    public boolean judgeSquareSum(int c) {
        long first=0;
        long last=(long)Math.sqrt(c);
        while(first<=last){
            long sum=first*first+last*last;
            if(sum==c) return true;
            if(sum<c) first+=1;
            else{
                last-=1;
            }
        }
        return false;
    }
}