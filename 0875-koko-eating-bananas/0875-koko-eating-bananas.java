class Solution {
    public int minEatingSpeed(int[] piles, int hr) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i:piles){
            if(i>max) max=i;
        }

        int l=1;
        int h=max;
        while(l<=h){
            int mid=l+(h-l)/2;
            long total=hrsTaken(piles,mid);
            if(total<=hr){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    public static long hrsTaken(int[] nums,int h){
        long totalhrs=0;
        for(int i=0;i<nums.length;i++){
            totalhrs+=(long)Math.ceil((double)nums[i]/h);
        }
        return totalhrs;
    }
}